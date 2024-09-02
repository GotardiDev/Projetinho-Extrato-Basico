import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldo = 2200;
        boolean conta = true;
        String nome = "Gabriel";


        System.out.println("********************");
        System.out.println("_");
        System.out.println("Dados iniciais do Cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + conta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("_");
        System.out.println("********************");


        int escolha = 0;


        while (escolha != 4) {
            System.out.println("-----Menu-----");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Seu Saldo é : " + saldo);
            } else if (escolha == 2) {
                System.out.print("Digite o valor a ser recebido: ");
                int valor = scanner.nextInt();
                saldo = saldo + valor;
                System.out.println("Você recebeu:" + valor);
            } else if (escolha == 3) {
                System.out.println("Digite o valor a ser transferido: ");
                int transfere = scanner.nextInt();
                boolean valida = (transfere > saldo);
                if (valida == true) {
                    System.out.println("Saldo insuficiente para transferir");
                } else {saldo = saldo - transfere;
                    System.out.println("Você Transferiu :" + transfere);
                }
                } else if (escolha == 4) {
                    System.out.println("Saiu do sistema.");
                } else {
                    System.out.println("opção invalida");
                }


            }

        }
    }

