package beans;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa sergio;
		sergio = new Pessoa();
		sergio.nome = "Sérgio R dos Santos";
		sergio.idade = 88;
		sergio.sexo = "masculino";
		sergio.genero = "masculino";
		
		System.out.println(sergio.nome + " " + sergio.idade + " " + sergio.genero + " " + sergio.sexo + " " );
		
		/*
		String nome = "Sérgio R Santos";
		int idade = 41;
		String sexo = "masculino";
		String genero = "masculino";
		
		System.out.println(nome);
		
		EXERCICIO
		CRIAR PROJETO FABRICA
		PACOTE BEANS
		CLASSE VEICULO
		ATRIBUTOS: MARCA MODELO COR
		CRIAR CLASSE TESTEVEICULO
		*/

	}

}
