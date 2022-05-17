public abstract class Ave extends Animal{

    private String plumaje;

    //---------------------CONSTRUCTOR-------------------------//

    public Ave(String especie, boolean domestico, int edad, Genero genero, int estadoAnimo, String plumaje) {
        super(especie, domestico, edad, genero, estadoAnimo);
        this.plumaje = plumaje;
    }
    //------------------GETTERS & SETTERS-----------------------//

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }


    //----------------------------------------------------------//

    public String volar(){
        return "Ave volando";
    }


}
