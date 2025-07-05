import java.util.Arrays;
import java.util.Random;

public class AQIMonitor {
    public static void main(String[] args) {
        // i) Generate 30 random AQI readings (1-300)
        int[] aqiReadings = new int[30];
        Random random = new Random();
        
        for (int i = 0; i < aqiReadings.length; i++) {
            aqiReadings[i] = random.nextInt(300) + 1;
        }
        
        // Display generated readings
        System.out.println("Generated AQI Readings:");
        System.out.println(Arrays.toString(aqiReadings));
        
        // ii) Compute and display median
        Arrays.sort(aqiReadings);
        double median;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[aqiReadings.length/2] + aqiReadings[aqiReadings.length/2 - 1]) / 2.0;
        } else {
            median = aqiReadings[aqiReadings.length/2];
        }
        System.out.println("Median AQI: " + median);
        
        // iii) Count hazardous days (AQI > 200)
        int hazardousDays = 0;
        for (int aqi : aqiReadings) {
            if (aqi > 200) {
                hazardousDays++;
            }
        }
        System.out.println("Hazardous days (AQI > 200): " + hazardousDays);
        
        // Additional analysis
        analyzeAirQuality(aqiReadings);
    }
    
    private static void analyzeAirQuality(int[] readings) {
        int good = 0, moderate = 0, unhealthy = 0;
        
        for (int aqi : readings) {
            if (aqi <= 50) good++;
            else if (aqi <= 100) moderate++;
            else unhealthy++;
        }
        
        System.out.println("\nAir Quality Summary:");
        System.out.println("Good (0-50): " + good + " days");
        System.out.println("Moderate (51-100): " + moderate + " days");
        System.out.println("Unhealthy (101+): " + unhealthy + " days");
    }
}