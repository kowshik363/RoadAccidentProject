/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadaccident;

import java.text.AttributedString;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.XYItemLabelGenerator;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.util.Rotation;

public class CreateChart extends ApplicationFrame  {
    
    //JButton btn1;

    public CreateChart(String title,String chartTitle, Map<String, Double> map ) {
        super(title);
        PieDataset dataset = createDataset(map);
        JFreeChart chart = createChart(dataset, title);
        ChartPanel chartPanel = new ChartPanel(chart);
    
        chartPanel.setPreferredSize(new java.awt.Dimension(650,510));
        setContentPane(chartPanel);
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }    
    
    private static<K,V> PieDataset createDataset(Map<K, V> map)
    {
        DefaultPieDataset result = new DefaultPieDataset();
        int index = 0;
        for (Map.Entry<K, V> entry : map.entrySet())
                {
                   if(index<5)
                   {
                      
                       String key = entry.getKey().toString();
                       Number number = (Number) entry.getValue();
                       String value = number.toString();
                       Double value1 = Double.parseDouble(value);
                       result.setValue(key, value1);
                     
                       index++;
                   }
                   else
                     break;
                }   
        return result;
    }
    
    private JFreeChart createChart(PieDataset dataset , String title)
    {
        JFreeChart chart = ChartFactory.createPieChart3D(title, dataset, true, true, false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(200);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
            "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(gen);
//        plot.setNoDataMessage("No data to display");
//        plot.setLabelGenerator(new CustomLabelGenerator());
        return chart;
    }   
    
     
     
}
