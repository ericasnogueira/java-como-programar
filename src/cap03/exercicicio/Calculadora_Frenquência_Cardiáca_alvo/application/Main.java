package cap03.exercicicio.Calculadora_Frenquência_Cardiáca_alvo.application;

import cap03.exercicicio.Calculadora_Frenquência_Cardiáca_alvo.entities.HeartRates;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String pessoaNome;
        String pessoaSobrenome;
        int pessoaDia;
        int pessoaMes;
        int pessoaAno;
        int diaCorrente;
        int mesCorrente;
        int anoCorrente;

        System.out.println("\t Frequencia Cardiaca");
        System.out.println("\n");

        System.out.println("Informe a data (hoje) : ");
        System.out.print("Informe ANO :");
        anoCorrente = input.nextInt();
        System.out.print("Informe MES: ");
        mesCorrente = input.nextInt();
        System.out.print("Informe DIA :");
        diaCorrente = input.nextByte();

        System.out.println("\n");

        System.out.print("Informe NOME : ");
        pessoaNome = input.next();
        System.out.print("Informe SOBRENOME : ");
        pessoaSobrenome = input.next();

        System.out.print("Informe Ano Nascimento : ");
        pessoaAno = input.nextInt();
        System.out.print("Informe Mes Nascimento : ");
        pessoaMes = input.nextInt();
        System.out.print("Informe Dia Nascimento : ");
        pessoaDia = input.nextInt();

        HeartRates heartRates = new HeartRates(pessoaNome, pessoaSobrenome,pessoaDia,pessoaMes,pessoaAno,anoCorrente,mesCorrente,diaCorrente);

        //chamadas dos métodos
        heartRates.calculaIdade();
        heartRates.calcFCM();
        heartRates.calcFCA();

        //imprimir resultados
        System.out.println("\n Resultados do heartRates \n");

        System.out.printf("Nome : %s %s \n ", heartRates.getNome(), heartRates.getSobrenome());
        System.out.printf("Data Nascimento : %d/%d/%d", heartRates.getNasciDia(),heartRates.getNascMes(),heartRates.getNascAno());
        System.out.println("\n");
        System.out.printf("Idade : %d \n", heartRates.getIdade());
        System.out.printf("Frequência cardiaca máxima : %d \n", heartRates.getFcm());
        System.out.printf("Frenquência cardiaca alvo : %.2f até %.2f \n", heartRates.getFca1(), heartRates.getFca2());
        System.out.println("\n");

    }
}
