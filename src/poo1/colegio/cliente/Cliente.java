package poo1.colegio.cliente;

import poo1.colegio.fachada.Colegio;

public class Cliente {

	public static void main(String[] args) {
		
		Colegio c = new Colegio(4);
		
		c.agregarCandidatoPersonero("Boris", "Perez", "1", "Todos unidos", 
				1, "001", "Perla");
		c.agregarCandidatoPersonero("Monica", "Villamizar", "2", "Todos en contra", 
				2, "002", "Michita");
		
		c.agregarCandidatoRepresentante("Rodrigo", "Mendoza", "1", "B", "Todos abajo?", 
				3, "Luis Sarmiento");
		c.agregarCandidatoRepresentante("Maria Camila", "Romero", "2", "A", "Todos arriba", 
				2, "Sergio Osorio");
		
		c.agregarVoto(2);
		c.agregarVoto(2);
		c.agregarVoto(2);
		c.agregarVoto(2);
		
		c.agregarVoto(1);
		c.agregarVoto(1);
		
		c.agregarVoto(3);
		c.agregarVoto(3);
		c.agregarVoto(3);
		
		c.agregarVotoBlanco();
		c.agregarVotoBlanco();
		
		System.out.println("****** Votos por Candidato");
		c.imprimirVotosPorCandidato();
		System.out.println("****** Candidatos Ganadores");
		c.imprimirCandidatosGanadores();
		System.out.println("****** Población Electoral");
		c.imprimirPoblacionElectoral();
		
	}
	
}

