//Ejercicio, mayor de 3 esferas
import java.util.Scanner;
public class EjercicioPropuesto24 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double pesoA, pesoB, pesoC; //Declaracion de variables
        System.out.println("Ingrese peso de esfera A: ");
        pesoA=entrada.nextDouble();
        System.out.println("Ingrese peso de esfera B: ");
        pesoB=entrada.nextDouble();
        System.out.println("Ingrese peso de esfera C: ");
        pesoC=entrada.nextDouble();
        if(pesoA>pesoB && pesoA>pesoC){ //Se comparan pesos
            System.out.println("La esfera A es la de mayor peso");
        }else if(pesoB>pesoA && pesoB>pesoC){
            System.out.println("La esfera B es la de mayor peso");
        }else{
            System.out.println("La esfera C es la de mayor peso");
        }
    }
}
