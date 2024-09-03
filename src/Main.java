import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldo = 2550;
        String conta = "Conta Corrente";
        String nome = "Gabriel";
        int escolha = 0;


        System.out.println("********************");
        System.out.println("\nDados iniciais do Cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + conta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("\n********************");


        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor\s
                4 - Sair

               \s""";
        Scanner leitura = new Scanner(System.in);



        while (escolha != 4) {
            System.out.println(menu);
             escolha = leitura.nextInt();



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

