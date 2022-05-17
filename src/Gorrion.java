public class Gorrion extends Ave{

    private boolean urbano;

    //---------------------CONSTRUCTOR-------------------------//

    public Gorrion(String especie, boolean domestico, int edad, Genero genero, int estadoAnimo, String plumaje, boolean urbano) {
        super(especie, domestico, edad, genero, estadoAnimo, plumaje);
        this.urbano = urbano;
    }

    //------------------GETTERS & SETTERS-----------------------//

    public boolean isUrbano() {
        return urbano;
    }

    public void setUrbano(boolean urbano) {
        this.urbano = urbano;
    }


    //----------------------------------------------------------//

    public String atraparInsectos(){
        return "El gorrión "+((this.urbano)?" de ciudad":" de campo")+" está atrapando insectos";
    }

    //-----------------------OVERRRIDES-------------------------//

    @Override
    public String emitirSonido() {
        return "Pío pío";
    }
}
