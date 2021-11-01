
public class Produktion
{
	//Methoden = verschieden Fertigungsverfahren, mit Dauer, Preis, Toleranz (beeinflusst Preis),
	private double toleranz;
	private Werkstoff werkstoff;
	
	public Produktion(double toleranz, Werkstoff werkstoff)
	{
		this.toleranz = toleranz;
		this.werkstoff = werkstoff;
	}
	
	//Materialien noch beruecksichtigen
	public double materialKostenFuerFertigung()
	{
		return 0;
	}
	
	public void drehen() 
	{
		
	}
	
	public void fraesen() 
	{
		
	}
	
	public void bohren() 
	{
		
	}
	
	public void giessen()
	{
		
	}
	
	//vllt. mit mehreren Haertungsverfahren wie Induktionshaerten, Flammhaerten etc. 
	public void haerten()
	{
		
	}
	
}
