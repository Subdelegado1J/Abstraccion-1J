import java.util.Arrays;

public class MainEjercicio7 {

    public static void main(String[] args) {

        Estudiante Patri = new Estudiante("Patri",12,170);
        Estudiante Manuel = new Estudiante("Manuel",43,173);
        Estudiante Javier = new Estudiante("Javier",72,189);
        Estudiante Alicia = new Estudiante("Alicia",52,168);
        Estudiante Alberto = new Estudiante("Alberto",35,189);

        
        Estudiante[] nombreArray = {
                Patri,
                Manuel,
                Javier,
                Alicia,
                Alberto};

        System.out.println("------------------------------");
        System.out.println("ESTUDIANTES SIN ORDENAR");
        for (Estudiante nombrevariable:nombreArray
             ) {
            System.out.println(nombrevariable);
        }
        Arrays.sort(nombreArray);
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("ESTUDIANTES ORDENADOS");
        for (Estudiante nombrevariable:nombreArray
        ) {
            System.out.println(nombrevariable);
        }
    }
}

