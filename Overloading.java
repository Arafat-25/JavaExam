//No.4b(ii)(b)

public class ReportGenerator {
    // Basic report
    public void generateReport(Patient p) {
        System.out.println("Basic report for " + p.getName());
    }
    
    // Detailed report
    public void generateReport(Patient p, boolean detailed) {
        System.out.println(detailed ? "Detailed report" : "Basic report");
    }
    
    // Report with priority
    public void generateReport(Patient p, int priority) {
        System.out.println("Priority " + priority + " report");
    }
}