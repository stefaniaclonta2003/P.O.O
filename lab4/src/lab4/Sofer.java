package lab4;

public class Sofer {

	private String nume;
	int varsta;
	int nrPermis;
	public String getNume()
	{
		return nume;
	}
	public void setNume(String nume)
	{
		this.nume = nume;
	}
	public int getVarsta()
	{
		return varsta;
	}
	
	public void setVarsta(int varsta)
	{
		this.varsta = varsta;
	}
	public int getPermis()
	{
		return nrPermis;
	}
	public void setPermis(int nrPermis)
	{
		this.nrPermis = nrPermis;
	}
	public Sofer(String nume, int varsta, int nrPermis)
	{
		this.varsta = varsta;
		this.nrPermis = nrPermis;
		this.nume = nume;
	}
}
