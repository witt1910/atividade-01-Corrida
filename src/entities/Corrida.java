package entities;

public class Corrida {
	private String nome;
	private Integer segundosPorVolta;

	public Corrida() {
	}

	public Corrida(String nome, Integer segundosPorVolta) {
		this.nome = nome;
		this.segundosPorVolta = segundosPorVolta;
	}

	public String getNome() {
		return nome;
	}

	public Integer getSegundosPorVolta() {
		return segundosPorVolta;
	}

	public void setSegundosPorVolta(Integer segundosPorVolta) {
		this.segundosPorVolta = segundosPorVolta;
	}

	public Integer ultrapassagem(Corrida corrida) {
		int diferenca = corrida.getSegundosPorVolta() - this.getSegundosPorVolta();
		int tempA = 0, tempB = 0, volta = 0;
		if (diferenca <= 0) {
			return -1;
		} else {
			while (tempB - tempA < corrida.getSegundosPorVolta()) {
				tempA += this.getSegundosPorVolta();
				tempB += corrida.getSegundosPorVolta();
				volta++;
			}
			return volta;
		}
	}
}