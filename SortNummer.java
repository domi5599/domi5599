import java.util.Comparator
;
public class SortNummer implements Comparator<Artikel>{

	@Override
	public int compare(Artikel a1, Artikel a2) {
		
		return Double.compare(a1.getArtikelnummer(), a2.getArtikelnummer());
	}
}