package borradores;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BorradorFecha {

	public static void main(String[] args) {
	 
		System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
		Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date testDate = null;
		String date = fecha;
		    try{
		        testDate = df.parse(date);
		        System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+testDate);
		   } catch (Exception e){ System.out.println("invalid format");}
		        if (!df.format(testDate).equals(date)){
		            System.out.println("invalid date!!");
		        } else {
		            System.out.println("valid date");
		        }
		        sc.close();
		    }
	
	}
