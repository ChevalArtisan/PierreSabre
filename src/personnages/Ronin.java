package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don=getArgent()/10;
		parler(beneficiaire.getNom()+" prend ces "+don+" sous");
		beneficiaire.recevoir(don);
		perdreArgent(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler(" Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (honneur*2>adversaire.getReputation()) {
			gagner(adversaire.getArgent());
			adversaire.perdre();
		}else {
			adversaire.gagner(perdre());
		}
	}
	
	public int perdre() {
		int sous=getArgent();
		perdreArgent(sous);
		honneur-=1;
		parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		return sous;			
	}
	public void gagner(int gain) {
		gagnerArgent(gain);
		honneur+=1;
		parler("Je t'ai eu petit Yakuza");
	}
}
