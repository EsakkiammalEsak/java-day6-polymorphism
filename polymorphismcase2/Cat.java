package polymorphismcase2;

public class Cat {
	
	float jumpHeight;
	int distanceStrolled;
	String soundsMade;
	
	public Cat(float jumpHeight, int distanceStrolled, String soundsMade) {
		super();
		this.jumpHeight = jumpHeight;
		this.distanceStrolled = distanceStrolled;
		this.soundsMade = soundsMade;
	}
	public float getJumpHeight() {
		return jumpHeight;
	}
	public void setJumpHeight(float jumpHeight) {
		this.jumpHeight = jumpHeight;
	}
	public int getDistanceStrolled() {
		return distanceStrolled;
	}
	public void setDistanceStrolled(int distanceStrolled) {
		this.distanceStrolled = distanceStrolled;
	}
	public String getSoundsMade() {
		return soundsMade;
	}
	public void setSoundsMade(String soundsMade) {
		this.soundsMade = soundsMade;
	}
    public	float generateEnergy(float jumpHeight )
	{
    	float i=0;
		if(jumpHeight ==10.75)
		{
			i=(float) 7.2;
		}
		
	else if(jumpHeight >10.75)
		{
			i=(float) ((jumpHeight /10.75)*7.2);
		}
	else if(jumpHeight <10.75)
	{
		i=0;
		System.out.println("No joules  can generate from this");
	}
		return i;
		
	}
	
	public float generateEnergy(int distanceStrolled )
	{
		float k=0;
		
	 if(distanceStrolled>=172)
		{
			
			k=(float) ((distanceStrolled/172)*12.35);
		}
		else if(distanceStrolled<172)
		{
			k=0;
			System.out.println("No joules  can generate from this");
		}
		return (float)k;
	
	}
	public float generateEnergy(String soundsMade)
	{
		float count=0;
	float j=0;
	String[] s=soundsMade.split(" ",5);

    for(int i=0;i<s.length;i++) {
		//System.out.println(s[i]);
	if(s[i].equalsIgnoreCase("meow"))
		count++;
	}
	
	if(count==5)
	{
		j=15;
	}
	else if(count>5)
	{
		
		j=(count/3)*15;
    }
	else if(count<5)
	{
		j=0;
		System.out.println("No joules  can generate from this");
	}

	return (int) j;
}

	
	
	
}
