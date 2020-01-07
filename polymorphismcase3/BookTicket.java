package polymorphismcase3;

public class BookTicket {
	private        int numOfPassengers;
	private         float price ;
	private int numOfChildren;
	private boolean isWiFi;
private  boolean isSleeper;
private boolean isAC;

	public BookTicket(int numOfPassengers2, float price2, int numOfChildren2, boolean isWiFi2, boolean isSleeper2,
		boolean isAC2) {
	// TODO Auto-generated constructor stub
		super();
		this.numOfPassengers = numOfPassengers;
		this.price = price;
		this.numOfChildren = numOfChildren;
		this.isWiFi = isWiFi;
		this.isSleeper = isSleeper;
		this.isAC = isAC;
}
	public int getNumOfChildren() {
		return numOfChildren;
	}
	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
	}
	public boolean isWiFi() {
		return isWiFi;
	}
	public void setWiFi(boolean isWiFi) {
		this.isWiFi = isWiFi;
	}
	public boolean isSleeper() {
		return isSleeper;
	}
	public void setSleeper(boolean isSleeper) {
		this.isSleeper = isSleeper;
	}
	public boolean isAC() {
		return isAC;
	}
	public void setAC(boolean isAC) {
		this.isAC = isAC;
	}
	public int getNumOfPassengers() {
		return numOfPassengers;
	}
	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	float sum;
	float amount;
	public void bookTicket(int numOfPassengers,float price)
	{
	        sum=numOfPassengers*price;
	        System.out.println(sum);
	}
	public void bookTicket(int numOfPassengers,float price,boolean isSleeper,boolean isAC)
	{
		if((Boolean.compare(isSleeper,true)==0))
		{
			amount=sum+250;
			System.out.println(amount);
			
		}
		else if((Boolean.compare(isAC,true)==0))
		{
			amount=sum+350;
			System.out.println(amount);
			
		}
	}
	
	public void bookTicket(int numOfPassengers,float price,boolean isSleeper,boolean 
            isAC ,int numOfChildren, boolean isWiFi)
	{
		sum=(numOfPassengers-numOfChildren)*price;
		
		if((Boolean.compare(isSleeper,true)==0))
		{
			amount=sum+250;
			System.out.println(amount);
			
		}
		else if((Boolean.compare(isAC,true)==0))
		{
			amount=sum+350;
			System.out.println(amount);
			
		}
	
		
		else if((Boolean.compare(isWiFi,true)==0))
		{
			amount=sum+450;
			System.out.println(amount);
			
		}        
	}

}
