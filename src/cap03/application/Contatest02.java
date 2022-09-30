package cap03.application;

import cap03.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Contatest02 {
    public static void main(String[] args) {
        /*
        Modifique a classe Conta para fornecer um m�todo chamado saque que retira di-
        nheiro de uma Conta. Assegure que o valor de d�bito n�o exceda o saldo de Conta. Se exceder, o
        saldo deve ser deixado inalterado e o m�todo deve imprimir uma mensagem que indica [Valor de d�bito excedeu
        o saldo da conta].
         */


        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Conta conta = new Conta("Erica", 500.0);

        double dinheiro = entrada.nextDouble();
        conta.saque(dinheiro);



    }
}
