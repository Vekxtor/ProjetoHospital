package programacaocomputer;
public class Enfermeiro extends Funcionario
{
    private String coren; 

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }
    
    @Override
    public double gerarBonus()
    {
       return calculaSalario() * 0.2;
    }
}
