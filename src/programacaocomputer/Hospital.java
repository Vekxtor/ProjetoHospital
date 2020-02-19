package programacaocomputer;

import java.util.ArrayList;

public class Hospital 
{
    private int idHospital;
    private String nome;
    private String endereco;
    private ArrayList<Funcionario> funcionarios = new ArrayList(); 

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void addFuncionario(Funcionario funcionario)
    {
        funcionarios.add(funcionario);
    }
    
    public void listarTodosFuncionarios()
    {
        funcionarios.forEach(funcionarios->System.out.println(funcionarios.getNome()));
    }
    
    public void listarMedicos()
    {
        for(Funcionario f : funcionarios){
            if(f instanceof Medico){
                System.out.println("Nome: " + f.getNome());
            }
            
        }
    }
    
    public void listarEnfermeiro()
    {
        for(Funcionario f : funcionarios){
            if(f instanceof Enfermeiro){
            System.out.println("Nomes dos Funcionarios: " + f.getNome());
        }
        }
    }
    
    public Hospital(int id, String end){
        this.idHospital = id;
        this.endereco = end;
    }
}
