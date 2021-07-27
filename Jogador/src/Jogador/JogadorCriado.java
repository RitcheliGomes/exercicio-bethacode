package Jogador;



import java.util.Scanner;

public class JogadorCriado {
    public static void main(String[] args) {

        Jogador jogador01 = new Jogador();

        jogador01.setNome(" THOR ");
        jogador01.setForca(23);
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println(" *******************");
            System.out.println("  Menu Jogador ");
            System.out.println(" 1- dar chute ");
            System.out.println(" 2- dar soco ");
            System.out.println(" 3- beber agua ");
            System.out.println(" 4 -comer pao ");
            System.out.println(" 5- Historico do jogador  ");
            System.out.println(" 6- opção invalida  ");

            System.out.print(" --Selecione uma opção :: ");

            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    jogador01.chute();
                    break;
                case 2:
                    jogador01.soco();
                    break;
                case 3:
                    jogador01.beberAgua();
                    break;
                case 4:
                    jogador01.comerPao();
                    break;
                case 5 :
                    jogador01.imprimirHistorico();
                    break;
                default:
                    System.out.println("Encerrar");

            }


        } while (opcao != 6);


    }
}
