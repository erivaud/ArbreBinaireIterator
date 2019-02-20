package Iterator;

import Iterator.ArbreBinaire;

public class IteratorApplication {

	public static void main(String[] args) {

//				   root
//				/  		\
//			 abG1		agD1
//			/	\		/	\
// 		abG2	abD2  abG3	abD3
		
// 	résultat attendu :
		
// 		abG2 - abG1 - abD2 - root - abG3 - agD1 - abD3
		
	ArbreBinaire abRoot = new ArbreBinaire("root");
	ArbreBinaire abG1 = new ArbreBinaire("G1");
	ArbreBinaire abD1 = new ArbreBinaire("D1");
	ArbreBinaire abG2 = new ArbreBinaire("G2");
	ArbreBinaire abD2 = new ArbreBinaire("D2");
	ArbreBinaire abG3 = new ArbreBinaire("G3");
	ArbreBinaire abD3 = new ArbreBinaire("D3");
	
	abRoot.setFilsGauche(abG1);
	abRoot.setFilsDroit(abD1);
	abG1.setFilsGauche(abG2);
	abG1.setFilsDroit(abD2);
	abD1.setFilsGauche(abG3);
	abD1.setFilsDroit(abD3);
	
	
	System.out.println(abRoot.getEtiquette());
	}

}
