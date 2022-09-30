package cap03.exercicicio.Funcionario.application;

import cap03.exercicicio.Funcionario.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {
        /*
         Crie uma classe chamada Employee que inclua tr�s vari�veis de inst�ncia � um primeiro nome (tipo String),
          um sobrenome (tipo String) e um sal�rio mensal (double). Forne�a um construtor que inicializa as tr�s
          vari�veis de inst�ncia. Forne�a um m�todo set e um get para cada vari�vel de inst�ncia. Se o sal�rio mensal
          n�o for positivo, n�o configure seu valor. Escreva um aplicativo de teste chamado EmployeeTest que demonstre
           as capacidades da classe Employee. Crie dois objetos Employee e exiba o sal�rio anual de cada objeto.
           Ent�o d� a cada Employee um aumento de 10% e exiba novamente o sal�rio anual de cada Employee.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario("Douglas","Silva",1500.0);
        Funcionario funcionario2 = new Funcionario("Suho", "Kim", 5000.0);

        System.out.println("Deseja mostrar o salario anual com as outras informa��es ? ");
        String reposta = entrada.nextLine();

        System.out.println(funcionario1.mostrarDados(reposta));
        System.out.println();
        System.out.println(funcionario2.mostrarDados(reposta));



    }
}
