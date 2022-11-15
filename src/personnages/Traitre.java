package personnages;

public class Traitre extends Samourai{
	private int nvTraitre=0;

	public Traitre(String nom, String boisson, String seigneur, int argent) {
		super(nom, boisson, seigneur, argent);
	}
	
	@Override
	public void direbonjour() {
		super.direbonjour();
		parler("- Mais je suis un traître et mon niveau de traîtrise est :"+nvTraitre+". Chut !");
	}
}
