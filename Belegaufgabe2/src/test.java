import java.io.FileNotFoundException;

public class test
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Dateiverarbeitung verarbeitung = new Dateiverarbeitung();
		verarbeitung.ausgabeDaten();
		Plotten diagramme = new Plotten();
		diagramme.zeichneGeradeUndLaengen();
		diagramme.zeichneHistogramm();
		//Mein Histogramm sieht etwas anders aus, da es z.B. bei [20-25) (Im Histogramm 22,5), die 25 in das naechst hoehere Intervall [25-30) (Im Histogramm 27,5) zaehlt
		//Das Histogramm in der "Musterloesung" macht das nicht, weshalb dort auch ein Balken der Anzahl 1 bei 22,5 ist
	}

}
