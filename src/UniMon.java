public class UniMon {
	private String nome;
	private String categoria;
	private int nivel;
	private int vida;
	private int dano;
	private int velo;
	private int xpAtual;
	
	
	public UniMon(String nome, String categoria, int nivel, int vida, int dano, int velo, int xpAtual) {
		this.nome = nome;
		this.categoria = categoria;
		this.nivel = nivel;
		this.vida = vida;
		this.dano = dano;
		this.velo = velo;
		this.xpAtual = xpAtual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getVelo() {
		return velo;
	}

	public void setVelo(int velo) {
		this.velo = velo;
	}

	public int getXpAtual() {
		return xpAtual;
	}

	public void setXpAtual(int xpAtual) {
		this.xpAtual = xpAtual;
	}
	
}
