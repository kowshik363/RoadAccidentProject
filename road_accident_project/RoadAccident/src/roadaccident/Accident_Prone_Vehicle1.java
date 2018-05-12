/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadaccident;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.swing.JFrame;

import org.jfree.ui.RefineryUtilities;


public class Accident_Prone_Vehicle1 {
    
     public Accident_Prone_Vehicle1() {
      int i,m,n;
       double f[]= new double[100];
      // Arrays.fill(f, 0);
       Calendar now = Calendar.getInstance();  
       
       int start_year=2007;
       int current_year = now.get(Calendar.YEAR);
         
         
    try{
      
   
       String url="jdbc:mysql://localhost:3306/road_accident"; 
       String user="root";
       String pass="";
       Connection conn=(Connection)DriverManager.getConnection(url, user, pass);
       
       String query="Select count(type_id) as total_vehicle from vehicle_type";
       PreparedStatement prepareStm=conn.prepareStatement(query);
       prepareStm.execute();
       ResultSet rs2=prepareStm.getResultSet();
        
        
        int no_of_vehicles = 0;
        while(rs2.next())
        {
            no_of_vehicles = rs2.getInt("total_vehicle");
        }
        
        
        
       Map<String, Double> unsortMap = new HashMap<String, Double>();
   
       String vehicle[]=new String[100];
       
       double temp,total_percentage =0;
               
     
       String cur_vehicle="";
       
       for(int j = 1; j<=no_of_vehicles;j++ )
       {
           temp = 0;
            for(i=(current_year-1);i>=start_year;i--)
            {
                
                m = 0;
                n=0;
              String  query1="Select a.vehicle_name,count(b.accident_no) as total_accident,sum(b.killed) as total_killed from vehicle_type a left join accident b on a.type_id=b.type_id where b.type_id='"+j+"' and date like'"+i+"%' ";
              prepareStm=conn.prepareStatement(query1);
              prepareStm.execute();
              rs2=prepareStm.getResultSet();
               
                
                while(rs2.next())
                {
                    m=rs2.getInt("total_accident");
                
                    n=rs2.getInt("total_killed");
                        //System.out.println(""+n);
                    cur_vehicle = rs2.getString("a.vehicle_name");
                }
               
                temp=temp+m*n;
                //System.out.println(""+temp);
            }
            
            vehicle[j] = cur_vehicle;
            f[j] = temp;
            
            total_percentage += f[j];
           
       }
      
       for(i = 1; i<= no_of_vehicles; i++)
       {
           temp = (f[i]*100)/total_percentage;
           //temp = temp * 100;
           //System.out.println("   "+temp);
           
           unsortMap.put(vehicle[i],temp);
       }
       Map<String, Double> sortedMap = sortByValue(unsortMap);
       printMap(sortedMap);
       
       CreateChart cc = new CreateChart("Accident Prone Vehicles", "Road Accident", sortedMap);
       cc.pack();
       cc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       //cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RefineryUtilities.centerFrameOnScreen(cc);
       cc.setVisible(true);
     
       
      }
      catch(SQLException|HeadlessException e)
      {
         System.out.println(e);
      }
        
        
    }
     
     
     private static Map<String, Double> sortByValue(Map<String,Double > unsortMap) {

      
        LinkedList<Map.Entry<String, Double>> list;
        list = new LinkedList<Map.Entry<String, Double>>(unsortMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> o1,
                               Map.Entry<String, Double> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        Map<String, Double> sortedMap = new LinkedHashMap<String, Double>();
        for (Map.Entry<String, Double> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
     
     
     public static <K, V> void printMap(Map<K, V> map) 
    
         {
            for (Map.Entry<K, V> entry : map.entrySet())
                {
                
//                     System.out.println("vehicle : " + entry.getKey()
//                    + " Value : " + entry.getValue());
                }      
         }
    
}
