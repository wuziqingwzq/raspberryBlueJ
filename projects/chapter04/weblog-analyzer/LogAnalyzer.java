/**
 * Read web server data and analyse
 * hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    private double[] readings;
    
    private int nnn;
    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        readings = new double[60];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
        test(nnn);
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasMoreEntries()) {
            LogEntry entry = reader.nextEntry();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        /*
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
        */
        int hour = 0;
        while(hour < hourCounts.length){
            System.out.println(hour + ": " + hourCounts[hour]);
            hour++;
        }
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
    
    public void testnnn(){
        
        
    }
    
    public void printGreater(double[] marks,double mean){
        marks = new double[]{1.22,3.45,4.31};
        mean = 2.01;
        for(int index = 0; index < marks.length; index++){
            if(marks[index] > mean){
                System.out.println(marks[index]);
            }
        }
    }
    
    public int numberOfAccesses()
    {
        int total = 0;
        for(int count:hourCounts){
            total += count;
        }
        return total;
    }
    
    public int busiestHour(){
        int busiest= 0;
        int hour=0;
        for(int i=0; i<hourCounts.length; i++){
            if(busiest < hourCounts[i]){
                busiest = hourCounts[i];
                hour = i;
            }
        }
        return hour;
    }
    
    public int busiest2Hour(){
        int busiest= 0;
        int hour=0;
        for(int i=0; i<hourCounts.length; i++){
            if(busiest < hourCounts[i]+hourCounts[(i+1)%(hourCounts.length-1)]){
                busiest = hourCounts[i]+hourCounts[(i+1)%(hourCounts.length-1)];
                hour = i;
            }
        }
        return hour;
    }
    
    public int quietestHour(){
        int hour = 0 ;
        int quietest = hourCounts[0];
        for(int i=0; i < hourCounts.length; i++){
            if(quietest >= hourCounts[i]){
                quietest = hourCounts[i];
                hour = i;
            }
        }
        return hour;
    }
    
    public void test(int nnn){
       nnn=9;
    }
}
