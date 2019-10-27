import java.util.Random;
import java.util.Scanner;


public class central1 {
	
	public static void main(String[] args)
	{
		/***** Exo 1 ****/
		
		/*
		 * Application permettant de demander son âge à l'utilisateur
		 * En fonction de sa saisie on lui fait un retour (jeune, vieux,etc...)
		
		
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisissez votre âge : ");
		age = sc.nextInt();
		
		if(age < 18)
		{
			System.out.println("Vous êtes mineur");
		}
		else if (age >= 18)
		{
			System.out.println("Vous êtes majeur");
			if(age > 60)
			{
				System.out.print(" .. et vieux !");
			}
		}
		
		*/
		
		/***** Exo 2 ****/
		/*
		Exercice 2
		 * Application de traitement de tableaux 
		Créer un tableau d'entiers
		Créer une méthode qui permet de trier ce tableau (Valider votre méthode 
		avec Arrays.sort)
		Afficher le tableau trié
		Créer une méthode qui cherche le max ;-)
		Afficher le max.
		
		//Le tableau d'entier à trier
		int[] t = new int[10] ; 
		
		//Initialise le tableau avec des entiers au hasard
		InitTab(t);
		
		//l'affiche une fois
		AfficherTableau(t);

		//Tri tu tableau
		TrierTableau(t);
		
		System.out.println("");
		
		//et le ré-affiche pour comparer
		AfficherTableau(t);
		
		*/
		
		/***** Exo 3 ****/
		/*
		 *  Créer un tableau de 8 adresses mail.
			Calculer la part de marché de chacun des fournisseurs d'accès.
			Le FAI est situé après le '@'
			Afficher pour chaque FAI sa part de marché

		
		int taille = 8;
		
		//Premier tableau de chaine avec les adresses mail
		String [] sTab = new String [taille];
		
		//déclaration d'un autre tableau ou stocker les fournisseur à partir du tableau d'adresse mail
		String [] TabFournisseur = new String [taille];
		
		//tableau dans lequel stocker les résultats
		String [] TabResultat = new String [taille];
		
		//Initialise le tableau avec les adresses mail
		InitStringTab(sTab);
		
		//Extrait les fournisseurs à partir du tableau de mail, dans le tableau de fournisseurs
		Extraction(sTab, TabFournisseur);
	
		//Initialise le tableau de résultats à vide
		InitStringTabNeutral(TabResultat);
		
		//Calcul les parts des fournisseurs et les stocks dans ce tableau
		CalculTab(TabFournisseur, taille);
			
		 */
		
		/***** Exo 4 ****/
		/*
		Générer 3 nombres aléatoires compris entre 0 et 1000
		Vérifier si vous avez 2 nombres pairs suivis par un impair ; Si ce n'est
		 pas le cas, recommencez jusqu'à avoir la combinaison pair, pair et 
		impair.
		Afficher ensuite le nombre d'essais pour y être arrivé.
		
		
		Boolean fini = false;
		int cpt = 0;
		int[] nTab = new int[3];
		
		//Affectation et vérification d'un nombre, réaffectation si non-validation
		while(fini == false)
		{
			cpt++;
			nTab[0] = (int)(Math.random() * 1000);
			if(nTab[0] % 2 == 0)
			{
				nTab[1] = (int)(Math.random() * 1000);
				if(nTab[1] % 2 == 0)
				{
					nTab[2] = (int)(Math.random() * 1000);
					if(nTab[2] % 2 != 0)
					{
						fini = true;
					}
					
				}
			}
			
		}
		
		System.out.print("Nombre d'essais : " + cpt + " Chiffres : " +nTab[0] + " " + nTab[1] + " " + nTab[2]);
		
		*/
		
		
		
		/***** Exo 5 ****/
		/*
		Générer un nombre aléatoire entre 0 et 1000.
		Demander à l'utilisateur de deviner le nombre saisi par l'ordinateur.
		Limiter sa saisie à un nombre entre 0 et 1000, lui indiquer "plus" ou 
		"moins" jusqu'à ce qu'il trouve le bon nombre.
		Afficher le nombre de propositions, ainsi que le temps mis pour deviner.
		
		//Constantes minimum et maximum
		final int MIN = 1;
		final int MAX = 1000;
		
		System.out.println("DEBUT");
		
		//début du jeu, lancement du timer
		long debut = System.currentTimeMillis();

		//génération du chiffre aléatoire
		int nbrToFind = (int)(Math.random() * MAX);

		int nbrTempo = 0;
		int cpt = 0;
		
		Boolean over = false;
		
		//Demande un chiffre en boucle jusqu'a validation, vérifie par rapport au nombre aléatoire et fait un retour à l'utilisateur
		while(!over)
		{

			int nbrChoisi = GetNumber(nbrTempo, MIN, MAX);
			cpt++;
			
			
			if(nbrChoisi < nbrToFind)
			{
				System.out.println("Votre chiffre est en dessous");
			}
			else if(nbrChoisi > nbrToFind)
			{
				System.out.println("Votre chiffre est au dessus");
			}
			else
			{
				float endTime = (System.currentTimeMillis()-debut) / 1000F;
				System.out.println("Félicitations vous avez trouvé le bon chiffre ! En " + cpt + " essai(s) et " + endTime + " secondes");
				
				over = !over;
			}
			
			
		}
		*/
		
	}
	
	
	//Fonction de demande de chiffre entre MIN et MAX jusqu'a validation
	public static int GetNumber(int nbr, int MIN, int MAX	)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez votre nombre entre " + MIN + " et " + MAX + " : ");
		nbr = sc.nextInt();
		while(nbr > MAX || nbr < MIN)
		{
			if(nbr > MAX || nbr < MIN)
			{
				System.out.print("Votre saisie est invalide, veuillez reessayer :");		
				nbr = sc.nextInt();
			}
		}
		
