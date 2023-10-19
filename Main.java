import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner NumeroFases = new Scanner(System.in);
		
		System.out.println("Digite o numero de fases facil: ");
		
		int fasesfacil = NumeroFases.nextInt();
		
		System.out.println("Quantidade fases fáceis: " + fasesfacil + " Fases");
		
		
		int  fasesDificil = 96 - fasesfacil;
		System.out.println("Quantidade fases difíceis:" + fasesDificil + " Fases");
		
		
		int HorasFasesFacil = fasesfacil;
		System.out.println("Horas nas fases fáceis: " + HorasFasesFacil + " Horas");
		
		int HorasFasesDificil = fasesDificil * 2;
		System.out.println("Horas nas fases difíceis: " + HorasFasesDificil + " Horas");
		
		int horatotal = HorasFasesDificil + HorasFasesFacil;
		System.out.println("Total de horas gastas até concluir o jogo:" + horatotal + " Horas" );
		
		double valortotal = horatotal * 5.00 ;
		System.out.println("Valor em reais da jogatina: R$" + valortotal + "Reais");
	}
}
