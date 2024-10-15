import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double areaTriangulo = a * c / 2;
        double areaCirculo = c * c * 3.14159;
        double areaTrapezio = (a + b) * c / 2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;
        System.out.printf("TRIANGULO: %.3f%n",areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n",areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n",areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n",areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n",areaRetangulo);
    }
}