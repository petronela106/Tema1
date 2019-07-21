package tema;

public class Elev {
	int nrMatricol;
    double medie;
    boolean corigent;
    Elev(int nrMatricol, double nota1, double nota2, double nota3){
        this.nrMatricol = nrMatricol;
        medie = ( nota1 + nota2 + nota3 ) / 3;
        if( medie > 5 ){
            corigent = false;
        }else {
            corigent = true;
        }
        System.out.println("Numar matricol: " + nrMatricol);
        System.out.println("Medie: " + String.format("%.2f", medie));
        System.out.println("Corigent: " + corigent );
    }

}
