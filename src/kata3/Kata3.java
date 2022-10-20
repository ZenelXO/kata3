package kata3;

/**
 *
 * @author Ángel H.O
 */
public class Kata3 {


    public static void main(String[] args) {
        Histogram <String> histogram = new Histogram();
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("outlook.es");
        histogram.increment("gmail.com");
        
        HistogramDisplay histograma = new HistogramDisplay(histogram, "Histograma");
        histograma.execute();
    }

}