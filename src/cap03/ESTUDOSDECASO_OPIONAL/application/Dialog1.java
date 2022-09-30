package cap03.ESTUDOSDECASO_OPIONAL.application;


import javax.swing.*;

//usando JOptionPane para exibi múltiplas linhas em uma caixa de diàlogo.
public class Dialog1 {
    public static void main(String[] args) {


        // pede para o usuario inserir o seu nome
        String nome =   JOptionPane.showInputDialog("Qual é o seu nome ?");//obtendo a entreda de usuario a partir
        //de um dialogo


        // null faz o diàlogo aparecer centralizado na janela do aplicativo
        //JOptionPane.showMessageDialog(null,"Olá Mundo");

        //cria a mensagem
        String mensagem = String.format("Bem vindo, %s, a programação com java", nome);

        //exibe a mensagem para cumprimentar o usuario pelo nome
        JOptionPane.showMessageDialog(null,mensagem);


    }
}
