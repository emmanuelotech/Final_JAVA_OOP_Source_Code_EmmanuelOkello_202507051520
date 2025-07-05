
public class Question3_C_WhileLoops_AirQOJavaSystem {

    static class AirQOSensor {

        public static double getRealTimeReading() 
        {
            
            return Math.random() * 150;
            
        }
    }

    public static void main(String[] args)
    {
        double[] pm25Readings = new double[30];
        int day = 0;

        
        
        while (day < 30) {
            
            pm25Readings[day] = AirQOSensor.getRealTimeReading();

            System.out.printf("Day %02d: %.2f %s%n",
                    day + 1,
                    pm25Readings[day],
                    pm25Readings[day] > 50 ? "[WARNING]" : "");

            if ((day + 1) % 7 == 0) {
                generateComplianceReport(day - 6, day);
            }

            day++;
        }

        analyzeMonthlyTrend(pm25Readings);
    }

    private static void generateComplianceReport(int startDay, int endDay) 
            
    {
        System.out.println(""
                + "Generating weekly report for days " + (startDay + 1) + " to " + (endDay + 1));
    }

    private static void analyzeMonthlyTrend(double[] readings)
    {
        
        
        System.out.println("Analyzing monthly trend...");
    }
}
