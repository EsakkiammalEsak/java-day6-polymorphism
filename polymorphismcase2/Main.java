package polymorphismcase2;
import java.util.Scanner;
public class Main {

	//private static float TotalEnergy;

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
float jumpHeight=s.nextFloat();
int distanceStrolled=s.nextInt();
float    energyReserve=s.nextFloat();
float energy=s.nextFloat();
float remainingEnergy=s.nextFloat();
//float TotalEnergy;
//float runFan;
String soundsMade="meow meow meow meow meow";

	
		  
				Machine m=new Machine(energyReserve,energy,remainingEnergy);
				m. addEnergy(energy );
			    m.runFan(remainingEnergy);
				Cat c=new Cat(jumpHeight,distanceStrolled,soundsMade);
				System.out.println(c.generateEnergy(jumpHeight)+" s");
				System.out.println(c.generateEnergy(distanceStrolled)+" s");
				System.out.println(c.generateEnergy(soundsMade)+" s");
			}
	}
	
