package oi;

public class classeAlunos {
	String nomeAt;
	float notaAt;
	String cursoAt;
	
	public void mostrarNomeMet() {
		System.out.println(this.nomeAt);
	}
	public void mostrarCursoMet() {
		System.out.println(this.cursoAt);
	}
	public void mostrarNotaMet() {
		System.out.println(this.notaAt);
	}
	public void receberNomeMet (String nomePar) {
		this.nomeAt = nomePar;
	}
	public void receberCursoMet (String cursoPar) {
		this.cursoAt = cursoPar;
	}
	public void receberNotaMet (float notaPar) {
		this.notaAt = notaPar;
	}
}
