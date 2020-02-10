

public class Ejercicio01_Suma_Media_Mayor_Menor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//construimos array
		int numeros [] = new int[150];
		
		//inicializamos array
		for (int i=0; i < numeros.length; i++ ) {
			numeros[i]= i+1;
		}
		for (int i=0; i< numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		

	 
		
		int num = Utils.obtenerNumeroAleatorio();

		int array [] = Utils.creaArrayNumerosAzar(10, 0, 20);
		Utils.mostrarArray(array);
		int num1 = Utils.obtenerNumeroAzar(0, 10);

		System.out.println("El número aleatorio es " + num1);
	}

}
