import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	Falas fala = new Falas();
    	System.out.println("--------------------------------------------------------------------");
    	fala.falaInicial();
    	System.out.println("--------------------------------------------------------------------");
    	System.out.print("\nDigite seu nome: ");
    	String nomePlayer = scan.nextLine();
    	
    	System.out.println("\n--------------------------------------------------------------------");
    	fala.falaInicial2(nomePlayer);
    	System.out.println("--------------------------------------------------------------------");
    	
    	System.out.print("\nDigite qual UniMon deseja: ");
    	int UniMonEsc = scan.nextInt();
    
    	System.out.println("\n--------------------------------------------------------------------");
    	fala.falaInicial3(nomePlayer,UniMonEsc - 1);
    	System.out.println("--------------------------------------------------------------------");
    }
}
