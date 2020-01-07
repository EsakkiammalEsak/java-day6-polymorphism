package polymorphismcase3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String          passengerName=s.next();
		String          emailID=s.next();
		int             mobileNo=s.nextInt();
		String          dateOfTravel=s.next();
		int numOfPassengers=s.nextInt(); 
                float price=s.nextFloat(); 
                 int numOfChildren=s.nextInt();
            	 boolean isWiFi=s.nextBoolean();
             boolean isSleeper=s.nextBoolean();
            boolean isAC=s.nextBoolean();
         
              
            
                BookTicket b=new BookTicket(numOfPassengers,price,numOfChildren,isWiFi,isSleeper,isAC);
                b.bookTicket(numOfPassengers, price);
                b.bookTicket(numOfPassengers, price,isSleeper, isAC);
                b.bookTicket(numOfPassengers, price,isSleeper, isAC ,numOfChildren,isWiFi);
                
	}

}
