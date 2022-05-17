public abstract class Mamifero extends Animal{

    private String pelaje;

    //---------------------CONSTRUCTOR-------------------------//

    public Mamifero(String especie, boolean domestico, int edad, Genero genero, int estadoAnimo, String pelaje) {
        super(especie, domestico, edad, genero, estadoAnimo);
        this.pelaje = pelaje;
    }
    //------------------GETTERS & SETTERS-----------------------//

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }


    //----------------------------------------------------------//

    public String amamantar(){
        return "Mamífero amamantando";
    }

    //-----------------------OVERRRIDES-------------------------//

    @Override
    public String emitirSonido() {
        return "Growl growl";
    }
}

