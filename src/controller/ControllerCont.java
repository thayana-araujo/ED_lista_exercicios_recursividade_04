package controller;

public class ControllerCont {

	public ControllerCont(){
		super();
	}
	
	public int somaqtdadeNum(int num1, int num2){
		
//Se o n�mero de entrada for zero o retorno ser� 0.				
		
		if(num1 == 0) {
			return 0;
		}
//Se o n�mero de entrada for maior que 1, ent�o ser� verificado se o resto � igual ao 2 numero
		if(num1%10 == num2) {
			return 1 + somaqtdadeNum(num1/10, num2);
		}
//Retorno da quantidade de vezes que o 2 n�mero aparece no primeiro		
		return somaqtdadeNum(num1/10, num2);	
	}
}
