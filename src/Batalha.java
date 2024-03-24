import java.util.Scanner;
public class Batalha {
    Scanner scan = new Scanner(System.in);
    UniDex uniMon = new UniDex();
	Creditos creditos = new Creditos();
    Falas fala = new Falas();
	Menu menu = new Menu();

    public void batalha (int uniMonEsc,int uniMonTrainer){
        switch (uniMonEsc) {
            case 0:
                menu.face(uniMonEsc, uniMonTrainer);
                menu.menuGolpesJorge();
                System.out.println("Qual golpe vai usar: ");
                int atq = scan.nextInt();
                switch (atq) {
                    case 1:
                        System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou ERRO causando: " + (uniMon.uniDex[uniMonEsc].getDano() + 2) + " de dano");
                        uniMon.uniDexTrainer[uniMonTrainer].setVida(uniMon.uniDexTrainer[uniMonTrainer].getVida() - (uniMon.uniDex[uniMonEsc].getDano() + 2 ));
                        break;
                    case 2:
                        System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou Coringada causando: " + (uniMon.uniDex[uniMonEsc].getDano() + 1) + " de dano");
                        uniMon.uniDexTrainer[uniMonTrainer].setVida(uniMon.uniDexTrainer[uniMonTrainer].getVida() - (uniMon.uniDex[uniMonEsc].getDano() + 1 ));
                        break;
                    case 3:
                        System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou Depre causando: " + (uniMon.uniDex[uniMonEsc].getDano() - 2 ) + " de dano");
                        uniMon.uniDexTrainer[uniMonTrainer].setVida(uniMon.uniDexTrainer[uniMonTrainer].getVida() - (uniMon.uniDex[uniMonEsc].getDano() - 2 ));
                        break;
                    case 4:
                        System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou HAHAHA causando: " + (uniMon.uniDex[uniMonEsc].getDano() + 9) + " de dano");
                        uniMon.uniDexTrainer[uniMonTrainer].setVida(uniMon.uniDexTrainer[uniMonTrainer].getVida() - (uniMon.uniDex[uniMonEsc].getDano() + 3 ));
                        System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou HAHAHA causando: " + (uniMon.uniDex[uniMonEsc].getDano() + 3) + " de dano, ataca mais vezes pra dá 9 HAHAHA");
                        break;    
                    default:
                        break;
                }
            case 2:
                menu.face(uniMonEsc, uniMonTrainer);
                menu.menuGolpesIris();
                System.out.println("Qual golpe vai usar: ");
                atq = scan.nextInt();
                switch (atq) {
                    case 1:
                        System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou LÁ ELEEE causando: " + (uniMon.uniDex[uniMonEsc].getDano() + 1) + " de dano");
                        uniMon.uniDexTrainer[uniMonTrainer].setVida(uniMon.uniDexTrainer[uniMonTrainer].getVida() - (uniMon.uniDex[uniMonEsc].getDano() + 1 ));
                        break;
                    case 2:
                        System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou Dormir curando 3 de vida");
                        uniMon.uniDex[uniMonEsc].setVida(uniMon.uniDex[uniMonEsc].getVida() + 3);
                        break;
                    case 3:
                        System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou Boy causando: " + (uniMon.uniDex[uniMonEsc].getDano() - 1 ) + " de dano");
                        uniMon.uniDexTrainer[uniMonTrainer].setVida(uniMon.uniDexTrainer[uniMonTrainer].getVida() - (uniMon.uniDex[uniMonEsc].getDano() - 1 ));
                        break;
                    case 4:
                        System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou Rémedio causando: " + (uniMon.uniDex[uniMonEsc].getDano() + 3) + " de dano");
                        uniMon.uniDexTrainer[uniMonTrainer].setVida(uniMon.uniDexTrainer[uniMonTrainer].getVida() - (uniMon.uniDex[uniMonEsc].getDano() + 3 ));
                        break;    
                    default:
                        break;
                    }
                    break;
            case 3:
                menu.face(uniMonEsc, uniMonTrainer);
                menu.menuGolpesArysson();
                System.out.println("Qual golpe vai usar: ");
                atq = scan.nextInt();
                switch (atq) {
                    case 1:
                        System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou Bomba causando: " + (uniMon.uniDex[uniMonEsc].getDano() + 2) + " de dano");
                        uniMon.uniDexTrainer[uniMonTrainer].setVida(uniMon.uniDexTrainer[uniMonTrainer].getVida() - (uniMon.uniDex[uniMonEsc].getDano() + 2 ));
                        break;
                    case 2:
                        System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou Voltar Ex perdendo 3 de vida");
                        uniMon.uniDex[uniMonEsc].setVida(uniMon.uniDex[uniMonEsc].getVida() - 3);
                        break;
                    case 3:
                        System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou Supino causando: " + (uniMon.uniDex[uniMonEsc].getDano() - 2 ) + " de dano");
                        uniMon.uniDexTrainer[uniMonTrainer].setVida(uniMon.uniDexTrainer[uniMonTrainer].getVida() - (uniMon.uniDex[uniMonEsc].getDano() - 2 ));
                        break;
                    case 4:
                        System.out.println(uniMon.uniDex[uniMonEsc].getNome() + " usou Break causando: " + (uniMon.uniDex[uniMonEsc].getDano() + 1) + " de dano");
                        uniMon.uniDexTrainer[uniMonTrainer].setVida(uniMon.uniDexTrainer[uniMonTrainer].getVida() - (uniMon.uniDex[uniMonEsc].getDano() + 1 ));
                        break;    
                    default:
                        break;
                    }
                break;  
            default:
                break;
        }



        int numAle = (int) (Math.random() * 5);
        switch (numAle) {
            case 0:
                System.out.println(uniMon.uniDexTrainer[uniMonTrainer].getNome() + " usou Lambida causando: " + (uniMon.uniDexTrainer[uniMonTrainer].getDano() + 1) + " de dano");
                uniMon.uniDex[uniMonEsc].setVida(uniMon.uniDex[uniMonEsc].getVida() - (uniMon.uniDexTrainer[uniMonTrainer].getDano() + 1));
                break;
            case 1:
                System.out.println(uniMon.uniDexTrainer[uniMonTrainer].getNome() + " usou Interger causando: " + (uniMon.uniDexTrainer[uniMonTrainer].getDano() - 1) + " de dano");
                uniMon.uniDex[uniMonEsc].setVida(uniMon.uniDex[uniMonEsc].getVida() - (uniMon.uniDex[uniMonTrainer].getDano() - 1 ));
                break;
            case 2:
                System.out.println(uniMon.uniDexTrainer[uniMonTrainer].getNome() + " usou Tiltar causando: " + (uniMon.uniDexTrainer[uniMonTrainer].getDano() + 2) + " de dano");
                uniMon.uniDex[uniMonEsc].setVida(uniMon.uniDex[uniMonEsc].getVida() - (uniMon.uniDex[uniMonTrainer].getDano() + 2 ));
                break;
            case 3:
                System.out.println(uniMon.uniDexTrainer[uniMonTrainer].getNome() + " usou Ataque Lento causando: 0 de dano");
                break;
            case 4:
                System.out.println(uniMon.uniDexTrainer[uniMonTrainer].getNome() + " usou Curar curando: 3 de vida");
                uniMon.uniDex[uniMonEsc].setVida(uniMon.uniDex[uniMonEsc].getVida() + 3);
                break;
            default:
                break;
        }
    }
}
