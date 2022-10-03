package cap03.exercicicio.Calculadora_Frenquência_Cardiáca_alvo.entities;

public class HeartRates {

    //atributos
    private String nome;
    private String sobrenome;
    private int nascDia;
    private int nascMes;
    private int nascAno;
    private int dia;
    private int mes;
    private int ano;

    private int idade;
    private int fcm;
    private  double fca1;
    private double fca2;

    public HeartRates(String nome, String sobrenome, int nascDia, int nascMes, int nascAno, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascDia = nascDia;
        this.nascMes = nascMes;
        this.nascAno = nascAno;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // metodos get
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getNasciDia() {
        return nascDia;
    }

    public int getNascMes() {
        return nascMes;
    }

    public int getNascAno() {
        return nascAno;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getIdade() {
        return idade;
    }

    public int getFcm() {
        return fcm;
    }

    public double getFca1() {
        return fca1;
    }

    public double getFca2() {
        return fca2;
    }

    // metodo de calculos
    public int calculaIdade(){

        if(this.ano > this.nascAno){

            if(this.mes > this.nascMes){

                this.idade = this.ano - this.nascAno;
            } else if (this.mes == this.nascMes) {
                if(this.dia >= this.nascDia){
                    this.idade = this.ano - this.nascAno;
                } else {
                    this.idade = this.ano - this.nascAno - 1;
                }
            } else if (this.mes < this.nascMes) {
                this.idade = this.ano - this.nascAno -1;
            }
        }
        return idade;
    }

    //cálculo frequência cardíaca máxima
    public int calcFCM(){
        //calcula a frequencia cardiaca máxima
        this.fcm = 220 - this.idade;
        return fcm;
    }
    public void calcFCA(){
        //calcula frequencia cardiaca alvo
        this.fca1 = this.fcm + 0.5;
        this.fca2 = this.fcm + 0.85;
    }
}
