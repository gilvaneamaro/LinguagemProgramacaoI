package entities;

public class Produto {
	
	private String nome;
	private Double valor;
	private Integer id;
	
		
	public Produto(String nome, Double valor, Integer id) {
		this.nome = nome;
		this.valor = valor;
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getValor() {
		return valor;
	}


	private void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void calcularInflacao(Double taxa) {
		Double novoValor = getValor() + getValor()*(taxa/100);
		setValor(novoValor);
	}

	public Integer getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Nome: " 
				+ nome 
				+ ", valor: R$" 
				+ valor 
				+ ", id:" 
				+ id; 
				
	}
		

}
