/**
 * 
 */
package bdd.steps;

import java.util.ArrayList;
import java.util.List;

import org.givwenzen.GivWenZen;
import org.givwenzen.annotations.DomainStep;
import org.givwenzen.annotations.DomainSteps;

/**
 * @author faroooq
 *
 */
@DomainSteps
public class FlightSteps {
	
	   private static final String SOME_NUMBER = "(\\d+)";
	   private GivWenZen givWenZen;
	   
	   

	   public FlightSteps(GivWenZen givWenZen) {
	      this.givWenZen = givWenZen;
	   }

	   @DomainStep("A flight departing at 0800")
	   public boolean flightArrive1() {
	     return true; 
	   }
	   
	   @DomainStep("A flight arrives at 1000")
	   public boolean flightArrive2() {
	     return true; 
	   }
	   
	   
	   @DomainStep("The flight departure is delayed by 20 minutes")
	   public boolean flightArrivesLate() {
	     return true; 
	   }
	   
	   
	   @DomainStep("The flight should depart at 0820")
	   public boolean flightdeparts1() {
	     return true; 
	   }
	   

	   @DomainStep("The flight should arrive at 1020")
	   public boolean flightdeparts2() {
	     return true; 
	   }
	   
}
