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
import javax.swing.table.DefaultTableModel;
import org.jfree.ui.RefineryUtilities;

public class Year1 {
    
    
     public Year1() {
     
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
  
        
        }
        
        }
        
        
       CreateBar c1 = new CreateBar("Car Usage Statistics", "Which car do you like?");
     // c1.pack( );        
       RefineryUtilities.centerFrameOnScreen(c1);      
      c1.setVisible( true ); 
        
        
        }
        
        catch(SQLException|HeadlessException e)
        {
        System.out.println(e);
        
        }
     }
    
    
}
