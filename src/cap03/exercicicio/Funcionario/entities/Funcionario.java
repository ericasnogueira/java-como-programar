package cap03.exercicicio.Funcionario.entities;

public class Funcionario {
    private String primerioNome;
    private String sobrenome;
    private double salarioMensal;

    public Funcionario(String primerioNome, String sobrenome, double salario) {
        this.primerioNome = primerioNome;
        this.sobrenome = sobrenome;
        if(salario > 0 ){
            this.salarioMensal = salario;
        } else {

        }
    }
    //set e get

    public String getPrimerioNome() {
        return primerioNome;
    }

    public void setPrimerioNome(String primerioNome) {
        this.primerioNome = primerioNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salarioMensal;
    }

    public void setSalario(double salario) {
        this.salarioMensal = salario;
    }


    public  double aumentarSalario(){
        double novoSalario = salarioMensal * 0.01;
        return novoSalario + salarioMensal;
    }
    public double salarioAnual () {
        if (aumentarSalario() > 0) {
            return aumentarSalario() * 12;
        } else {
            return salarioMensal * 12;
        }
    }
    public String mostrarDados(String resposta) {
                if( resposta .equals("s")){
                    return  "Nome : " + getPrimerioNome() + " " + getSobrenome() + " \n" +
                            "Salario mensal : " + String.format("%.2f", aumentarSalario()) + "\n" +
                            "Salario Anual : " + String.format("%.2f", salarioAnual());
                } else {
                    return  "Nome : " + getPrimerioNome() + " " + getSobrenome() + " \n" +
                            "Salario mensal : " + String.format("%.2f", salarioMensal);
                }
    }
}
