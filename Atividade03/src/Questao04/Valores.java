package Questao04;

public class Valores {
	
   private int x;
   private int y;
   
     
public Valores(int x, int y) {
	
	this.x = x;
	this.y = y;
}

public void lerValores() {
	//if(x <> y) {
		System.out.println("Os numeros são diferentes, tudo OK");
	//}else {
		System.out.println("ERRO os numeros são iguais");
	}
//}
public void maiorValor() {
	if(x > y) {
		System.out.println("O valor X e o maior numero");
	}else {
		System.out.println("O valor Y e o maoir numero");
	}
}
public void ordemCrescente() {
	if(x > y) {
		System.out.println(this.getX());
	}else {
		System.out.println(this.getY());
	}
}


public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
   
   
}
