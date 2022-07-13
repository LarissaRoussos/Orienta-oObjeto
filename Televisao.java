package POD;

public class Televisao {

	public static void main(String[] args) {
		{
		Eletronico televisao1= new Eletronico();
	    televisao1.polegadas= "52";
	    televisao1.resolucaodetela= "4k";
	    televisao1.conexao= "HDMI";

	    System.out.println("Televisão\nPolegadas:"+televisao1.polegadas);
		System.out.println("Resolução de Tela:"+televisao1.resolucaodetela);
		System.out.println("Conexão:"+televisao1.conexao);
		
	}
	}
}