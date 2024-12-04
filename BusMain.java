import java.util.Scanner; //nested package/ hierarchical package
import java.util.ArrayList;

public class BusMain {

	public static void main(String[] args) {
		
	
		ArrayList<BusReserv> buses = new ArrayList<BusReserv>();
		ArrayList<BusBooking> bookings = new ArrayList<BusBooking>();
		
		buses.add(new BusReserv(1,true,2));
		buses.add(new BusReserv(2,false,50));
		buses.add(new BusReserv(3,true,48));
		
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		
		for(BusReserv b:buses) {
			b.displayBusInfo();
		}
		
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 2 to exit");
			userOpt = scanner.nextInt();
			if(userOpt == 1) {
				BusBooking booking = new BusBooking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("Sorry. Bus is full. Try another bus or date.");
			}
		}
	}

}