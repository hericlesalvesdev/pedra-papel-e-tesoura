import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] itens = {"pedra", "papel", "tesoura"};

        System.out.println("Seja bem vindo ao jogo de pedra, papel e tesoura :D");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Escolha sua opção: ");
        System.out.println("[0 - Pedra] [1 - Papel] [2 - Tesoura]");

        int maquina = random.nextInt(3);
        int jogador = sc.nextInt();

        System.out.println("JO");
        System.out.println("KEN");
        System.out.println("PO");

        System.out.println("O jogador escolheu: " + itens[jogador]);
        System.out.println("O computador escolheu: " + itens[maquina]);

        //Lógica

        if (jogador == maquina) {
            System.out.println("EMPATE");
        } else if (maquina == 0) {
            if (jogador == 1) {
                System.out.println("JOGADOR GANHOU");
            } else if (jogador == 2) {
                System.out.println("MÁQUINA VENCEU");
            }
        } else if (maquina == 1) {
            if (jogador == 0) {
                System.out.println("MÁQUINA GANHOU");
            } else if (jogador == 2) {
                System.out.println("JOGADOR GANHOU");
            }
        } else if (maquina == 2) {
            if (jogador == 0) {
                System.out.println("JOGADOR VENCEU");
            } else if (jogador == 1) {
                System.out.println("MÁQUINA VENCEU");
            }
        }
    }
}
