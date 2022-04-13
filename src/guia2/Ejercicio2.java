package guia2;
/**
 *
 * @author juanj
 */
public class Ejercicio2 {
    public static void main(String[] args) {
      /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos*/
         Circunferencia circulo = new Circunferencia((float) 3.6);
         System.out.println("El area dela circunferencia es: "+ circulo.area());
         System.out.println("El perimetro de la circunferencia es: " + circulo.perimetro());
    }
    
    static class Circunferencia{
        private float radio; 
        private final double PI = 3.141516; 
        
        public Circunferencia(float radio) {
            this.radio = radio;
        }
        
        public void crearCircunferencia(float radio) {
            this.radio = radio;
        }
       
        // Area = π ∗ radio2
        public double area(){
            double area = PI * radio * radio;
            return area;
        }
        // peri = 2 * pi * radio
        public double perimetro(){
            return  2 * PI * radio;
        }
        
        public float getRadio() {
            return radio;
        }

        public void setRadio(float radio) {
            this.radio = radio;
        }
    }
}