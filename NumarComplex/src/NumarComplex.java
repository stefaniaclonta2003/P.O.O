public class NumarComplex {
	private int parteRe;
	private int parteIm;
	
	
	public NumarComplex(int parteRe, int parteIm)
	{
		this.parteRe = parteRe;
		this.parteIm = parteIm;
	}
	
	public NumarComplex adunare(NumarComplex b) {
		NumarComplex rez = new NumarComplex(0, 0);
		rez.parteRe = b.parteRe + parteRe;
		rez.parteIm = b.parteIm + parteIm;
		return rez;
	}
	
	@Override
	public String toString() {
		return parteRe + "+" +  parteIm + "xi";
	}
	
	public NumarComplex scadere(NumarComplex c) {
		NumarComplex rez2 = new NumarComplex(0, 0);
		rez2.parteRe = c.parteRe - parteRe;
		rez2.parteIm = c.parteIm - parteIm;
		return rez2;
	}
	public NumarComplex inmultire (NumarComplex d) {
		NumarComplex rez3 = new NumarComplex(0, 0);
		rez3.parteRe = (d.parteRe * parteRe) + (d.parteIm + parteIm);
		rez3.parteIm = (d.parteIm * parteRe) + (d.parteRe * parteIm);
		return rez3;
		
		}
	public NumarComplex inmultireScalar(int e) {
		NumarComplex rez4 = new NumarComplex(0, 0);
		rez4.parteRe = e * parteRe;
		rez4.parteIm = e * parteIm;
		return rez4;
	}
	
}
