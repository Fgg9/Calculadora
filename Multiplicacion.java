package CalculadoraJohan;

public class Multiplicacion {

    //Atributos de la clase
    double num1, num2;
    
    // constructor 
    public Multiplicacion() {
    }

    // metodo
    public void Multiplicando(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        double resultado = this.num1 * this.num2;
        System.out.println("El resultado de la multiplicacion es: " + resultado);              
    }
    
}

