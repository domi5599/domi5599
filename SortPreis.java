import java.util.Comparator;

public class SortPreis implements Comparator<Artikel> {

	@Override
	public int compare(Artikel a1, Artikel a2) {
		
		return Double.compare(a1.getVerkaufspreis(), a2.getVerkaufspreis());
	}
}
