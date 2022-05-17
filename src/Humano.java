public class Humano extends Mamifero{

    private String nombre;

    //---------------------CONSTRUCTOR-------------------------//


    public Humano(String especie, boolean domestico, int edad, Genero genero, int estadoAnimo, String pelaje, String nombre) {
        super(especie, domestico, edad, genero, estadoAnimo, pelaje);
        this.nombre = nombre;
    }
    //------------------GETTERS & SETTERS-----------------------//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //----------------------------------------------------------//

    public void hablar(){
        System.out.println(this.nombre + " hablando");
    }

    public String darChuches(Perro perro, int nChuches){

        if (nChuches==0){
            perro.setEstadoAnimo(perro.getEstadoAnimo()+3);
        } else if (nChuches==1){
            perro.setEstadoAnimo(perro.getEstadoAnimo()+1);
        } else if (nChuches==2){
            if (perro.getEstadoAnimo()>=2){
                perro.setEstadoAnimo(perro.getEstadoAnimo()-2);
            }else{
                perro.setEstadoAnimo(0);
            }

        }

        String resultado = "";

        if (nChuches == 0){
            resultado=this.nombre + " no ha dado chuches a " + perro.getNombre();
        }else{
            resultado=this.nombre + " ha dado chuches a " + perro.getNombre();
        }

        return resultado;
    }


    //-----------------------OVERRRIDES-------------------------//

    @Override
    public String emitirSonido() {
        return "Aúpa Athletic";
    }


    @Override
    public String toString() {
        return this.nombre;
    }
}
