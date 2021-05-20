import java.util.Comparator;

public class SortName implements Comparator<Artikel>{
	
	@Override
	public int compare(Artikel a1, Artikel a2) {
		
		return (a1.getArtikelbezeichnung()).compareTo(a2.getArtikelbezeichnung());
	}
}