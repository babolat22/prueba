package guia2;

/**
 *
 * @author juanj
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor con 
todos los atributos pasados por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el numero de páginas*/
      Libro lib = new Libro(2658, "Los mares de acero", "Felipe Soloa", 216);
      Libro lib2 = new Libro(2659, "Guardianes del alma", "Jesus Maria Rozales", 216);
      System.out.println(lib.toString());
      System.out.println(lib2.toString());
        System.out.println("tienen las misma cantida? "+ lib.compararPaginas(lib2));
    }
    
    static class Libro{
        int ISBN; 
        String título; 
        String autor; 
        int nroPaginas;

        public Libro(int ISBN, String título, String autor, int nroPaginas) {
            this.ISBN = ISBN;
            this.título = título;
            this.autor = autor;
            this.nroPaginas = nroPaginas;
        }

        @Override
        public String toString() {
            return "Libro{" + "ISBN=" + ISBN + ", t\u00edtulo=" + título + ", autor=" + autor + ", nroPaginas=" + nroPaginas + '}';
        }

        private boolean compararPaginas(Libro lib2) {
           return this.nroPaginas==lib2.nroPaginas;
        }
    
    }
            
}
