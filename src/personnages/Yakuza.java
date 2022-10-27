package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom, String boisson, String clan, int argent) {
		super(nom, boisson, argent);
		this.clan=clan;	
	}
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom()+", si tu tiens � la vie donne moi ta bourse !");
		int butin=victime.seFaireExtorquer();
		parler("J�ai piqu� les "+butin+" sous de "+victime.getNom()+", ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi !");
		gagnerArgent(butin);
	}

}
