import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class Chaine {

	public static void main(String[] args) {
		creerFichier(generateString(new Random(), "abcdefgh  ijklmnopqrstuvxwyz. ", 10), "texte10");
		creerFichier(generateString(new Random(), "abcdefgh  ijklmnopqrstuvxwyz. ", 50), "texte50");
		creerFichier(generateString(new Random(), "abcdefgh  ijklmnopqrstuvxwyz. ", 100), "texte100");
		creerFichier(generateString(new Random(), "abcdefgh  ijklmnopqrstuvxwyz. ", 500), "texte500");
		creerFichier(generateString(new Random(), "abcdefgh  ijklmnopqrstuvxwyz. ", 1000), "texte1000");
	} 
	
	public static String generateString(Random rng, String characters, int length)
	{
	    char[] text = new char[length];
	    for (int i = 0; i < length; i++)
	    {
	        text[i] = characters.charAt(rng.nextInt(characters.length()));
	    }
	    return new String(text);
	}
	
	public static void creerFichier (String texte, String nom) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(nom +".txt", "UTF-8");
			writer.println(texte);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
}
