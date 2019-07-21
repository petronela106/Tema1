package tema;

public class Main {
	public static void main(String[] args) {
		Patrat patrat = new Patrat(5.2);
		System.out.println();
		Masina masina = new Masina(2016);
		Masina masina2 = new Masina("Ford");
		Masina masina3 = new Masina("Ford", "Focus", 2016);
		System.out.println();
		Elev elev = new Elev(10, 5.6, 7.5, 4.7 );
	}
}
