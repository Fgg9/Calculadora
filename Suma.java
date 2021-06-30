package CalculadoraJohan;

public class Suma {

    //Atributos de la clase
    double num1, num2;
    
    // constructor 
    public Suma() {
    }

    // metodo
    public void Sumar(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        double resultado = this.num1 + this.num2;
        System.out.println("El resultado de la suma es: " + resultado);            
    }
    
}

