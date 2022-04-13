package guia2;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class Ejercicio3 {
    public static void main(String[] args) {
      /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos*/
         Operacion op =  new Operacion();
         op.crearOperacion();
         System.out.println("Suma: "+ op.sumar());
         System.out.println("Resta: "+ op.restar());
         System.out.println("Dividir: "+ op.dividir());
         Operacion op2 =  new Operacion(2,0);
         System.out.println("Multiplicar: "+ op2.multiplicar());
    }
    
    static class Operacion{
        private float nro1; 
        private float nro2; 

        public Operacion() {
        }

        public Operacion(float nro1, float nro2) {
            this.nro1 = nro1;
            this.nro2 = nro2;
        }
        public void crearOperacion() {
            System.out.println("Ingresa por teclado ambos numeros: ");
            Scanner sc = new Scanner(System.in);
            nro1 = sc.nextInt();
            nro2 = sc.nextInt();
        }
        public float sumar() {
            return nro1 + nro2;
        }
        public float restar() {
            return nro1 - nro2;
        }
        public float multiplicar() {
            if (nro1!=0 && nro2!=0)
                return nro1 * nro2;
            else 
                System.out.println("ERROR//");
                return 0;
        }
        public float dividir() {
            if (nro2!=0)
                return nro1 / nro2;
            else 
                System.out.println("DIVISION POR ZERO//");
                return 0;
        }
      }
}