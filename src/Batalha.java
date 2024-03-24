public class Batalha {
    UniDex uniMon = new UniDex();
	Creditos creditos = new Creditos();
    Falas fala = new Falas();
	Menu menu = new Menu();

    public void batalha (int uniMon){
        
        switch (uniMon) {
            case 1:
                menu.menuGolpesJorge();
                break;
        
            default:
                break;
        }
    }
}
