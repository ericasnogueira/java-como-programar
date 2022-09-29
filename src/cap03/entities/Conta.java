package cap03.entities;

//classe conta que contém uma variavel de instância nome
//e metodos para configurar e obter seu valor

public class Conta {
    private String nome;// variável de instância

    //método para recuperar o nome do objeto
    public String getNome() {
        return nome;//retorna o valor do nome para o chamador
    }

    //método para definir o nome no objeto
    public void setNome(String nome) {
        this.nome = nome; // armazenar o nome
    }
}
