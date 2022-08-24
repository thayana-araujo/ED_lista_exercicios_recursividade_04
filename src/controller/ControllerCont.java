package controller;

public class ControllerCont {

	public ControllerCont(){
		super();
	}
	
	public int somaqtdadeNum(int num1, int num2){
		
//Se o número de entrada for zero o retorno será 0.				
		
		if(num1 == 0) {
			return 0;
		}
//Se o número de entrada for maior que 1, então será verificado se o resto é igual ao 2 numero
		if(num1%10 == num2) {
			return 1 + somaqtdadeNum(num1/10, num2);
		}
//Retorno da quantidade de vezes que o 2 número aparece no primeiro		
		return somaqtdadeNum(num1/10, num2);	
	}
}
