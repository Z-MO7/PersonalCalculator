package calculator;

import java.util.Locale;
import java.util.Scanner;

public class Core {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String operador;
		double x, y, resultado = 0;
		
		System.out.println("[===== Calculadora do Z (v1.0) =====]");
		System.out.println("Escolha uma das seguintes operações: + - / * ");
		
		operador = sc.next();
		
		switch(operador) {
			case "+":
				System.out.println("Você escolheu: Soma \nDigite a primeira parcela: ");
				x = sc.nextDouble();
				System.out.println("Digite a segunda parcela: ");
				y = sc.nextDouble();
				resultado = x + y;
				System.out.printf("Resultado da soma: %.2f", resultado);
				break;
				
			case "-":
				System.out.println("Você escolheu: Subtração \nDigite o minuendo: ");
				x = sc.nextDouble();
				System.out.println("Digite o subtraendo: ");
				y = sc.nextDouble();
				resultado = x - y;
				System.out.printf("Resultado da subtração: %.2f", resultado);
				break;
				
			case "/":
				System.out.println("Você escolheu: Divisão \nDigite numerador: ");
				x = sc.nextDouble();
				System.out.println("Digite o denominador: ");
				y = sc.nextDouble();
				if (y == 0) {
					System.out.println("Impossível dividir por 0!");
				} else {
					resultado = x / y;
					System.out.printf("Resultado da divisão: %.2f", resultado);
				}
				break;
				
			case "*":
				System.out.println("Você escolheu: Multiplicação \nDigite o multiplicando: ");
				x = sc.nextDouble();
				System.out.println("Digite o multiplicador: ");
				y = sc.nextDouble();
				resultado = x * y;
				System.out.printf("Resultado da multiplicação: %.2f", resultado);
				break;	
				
			default: 
				System.out.println("Erro: Operação não reconhecida.");
				break;
		} 
		
		sc.close();
	}

}
