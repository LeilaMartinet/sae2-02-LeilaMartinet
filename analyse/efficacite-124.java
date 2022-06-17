public class Erase {

	//Modification : ajout d'une valeur de retour + changement du nom de la fonction
	
	public static String erase (String mot_avec_espace) {

		String str = mot_avec_espace.replaceAll("   ", "~");
		str= str.replaceAll("  ", "~~");
		str = str.replaceAll(" ", "");
		str = str.replaceAll("~~", "  ");
		str = str.replaceAll("~", "   ");
		//System.out.println(str);
		
		return str;
		
	}




	
}
