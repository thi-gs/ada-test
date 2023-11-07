/*
	Programa para calcular a área de uma casa (e seus cômodos) de 3 cômodos: uma sala de 10x10m, um banheiro e um quarto de 5x7m cada.
*/
class AreaCasa_aula09 {
	static double valorM2 = 1500;
	
	static void areaCasa(float lateral, float compQuarto) {
		float AreaSala;
		float AreaQuarto;
		float AreaTotal;
		
		System.out.println("Programa para cálculo da área da casa");
		
		if (!(lateral >= 0 && compQuarto >= 0)) System.out.println("Erro: Valor parâmetro < 0");
		else {
			AreaSala = lateral*lateral;
			System.out.println("A área da sala é " + AreaSala);
		
			AreaQuarto = compQuarto*(lateral/2);
			System.out.println("A área do quarto é " + AreaQuarto);
			System.out.println("A área do banheiro é " + AreaQuarto);
		
			AreaTotal = AreaSala + 2*AreaQuarto;
			System.out.println("A área total é " + AreaTotal);
		}
	}
	
	static double areaPiscina(double raio){
		return((raio >= 0) ? Math.PI * Math.pow(raio, 2) : -1);
	}
	
	
	/**
	 * Método utilizado para calcular o valor da construção
     * @param area Área passada pelo usuário
     * @return Retorna o valor se a área for zero ou positiva, e se não retorna -1 (erro)
     */
	static double valor(double area){
		if (area >= 0) 
			return(valorM2*area);
		return (-1);
	}
	
	/**
	 * Método main que chama os métodos areaCasa(), areaPiscina(), valor()
     * 
     */
	public static void main(String[] args){
		double areaPisc;
		double raio = 2;
		double preco;
		boolean valorOK = false;
		
		areaCasa(11, 7);
		
		areaPisc = areaPiscina(raio);
		System.out.println("A área da piscina é " + areaPisc);
		
		preco = valor(-20);
		valorOK = preco >= 0; // A variável recebe o valor lógico resultante da expressão
		if (valorOK) System.out.println("O valor da construção é " + preco);
		else System.out.println("Erro: Valor da área negativo");
	}
}

// This is the new update
