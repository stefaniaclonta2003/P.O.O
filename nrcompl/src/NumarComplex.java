public class NumarComplex {
    private int parteR;
    private int parteI;

    public int getParteI() {
        return parteI;
    }

    public void setParteI(int parteI) {
        this.parteI = parteI;
    }

    public int getParteR() {
        return parteR;
    }

    public void setParteR(int parteR) {
        this.parteR = parteR;
    }
    public NumarComplex(int parteI, int parteR)
    {
        this.parteI = parteI;
        this.parteR = parteR;
    }
    public NumarComplex()
    {

    }

   public NumarComplex adunare(NumarComplex a)
   {
       NumarComplex res = new NumarComplex(parteR+a.parteR, parteI+a.parteI);
       return res;
   }
    public NumarComplex scadere(NumarComplex a)
    {
        NumarComplex res = new NumarComplex(parteR-a.parteR, parteI-a.parteI);
        return res;
    }
   public NumarComplex inm_scalar(int x)
   {
       NumarComplex res = new NumarComplex(parteR*x, parteI*x);
       return res;
   }
   public NumarComplex inmultire(NumarComplex a)
   {
       NumarComplex res = new NumarComplex(0, 0);
       res.parteI = (a.parteI * parteR) + (a.parteR * parteI);
       res.parteR = (a.parteR *parteR) + (a.parteI *parteI);
       return res;
   }

    @Override
    public String toString() {
        return parteR + "+j*" + parteI;
    }
}
