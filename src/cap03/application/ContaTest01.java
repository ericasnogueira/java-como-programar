package cap03.application;


import cap03.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

// Usando o construtor de Conta para inicializar a instancia nome
//variavel no momento em que cada objeto conta é criado
public class ContaTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        //criando dois objetos Conta
        Conta conta1 = new Conta("Jane Green",50.0);
        Conta conta2 = new Conta("John Blue",-7.53);// o saldo sera 0 pq o construtor rejeitou em iniciar
        //conta2 com saldo negativo

        //exibindo o valor inicial de nome para cada Conta
        System.out.println("Conta 1 : "+ conta1.getNome());
        System.out.println("Conta 2 : "+ conta2.getNome());
        System.out.println();

        //exibe saldo inicial de cada objeto
        System.out.printf("Conta 1 : $%.2f%n", conta1.getSaldo());
        System.out.printf("Conta 2 : $%.2f%n", conta2.getSaldo());
        System.out.println();


        System.out.println("Depositando na conta 1");
        double deposito1 = entrada.nextDouble();
        conta1.deposita(deposito1);// adicionando o saldo da conta1
        System.out.printf("adicionando  na conta 1: %.2f%n", deposito1);
        System.out.println();

       //exibe saldos
        System.out.println(conta1.getNome() + " "+ conta1.getSaldo());
        System.out.println(conta2.getNome() + " "+ conta2.getSaldo());
        System.out.println();


        System.out.println("Depositando na conta 2");
        deposito1 = entrada.nextDouble();
        conta2.deposita(deposito1);// adicionando o saldo da conta1
        System.out.printf("adicionando  na conta 2: %.2f%n", deposito1);
        System.out.println();

        //exibe saldos
        System.out.printf("%s : $%.2f%n", conta1.getNome(),conta1.getSaldo());
        System.out.printf("%s: $%.2f%n",conta2.getNome(), conta2.getSaldo());


    }
}
