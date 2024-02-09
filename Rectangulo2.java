public class Rectangulo2 implements Comparable<Rectangulo2> {


    double ancho = 2;
    double alto = 3;

    public Rectangulo2(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }


    @Override
    public int compareTo(Rectangulo2 o) {
        int resultado=0;
        if (this.ancho<o.ancho) {   resultado = -1;      }
        else if (this.ancho>o.ancho) {    resultado = 1;      }
        else {
            if (this.alto<o.alto) {  resultado = -1;    }
            else if (this.alto>o.alto) {   resultado = 1;   }
            else {   resultado = 0;   }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Rectangulo2{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }




    public void redimensionar(int x) {
     this.ancho *= x;
     this.alto *= x;
     }

    public double getArea(){
        return ancho * alto;

    }

    public double getPerimiter(){
        return (2 * ancho) + (2 * alto);
    }


}
