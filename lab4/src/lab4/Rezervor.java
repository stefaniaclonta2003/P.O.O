package lab4;

public class Rezervor {
	float capacitateMax;
	float capacitateCurenta;
	
	public float getCapacitateMax()
	{
		return capacitateMax;
	}
	public void setCapacitateMax()
	{
		 this.capacitateMax = capacitateMax;
	}
	public float getCapacitateCurr()
	{
		return capacitateCurenta;
	}
	public void setCapacitateCurr()
	{
		 this.capacitateCurenta = capacitateCurenta;
	}
	
	public Rezervor (float capacitateMax, float capacitateCurenta) {
		 this.capacitateMax = capacitateMax;
		 this.capacitateCurenta = capacitateCurenta;
	}
}

