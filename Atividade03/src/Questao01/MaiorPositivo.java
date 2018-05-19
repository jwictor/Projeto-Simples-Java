package Questao01;

public class MaiorPositivo {
 //Atributos
	private int valor;
	
	//Get e Set	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}	
	//Metodo Construtor
	public MaiorPositivo(int valor) {
		this.valor = valor;
	}
	
	public void testarMaior() {
		if(valor >=10 ) {  
			System.out.println("O NUMERO"   +   this.getValor()   +   "E MAIOR QUE 10");
		}else  {	 
			System.out.println("O NUMERO"   +   this.getValor()   +  "E MENOR QUE 10");
		}		
	}
	public void testarPositivo() {
		if (this.getValor() >=0) {
			System.out.println("O NUMERO"   +   this.getValor()   +   "E POSITIVO");
		}else {
			System.out.println("O NUMERO"   +   this.getValor()   +   "E NEGATIVO");
		}
		
	}
}
