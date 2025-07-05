//No.4c)
// Final class cannot be extended
public final class MedicalConstants {
    // Final variables are constants
    public static final double NORMAL_TEMP = 37.0;
    public static final int MAX_HEART_RATE = 220;
}

// Final method cannot be overridden
public class Patient {
    public final String getSSN() { return this.ssn; }
}
