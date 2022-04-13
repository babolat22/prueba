package guia2;
/**
 *
 * @author juanj
 */
public class Ejercicio4 {
    public static void main(String[] args) {
      /*Declarar una clase llamada Rectangulo que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos*/
         Rectangulo rec = new Rectangulo(3,4);
         System.out.println("dibujando rectangulo de 3 x 4...");
         rec.dibujarRectangulo();
    }
    
    static class Rectangulo{
        private float base; 
        private float altura; 

        public void dibujarRectangulo() {
            int i=0, j=0;
         
            while(i<base) {
                while(j<altura) {
                   System.out.print("*");
                   j++;
                }
                System.out.println();
                j=0;
                i++;
            }  
        }
        
        public float getBase() {
            return base;
        }

        public void setBase(float base) {
            this.base = base;
        }

        public float getAltura() {
            return altura;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }
        
        public Rectangulo(float base, float altura) {
            this.base = base;
            this.altura = altura;
        }
        
        // sup = base ∗ altura
        public double superficie(){
            double sup = base * altura;
            return sup;
        }
        // peri = 2 * pi * radio
        public double perimetro(){
            return  2 * (base+altura);
        }
     }
}