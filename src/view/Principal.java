package view;

import javax.swing.JOptionPane;

import controller.ControllerCont;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		Metodo construtor
		ControllerCont cc = new ControllerCont();
		
//		variavel que recebe a sequ�ncia do primeiro n�mero
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma sequ�ncia de n�meros: "));

//		variavel que recebe a sequ�ncia do segundo n�mero		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para verificar quantas vezes aparece na sequ�ncia informada anteriormente. "));
		
		int result = cc.somaqtdadeNum(num1, num2);
		
//		exibi��o do resultado
		System.out.println("O n�mero " + num2 + " aparece "+ result +" vezes na sequ�ncia: " + num1 +".");

	}

}
