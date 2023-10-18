import java.math.BigInteger;

public class ProblemaBoabelor 
{
    public static void main(String[] args) 
    {
        BigInteger nrBoabe = BigInteger.ZERO;
        BigInteger sum = BigInteger.ONE;
        int nrCasete = 64;
        int i;
        for (i = 1; i <= nrCasete; i++) 
        {
            nrBoabe = nrBoabe.add(sum);
            sum = sum.multiply(BigInteger.valueOf(2));
        }
        System.out.println("Numarul total de boabe este: " + nrBoabe);
    }
}
