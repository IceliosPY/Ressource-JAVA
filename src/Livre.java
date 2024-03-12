public class Livre {
    private int nbPages;
    private boolean estPris;
    private String titre;

    public Livre(int nbPages, boolean estPris, String titre) {
        this.nbPages = nbPages;
        this.estPris = estPris;
        this.titre = titre;
    }

    public int getNbPages() {
        return nbPages;
    }

    public boolean getEstPris() {
        return estPris;
    }

    public String getTitre() {
        return titre;
    }
	
	public Livre modifierTitre(String NouveauTitre) {   
	this.titre = NouveauTitre;
	return new Livre(
			 this.getNbPages(),
			 this.getEstPris(),
			 this.getTitre()
					);
	}
	
	public Livre modifierNbpages(int nbpages) {   
		this.nbPages = nbpages;
		return new Livre(
				 this.getNbPages(),
				 this.getEstPris(),
				 this.getTitre()
						);
		}
	
	public Livre modifierEstPris(boolean estPris) {   
		this.estPris = estPris;
		return new Livre(
				 this.getNbPages(),
				 this.getEstPris(),
				 this.getTitre()
						);
		}
	
	public boolean estIdentique(Livre livre1){
		if (
				(livre1.estPris == this.estPris) || 
				(livre1.titre == this.titre) || 
				(livre1.nbPages == this.nbPages)) {
		   // si c'est les mêmes
		   System.out.println("ok");
		   return true;}
		   else {
		   // si c'est pas les mêmes
		   System.out.println("ko");
		   return false;
		   }
		
	}
	
}