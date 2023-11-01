
public class MainClass {
	public static void main(String[] args)
	{
	NumarComplex a = new NumarComplex(5, 2);
	NumarComplex b = new NumarComplex(1, -1);
	System.out.println(a);
	System.out.println(b);
	System.out.println(a.adunare(b));
	System.out.println(a.scadere(b));
	System.out.println(a.inmultire(b));
	System.out.println(a.inmultireScalar(3));
	int[] arr = new int[3];
	int []arr2 = new int[] {1, 2, 3};
	arr2 = arr; //shallow copy
	arr2[1] = 5;
	//arr2 = System.arrayCopy(arr); // deep copy
	System.out.println(arr[1]);
	
	for(int i = 0; i < arr.length; i++)
	{
		arr[i] = i;
		
	}
	for(int element : arr) {
		System.out.println(element);
	}
	int aux;
	int i = 0;
	int j = arr.length-1;
	while(i < j) {
		aux = arr[i];
		arr[i] = arr[j];
		arr[j] = aux;
		i++;
		j--;
	}
	
	NumarComplex [][] matrice = new  NumarComplex[3][3];
	int rows = matrice.length;
	int cols = matrice[0].length;
	i = 0;
	j = 0;
	MatriceComplex m1 = new MatriceComplex(3, 3);
	MatriceComplex m2 = new MatriceComplex(3, 3);	
	
	for(i = 0; i < rows; i++) {
		for(j = 0; j < cols; j++) {
			NumarComplex k = new NumarComplex(i, j);
			matrice[i][j] = k;
		}
	}
	m1.matrice = matrice;
	m2 = m1.add(m1);
	for(i = 0; i < rows; i++) {
		for( j = 0; j < cols; j++) {
			System.out.print(m1.matrice[i][j]);
			System.out.print(" ");
		}
		System.out.print("\n");
	}
	m2 = m1.sub(m1);
	for(i = 0; i < rows; i++) {
		for( j = 0; j < cols; j++) {
			System.out.print(m1.matrice[i][j]);
			System.out.print(" ");
		}
		System.out.print("\n");
	}
	m2 = m1.mult(3);
	for(i = 0; i < rows; i++) {
		for( j = 0; j < cols; j++) {
			System.out.print(m1.matrice[i][j]);
			System.out.print(" ");
		}
		System.out.print("\n");
	}
	
}
	
	
}
