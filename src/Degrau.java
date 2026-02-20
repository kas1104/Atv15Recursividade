import java.util.Scanner;

public class Degrau {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valorDegrau = sc.nextInt();

        subirDegrau(valorDegrau);

        //int valorSubida = subida(valorDegrau);

    }

    private static void subirDegrau(int degrau){
        //Se o numero de degraus a subir for menor ou iguar a 2 irá retorna somente o valor digitado pelo usuario,
        //Pois o numero de maneiras necessarias até 2 é somente o proprio 2 e a soma para resultar nele mesmo
        //E o 1 é somente ele mesmo
        if(degrau <= 2){
            System.out.println(degrau);
        }

        //Senão se o degrau for maior igual a 3 será realizado o calculo de fibonnacci, a partir de 3
        else if(degrau >= 3){

            //O valor do calculo de fibonacci é realizado por meio do  requisitos definidos na tarefa
            //Onde possuimos o topo e podemos subir a escada de um degrau por vez ou dois degraus por vez
            //Assim foram definidas as variaveis
            int topo = 0;
            int subir1 = 1;
            int subir2 = 2;

            //Estrutura de repetiçaõ que repete o enquanto a variavel x for menor ou igual ao valor definido pelo usuario
            //O valor começa a contar de 3 pois se contarmos a partir de 0 iremos considerar mais passos realizados de forma desnecessaria
            for(int x = 3; x <= degrau; x++){

                //É realizado o calculo de fibonacci onde o topo recebe a soma da subida1 + subida2
                topo = (subir2) + (subir1);

                //Neste trecho é realizado o parametro da logica para o calculo onde o subir1 irá receber o valor de subir2
                //E o subir2 irá receber o valor de topo para que a cadaa repetição ele some ao valor anterior
                subir1 = subir2;
                subir2 = topo;
            }
            //Aqui será retornado o valor de fibonnaci da quantidade de posssibilidades que há de subir pela escada
            System.out.println("A quantidade de maneiras possiveis para chegar ao topo é: " + topo);
        }
    }

}
