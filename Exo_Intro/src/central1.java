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
		
		
		int[] t = new int[10] ; 
		
		
		
		InitTab(t);
		
		AfficherTableau(t);
		TrierTableau(t);
		
		System.out.println("");
		
		AfficherTableau(t);
		
		*/
		
		/***** Exo 3 ****/
		/*
		 *  Créer un tableau de 8 adresses mail.
			Calculer la part de marché de chacun des fournisseurs d'accès.
			Le FAI est situé après le '@'
			Afficher pour chaque FAI sa part de marché

		
		int taille = 8;
		
		String [] sTab = new String [taille];
		
		String [] TabFournisseur = new String [taille];
		
		String [] TabResultat = new String [taille];
		
		InitStringTab(sTab);
		
		Extraction(sTab, TabFournisseur);

		InitStringTabNeutral(TabResultat);
		
		CalculTab(TabFournisseur, taille);
			
		 */
		
	}
	
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
	
	public static void InitStringTabNeutral(String[] t)
	{
		for(int i = 0; i < t.length; i++)
		{
			t[i] = "";
		}
		
	}
	
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

	
	public static void AfficherStringTab(String[] t)
	{
		for(int i = 0; i < t.length; i++)
		{
			System.out.println(t[i]);
		}
	}

	
	public static void InitTab(int[] t)
	{
		for(int i = 0; i < t.length; i++)
		{
			t[i] = (int)(Math.random() * 100 );
		}
	}
	
	
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
	
	
	public static void AfficherTableau(int[] t)
	{
		for(int i = 0; i < t.length; i++)
		{
			System.out.print(t[i] + " ");
		}
	}
}
