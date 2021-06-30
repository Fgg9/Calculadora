package CalculadoraJohan;

public class CalculadoraJohan {

    public static void main(String[] args) {

        IntroducirDatos leerValor = new IntroducirDatos();
        
        Resta restar = new Resta();
        Multiplicacion multiplicar = new Multiplicacion();
        Division dividir = new Division();

        int opcion; 
        
        do {
            System.out.println("\n<<<<<<<< Calculadora Johan >>>>>>>>>>>>\n");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("0. Salir");

            opcion = leerValor.LeerOpcion();

            double num1, num2;

            switch (opcion) {

                case 1:
                    Suma sumar = new Suma();
                    num1 = leerValor.PrimerValor();
                    num2 = leerValor.SegundoValor();
                    sumar.Sumar(num1,num2);
                    break;
                
                case 2:
                    num1 = leerValor.PrimerValor();
                    num2 = leerValor.SegundoValor();
                    restar.Restando(num1,num2);
                    break;

                case 3:
                    num1 = leerValor.PrimerValor();
                    num2 = leerValor.SegundoValor();
                    multiplicar.Multiplicando(num1,num2);
                    break;

                case 4:
                    num1 = leerValor.PrimerValor();
                    num2 = leerValor.SegundoValor();
                    dividir.Dividiendo(num1,num2);
                    break;

                default:
                    System.out.println("<<Opcion no valida>>");
             
            }

        }while (opcion != 0);
     

    }

}
