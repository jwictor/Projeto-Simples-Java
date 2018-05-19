package Questao05;

public class DoisValores {
   private int v1;
   private int v2;
   
   
public DoisValores(int v1, int v2) {
	
	this.v1 = v1;
	this.v2 = v2;
}
   public void testarValores() {
	  if(v1 == v2) {
		  System.out.println("NUMEROS IGUAIS");		  
	  }else if(v1 > v2) {
		  System.out.println("O primeiro valor e maior");
	  }else if (v1<v2) {
		  System.out.println("O segundo valor e maoir");
	  }
   
}
public int getV1() {
	return v1;
}
public void setV1(int v1) {
	this.v1 = v1;
}
public int getV2() {
	return v2;
}
public void setV2(int v2) {
	this.v2 = v2;
}
}