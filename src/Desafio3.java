/*
Desafio
A corrida de tartarugas é um esporte que cresceu muito nos últimos anos, fazendo com que vários competidores se dediquem a capturar tartarugas rápidas, e treina-las para faturar milhões em corridas pelo mundo. Porém a tarefa de capturar tartarugas não é uma tarefa muito fácil, pois quase todos esses répteis são bem lentos. Cada tartaruga é classificada em um nível dependendo de sua velocidade:


Nível 1: Se a velocidade é menor que 10 cm/h .
Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
Nível 3: Se a velocidade é maior ou igual a 20 cm/h .

Sua tarefa é identificar qual o nível de velocidade da tartaruga mais veloz de um grupo.

Entrada
A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas: A primeira linha contém um inteiro L (1 ≤ L ≤ 500) representando o número de tartarugas do grupo, e a segunda linha contém L inteiros Vi (1 ≤ Vi ≤ 50) representando as velocidades de cada tartaruga do grupo.

Saída
Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da tartaruga mais veloz do grupo.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        //continue a solucao de acordo com o solicitado

        int maior = 0;
        int atual = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int velocidade = 0;
        int nivel = 0;
        int tentativas = 3;
        while (tentativas > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                arrayList.add(sc.nextInt());
                atual = arrayList.get(i);

                if (atual > maior) {
                    maior = atual;
                    velocidade = atual;

                    if (velocidade < 10) {
                        nivel = 1;

                    } else if (velocidade >= 10 && velocidade < 20) {
                        nivel = 2;

                    } else if (velocidade >= 20) {
                        nivel = 3;
                    }
                }
            }

            maior = 0;

            arrayList.clear();

            tentativas--;

            System.out.println(nivel);
        }
    }
}