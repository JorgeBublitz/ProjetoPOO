import java.util.Scanner;

public class Falas {
	Scanner scan = new Scanner(System.in);
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
	public void falaInicial3(String nomePlayer, int nomeMon) {
		
		UniDex nome = new UniDex();
		String[] texto = new String[] {"Boa escolha " + nomePlayer + "... espero que ( " + nome.uniDex[nomeMon].getNome() + " ) te ajude na sua jornada no mundo de Unipe...\n", 
										"Agora vá... verei você em breve.\n" ,
										"Jájá vai aparecer o seu rival, BOA SORTE!\n"
										
									
									
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
	public void falaInicial4() {
		String[] texto = new String[] {
				"Ah você chegou a Unipê...\n" +
				"O Leo disse que você viria\n" +
				"PRONTO PRA BATALHAT???!!!"
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
		scan.nextLine();
	}
}
