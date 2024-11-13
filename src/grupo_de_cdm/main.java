package grupo_de_cdm;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		// User 1 fer la suma dels elements de sumArray
		
		int recSuma = 0;
		for (int i = 0; i < sumArray.length; i++) {
			recSuma = recSuma + sumArray[i];
		}
		System.out.println("El resultat de la suma es = ");
		System.out.println(recSuma);
		
		// User 2 fer la resta dels elements de subArray 
		
		int resultadoResta = 0;
		
		for(int i = 0; i < subArray.length; i++) {
		
		resultadoResta =  subArray[i] - resultadoResta;
		}
		
		System.out.println("Resultado Resta" + resultadoResta);
		
		
		// User 3 fer la multiplicació dels elements de prodArray
		
		
		
		
	}
}
