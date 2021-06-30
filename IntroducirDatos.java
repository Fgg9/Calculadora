package CalculadoraJohan;

import java.util.Scanner;

public class IntroducirDatos {

    Scanner scanner = new Scanner(System.in);
    //Atributos de la clase
    int opcion;
    double num1, num2;
    
    // constructor 
    public IntroducirDatos() {
    }
    // 1er metodo 
    public int LeerOpcion() {
        
        System.out.println("\nIngrese la operacion que desea realizar");
        opcion = Integer.parseInt(scanner.nextLine());
        return opcion;      
        
    }
    public double PrimerValor() {

        System.out.println("\nPrimer Valor = ");
        num1 = Double.parseDouble(scanner.nextLine());
        return num1;        
    }
    public double SegundoValor() {

        System.out.println("\nSegundo Valor = ");
        num2 = Double.parseDouble(scanner.nextLine());
        return num2;
    }

}

