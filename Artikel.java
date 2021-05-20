import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Artikel {
	
	protected int Artikelnummer;
	protected String Artikelbezeichnung;
	protected double Verkaufspreis;
	
	public Artikel(int artikelnummer, String artikelbezeichnung, double verkaufspreis) {
		
		this.Artikelnummer = artikelnummer;
		this.Artikelbezeichnung = artikelbezeichnung;
		this.Verkaufspreis = verkaufspreis;
		
	}
	
	public static Artikel erzeugeArtikel() {
		
		JTextField f1 = new JTextField();
		JTextField f2 = new JTextField();
		JTextField f3 = new JTextField();
        
		Object[] message = {"Artikelnummer", f1, "Artikelbezeichnung",f2, "Verkaufspreis", f3};
		JOptionPane pane = new JOptionPane(message, JOptionPane.PLAIN_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
        pane.createDialog(null, "Artikel").setVisible(true);
        //System.out.println("Eingabe: " + Artikelnummer.getText() + ", " + Artikelbezeichnung.getText() + ", " + Verkaufspreis.getText());
        String t1 = f1.getText();
        int Artikelnummer = Integer.parseInt(t1);
        String t2 = f2.getText();
        String Artikelbezeichnung = t2;
        String t3 = f3.getText();
        double Verkaufspreis = Double.parseDouble(t3);
        return new Artikel(Artikelnummer, Artikelbezeichnung, Verkaufspreis);
	}
    
	public void print() {
		
		System.out.println("Artikel hat die Nummer: " + Artikelnummer + " und hat die Bezeichnung: " + Artikelbezeichnung + " und kostst: " + Verkaufspreis + "€");
	}
	
	public int getArtikelnummer() {
		
		return Artikelnummer;
	}
	
	public String getArtikelbezeichnung() {
		
		return Artikelbezeichnung;
	}
	
	public double getVerkaufspreis() {
		
		return Verkaufspreis;
	}
	
	public void setArtikelnummer(int neueArtikelnummer) {
		
		this.Artikelnummer = neueArtikelnummer;
	}
	
	public void setArtikelbezeichnung(String neueArtikelbezeichnung) {
		
		this.Artikelbezeichnung = neueArtikelbezeichnung;
	}
	
	public void setVerkaufspreis(double neuerVerkaufspreis) {
		
		this.Verkaufspreis = neuerVerkaufspreis;
	}

}
