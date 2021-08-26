/**
 * 
 */
package entidades;

/**
 * @author leo_dias
 *
 */
public class Juridica extends Pessoa {
	
	private int numeroFuncionarios;

	public Juridica() {
		super();
	}

	public Juridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double calcularImposto() {
		double total = 0.0;
		
		if(numeroFuncionarios < 10) {
			total = super.getRendaAnual() * 0.16;
		}else if(numeroFuncionarios >= 10) {
			total = super.getRendaAnual() * 0.14;
		}
		return total;
	}
	
	

}
