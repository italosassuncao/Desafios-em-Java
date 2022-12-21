import java.util.Scanner;

class Classe{
    public static void main(String[] args){
        //declare suas variaveis do tipo double
        // continue a solucao
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();

        double area = 3.14159 * (raio * raio);

        System.out.printf("A=%.4f\n", area);
    }
}