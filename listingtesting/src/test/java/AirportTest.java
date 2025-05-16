
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.listingtest.BussinessFlight;
import com.listingtest.EconomyFlight;
import com.listingtest.Flight;
import com.listingtest.Passanger;

public class AirportTest {
    @DisplayName("Given there is an economy FLigth")
    @Nested
    class EconomyFlightTest {
        private Flight economyFlight;
        
        @BeforeEach
        void setUp() {
            economyFlight = new EconomyFlight("1");
        }
        
        @Test
        void testEconomyFlightRegularPassanger(){
            Passanger mike = new Passanger("Mike", false);
            
            assertEquals("1", economyFlight.getId());
            assertEquals(true, economyFlight.addPassanger(mike));
            assertEquals(1, economyFlight.getPassangersList().size());
            assertEquals("Mike", economyFlight.getPassangersList().get(0).getName());
            assertEquals(true, economyFlight.removePassanger(mike));
            assertEquals(0, economyFlight.getPassangersList().size());
            
        }
        
        @Test
        void testEconomyFlightVipPassanger(){
            Passanger james = new Passanger("James", true);
            
            assertEquals("1", economyFlight.getId());
            assertEquals(true, economyFlight.addPassanger(james));
            assertEquals(1, economyFlight.getPassangersList().size());
            assertEquals("James", economyFlight.getPassangersList().get(0).getName());
            assertEquals(false, economyFlight.removePassanger(james));
            assertEquals(1, economyFlight.getPassangersList().size());
        }
    }
    
    @DisplayName("Given there is a business flight")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;
        
        @BeforeEach
        void setUp() {
            businessFlight = new BussinessFlight("2");
        }
        
        @Test
        void testBusinessFlightRegularPassanger() {
            Passanger mike = new Passanger("Mike", false);
            
            assertEquals(false, businessFlight.addPassanger(mike));
            assertEquals(0, businessFlight.getPassangersList().size());
            assertEquals(false, businessFlight.removePassanger(mike));
            assertEquals(0, businessFlight.getPassangersList().size());
        }
        
        @Test
        void testBusinessFlightVipPassanger() {
            Passanger james = new Passanger("James", true);
            assertEquals(true, businessFlight.addPassanger(james));
            assertEquals(1, businessFlight.getPassangersList().size());
            assertEquals(false, businessFlight.removePassanger(james));
            assertEquals(1, businessFlight.getPassangersList().size());
        }
    } 
}