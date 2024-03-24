public class UniDex {
	int hp = 0;
    int ad = 0;
    int spd = 0;
    int HP = 0;

    UniMon jorgeMon = new UniMon("JorgeMon", "Júnio", 1, 3, 2, 1, 0);
    UniMon arrysonMon = new UniMon("ArrysonMon", "Júnio", 1, 2, 4, 0, 0);
    UniMon irisMon = new UniMon("ÍrisMon", "Júnio", 1, 4, 2, 0, 0);
    
    UniMon[] uniDex = new UniMon[] {jorgeMon, irisMon, arrysonMon};
    
    UniMonTrainer vitorMon = new UniMonTrainer("VitorMon", "Júnio", 1, 2, 3, 0, 0); 
    UniMonTrainer anthonyMon = new UniMonTrainer("AnthonyMon", "Júnio", 0, 0, 0, 0, 0); 
    UniMonTrainer elionMon = new UniMonTrainer("ElionMon", "Júnio", 1, 3, 1, 1, 0); 
    UniMonTrainer kaikeMon = new UniMonTrainer("KaikeMon", "Júnio", 1, 5, 2, 0, 0); 
    
    UniMonTrainer[] uniDexTrainer = new UniMonTrainer[] {vitorMon, anthonyMon, elionMon, kaikeMon};
    
    UniMonMestre emersonMon = new UniMonMestre("KerneyMon", "Sênior", 6, 14, 2, 3); 
    UniMonMestre danielMon = new UniMonMestre("PhpMon", "Sênior", 8, 18, 4, 3);
    UniMonMestre walterMon = new UniMonMestre("JavaMon", "Sênior", 10, 22, 5, 3);
    UniMonMestre wallaceMon = new UniMonMestre("ListaMon", "Sênior", 12, 26, 7, 3);
    UniMonMestre leoMon = new UniMonMestre("CêMon", "Sênior", 15, 30, 8, 3);
    
    UniMonMestre[] uniDexMestre = new UniMonMestre[] {emersonMon, danielMon, walterMon, wallaceMon, leoMon};
    
    
    public void levelUp(int esc, int xp) {
        if (uniDex[esc].getXpAtual() < 10) {
            uniDex[esc].setXpAtual(uniDex[esc].getXpAtual() + xp);
        }

        if (uniDex[esc].getXpAtual() >= 10) {
        	if (uniDex[esc].getNivel() == 15){
        		uniDex[esc].setXpAtual(0);
        		return;
        	}
            if (uniDex[esc].getNivel() < 15) {
                uniDex[esc].setNivel(uniDex[esc].getNivel() + 1);
                uniDex[esc].setXpAtual(uniDex[esc].getXpAtual() - 10);
                hp++;
                ad++;
                spd++;
            } 
        }
        if(hp == 1) { //Up Vida
        	uniDex[esc].setVida(uniDex[esc].getVida() + 2);
        	HP = uniDex[esc].getVida();
        	hp = 0;
        }
        if(ad == 3) { //Up Dano
        	uniDex[esc].setDano(uniDex[esc].getDano() + 1);
        	ad = 0;
        }
        if(spd == 5) { //Up Velocidade
        	uniDex[esc].setVelo(uniDex[esc].getVelo() + 1);
        	spd = 0;
        }
        //Subir a categoria
        if(uniDex[esc].getNivel() >= 6 && uniDex[esc].getNivel() <= 9) {
        	uniDex[esc].setCategoria("Pleno");
        }else if(uniDex[esc].getNivel() >= 10 && uniDex[esc].getNivel() <= 15) {
        	uniDex[esc].setCategoria("Sênior");
        }
    }
    	
    
    public void levelUpTrainer(int player, int esc) {

    	for(int i = 0; i <= uniDex[player].getNivel(); i++) {
    		if (uniDexTrainer[esc].getXpAtual() < 10) {
                uniDexTrainer[esc].setXpAtual(uniDex[esc].getXpAtual() + 10);
            }

            if (uniDexTrainer[esc].getXpAtual() >= 10) {
            	if (uniDexTrainer[esc].getNivel() == 15){
            		uniDexTrainer[esc].setXpAtual(0);
            		return;
            	}
			if (uniDexTrainer[esc].getXpAtual() >= 10) {
	        	if (uniDexTrainer[esc].getNivel() == 15){
	        		uniDexTrainer[esc].setXpAtual(0);
	        		return;
	        	}
	            if (uniDexTrainer[esc].getNivel() < 15) {
	                uniDexTrainer[esc].setNivel(uniDex[esc].getNivel() + 1);
	                uniDexTrainer[esc].setXpAtual(uniDex[esc].getXpAtual() - 10);
	                hp++;
	                ad++;
	                spd++;
	            } 
	        }
	        if(hp == 1) { //Up Vida
	        	uniDexTrainer[esc].setVida(uniDexTrainer[esc].getVida() + 2);
	        	hp = 0;
	        }
	        if(ad == 3) { //Up Dano
	        	uniDexTrainer[esc].setDano(uniDexTrainer[esc].getDano() + 1);
	        	ad = 0;
	        }
	        if(spd == 5) { //Up Velocidade
	        	uniDexTrainer[esc].setVelo(uniDexTrainer[esc].getVelo() + 1);
	        	spd = 0;
	        }
	        //Subir a categoria
	        if(uniDexTrainer[esc].getNivel() >= 6 && uniDexTrainer[esc].getNivel() <= 9) {
	        	uniDexTrainer[esc].setCategoria("Pleno");
	        }else if(uniDexTrainer[esc].getNivel() >= 10 && uniDexTrainer[esc].getNivel() <= 15) {
	        	uniDexTrainer[esc].setCategoria("Sênior");
	        }
        }
   	}
}
    
    public void ataqueUniTrainer(int player, int trainer, int ataque) { //Nosso dano
    	if(ataque == 1 && uniDex[player].getNivel() >= 1 ) {
    		int novoValorVida = uniDexTrainer[trainer].getVida() - uniDex[player].getDano();
            uniDexTrainer[trainer].setVida(novoValorVida);
    	}
    }
    
    public void ataqueUniMestre(int player, int mestre, int ataque) { //Nosso dano
    	if(ataque == 1 && uniDex[player].getNivel() >= 1 ) {
    		int novoValorVida = uniDexMestre[mestre].getVida() - uniDex[player].getDano();
            uniDexMestre[mestre].setVida(novoValorVida);
    	}
    }
    
    public void receberAtaqueTrainer(int player, int trainer, int ataque) { //Receber dano
    	if(ataque == 1 && uniDexTrainer[trainer].getNivel() >= 1 ) {
    		int novoValorVida = uniDex[player].getVida() - uniDexTrainer[trainer].getDano();
            uniDex[player].setVida(novoValorVida);
    	}
    }
    
    public void receberAtaqueMestre(int player, int mestre, int ataque) { //Receber dano
    	if(ataque == 1 && uniDexMestre[mestre].getNivel() >= 1 ) {
    		int novoValorVida = uniDex[player].getVida() - uniDexMestre[mestre].getDano();
            uniDex[player].setVida(novoValorVida);
    	}
    }
    
    public void curarVida(int player) {
    	if(uniDex[player].getVida() < HP) {
    		uniDex[player].setVida(HP);
    	}else {
    		uniDex[player].setVida(uniDex[player].getVida());
    	}
    }
    
    public void status(int esc) {
    	System.out.println("Lv" + uniDex[esc].getNivel() + "\t|Nome: " + uniDex[esc].getNome());
    	System.out.println("Vida: " + uniDex[esc].getVida() + " Dano: " + uniDex[esc].getDano());
    	System.out.println("Lv" + uniDexTrainer[esc].getNivel() + "\t|Nome: " + uniDexTrainer[esc].getNome());
    	System.out.println("Vida: " + uniDexTrainer[esc].getVida() + " Dano: " + uniDexTrainer[esc].getDano());
    	System.out.println("Lv" + uniDexMestre[4].getNivel() + "\t|Nome: " + uniDexMestre[4].getNome());
    	System.out.println("Vida: " + uniDexMestre[4].getVida() + " Dano: " + uniDexMestre[4].getDano());
    }
}
