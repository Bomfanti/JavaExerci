package O_O_2;

import java.util.Scanner;

public class ContaCorrente {
    String conta;
    String agencia;
    String nomeCliente;
    double saldo;



    public void setConta() {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("\nDigite a conta do cliente: ");
        this.conta = scanner1.nextLine();
    }

    public void setAgencia() {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("\nDigite a agencia do cliente: ");
        this.agencia = scanner1.nextLine();
    }

    public void setNomeCliente() {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("\nDigite o nome do cliente: ");
        this.nomeCliente = scanner1.nextLine();
    }

    public double sacar() {
        System.out.println("Digite o valor a ser sacado: ");
        Scanner scanner1 = new Scanner(System.in);
        double valor = scanner1.nextDouble();

        if(saldo<=valor){
           System.out.println("Saldo Insuficiente ");
           return 0;
        }
        else{
            System.out.println("Saque realizado ");
            saldo-=valor;
            return 1;
        }
    }

    public void depositar() {
        System.out.println("Digite o valor a ser sacado: ");
        Scanner scanner1 = new Scanner(System.in);
        double quantidade = scanner1.nextDouble();
        this.saldo += quantidade;
    }

  public void imprimir() {
        System.out.println("------------------------");
        System.out.println("Nome: " +this.nomeCliente);
        System.out.println("Saldo: " +this.saldo);
        System.out.println("Conta: " +this.conta);
        System.out.println("Agencia: " +this.agencia);
        System.out.println("------------------------\n");
    }
}