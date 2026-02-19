import java.util.Scanner;
import escada.entity.Escada;

public class Degrau {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor");
        int valorDegrau = sc.nextInt();

        new Escada(valorDegrau);
    }
}
