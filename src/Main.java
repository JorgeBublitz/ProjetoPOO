import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
		UniDex uniMon = new UniDex();
		Creditos creditos = new Creditos();
    	Falas fala = new Falas();
		Menu menu = new Menu();/*
    	System.out.println("--------------------------------------------------------------------");
    	fala.falaInicial();
    	System.out.println("--------------------------------------------------------------------");
    	System.out.print("\nDigite seu nome: ");
    	String nomePlayer = scan.nextLine();
    	
    	System.out.println("\n--------------------------------------------------------------------");
    	fala.falaInicial2(nomePlayer);
    	System.out.println("--------------------------------------------------------------------");
    	
    	System.out.print("\nDigite qual UniMon deseja: ");
    	int uniMonEsc = scan.nextInt();
    

    	System.out.println("\n--------------------------------------------------------------------");
    	fala.falaInicial3(nomePlayer,uniMonEsc );
    	System.out.println("--------------------------------------------------------------------\n\n");
		*/
		
		
		boolean java = true;

		while (java) {
			System.out.println("--------------------------------------------------------------------\n");
			menu.menu();
			System.out.println("--------------------------------------------------------------------");
			int menuEsc = scan.nextInt();
			switch (menuEsc) {
				
				case 1:{	
					
					fala.falaInicial4();
					/*
					 AQUI QUE VOCÊ IRA FAZER O SEXO, CARALHO
					 */

					if(uniMon.uniDex[uniMonEsc].getVida() == 0){
						System.out.println("");
					}





















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
		
    }

