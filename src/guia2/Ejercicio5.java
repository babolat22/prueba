package guia2;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class Ejercicio5 {
    public static void main(String[] args) {
      /*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual.*/
         Cuenta c1 = new Cuenta();
         Cuenta c2 = new Cuenta(162, 35689741, 12000);
         c2.consultarDatos();
         c2.ingresar(5000);
         System.out.println("Saldo: $"+ c2.consultarSaldo());
         c2.retirar(3000);
         c1.retirar(200);
         c2.extraccionRapida(15000);
         System.out.println("Saldo: $"+ c2.consultarSaldo());
         
    }
    
    static class Cuenta{
        private int numeroCuenta; 
        private long DNI; 
        private float saldo;

        public Cuenta(int numeroCuenta, long DNI, float saldo) {
            this.numeroCuenta = numeroCuenta;
            this.DNI = DNI;
            this.saldo = saldo;
        }

        public Cuenta() {
        }
        public void ingresar(double ingreso){
            this.saldo+=ingreso;
            System.out.println("Fondos ingresados "+ingreso+ "$$$$ !");
        } 
        public void retirar(double retiro){
            if (retiro<=saldo){
                this.saldo-=retiro;
                System.out.println("Salen "+ retiro + " de las arcas");
            }else
                System.out.println("No se puede retirar mas de LO QUE TIENE!");
        }
        public void extraccionRapida(double retiro){
            if (retiro<=saldo*0.2)
                this.saldo-=retiro;
            else
                System.out.println("No se puede retirar mas del 20% del saldo!");
        }
        public int getNumeroCuenta() {
            return numeroCuenta;
        }

        public void setNumeroCuenta(int numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }

        public long getDNI() {
            return DNI;
        }

        public void setDNI(long DNI) {
            this.DNI = DNI;
        }

        public float consultarSaldo() {
            return saldo;
        }

        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }

        public String consultarDatos() {
            return "info de Cuenta{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldo=" + saldo + '}';
        }
  }
}