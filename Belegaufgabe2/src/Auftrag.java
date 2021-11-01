import java.util.ArrayList;

public class Auftrag
{
	//wird so aehnlich wie main, berechnet gesamtpreis, dauer etc. 
	//gui dient als Eingabe fuer die Klasse Auftrag
	//vgl. Praktikum 12 Klasse Auftrag
	
	private ArrayList<Serienprodukt> artikel = new ArrayList<Serienprodukt>();
	
	public Auftrag(Serienprodukt s)
	{
		artikel.add(s);
	}
	
	public ArrayList<Serienprodukt> getAuftragsliste()
	{
		return artikel;
	}
	
	
}
