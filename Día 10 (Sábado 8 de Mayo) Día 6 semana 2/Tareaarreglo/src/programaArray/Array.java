package programaArray;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
			int [] edades = new int[10];
			Scanner lector = new Scanner(System.in);
			int edad, cont=0;

			/*Ingresa las edades mayores de edad al arreglo*/
			while(cont<10)
			{
				do
				{
					System.out.print("Ingrese la edad de la persona: ");
					edad = lector.nextInt();

					if(edad<0 || edad>150)
					{
						System.out.println("La edad de la persona no puede ser inferior a 0 o mayor a 150");
					}
				}
				while(edad<0 || edad>150);

				if(edad>=18)
				{
					edades[cont] = edad;
					cont++;
				}
			}

			System.out.println("Edades sin ordenar");
			for(int i = 0; i<10; i++)
			{
				System.out.print(edades[i] + " ");
			}

			/*Ordenar arreglo*/
			for (int i = 0; i < edades.length; i++)
			{
				for (int j = 0; j < edades.length-i-1; j++)
				{
					if(edades[j] > edades[j+1])
					{
						int tmp = edades[j+1];
						edades[j+1] = edades[j];
						edades[j] = tmp;
					}
				}
			}

			System.out.println("\nEdades ordenadas");
			for(int i = 0; i<10; i++)
			{
				System.out.print(edades[i] + " ");

	}//Llave main
	}
}//Llave de Cierre
