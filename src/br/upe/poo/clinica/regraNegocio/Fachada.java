
package br.upe.poo.clinica.regraNegocio;

import br.upe.poo.clinica.entidades.Consultas;
import br.upe.poo.clinica.entidades.Medicos;
import br.upe.poo.clinica.entidades.Pacientes;
import java.util.List;

public interface Fachada {
    
    public void cadastrarPaciente(Pacientes paciente)throws ExceptionRegraNegocioPacientesCadastrar;
    
    public Pacientes buscarPacienteCpf(Long cpf)throws ExceptionRegraNegocioPacienteBuscarPaciente;
    
    public List<Pacientes> buscarPacienteNome(String nome)throws ExceptionRegraNegocioPacienteBuscarPaciente;
    
    public void atualizarPaciente(Pacientes paciente)throws ExceptionRegraNegocioAtualizarPacientes;
    
    public void deletarPaciente(Pacientes paciente)throws ExceptionRegraNegocioDeletarPacientes;
    
    
    
    public void cadastrarMedicos(Medicos medico)throws ExceptionRegraNegocioCadastrarMedicos;
    
    public Medicos buscarMedicoCpf(Long cpf)throws ExceptionRegraNegocioBuscarMedicos;
    
    public List<Medicos> buscarMedicoNome(String nome)throws ExceptionRegraNegocioBuscarMedicos;
    
    public void atualizarMedico(Medicos medico)throws ExceptionRegraNegocioAtualizarMedicos;
    
    public void deletarMedico(Medicos medico)throws ExceptionRegraNegocioDeletarMedicos;
    
   
    
    public void agendarConsulta(Consultas consulta)throws ExceptionRegraNegocioAgendarConsultas;
    
    public List<Consultas> filtrarConsultaNomePaciente(String nomePaciente)throws ExceptionRegraNegocioFiltrarConsultas;
    
    public Consultas filtrarConsultaCpfPaciente(Long cpf)throws ExceptionRegraNegocioFiltrarConsultas;
    
    public void atualizarConsulta(Consultas consulta)throws ExceptionRegraNegocioAtualizarConsultas;
    
    public void deletarConsulta(Consultas consulta)throws ExceptionRegraNegocioDeletarConsultas;

   
}

    

