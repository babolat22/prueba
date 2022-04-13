package guia2;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class Ejercicio6 {
    public static void main(String[] args) {
      /*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual.*/
         Cafetera caf = new Cafetera();
         Cafetera caf2 = new Cafetera(500, 0);
         caf2.servirTaza(50); // 50cc
         caf2.agregarCafe(200);
         caf.llenarCafetera();
         caf2.vaciarCafetera();
         System.out.println("Se tiro todo el cafe viejo...");
         caf.servirTaza(200);
    }
    
    static class Cafetera{
        private int capacidadMaxima; 
        private int cantidadActual; 

        public Cafetera() { this.capacidadMaxima = 450; }
        
        public void llenarCafetera() {
            this.cantidadActual = this.capacidadMaxima;
        }
        public void servirTaza(int taza) {  //simula la acción de servir la taza con la capacidad indicada
            if (cantidadActual>0){    // si hay algo de cafe
                if (taza>cantidadActual){
                    this.cantidadActual = 0;   
                    System.out.println("No alcanzo para llenar, pero algo de cafe se sirvio!. Ha quedado vacia.");
                }else{
                    this.cantidadActual -= taza;
                    System.out.println("Se sirvio una taza de cafe, quedan "+ this.cantidadActual + "cc");
                }       
            }else  System.out.println("NO queda NADA de cafe, en la cafetera ");
        }
        
        public void agregarCafe(int cantCafe) {
            this.cantidadActual += cantCafe;
            System.out.println("Hicimos mas cafe! Ahora hay "+ this.cantidadActual+ "cc");
        }
        public void vaciarCafetera() {
            this.cantidadActual = 0;
        }
        public Cafetera(int capacidadMaxima, int cantidadActual) {
            this.capacidadMaxima = capacidadMaxima;
            this.cantidadActual = cantidadActual;
        }

        public int getCapacidadMaxima() {
            return capacidadMaxima;
        }

        public void setCapacidadMaxima(int capacidadMaxima) {
            this.capacidadMaxima = capacidadMaxima;
        }

        public int getCantidadActual() {
            return cantidadActual;
        }

        public void setCantidadActual(int cantidadActual) {
            this.cantidadActual = cantidadActual;
        }
        
    }
}