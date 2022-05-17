public class Pato extends Ave{

    private boolean migratorio;

    //---------------------CONSTRUCTOR-------------------------//

    public Pato(String especie, boolean domestico, int edad, Genero genero, int estadoAnimo, String plumaje, boolean migratorio) {
        super(especie, domestico, edad, genero, estadoAnimo, plumaje);
        this.migratorio = migratorio;
    }

    //------------------GETTERS & SETTERS-----------------------//

    public boolean isMigratorio() {
        return migratorio;
    }

    public void setMigratorio(boolean migratorio) {
        this.migratorio = migratorio;
    }


    //----------------------------------------------------------//

    public String nadar(){
        return "El pato está nadando";
    }

    //-----------------------OVERRRIDES-------------------------//

    @Override
    public String emitirSonido() {
        return "Cuá cuá";
    }
}
