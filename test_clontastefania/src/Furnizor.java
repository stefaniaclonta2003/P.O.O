public class Furnizor {
    private String numeSRL;
    private String infoFiscal;
    private int bilant;

    public Furnizor(String numeSRL, String infoFiscal, int bilant)
    {
        this.bilant = bilant;
        this.numeSRL = numeSRL;
        this.infoFiscal = infoFiscal;
    }
    public Furnizor()
    {

    }

    public int getBilant() {
        return bilant;
    }

    public void setBilant(int bilant) {
        this.bilant = bilant;
    }

    public String getNumeSRL() {
        return numeSRL;
    }

    public void setNumeSRL(String numeSRL) {
        this.numeSRL = numeSRL;
    }

    public String getInfoFiscal() {
        return infoFiscal;
    }

    public void setInfoFiscal(String infoFiscal) {
        this.infoFiscal = infoFiscal;
    }

    @Override
    public String toString() {
        return "Furnizorul se numeste " + numeSRL + " are infoFiscal " + infoFiscal + " iar bilantul este " + bilant;
    }
}
