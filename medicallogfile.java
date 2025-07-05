import java.io.*;

public class MedicalLogViewer {
    public static void displayLog(File medicalLogFile) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(medicalLogFile));
            System.out.println("=== MEDICAL LOG ===");
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: Log file not found at " + medicalLogFile.getPath());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try { reader.close(); } 
                catch (IOException e) { /* Ignore */ }
            }
            System.out.println("=== END OF LOG ===");
        }
    }

    public static void main(String[] args) {
        File logFile = new File("patient_logs.txt");
        displayLog(logFile);
    }
}