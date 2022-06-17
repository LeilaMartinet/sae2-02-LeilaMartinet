import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestTemps {

	public static void main(String[] args) {

		String cc10 = "";
		String cc50 = "";
		String cc100 = "";
		String cc500 = "";
		String cc1000 = "";
		String cc100000 = "";
		String cc1000000 = "";
		
		try{
			InputStream flux1=new FileInputStream("texte10.txt"); 
			InputStreamReader lecture1=new InputStreamReader(flux1);
			BufferedReader buff1=new BufferedReader(lecture1);
			String ligne;
			while ((ligne=buff1.readLine())!=null){
				cc10 = ligne;
			}
			buff1.close();
			
			InputStream flux2=new FileInputStream("texte50.txt"); 
			InputStreamReader lecture2=new InputStreamReader(flux2);
			BufferedReader buff2=new BufferedReader(lecture2);
			while ((ligne=buff2.readLine())!=null){
				cc50 = ligne;
			}
			buff2.close();
			
			InputStream flux3=new FileInputStream("texte100.txt"); 
			InputStreamReader lecture3=new InputStreamReader(flux3);
			BufferedReader buff3=new BufferedReader(lecture3);
			while ((ligne=buff3.readLine())!=null){
				cc100 = ligne;
			}
			buff3.close();
			
			InputStream flux4=new FileInputStream("texte500.txt"); 
			InputStreamReader lecture4=new InputStreamReader(flux4);
			BufferedReader buff4=new BufferedReader(lecture4);
			while ((ligne=buff4.readLine())!=null){
				cc500 = ligne;
			}
			buff4.close();
			
			InputStream flux5=new FileInputStream("texte1000.txt"); 
			InputStreamReader lecture5=new InputStreamReader(flux5);
			BufferedReader buff5=new BufferedReader(lecture5);
			while ((ligne=buff5.readLine())!=null){
				cc1000 = ligne;
			}
			buff5.close();
			
			InputStream flux6=new FileInputStream("texte100000.txt"); 
			InputStreamReader lecture6=new InputStreamReader(flux6);
			BufferedReader buff6=new BufferedReader(lecture6);
			while ((ligne=buff6.readLine())!=null){
				cc100000 = ligne;
			}
			buff6.close();
			
			InputStream flux7=new FileInputStream("texte1000000.txt"); 
			InputStreamReader lecture7=new InputStreamReader(flux7);
			BufferedReader buff7=new BufferedReader(lecture7);
			while ((ligne=buff7.readLine())!=null){
				cc1000000 = ligne;
			}
			buff7.close();
			
			}		
			catch (Exception e){
			System.out.println(e.toString());
			}

		long tempsT1;
		long tempsT2;
		
		//La première exécution est toujours plus longue, donc pour ne pas fausser le résultat, exécution à blanc
		Erase.erase("");
		
		tempsT1 = System.nanoTime();
		Erase.erase(cc10);
		tempsT2 = System.nanoTime();
		System.out.println("Test 10 caractères :" + (tempsT2 - tempsT1) + "ns");
		
		tempsT1 = System.nanoTime();
		Erase.erase(cc50);
		tempsT2 = System.nanoTime();
		System.out.println("Test 50 caractères :" + (tempsT2 - tempsT1) + "ns");
		
		tempsT1 = System.nanoTime();
		Erase.erase(cc100);
		tempsT2 = System.nanoTime();
		System.out.println("Test 100 caractères :" + (tempsT2 - tempsT1) + "ns");
		
		tempsT1 = System.nanoTime();
		Erase.erase(cc500);
		tempsT2 = System.nanoTime();
		System.out.println("Test 500 caractères :" + (tempsT2 - tempsT1) + "ns");
		
		tempsT1 = System.nanoTime();
		Erase.erase(cc1000);
		tempsT2 = System.nanoTime();
		System.out.println("Test 1000 caractères :" + (tempsT2 - tempsT1) + "ns");
		
		tempsT1 = System.nanoTime();
		Erase.erase(cc100000);
		tempsT2 = System.nanoTime();
		System.out.println("Test 100000 caractères :" + (tempsT2 - tempsT1) + "ns");
		
		tempsT1 = System.nanoTime();
		Erase.erase(cc1000000);
		tempsT2 = System.nanoTime();
		System.out.println("Test 1000000 caractères :" + (tempsT2 - tempsT1) + "ns");
		
	}
	
}
