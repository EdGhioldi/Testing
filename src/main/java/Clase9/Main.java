package Clase9;

public class Main {
    public static void main(String[] args) {

        try{
            Calculadora calc = new Calculadora();
            System.out.println("Suma " + calc.sumar(3,2));
            System.out.println("Multiplicacion " + calc.multiplicar(5,3));
            System.out.println("Restar " + calc.restar(10,5));
            System.out.println("Dividir " + calc.dividir(8,0));
        }
        catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}