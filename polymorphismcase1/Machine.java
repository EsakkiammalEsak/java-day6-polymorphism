package polymorphismcase1;


import java.lang.String;
public class Machine {
		
		public int produceShoePolish(int CoalPrice) {
			
			int i=0;
			if(CoalPrice==5)
			{
				i=100;
			}
			
		else if(CoalPrice>5)
			{
				i=(CoalPrice/5)*100;
			}
		else if(CoalPrice<5)
		{
			i=0;
			System.out.println("Not Efficient");
		}
			return i;
			
		}
		public int produceShoePolish(float hairStrand ) {
			float k=0;
			if(hairStrand==(float)9.83)
			{
				k=(int)100;
			}
			else if(hairStrand>9.83)
			{
				
				k=(float) ((hairStrand/9.83)*100);
			}
			else if(hairStrand<9.83)
			{
				k=0;
				System.out.println("Not Efficient");
			}
			return (int) k;
		}
		public int produceShoePolish(String coalMsg) {
			float count=0;
			float j=0;
			String[] s=coalMsg.split(" ",27);
	
		    for(int i=0;i<s.length;i++) {
				System.out.println(s[i]);
			if(s[i].equalsIgnoreCase("coal"))
				count++;
			}
			//System.out.println(count);
			if(count==27)
			{
				j=100;
			}
			else if(count>27)
			{
				//System.out.println("");
				j=(count/3)*100;
		    }
			else if(count<3)
			{
				j=0;
				System.out.println("Not Efficient");
			}
		
			return (int) j;
		}
		
	}