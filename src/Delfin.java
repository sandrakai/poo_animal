public class Delfin extends Mamifero{

    private boolean marino;

    //---------------------CONSTRUCTOR-------------------------//

    public Delfin(String especie, boolean domestico, int edad, Genero genero, int estadoAnimo, String pelaje, boolean marino) {
        super(especie, domestico, edad, genero, estadoAnimo, pelaje);
        this.marino = marino;
    }

    //------------------GETTERS & SETTERS-----------------------//

    public boolean isMarino() {
        return marino;
    }

    public void setMarino(boolean marino) {
        this.marino = marino;
    }


    //----------------------------------------------------------//

    public String nadar(){
        return "El delfín " + ((this.marino)?  " salvaje" : " del acuario") + " nada alegremente";
    }
    public String jugar(){
        return "El delfín está jugando";
    }

    //-----------------------OVERRRIDES-------------------------//

    @Override
    public String emitirSonido() {
        return "...iiikkk....iiikkkk";
    }
}
