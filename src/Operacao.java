import java.math.BigDecimal;

public class Operacao {
	
	BigDecimal valor1 = BigDecimal.ZERO;
	BigDecimal valor2 = BigDecimal.ZERO;
	BigDecimal resultado = BigDecimal.ZERO;
	
	public String menuOperacoes () {
	
		StringBuilder menu = new StringBuilder();
		
		menu.append("========Escolha a Operação========\n");
		menu.append("========Digite o numero 1 para adição========\n");
		menu.append("========Digite o numero 2 para subtração========\n");
		menu.append("========Digite o numero 3 para multiplicação========\n");
		menu.append("========Digite o numero 4 para divisão========\n");
		
		return menu.toString();
	}
	
	public BigDecimal addValores(BigDecimal valor1, BigDecimal valor2) {
		return valor1.add(valor2);
	}
	
	public BigDecimal getResultado() {
		return resultado;
	}
	public void setResultado(BigDecimal resultado) {
		this.resultado = resultado;
	}
	
	
}
