package O_O_2;
import java.util.Scanner;

public class PrincipalContaCorrente {
    public static void main(String[] Args) {
        int escolha;
        ContaCorrente pessoa1 = new ContaCorrente();


        do {
            System.out.print("\n1-Cadastrar");
            System.out.print("\n2-Sacar");
            System.out.print("\n3-Depositar ");
            System.out.print("\n4-Consultar ");
            System.out.print("\n5-Sair");
            System.out.print("\nEscolha uma opção: ");


            Scanner scanner = new Scanner(System.in);
            escolha = scanner.nextInt();



            switch (escolha) {
                case 1:
                    pessoa1.setNomeCliente();
                    pessoa1.setConta();
                    pessoa1.setAgencia();
                    break;
                case 2:
                    pessoa1.sacar();
                    break;
                case 3:
                    pessoa1.depositar();
                    break;
                case 4:
                    pessoa1.imprimir();
                    break;

                case 5:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Inválido");
                    break;
            }
        } while (escolha != 5);
    }
}

