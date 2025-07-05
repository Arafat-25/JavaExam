import org.junit.Test;
import static org.junit.Assert.*;

public class CompanyTest {
    
    @Test
    public void testSchedulePickupWhenVehicleAvailable() {
        Company company = new Company();
        // Add at least one available vehicle to the company
        Vehicle vehicle = new Vehicle(4); // 4-seater
        company.addVehicle(vehicle);
        
        Passenger passenger = new Passenger(new Location(10, 20), new Location(30, 40));
        assertTrue(company.schedulePickup(passenger));
    }
    
    @Test
    public void testSchedulePickupWhenNoVehicleAvailable() {
        Company company = new Company();
        // Don't add any vehicles to the company
        
        Passenger passenger = new Passenger(new Location(10, 20), new Location(30, 40));
        assertFalse(company.schedulePickup(passenger));
        // Also could verify lostFares counter was incremented
    }
}