public class Perro extends Mamifero{

    private String raza;
    private String nombre;
    private Humano duenyo;

    //---------------------CONSTRUCTOR-------------------------//

    public Perro(String especie, boolean domestico, int edad, Genero genero, int estadoAnimo, String pelaje, String raza, String nombre, Humano duenyo) {
        super(especie, domestico, edad, genero, estadoAnimo, pelaje);
        this.raza = raza;
        this.nombre = nombre;
        this.duenyo = duenyo;
    }
    //------------------GETTERS & SETTERS-----------------------//

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Humano getDuenyo() {
        return duenyo;
    }

    public void setDuenyo(Humano duenyo) {
        this.duenyo = duenyo;
    }


    //----------------------------------------------------------//

    public String vigilarCasa(){
        return this.nombre + " de la raza "+ this.raza +" está vigilando la casa de " + this.duenyo.getNombre();
    }

    //-----------------------OVERRRIDES-------------------------//

    @Override
    public String emitirSonido() {
  /*      String ladrido;

        switch (this.getEstadoAnimo()){
            case 0 -> ladrido = "Guau";
            case 1 -> ladrido = "Guau guau";
            case 2 -> ladrido = "Guau guau guau";
            case 3 -> ladrido = "Guau guau guau guau";
            case 4 -> ladrido = "Guau guau guau guau guau";
            case 5 -> ladrido = "Guau guau guau guau guau guau";
            default -> ladrido="No ladra";
        }
        return ladrido;*/
        String ladrido = "";
        if (this.getEstadoAnimo()>=10){
            ladrido = "El perro se ha tirado a moder";
        }else{
            for (int i=0; i<=this.getEstadoAnimo();i++){
                ladrido+="Guau ";
            }
        }
        
        return ladrido;
    }

    @Override
    public String toString() {
        return "El perro es de la raza " +
                 raza+
                " su nombre es " + nombre +
                " y su dueño " + duenyo;
    }
}
