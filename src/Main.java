import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    		Scanner scanf = new Scanner(System.in);
    		UniDex uniDex = new UniDex();
    		
    		int escolha = 0;
    		int xp = 10;
    		for(int i = 0; i < 5; i++) {
    			uniDex.levelUp(escolha, xp);
    		} 
    		uniDex.levelUpTrainer(0, 0);
    		uniDex.status(escolha);
    		System.out.println("_____________");
    		uniDex.ataqueUniTrainer(0, 0, 1);
    		uniDex.status(escolha);
    		System.out.println("_____________");
    		uniDex.ataqueUniMestre(0, 4, 1);
    		uniDex.status(escolha);
    		System.out.println("_____________");
    		uniDex.receberAtaqueTrainer(0, 0, 1);
    		uniDex.status(escolha);
    		System.out.println("_____________");
    		uniDex.receberAtaqueMestre(0, 4, 1);
    		uniDex.status(escolha);
    		System.out.println("_____________");
    }
}
