package polymorphismcase1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int coalPieces=s.nextInt();
float hairStrand=s.nextFloat();
String coalMsg="coal coal coal coal coal coal coal coal coal coal coal coal coal coal coal coal coal coal coal coal coal coal coal coal coal coal coal";

	
		  
				Machine m=new Machine();
				System.out.println(m.produceShoePolish(coalPieces)+" ml");
				System.out.println(m.produceShoePolish((float)hairStrand)+" ml");
				System.out.println(m.produceShoePolish(coalMsg)+" ml");
			}
	}
	