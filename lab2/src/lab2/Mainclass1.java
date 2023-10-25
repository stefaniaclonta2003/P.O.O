package lab2;

import java.util.Scanner;

public class Mainclass1 {

	//problema 2
/*	public static void main(String[] args) {
	
		int varsta = 20, sex = 0, inaltime = 175;
		int varsta_nou, sex_nou, inaltime_nou;
		short wrap;
		wrap = (short)inaltime;
		wrap = (short)(wrap | (sex << 8));
		wrap = (short)(wrap | (varsta << 9));
		
		inaltime_nou = wrap & 0xff;
		sex_nou = (wrap >> 8) & 1;
		varsta_nou = (wrap >> 9)& 0x7f;
		
		System.out.println(inaltime_nou);
		System.out.println(sex_nou);
		System.out.println(varsta_nou);
	}
		*/
		
		//problema 4
	/*public static void main(String[] args) {
		String str1="Ana are ";
		String str2="mere";
		String str3=str1+str2;
		System.out.println(str3=="Ana are mere");
		System.out.println(str3.equals("Ana are mere"));
		}
		*/
		
		//problema 1
		
/*	public static void main(String[] args) {
		int n = 10, m = 25;
		int i, j, k, x=0, y=0, nrprim;
		int ok = 0;
        for(i = n; i <= m; i++)
        {
            if(i%2 == 0)
            {
                nrprim = 0;
                
            }
                
        }

}
*/
//problema 3

  public static void main(String[] args) {
	  
	  int nr_consoane = 0;
	  int nr_vocale = 0;
	 Scanner c = new Scanner(System.in);
	 String str = c.nextLine();
	 int ok; 
	 for(int i = 0; i < str.length(); i++)
	 {
		 if((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u'))
		 nr_vocale++;
		 else
			 nr_consoane++;
	 }
	 System.out.println("Numar de consoane: " + nr_consoane);
     System.out.println("Numar de vocale: " + nr_vocale);
    
     Scanner vocScanner = new Scanner(System.in);
     System.out.print("Introduceți vocala căutată: ");
     char voc = vocScanner.next().charAt(0);

     int found = 0;
     for (int j = 0; j < str.length(); j++) 
     {
         if (str.charAt(j) == voc) 
         {
             System.out.println("Vocala '" + voc + "' se găsește la indexul " + j);
             found = 1;
         }
     }    
	  
  }
}
	 


  
  
  
  
  
  
  
  
  
  
  
  

