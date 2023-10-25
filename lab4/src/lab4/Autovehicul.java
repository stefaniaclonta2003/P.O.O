package lab4;

import java.awt.Color;

public class Autovehicul {
	private String marca;
	float vitezaCurenta;
	float vitezaMaxima;
	int nrTrepte;
	int treaptaCurenta;
	Color culoare;
	Sofer sofer1;
	Rezervor rez;
	@Override
	public String toString()
	{
		return "Marca este " + marca + " are viteza curenta de " + vitezaCurenta + " si se afla in treapta " + treaptaCurenta + " numele soferului este " + sofer1.getNume() + " si are varsta de " + sofer1.getVarsta() +  " iar numarul permisului este " + sofer1.getPermis() + " rezervorul are capacitatea maxima de " + rez.getCapacitateMax() + " iar capacitatea curenta este de " + rez.getCapacitateCurr();
	}
	public String getMarca()
	{
		return marca;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	public Color getColor()
	{
		return culoare;
	}
	public void setColor(Color culoare)
	{
		this.culoare = culoare;
	}
	public float getViteza()
	{
		return vitezaCurenta;	
	}
	public void setViteza(float vitezaCurenta)
	{
		this.vitezaCurenta = vitezaCurenta;
	}
	public int getTreapta()
	{
		return treaptaCurenta;
	}
	public void setTreapta(int treaptaCurenta)
	{
		this.treaptaCurenta = treaptaCurenta;
	}
	public Autovehicul(Sofer sofer1, Rezervor rez, String marca, float vitezaCurenta, float vitezaMaxima, int nrTrepte, int treaptaCurenta, Color culoare )
	{
		this.rez = rez;
		this.sofer1 = sofer1;
		this.marca = marca;
		this.vitezaCurenta = vitezaCurenta;
		this.vitezaMaxima = vitezaMaxima;
		this.nrTrepte = nrTrepte;
		this.treaptaCurenta = treaptaCurenta;
		this.culoare = culoare;
	}
	
	public void accelerare(int delta)
	{
		if(delta + vitezaCurenta > vitezaMaxima) 
			vitezaCurenta = vitezaMaxima;
		else
			vitezaCurenta = vitezaCurenta + delta;
	}
	
	public void decelerare(int delta)
	{
		if(vitezaCurenta - delta < 0) 
			vitezaCurenta = 0;
		else
			vitezaCurenta = vitezaCurenta - delta;
	}
	public void schimbareTrepte(int treapta) {
		if(treaptaCurenta + treapta > nrTrepte)
			treaptaCurenta = nrTrepte;
		else if(treaptaCurenta + treapta < 0)
			treaptaCurenta = 0;
		else
			treaptaCurenta = treaptaCurenta + treapta;
	}
	
	
	
	
}
