package Questao03;

public class Aluno {
//Atributos
	private double nota1, nota2;	
	//Metodo Construto
	public Aluno(double nota1, double nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;		
	}

   //Metodos Gett Sett
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	//Metodo Notas
	public void mediaNotas() {
		double media;
		media = this.getNota1() + this.getNota2() / 2;
		if(media >= 6.0) {
			System.out.println("Aluno Aprovado com nota =" + media);
		}else {
			System.out.println("Aluno Reprovado com media =" + media);
		}
		
	}
	
}
