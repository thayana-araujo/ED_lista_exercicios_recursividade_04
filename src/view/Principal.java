package view;

import javax.swing.JOptionPane;

import controller.ControllerCont;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		Metodo construtor
		ControllerCont cc = new ControllerCont();
		
//		variavel que recebe a sequência do primeiro número
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma sequência de números: "));

//		variavel que recebe a sequência do segundo número		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para verificar quantas vezes aparece na sequência informada anteriormente. "));
		
		int result = cc.somaqtdadeNum(num1, num2);
		
//		exibição do resultado
		System.out.println("O número " + num2 + " aparece "+ result +" vezes na sequência: " + num1 +".");

	}

}
