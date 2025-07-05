public class Question3_C_ForLoops_AirQOJavaSystem {
    public static void main(String[] args) {
        double[] pm25Readings = new double[30];
        
        for (int day = 0; day < 30; day++) {
            pm25Readings[day] = 150 * Math.random();
            
            System.out.printf("Day %02d: %.2f %s%n", 
                day+1, 
                pm25Readings[day],
                pm25Readings[day] > 50 ? "[WARNING]" : "");
            
            if ((day+1) % 7 == 0) {
                generateComplianceReport(day-6, day);
            }
        }
        
        analyzeMonthlyTrend(pm25Readings);
    }

    private static void generateComplianceReport(int startDay, int endDay) {}
    private static void analyzeMonthlyTrend(double[] readings) {}
}