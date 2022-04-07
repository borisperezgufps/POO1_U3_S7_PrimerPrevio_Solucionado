package poo1.colegio.fachada;

import poo1.colegio.base.Candidato;
import poo1.colegio.base.Personero;
import poo1.colegio.base.Representante;

public class Colegio {
	
	private int numeroVotosBlanco;
	private int cont;

	private Candidato[] candidatos;
	
	public Colegio(int tamanio) {
		candidatos = new Candidato[tamanio];
	}
	
	public void agregarCandidatoPersonero(String nombre, String apellido, 
			String grado, String lema, int numeroTarjeton, String idMascota, 
			String nombreMascota) {
		
		Personero p = new Personero();
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setGrado(grado);
		p.setLema(lema);
		p.setNumeroTarjeton(numeroTarjeton);
		
		p.setMascota(idMascota, nombreMascota);
		
		if(cont<candidatos.length) {
			candidatos[cont] = p;
			cont++;
		}
		
	}
	
	public void agregarCandidatoRepresentante(String nombre, String apellido, 
			String grado, String grupo, String lema, int numeroTarjeton, String formula) {
		
		Representante p = new Representante();
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setGrado(grado);
		p.setGrupo(grupo);
		p.setLema(lema);
		p.setNumeroTarjeton(numeroTarjeton);
		p.setNombreFormulaEstudiante(formula);
		
		
		if(cont<candidatos.length) {
			candidatos[cont] = p;
			cont++;
		}
		
	}
	
	public void agregarVoto(int numeroTarjeton) {
		
	}
	
	public void agregarVotoBlanco() {
		
	}
	
	public void imprimirVotosPorCandidato() {
		
	}
	
	public void imprimirCandidatosGanadores() {
		
	}
	
	public void imprimirPoblacionElectoral() {
		
	}
	
}
