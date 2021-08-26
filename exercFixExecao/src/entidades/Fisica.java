/**
 * 
 */
package entidades;

/**
 * @author leo_dias
 *
 */
public class Fisica extends Pessoa {

	private double gastoSaude;

	public Fisica() {
		super();
	}

	public Fisica(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double calcularImposto() {
		double subTotal = 0.0;
		double abatimento = 0.0;
		double total = 0.0;
		if (super.getRendaAnual() < 20000.00) {
			subTotal = super.getRendaAnual() * 0.15;
		} else if (super.getRendaAnual() >= 20000.00) {
			subTotal = super.getRendaAnual() * 0.25;
		}

		if (gastoSaude > 0) {
			abatimento = gastoSaude * 0.5;
			total = subTotal - abatimento;
		}
		return total;
	}

}
