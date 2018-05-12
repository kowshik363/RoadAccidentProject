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
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.swing.JFrame;
import org.jfree.ui.RefineryUtilities;

public class Accident_Prone_Zone1 {
  
    
    
    
 public Accident_Prone_Zone1() {
        
        
         int i,m;
       double f[]= new double[100];
       Arrays.fill(f, 0.0);
       Calendar now = Calendar.getInstance();  
       double factor[]=new double[4000];
       double val=1.0;
       int start_year=2007;
       int current_year = now.get(Calendar.YEAR);
         //System.out.println(""+current_year);
         
    try{
      
       for(i=(current_year-1);i>=start_year;i--)
       {
            if((current_year-start_year)==199)
            {
            factor[i]=0.05;
            }
            else
            {
            factor[i]=val;        
            }
            val=val-0.05;
       }
       
       
       String url="jdbc:mysql://localhost:3306/road_accident"; 
       String user="root";
       String pass="";
       
       
       Connection conn=(Connection)DriverManager.getConnection(url, user, pass);
       
       
        String query="Select count(location_id) as total from  location";
        PreparedStatement prepareStm=conn.prepareStatement(query);
        prepareStm.execute();
        ResultSet rs2=prepareStm.getResultSet();
        int no_of_locations = 0;
        while(rs2.next())
            no_of_locations = rs2.getInt("total");
            
       
       Map<String, Double> unsortMap = new HashMap<String, Double>();
       String locations[] = new String[100];
       double temp, total_factor = 0.0;
       String cur_location = "";
       for(int j = 1; j<=no_of_locations;j++ )
       {
           temp = 0.0;
            for(i=(current_year-1);i>=start_year;i--)
            {
                query="Select a.location_name,count(b.accident_no) as total_accident from location a left join accident b on a.location_id=b.location_id where b.location_id='"+j+"' and date like'"+i+"%' ";
                prepareStm=conn.prepareStatement(query);
                prepareStm.execute();
                rs2=prepareStm.getResultSet();
                m = 0;
                while(rs2.next())
                {
                    m=rs2.getInt("total_accident");
                    cur_location = rs2.getString("a.location_name");
                }
               
                temp=temp+factor[i]*m;
                //System.out.println(""+f);
            }
            locations[j] = cur_location;
            f[j] = temp;
            total_factor += f[j];
       }
    
       
       for(i = 1; i<= no_of_locations; i++)
       {
           temp = f[i]/total_factor;
           temp = temp * 100;
           unsortMap.put(locations[i],temp);
       }
       Map<String, Double> sortedMap = sortByValue(unsortMap);
       printMap(sortedMap);
       
       CreateChart cc = new CreateChart("Accident Prone Zones", "Road Accident", sortedMap);
       cc.pack();
      // cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       cc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       RefineryUtilities.centerFrameOnScreen(cc);
       cc.setVisible(true);
      }
      catch(SQLException|HeadlessException e)
      {
         System.out.println(e);
      }
        
        
    }
    
    
    private static Map<String, Double> sortByValue(Map<String, Double> unsortMap) {

      
        LinkedList<Map.Entry<String, Double>> list;
        list = new LinkedList<Map.Entry<String, Double>>(unsortMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> o1,
                               Map.Entry<String, Double> o2) 
            {
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
                    // System.out.println("place : " + entry.getKey()
                   // + " Value : " + entry.getValue());
                }      
         }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
                    

    
    
  
    // Variables declaration - do not modify                     
    // End of variables declaration                   

   
}

