package cap03.ESTUDOSDECASO_OPIONAL.application;


import javax.swing.*;

//usando JOptionPane para exibi m�ltiplas linhas em uma caixa de di�logo.
public class Dialog1 {
    public static void main(String[] args) {


        // pede para o usuario inserir o seu nome
        String nome =   JOptionPane.showInputDialog("Qual � o seu nome ?");//obtendo a entreda de usuario a partir
        //de um dialogo


        // null faz o di�logo aparecer centralizado na janela do aplicativo
        //JOptionPane.showMessageDialog(null,"Ol� Mundo");

        //cria a mensagem
        String mensagem = String.format("Bem vindo, %s, a programa��o com java", nome);

        //exibe a mensagem para cumprimentar o usuario pelo nome
        JOptionPane.showMessageDialog(null,mensagem);


    }
}
