package Questao02;

public class Macas {
 //Atributos
	private float quantidade;
	
	//Metodo construto
	public Macas (float quantidade) {
		this.quantidade = quantidade;
	}
    //Gett Sett
	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void macaCusta() {
		if(this.getQuantidade() <12) {
			System.out.println("O VALOR DAS MACAS E:" + this.getQuantidade() * 1.30 );
			
		}else {
			System.out.println("O VALOR DAS MACAS E:" + this.getQuantidade() * 1.00);
		}
	}
	
}
