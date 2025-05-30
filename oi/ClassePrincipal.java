package oi;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		classeAlunos mikaelObj = new classeAlunos();
		classeAlunos abraaoObj = new classeAlunos();
		
		mikaelObj.nomeAt = "Mikael";
		mikaelObj.cursoAt = "Informática";
		mikaelObj.notaAt = 8.5F;

		System.out.println(mikaelObj.nomeAt);
		System.out.println(mikaelObj.cursoAt);
		System.out.println(mikaelObj.notaAt);
	}

}