		return nbr;
	}
	
	
	
	
	//procédure de calcul de parts de marché des fournisseurs
	public static void CalculTab(String[] t, int tabTaille)
	{
		int live = 0;
		int outlook = 0;
		int ludus = 0;
		int hotmail = 0;
		int autre = 0;
		
		for(int i = 0; i < t.length; i++)
		{
			int position = t[i].indexOf("live");
			
			if(position != -1)
			{
				live++;
			}			
			position = t[i].indexOf("outlook");
			if(position != -1)
			{
				outlook++;
			}
			position = t[i].indexOf("ludus");
			if(position != -1)
			{
				ludus++;
			}
			
			position = t[i].indexOf("hotmail");
			if(position != -1)
			{
				hotmail++;
			}

		
		
		}
		
		float[] TabSortie = new float [tabTaille];
		
		TabSortie[0] = live * 100 / tabTaille;
		TabSortie[1] = outlook * 100 / tabTaille;
		TabSortie[2] = ludus * 100 / tabTaille;
		TabSortie[3] = hotmail * 100 / tabTaille;
		
		
		
		
		
		System.out.print("Live : " + TabSortie[0] + "% Outlook : " + TabSortie[1] + "% Ludus : " + TabSortie[2] + "% Hotmail : " + TabSortie[3] + "%");
	}
	

	//Procedure d'initialisation du tableau d'adresse mail
	public static void InitStringTab(String[] t)
	{
		t[0] = "cedric.mag@live.fr";
		t[1] = "jean.kevin@hotmail.fr";
		t[2] = "igor.mak@outlook.fr";
		t[3] = "ultra.vomit@outlook.fr";
		t[4] = "cedric.mag@ludus-academie.com";
		t[5] = "alexis.wallish@outlook.fr";
		t[6] = "testo.sterone@live.fr";
		t[7] = "patrick.balkany@outlook.fr";
	}
	

	//Procedure d'initialisation 
	public static void InitStringTabNeutral(String[] t)
	{
		for(int i = 0; i < t.length; i++)
		{
			t[i] = "";
		}
		
	}
	
	//Procedure d'extraction des fournisseurs depuis les mails
	public static void Extraction(String[] t, String[] t2)
	{
		
		for(int i = 0; i < t.length; i++)
		{
			String adresse = t[i];
			int pos = adresse.indexOf('@');
			int index = adresse.lastIndexOf('.');
			
			String fournisseur = adresse.substring(pos+1, index);
			
			t2[i] = fournisseur;
		}
	}

	
	//affichage d'un tableau de chaines
	public static void AfficherStringTab(String[] t)
	{
		for(int i = 0; i < t.length; i++)
		{
			System.out.println(t[i]);
		}
	}

	
	//Initialisation d'un tableau d'entiers avec des nombres aléatoires
	public static void InitTab(int[] t)
	{
		for(int i = 0; i < t.length; i++)
		{
			t[i] = (int)(Math.random() * 100 );
		}
	}
	
	
	//fonction de tri de tableau
	public static void TrierTableau(int[] t)
	{
		int i, j, cle;

	    for (i = 1; i < t.length; i++)
	    {
	        cle = t[i];
	        j = i;
	        while ((j >= 1) && (t[j - 1] > cle)) //ordre de classement
	        {
	            t[j]  = t[j - 1] ;
	            j = j - 1;
	        }
	        t[j] = cle;
	    }
		
	}
	
	
	//Affichage d'un tableau d'entiers
	public static void AfficherTableau(int[] t)
	{
		for(int i = 0; i < t.length; i++)
		{
			System.out.print(t[i] + " ");
		}
	}
}
