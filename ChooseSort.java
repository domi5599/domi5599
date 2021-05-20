import javax.swing.JOptionPane;

public class ChooseSort {
		
		public static String getOperatoren() {
			
			final String[] RMIType = { "Sortierung Nummer", "Sortierung Name", "Sortierung Preis"};
			return (String) JOptionPane.showInputDialog(null, "Sortierungsauswahl", "Input Dialog", JOptionPane.QUESTION_MESSAGE, null, RMIType,RMIType[0]);
		}
	}


	
