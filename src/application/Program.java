package application;

import entities.Corrida;

public class Program {

	public static void main(String[] args) {

		Corrida corrida = new Corrida("Matt", 7);
		Corrida outraCorrida = new Corrida("John", 5);

		System.out.println();
		System.out.println(corrida.ultrapassagem(outraCorrida));
		System.out.println("Ok");
	}

}
