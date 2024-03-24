import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
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
		int uniMonBat = 0;
		vere = true;

		while (jogoAndamento) {
			System.out.println("--------------------------------------------------------------------\n");
			menu.menu();
			int menuEsc = scan.nextInt();
			switch (menuEsc) {
				
				case 1:{	
					System.out.println("--------------------------------------------------------------------\n");
					fala.falaInicial4();
					System.out.println("--------------------------------------------------------------------\n\n\n");

					while (batalha) { 
						menu.menuBatalha();
						vere = true; 
					
						while (vere) {
							System.out.print("\nO que vai fazer: ");
							uniMonBat = scan.nextInt();
							if (uniMonBat != 1 && uniMonBat != 2) {
								System.out.println("Opção Inválida!!");
								vere = true;
							} else {
								vere = false; 
							}
						}

						if(uniMonBat == 1){
							if(uniMonEsc == 1){
								menu.menuGolpesJorge();
								int atq = scan.nextInt();
								switch (atq) {
									case 1:
										System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou ERRO");
										uniMon.uniDexTrainer[3].setVida(uniMon.uniDexTrainer[3].getVida() - uniMon.uniDex[uniMonEsc].getDano() + 2);
										System.out.println(uniMon.uniDexTrainer[3].getVida());
										break;
								
									default:
										break;
								}
							}

						}

						if(uniMon.uniDex[uniMonEsc].getVida() == 0 || uniMon.uniDexTrainer[3].getVida() == 0){
							if(uniMon.uniDexTrainer[3].getVida() == 0){ 
								System.out.println("Nem acredito que você me ganhou, bom... te vejo depois, vá para o CT...");
								batalha = false;
							}else{
								System.out.println("Eu sou inevitável. HAHAHA... Treine mais, e talvez alcançará 1% do meu poder.");
								batalha = false;
							}
						}
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

