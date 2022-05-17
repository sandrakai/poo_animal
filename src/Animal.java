public abstract class Animal {

    private String especie;
    private boolean domestico;
    private int edad;
    private Genero genero;
    private int estadoAnimo;

    //---------------------CONSTRUCTOR-------------------------//

    public Animal(String especie, boolean domestico, int edad, Genero genero, int estadoAnimo) {
        this.especie = especie;
        this.domestico = domestico;
        this.edad = edad;
        this.genero = genero;
        this.estadoAnimo = estadoAnimo;
    }
    //------------------GETTERS & SETTERS-----------------------//

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getEstadoAnimo() {
        return estadoAnimo;
    }

    public void setEstadoAnimo(int estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }


    //----------------------------------------------------------//

    public abstract String emitirSonido();

   public  String comer(){
       return "Comer como animal";
   }


}
