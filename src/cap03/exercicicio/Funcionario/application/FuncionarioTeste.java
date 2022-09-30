package cap03.exercicicio.Funcionario.application;

import cap03.exercicicio.Funcionario.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {
        /*
         Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String),
          um sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que inicializa as três
          variáveis de instância. Forneça um método set e um get para cada variável de instância. Se o salário mensal
          não for positivo, não configure seu valor. Escreva um aplicativo de teste chamado EmployeeTest que demonstre
           as capacidades da classe Employee. Crie dois objetos Employee e exiba o salário anual de cada objeto.
           Então dê a cada Employee um aumento de 10% e exiba novamente o salário anual de cada Employee.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario("Douglas","Silva",1500.0);
        Funcionario funcionario2 = new Funcionario("Suho", "Kim", 5000.0);

        System.out.println("Deseja mostrar o salario anual com as outras informações ? ");
        String reposta = entrada.nextLine();

        System.out.println(funcionario1.mostrarDados(reposta));
        System.out.println();
        System.out.println(funcionario2.mostrarDados(reposta));



    }
}
