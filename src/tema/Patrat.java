package tema;

public class Patrat {
	double arie, perimetru;
	Patrat(double latura){
		arie=latura*latura;
		perimetru=4*latura;
		System.out.println("Aria patratului este : " + String.format("%.2f", arie));
		System.out.println("Perimetru patratului este : " + perimetru);
		}
}