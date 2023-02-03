package aula04;

public class Funcionario {
	private String nome;
	private String empresa;
	private int matricula;
	private double salario = 2000;
	private int anos_expe;
	private int qtdVendas;

	// Métodos Personalizados

	public void salarioTotal() {
		if (this.getQtdVendas() > 5 && this.getQtdVendas() < 10) {
			for (int i = 0; i < (getQtdVendas() - 5); i++) {
				this.setSalario(salario * Math.pow(1.15, i));
			}
			System.out.printf("O valor do salário é %.2f R$",this.getSalario());
		} else if (this.getQtdVendas() >= 10) {
			this.setSalario(salario * 2.5);
			System.out.printf("O valor do salário é %.2f R$",this.getSalario());
		} else {
			System.out.printf("O valor do salário é %.2f R$",this.getSalario());
		}
	}

	void status() {
		System.out.println("------------" + empresa + "---------");
		System.out.println("--------Banco de Dados Funcionário-------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Matrícula: " + this.getMatricula());
		System.out.println("Anos de Experiência: " + this.getAnos_expe());
		System.out.println("Quantidade de Vendas Mensal: " + this.getQtdVendas());
		salarioTotal();
	}

	// Métodos Especiais (Sets, Getters and Constructor)

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getAnos_expe() {
		return anos_expe;
	}

	public void setAnos_expe(int anos_expe) {
		this.anos_expe = anos_expe;
	}

	public int getQtdVendas() {
		return this.qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

	public void setSalario(double s) {
		this.salario = s;
	}

	public double getSalario() {
		return this.salario;
	}

	public Funcionario(String empresa, String nome, int matricula, int qtdVendas, int anos_expe) {
		this.empresa = empresa;
		this.nome = nome;
		this.matricula = matricula;
		this.qtdVendas = qtdVendas;
		this.anos_expe = anos_expe;
		status();
	}

}
