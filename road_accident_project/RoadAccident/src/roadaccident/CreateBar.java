/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadaccident;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;




public class CreateBar extends ApplicationFrame {
    
    public CreateBar( String applicationTitle , String chartTitle )
   {
      super( applicationTitle );        
      
        
    
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  
      
      int i;
        
        int start_year=2007;
        Calendar now = Calendar.getInstance();   // Gets the current date and time
         int current_year = now.get(Calendar.YEAR);
         
          
         
          try
        {
         String url="jdbc:mysql://localhost:3306/road_accident";
        String user="root";
        String pass="";
        
        Connection conn=(Connection)DriverManager.getConnection(url, user, pass);
       // DefaultTableModel model=(DefaultTableModel)year_table.getModel();
        
        for(i=start_year;i<current_year;i++)
        {
        String query="Select count(accident_no) as total_accident from accident where date like'"+i+"%'";
        
        PreparedStatement preparedStm=conn.prepareStatement(query);
        preparedStm.execute();
        ResultSet rs2=preparedStm.getResultSet();
        
        while(rs2.next())
        {
           
//          Number number = (Number) entry.getValue();
             Number number=i;
               String v = number.toString();
//               Double j=Double.parseDouble(value);
               
             int  m= rs2.getInt("total_accident");
              Number number1=m;
              String q=number1.toString();
              Double p=Double.parseDouble(q);
            //summary = rs.getInt("SummaryOfCalls");
            
              dataset.setValue(p,v,v);
        
        }
        
        }
        
        
    JFreeChart chart = ChartFactory.createBarChart("", "Year","Total Accident", dataset, PlotOrientation.VERTICAL, true, true,false);
    CategoryPlot p = chart.getCategoryPlot();

         //p.setRangeGridlinePaint(Color.BLUE);

     ChartPanel chartPanel = new ChartPanel(chart );        
    chartPanel.setPreferredSize(new java.awt.Dimension( 720 , 600 ) );        
    setContentPane( chartPanel );
        
        
        }
        
        catch(SQLException|HeadlessException e)
        {
        System.out.println(e);
        
        }
         
   }
}
    
    
  

