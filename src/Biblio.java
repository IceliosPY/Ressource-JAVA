public class Biblio {
    private Livre[] livres;
    private int nbLivres;

    public Biblio(int maxLivre) {
        this.livres = new Livre[maxLivre];
        this.nbLivres = 0;
    }
    
    public void ajouterLivre(Livre nouveauLivre) {
        if (nbLivres >= livres.length) {
            System.out.println("La biblioth�que est pleine. Impossible d'ajouter plus de livres.");
            return;
        }

        livres[nbLivres] = nouveauLivre;
        nbLivres++;
        System.out.println("Livre ajout� avec succ�s : " + nouveauLivre.getTitre());
    }
    
    public void listerLivres() {
        if (nbLivres == 0) {
            System.out.println("La biblioth�que est vide.");
        } else {
            System.out.println("La biblioth�que contient les livres suivants :");
            for (int i = 0; i < nbLivres; i++) {
                Livre livre = livres[i];
                System.out.println((i + 1) + ". Titre: " + livre.getTitre()  + ", Nombre de pages: " + livre.getNbPages() + ", Est emprunt�: " + livre.getEstPris());
            }
        }
    }
    
    public int getNbLivre() {
    	System.out.println("il y a " + this.nbLivres + " livres");
    	return this.nbLivres;
    }
    
    public void supprimerLivre(Livre livre) {
        for (int i = 0; i < nbLivres; i++) {
            if (livres[i].equals(livre)) { 
                for (int j = i; j < nbLivres - 1; j++) {
                    livres[j] = livres[j + 1]; 
                }
                nbLivres--;
                System.out.println("ok");
                return;
            }
        }
        System.out.println("ko");
    }
    
    
    public Livre trouverLivre(Livre livreRecherche) {
        for (int i = 0; i < nbLivres; i++) {
            if (livres[i].estIdentique(livreRecherche)) {
                System.out.println("Le livre est d�j� dans la biblioth�que.");
                return livres[i];
            }
        }
        System.out.println("Le livre n'est pas dans la biblioth�que.");
        return null;
    }
}