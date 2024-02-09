public class Estudiante implements Comparable<Estudiante>{

    String nombre;
    int edad;
    double altura;

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }

    public Estudiante(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public int compareTo(Estudiante o) {
        int resultado=0;
        if (this.altura<o.altura) {   resultado = 1;      }
        else if (this.altura>o.altura) {    resultado = -1;      }
        else {
            if (this.edad<o.edad) {  resultado = 1;    }
            else if (this.edad>o.edad) {   resultado = -1;   }
            else {   resultado = 0;   }
        }
        return resultado;
    }
}
