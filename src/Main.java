import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Biblio maBiblio = new Biblio(10); 
        Livre livre1 = new Livre(300, false, "Titre 1");
        Livre livre2 = new Livre(250, true, "Titre 2");
        Livre livre3 = new Livre(250, true, "Titre 2"); 
        Livre livre4 = new Livre(250, true, "Titre 2"); 
        Livre livre5 = new Livre(250, true, "Titre 2"); 
        Livre livre6 = new Livre(250, true, "Titre 2"); 
        
        
        System.out.println("\nMenu:");
        System.out.println("1. Ajouter Livre");
        System.out.println("2. Lister Livres");
        System.out.println("3. V�rifier Identique");
        System.out.println("4. Supprimer");
        System.out.println("5. Quitter");
        boolean enCours = true;
        while (enCours) {
           
            
            int choix = System.in.read();
            
            switch (choix) {
                case '1':
                	// ajoute un livre a ma biblioth�que
                	System.out.println(" ");
                    System.out.println("Option Ajouter Livres s�lectionn�e.");
                    maBiblio.ajouterLivre(livre1);
                    maBiblio.ajouterLivre(livre2);
                    System.out.println(" ");
                    break;
                case '2':
                	// montre la liste des livres 
                	System.out.println(" ");
                    System.out.println("Option Lister livres s�lectionn�e.");
                    maBiblio.listerLivres();
                    System.out.println(" ");
                    break;
                case '3':
                	// verifie si deux livres sont identiques
                	System.out.println(" ");
                    System.out.println("Option V�rifier Identique s�lectionn�e.");
        	        livre1.estIdentique(livre2);
        	        livre2.estIdentique(livre3);
        	        System.out.println(" ");
                    break;
                    
                case '4':
                	// ajoute un livre, v�rifie que deux livres sont identique, puis supprime le troisi�me 
                	maBiblio.ajouterLivre(livre1);
                    maBiblio.ajouterLivre(livre2);
                    maBiblio.ajouterLivre(livre3);
                	livre1.estIdentique(livre2);
        	        livre2.estIdentique(livre3);
        	        maBiblio.supprimerLivre(livre3);
        	        break;
                case '5' : 
                	// ajoute trois livres, et supprime tout doublons
                	maBiblio.ajouterLivre(livre1);
                    maBiblio.ajouterLivre(livre2);
                    maBiblio.ajouterLivre(livre3);
        	        maBiblio.supprimerLivre(maBiblio.trouverLivre(livre3));
        	        break;
                case '6':
                	System.out.println(" ");
                    System.out.println("Au revoir !");
                    enCours = false; 
                    System.out.println(" ");
                    break;
                    
            }
        }
    }
}