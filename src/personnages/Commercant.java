package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
	}
	
	public int seFaireExtorquer() {
		int butin =getArgent();
		perdreArgent(butin);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return butin;
	}
	
	public void recevoir(int don) {
		gagnerArgent(don);
		parler( don+" sous! Je te remercie généreux donateur!");
	}
}
