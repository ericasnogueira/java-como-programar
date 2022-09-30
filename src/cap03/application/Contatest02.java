package cap03.application;

import cap03.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Contatest02 {
    public static void main(String[] args) {
        /*
        Modifique a classe Conta para fornecer um método chamado saque que retira di-
        nheiro de uma Conta. Assegure que o valor de débito não exceda o saldo de Conta. Se exceder, o
        saldo deve ser deixado inalterado e o método deve imprimir uma mensagem que indica [Valor de débito excedeu
        o saldo da conta].
         */


        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Conta conta = new Conta("Erica", 500.0);

        double dinheiro = entrada.nextDouble();
        conta.saque(dinheiro);



    }
}
