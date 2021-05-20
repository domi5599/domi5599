import java.util.*;
import javax.swing.*;

public class TestArtikel {

	public static void main(String[] args) {
		
		List<Artikel> liste = new ArrayList<Artikel>();
		
		int repeat = 0;
		while(repeat == 0) {
			
			liste.add(Artikel.erzeugeArtikel());
			repeat = JOptionPane.showConfirmDialog(null,"Ja für weiteres Objekt", "Nein", JOptionPane.YES_NO_OPTION);
			
		}
			
			//while(repeat == 0) {
				
				String erg = ChooseSort.getOperatoren();
				//repeat = JOptionPane.showConfirmDialog(null,"Ja für weiteres Sortierverfahren", "Nein", JOptionPane.YES_NO_OPTION);
			
					if (erg.equals("Sortierung Nummer")) {
				
						Collections.sort(liste, new SortNummer());
						System.out.println("\nSortierung nach Artikelnummer:");
				
						for(Artikel a : liste) {
					
							a.print();
						}
					}
			
					else if (erg.equals("Sortierung Name")) {
				
						Collections.sort(liste, new SortName());
						System.out.println("\nSortierung nach Artikelbezeichnung:");
				
						for(Artikel a : liste) {
					
							a.print();
						}
					}
			
					else if (erg.equals("Sortierung Preis")) {
					
						Collections.sort(liste, new SortPreis());
						System.out.println("\nSortierung nach Verkaufspreis:");
					
						for (Artikel a : liste) {

							a.print();
						}
					} 
					
					else {
				
						System.out.print("Fehler");
					}
				}
			}
		
	//}
		
		


	  
