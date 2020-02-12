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
        
        p.setNome("Luis magrelo");
        p.setRg("2642-3422-4123");
        p.setCpf("143-445-124-34");
        p.setIdade("75");
        p.setCodPaciente(120212450);
        p.setSenha("1917mereciaooscar");
    
        //Instanciando Medico
        Medico m = new Medico();
        m.setNome("Tia do Postim");
        m.setRg("rg da tia");
        m.setCpf("347-341-422-3");
        m.setIdade("23");
        m.setCrm("Pemitido a trabalhar");
        m.setEspecialidade("Neurocirugias");
        
        m.setNome("Tio do Postim");
        m.setRg("rg da tio");
        m.setCpf("356-431-343-3");
        m.setIdade("23");
        m.setCrm("Pemitido a trabalhar");
        m.setEspecialidade("Cirurgia de Cabeçote");
        
        //Instanciando Enfermeiro
        Enfermeiro e = new Enfermeiro();
        e.setNome("Airtom Barbosa Costa");
        e.setRg("564-178-6445-14");
        e.setCpf("202-288-555-16");
        e.setIdade("56");
        e.setCoren("Permitido a ajudar as pessoas");
        
        e.setNome("Danilo Eduaro Filho");
        e.setRg("3157-456-4567-44");
        e.setCpf("5469-5481-561");
        e.setIdade("25");
        e.setCoren("Permitido a ajudar as pessoas");
        
    }
    
}
