public class Menu {
    UniDex uniMon = new UniDex();
    public void menu() {
        System.out.println(" ---------------- UniMon  ----------------");
        System.out.println("|    1 - Jogar             2 - Créditos  |");
        System.out.println("|    3 - Sair                            |");
        System.out.println("------------------------------------------");
        
    }

    public void face(int uniMonEsc, int trainer){
        System.out.println(" --------------- BatalhaMon --------------");
        System.out.println("|                       " + uniMon.uniDexTrainer[trainer].getNome() + " HP: " + uniMon.uniDexTrainer[trainer].getVida() );
        System.out.println("|                                        |");
        System.out.println("|                                        |");
        System.out.println("|                                        |");
        System.out.println("| " + uniMon.uniDex[uniMonEsc].getNome() + " HP: " + uniMon.uniDex[uniMonEsc].getVida());
        System.out.println("------------------------------------------");
    }

    public void menuBatalha(){
        System.out.println("--------------- BatalhaMon ---------------");
        System.out.println("|    1 - Golpe              2 - Bolsa    |");
        System.out.println("------------------------------------------");
    }
    public void menuGolpesJorge(){
        System.out.println("---------------- GolpeMon ----------------");
        System.out.println("|    1 - ERRO              2 - Coringada |");
        System.out.println("|    3 - Depre             4 - HAHAHA    |");
        System.out.println("------------------------------------------");
    }
    public void menuGolpesIris(){
        System.out.println("---------------- GolpeMon ----------------\n");
        System.out.println("|    1 - LÁ ELEEE          2 - Dormir    |\n");
        System.out.println("|    3 - BOY               4 - Remédio   |\n");
        System.out.println("------------------------------------------\n");
    }
    public void menuGolpesArysson(){
        System.out.println("---------------- GolpeMon ----------------\n");
        System.out.println("|    1 - Bomba             2 - Voltar Ex |\n");
        System.out.println("|    3 - Supino            4 - Break     |\n");
        System.out.println("------------------------------------------\n");
    }
}
