//No.4b(ii)(a)
public class MedicalUtils {
    // Shared utility that doesn't need instance data
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}
// Usage: MedicalUtils.calculateBMI(70, 1.75)