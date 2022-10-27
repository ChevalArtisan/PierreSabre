package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public String getBoissonFavorite() {
		return boissonFavorite;
	}
	public int getArgent() {
		return argent;
	}
	
	public void gagnerArgent(int gain) {
		argent+=gain;		
	}
	
	public void perdreArgent(int perte) {
		argent-=perte;
	}
	
	public void parler(String texte) {
		System.out.println("("+nom+") - "+texte);
	}
	
	public void direbonjour() {
		parler("Bonjour ! Je m'apelle "+nom+" et j'aime boire du "+boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boissonFavorite+" ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix>argent) {
			parler("Je n'ai que "+argent+" sous en poche. Je ne peux meme pas m'offrir un(e) "+bien+" à "+prix+" sous");
		}else {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir un(e) "+bien+" à "+prix+"sous");
			perdreArgent(prix);
		}
	}
}
	

