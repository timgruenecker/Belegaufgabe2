
public class Werkstoff
{
	private String name;
	private double preisProTonne;
	private double haerte;
	private double volumenImLager;
	private int lieferbarkeit; //3 Integerwerte fuer 0 nicht lieferbar, 1 spaet lieferbar, 2 sofort lieferbar
	
	//vielleicht noch mit aktuellen preisen von Internet
	public Werkstoff(String name, double preisProTonne, int lieferbarkeit, double haerte, double volumenImLager) 
	{
		this.name = name;
		this.preisProTonne = preisProTonne;
		this.lieferbarkeit = lieferbarkeit;
		this.haerte = haerte;
		this.volumenImLager = volumenImLager;
	}
	
	public double getHaerte()
	{
		return haerte;
	}
	
	public double getVolumenImLager()
	{
		return volumenImLager;
	}
	
	
}
