/**
 * 
 */
package aplicacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Fisica;
import entidades.Juridica;
import entidades.Pessoa;

/**
 * @author leo_dias
 *
 */
public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> lista = new ArrayList<>();

		System.out.print("Entre com o n�mero de contribuintes: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println();
			System.out.println("Dados do contribuinte #" + i);
			System.out.print("Pessoa f�sica ou jur�dica(F/J):");
			char resp = sc.next().charAt(0);
			
			if(resp == 'f' || resp == 'F') {
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Renda anual: ");
				double renda = sc.nextDouble();
				System.out.print("Total gastos com sa�de: ");
				double gasto = sc.nextDouble();
				
				lista.add(new Fisica(nome, renda, gasto));
			}else if(resp == 'j' || resp == 'J') {
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Renda anual: ");
				double renda = sc.nextDouble();
				System.out.print("Quantidade de  funcion�rios:");
				int quantFunc = sc.nextInt();
			
				lista.add(new Juridica(nome, renda, quantFunc));
			}
		}
		
		System.out.println();
		System.out.println("Valor dos impostos");
		
		double total = 0.0;
		for(Pessoa p : lista) {
			System.out.println(p.getNome() + ": $" + String.format("%.2f", p.calcularImposto()));
			total += p.calcularImposto();
		}
		
		System.out.println();
		System.out.println("Total impostos: " + String.format("%.2f", total));
		
		sc.close();
	}

}
