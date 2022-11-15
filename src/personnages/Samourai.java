package personnages;

public class Samourai extends Ronin{
	
	private String seigneur;

	public Samourai(String nom, String boisson, String seigneur , int argent) {
		super(nom, boisson, argent);
		this.seigneur=seigneur;
	}
	@Override
	public void direbonjour() {
		super.direbonjour();
		parler("Je suis fier de servir le seigneur "+seigneur);
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du "+ boisson);
	}
}
