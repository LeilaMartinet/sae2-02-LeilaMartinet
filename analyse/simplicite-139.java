public class Erase {

    /*
    public static void main(String[] args) {
        
    	//Saisie du texte String
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Veuillez saisir le texte : ");
    	String text = sc.nextLine();
        System.out.println("\nLe texte de base est : \n"+text);
        String newText="";
   
        //Remplace les 3 espaces, les 2 espaces et les espaces seuls sont maintenant vide puis replace dans l'autre sens
      
        
        newText=text.replaceAll("   ","2x6GutAqKH");
        newText=newText.replaceAll("  ","TrMyEgnMHX");
        newText=newText.replaceAll(" ","");
        newText=newText.replaceAll("2x6GutAqKH","   ");
        newText=newText.replaceAll("TrMyEgnMHX","  ");
     
        
        System.out.println("---------------------------------------------------------------");
        System.out.println("Nouveau texte :\n" +newText+".");
   
    }
    */

    public static String erase (String text) {

        String newText = "";

        newText=text.replaceAll("   ","2x6GutAqKH");
        newText=newText.replaceAll("  ","TrMyEgnMHX");
        newText=newText.replaceAll(" ","");
        newText=newText.replaceAll("2x6GutAqKH","   ");
        newText=newText.replaceAll("TrMyEgnMHX","  ");

        return newText;
    }

}



