package polymorphismcase2;

public class Machine {
	float     energyReserve;
	float energy;
	float remainingEnergy;
	float TotalEnergy;
	float runFan;
	
	public Machine(float energyReserve, float energy, float remainingEnergy) {
		super();
		this.energyReserve = energyReserve;
		this.energy = energy;
		this.remainingEnergy = remainingEnergy;
	}
	public float getEnergyReserve() {
		return energyReserve;
	}
	public void setEnergyReserve(float energyReserve) {
		this.energyReserve = energyReserve;
	}
	public float getEnergy() {
		return energy;
	}
	public void setEnergy(float energy) {
		this.energy = energy;
	}
	public float getRemainingEnergy() {
		return remainingEnergy;
	}
	public void setRemainingEnergy(float remainingEnergy) {
		this.remainingEnergy = remainingEnergy;
	}
	public float getTotalEnergy() {
		return TotalEnergy;
	}
	public void setTotalEnergy(float totalEnergy) {
		TotalEnergy = totalEnergy;
	}
	public  void  addEnergy(float energy ) {
		TotalEnergy=energy+energyReserve;
		System.out.println("Total Energy Consumed:"+TotalEnergy);
	}
	public void runFan(float remainingEnergy)
	{
		this.TotalEnergy=TotalEnergy;
		runFan=TotalEnergy-remainingEnergy;
		System.out.println("RunFan:"+runFan);
	}
}
