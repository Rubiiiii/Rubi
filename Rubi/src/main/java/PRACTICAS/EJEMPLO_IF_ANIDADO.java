package PRACTICAS;

public class EJEMPLO_IF_ANIDADO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperatura = 26;
		if (temperatura > 15) {
			if (temperatura > 25) {
				System.out.println("A la playa!");
			} else {
				System.out.println("A la monta�a");
			}
		} else {

			System.out.println("A descansar");

		}
	}
}