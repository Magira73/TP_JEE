
public class Colis {
	public static int ID = 0;
	private final int id = ID++;
	private double poids;
	private String val;
	private Emplacement origine;
	private Emplacement destination;

	public Colis(String val, double poids, Emplacement src, Emplacement dest) {
		this.poids = poids;
		this.val = val;
		this.origine = src;
		this.destination = dest;
	}
}