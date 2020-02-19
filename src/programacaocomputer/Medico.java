package programacaocomputer;
public class Medico extends Funcionario
{
    private String crm;
    private String especialidade;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    @Override
    public double gerarBonus()
    {
       return calculaSalario() * 0.3;
    }
    
}
