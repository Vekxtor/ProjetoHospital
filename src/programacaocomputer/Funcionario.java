package programacaocomputer;
public class Funcionario extends pessoa
{
    private int matricula;
    private String senha;
    private double valorHora;
    private double salario;    
    private double bonus;    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double calculaSalario()
    {
        return valorHora * 30;
    }
    
    public double calculaSalario(double descontos)
    {
        return valorHora * 30 - descontos;
    }
    
    public double gerarBonus()
    {
       return calculaSalario() * 0.1;
    }
} 
