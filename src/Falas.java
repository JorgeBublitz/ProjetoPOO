
public class Falas {
	public void falaInicial() {
		String[] texto = new String[] {
		        " Bem-vindo ao mundo dos Unimon! Meu nome é Professor Leo.\n"
		      + " As pessoas costumam me chamar de Professor LOL.\n",
		        " Este mundo é habitado por criaturas chamadas Unimon.\n"
		      + " Algumas pessoas os têm como animais de estimação,\n"
		      + " outros os usam para lutar.\n",
		        " Você deve tentar obter o máximo de experiência possível.\n"
		      + " Esta é uma jornada muito enriquecedora,\n"
		      + " vou pro meu League of Legends...\n",
		        " AAAA... Quase ia esquecendo, diz o seu nome ai\n"
		    };

	    for (String frase : texto) {
	        for (int i = 0; i < frase.length(); i++) {
	            System.out.print(frase.charAt(i));
	            try {
	                Thread.sleep(1); // Atraso de 100 milissegundos entre caracteres
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
	public void falaInicial2(String nome) {
		String[] texto = new String[] {
		        " Bem vindo "+ nome +", deve jogar Dota, pra ter esse nome kkkkk.\n",
		        " Jogador de Dota não tem capacidade de pegar seu primeiro UniMon sozinho...\n",
		        " Então escolha um UniMon ( 1 - JorgeMon | 2 - ÍrisMon | 3 - ArrysonMon )\n"
		    };
		for (String frase : texto) {
	        for (int i = 0; i < frase.length(); i++) {
	            System.out.print(frase.charAt(i));
	            try {
	                Thread.sleep(1); // Atraso de 100 milissegundos entre caracteres
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
	public void falaInicial3() {
		String[] texto = new String[] {""}
	}
}
