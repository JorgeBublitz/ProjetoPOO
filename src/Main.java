import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
		Batalha batalhas = new Batalha();
		UniDex uniMon = new UniDex();
		Creditos creditos = new Creditos();
    	Falas fala = new Falas();
		Menu menu = new Menu();
    	System.out.println("--------------------------------------------------------------------");
    	fala.falaInicial();
    	System.out.println("--------------------------------------------------------------------");
    	System.out.print("\nDigite seu nome: ");
    	String nomePlayer = scan.nextLine();
    	
    	System.out.println("\n--------------------------------------------------------------------");
    	fala.falaInicial2(nomePlayer);
    	System.out.println("--------------------------------------------------------------------");
		
		boolean vere = true;
    	int uniMonEsc = 0;

		while (vere) {
			System.out.print("\nDigite qual UniMon deseja: ");
			uniMonEsc = scan.nextInt();
			uniMonEsc -= 1;
			if (uniMonEsc != 0 && uniMonEsc != 1 && uniMonEsc != 2) {
				System.out.println("UniMon Inválido");
				vere = true;
			} else {
				vere = false;
			}
		}
    

    	System.out.println("\n--------------------------------------------------------------------");
    	fala.falaInicial3(nomePlayer,uniMonEsc);
    	System.out.println("--------------------------------------------------------------------\n\n\n\n");
		
		
		
		boolean jogoAndamento = true;
		boolean batalha = true;

		
		System.out.println("--------------------------------------------------------------------\n");
		menu.menu();
		int menuEsc = scan.nextInt();
		switch (menuEsc) {
			
			case 1:{	
				System.out.println("--------------------------------------------------------------------\n");
				fala.falaInicial4();
				System.out.println("--------------------------------------------------------------------\n\n\n");
				batalhas.batalha(uniMonEsc);
			}
			break;
			case 2:{
				creditos.creditos();
			}
			break;

			case 3:{
				System.out.println("Encerrando o UniMon!");
				System.exit(0);
			}
			break;

			default:{
				System.out.println("Opção invalida");
				scan.nextLine();
			}
			break;
		}
    }
}
