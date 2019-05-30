public class ValorAvaliacao {
	private float valor;
	private MedidaAvaliacao medida = new MedidaAvaliacao("TESTE", 6.34f, 896.12f);

	public ValorAvaliacao(MedidaAvaliacao medida) {
		valor = 0.0f;
		this.medida = medida;
	}

	/* setValor: método responsável por armazenar 
	 	o valor obtido pelo algoritmo na medida de avaliação*/
	public boolean setValor(float valor) { 
		//Verificar se  o valor se encontra no intervalo da medida de avaliação
		if ( valor > medida.getMenorValor()  && valor < medida.getMaiorValor()){ 
			this.valor = valor; // caso sim o valor pode ser setado e retorna verdadeiro														
			return true;
		}
		else {
			//Caso não basta informar o usuário e retornar falso
			System.out.println("Impossivel de se realizar a atribuicao");
			return false;
		}
	}
	

	public float getValor() {
		return valor;
	}

	public MedidaAvaliacao getMedida() {
		return medida;
	}
}
