public class MainEjercicio6 {

    public static void main(String[] args) {

        Rectangulo2 rectangulo21 = new Rectangulo2(2,3);
        Rectangulo2 rectangulo22 = new Rectangulo2(4,7);
        Rectangulo2 rectangulo23 = new Rectangulo2(7,8);

        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");

        if (rectangulo21.compareTo(rectangulo22) < 0 ) { System.out.println("El rectángulo21: es menor."); }
        else if (rectangulo21.compareTo(rectangulo22) > 0 ) {System.out.println("El rectángulo22: es mayor."); }

        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");

        if (rectangulo23.compareTo(rectangulo21) < 0 ) { System.out.println("El rectángulo23: es menor."); }
        else if (rectangulo23.compareTo(rectangulo21) > 0 ) {System.out.println("El rectángulo23: es mayor."); }



       /* System.out.println("Rectángulo 1:" + rectangulo21.getArea());
        System.out.println("Rectángulo 2:" + rectangulo21.getArea());
        System.out.println("Rectángulo 3:" + rectangulo21.getArea());
        System.out.println("Rectángulo 4:" + rectangulo21.getArea());
        System.out.println("Rectángulo 5:" + rectangulo21.getArea());
        System.out.println("Rectángulo 6:" + rectangulo21.getArea());
        System.out.println("Rectángulo 7:" + rectangulo21.getArea());
        System.out.println("Rectángulo 8:" + rectangulo21.getArea());
        System.out.println("Rectángulo 9:" + rectangulo21.getArea());
        System.out.println("Rectángulo 10:" + rectangulo21.getArea());*/
    }
}
