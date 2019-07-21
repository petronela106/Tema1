package tema;

public class Masina {
	 String marca;
	    String model;
	    int anFabricatie;
	    Masina(int anFabricatie){
	        this.anFabricatie = anFabricatie;
	        System.out.println("Masina e fabricata in "+ anFabricatie);
	        }
	    Masina(String marca){
	        this.marca = marca;
	        System.out.println("Masina este " + marca);
	        }
	    Masina(String marca, String model, int anFabricatie){
	        this.marca = marca;
	        this.model = model;
	        this.anFabricatie = anFabricatie;
	        System.out.println(marca + " " + model + " " + anFabricatie);
	        }


}
