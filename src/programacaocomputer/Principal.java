package programacaocomputer;
public class Principal {

    public static void main(String[] args) 
    {
        //Instanciando Paciente
        Paciente p = new Paciente();
        p.setNome("Guaras Vitim");
        p.setRg("2834-3892-4892");
        p.setCpf("123-452-514-82");
        p.setIdade("23");
        p.setCodPaciente(12022020);
        p.setSenha("Minhamareumapessaxxv");
        
        Paciente p2 = new Paciente();
        p2.setNome("Luis magrelo");
        p2.setRg("2642-3422-4123");
        p2.setCpf("143-445-124-34");
        p2.setIdade("75");
        p2.setCodPaciente(120212450);
        p2.setSenha("1917mereciaooscar");
    
        //Instanciando Medico
        Medico m = new Medico();
        Medico m2 = new Medico();
        m.setNome("Tia do Postim");
        m.setRg("rg da tia");
        m.setCpf("347-341-422-3");
        m.setIdade("23");
        m.setCrm("Pemitido a trabalhar");
        m.setEspecialidade("Neurocirugias");
        m.setSenha("Senha de um medico normal");
        
        m2.setNome("Tio do Postim");
        m2.setRg("rg da tio");
        m2.setCpf("356-431-343-3");
        m2.setIdade("23");
        m2.setCrm("Pemitido a trabalhar");
        m2.setEspecialidade("Cirurgia de Cabeçote");
        m2.setSenha("senha de um medico estranho");
        
        //Instanciando Enfermeiro
        Enfermeiro e = new Enfermeiro();
        Enfermeiro e2 = new Enfermeiro();
        e.setNome("Airtom Barbosa Costa");
        e.setRg("564-178-6445-14");
        e.setCpf("202-288-555-16");
        e.setIdade("56");
        e.setCoren("Permitido a ajudar as pessoas");
        e.setSenha("leia o hobbit");
        
        e2.setNome("Danilo Eduaro Filho");
        e2.setRg("3157-456-4567-44");
        e2.setCpf("5469-5481-561");
        e2.setIdade("25");
        e2.setCoren("Permitido a ajudar as pessoas");
        e2.setSenha("leia leo huberman");
        
        //MOSTRANDO OS VALORES;
        //mostrando incialmente os valores dos pacientes
        System.out.println("PACIENTES\nNome: "+p.getNome()+"\nIdade: "+
                p.getIdade()+"\nRG: "+p.getRg()+"\nCPF: "+p.getCpf()+
                "\nCódigo do Paciente: "+p.getCodPaciente()+"\nSenha: "+
                p.getSenha()+"\n");
        
        System.out.println("Nome: "+p2.getNome()+"\nIdade: "+
                p2.getIdade()+"\nRG: "+p2.getRg()+"\nCPF: "+p2.getCpf()+
                "\nCódigo do Paciente: "+p2.getCodPaciente()+"\nSenha: "+
                p2.getSenha()+"\n");
    
        
        //mostrando incialmente os valores dos medicos
        System.out.println("MEDICOS\nNome: "+m.getNome()+"\nIdade: "+
                m.getIdade()+"\nRG: "+m.getRg()+"\nCPF: "+m.getCpf()+
                "\nCRM do Doutor: "+m.getCrm()+"\nSenha: "+
                m.getSenha()+"\nEspecialização: "+m.getEspecialidade()+"\n");
        
        System.out.println("\nNome: "+m2.getNome()+"\nIdade: "+
                m2.getIdade()+"\nRG: "+m2.getRg()+"\nCPF: "+m2.getCpf()+
                "\nCRM do Doutor: "+m2.getCrm()+"\nSenha: "+
                m2.getSenha()+"\nEspecialização: "+m2.getEspecialidade()+"\n");
    }
    
}
