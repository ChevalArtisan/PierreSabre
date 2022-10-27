package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom, String boisson, String clan, int argent) {
		super(nom, boisson, argent);
		this.clan=clan;	
	}
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int butin=victime.seFaireExtorquer();
		parler("J’ai piqué les "+butin+" sous de "+victime.getNom()+", ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi !");
		gagnerArgent(butin);
	}
	
	public int getReputation(){
		return reputation;
	}
	public int perdre() {
		int sous=getArgent();
		perdreArgent(sous);
		parler("J’ai perdu mon duel et mes "+sous+" sous, snif... J'ai déshonoré le clan "+ clan);
		reputation-=1;
		return sous;			
	}
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation+=1;
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+"? Je l'ai dépouillé de ses "+gain+" sous.");
	}
}
