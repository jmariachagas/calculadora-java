import java.math.BigDecimal;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		BigDecimal numero1 = BigDecimal.ZERO;
		BigDecimal numero2 = BigDecimal.ZERO;
		int operador = 0;
		Operacao operacao = new Operacao();
		BigDecimal resultado = BigDecimal.ZERO;
		
		System.out.print("Digite o primeiro número da operação: \n");
		Scanner entrada = new Scanner(System.in);
		numero1 = entrada.nextBigDecimal();
		
		do {
			
			System.out.print(operacao.menuOperacoes());
			Scanner entrada2 = new Scanner(System.in);
			operador = entrada2.nextInt();
			
		}while(operador == 0);
		
		
		System.out.print("Digite o segundo número da operação: \n");
		Scanner entrada3 = new Scanner(System.in);
		numero2 = entrada3.nextBigDecimal();
		
		switch (operador) {
		case 1: {
			
			resultado = operacao.addValores(numero1, numero2);
			System.out.print("O resultado é: " + resultado);
		}
		case 2: {
			
			//resultado = operacao.addValores(numero1, numero2);
			//System.out.print("O resultado é: " + resultado);
			
		}
		case 3: {
			
			//resultado = operacao.addValores(numero1, numero2);
			//System.out.print("O resultado é: " + resultado);
			
		}
		case 4: {
			
			//resultado = operacao.addValores(numero1, numero2);
			//System.out.print("O resultado é: " + resultado);
			
		}
			
		default:
	
		}

	}

}
