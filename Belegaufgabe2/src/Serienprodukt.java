
public class Serienprodukt
{
	//quasi wie Einheitsschraenke - also die Implantate, Platten usw. die das MedTech Unternehmen sowieso im Angebot hat
	//verschiedene Konstruktoren = verschiedene Produkte
	private String name;
	private double[] abmessung; //Laenge, Breite, Hoehe
	private double gewicht;
	private double preis;
	private Werkstoff werkstoff;
	private static int zaehler = 0;
	
	//Allgemeines Produkt, vllt noch nen Bild oder techn. Zeichnung hinzufuegen
	public Serienprodukt (String name, double[] abmessung, double preis, double gewicht, Werkstoff werkstoff)
	{
		this.name = name;
		this.abmessung = abmessung;
		this.preis = preis;
		this.gewicht = gewicht;
		this.werkstoff = werkstoff;
		zaehler++; // Fuer Anzahl
	}
	
	public double getVolumen()
	{
		return Math.round((abmessung[0] * abmessung[1] * abmessung[2]) * 100.0) / 100.0 ;
	}
	
	public String getDaten()
	{
		String eigenschaften = "";
		eigenschaften = "Name: " + name + ", Volumen: " + getVolumen() +  "m³, Preis: " + preis + " EUR";
		return eigenschaften;
	}
	
	public int getAnzahl()
	{
		return zaehler;
	}
}
