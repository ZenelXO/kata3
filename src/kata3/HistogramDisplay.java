package kata3;

import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import  org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Ángel H.O
 */
public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay(String histo){
        super(histo);
        setContentPane(createPanel());

        pack();
    }

    public void execute(){
        setVisible(true);
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart("Historgrama de emails", "Dominios de emails", "Numero de emails", dataset, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        
        return chart;
    }

    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        
        return chartPanel;
    }

    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5,"","gmail.es");
        dataset.addValue(10,"","ulpgc.es");
        dataset.addValue(3,"","outlook.es");
        
        return dataset;
    }
}