public class AnimalMain {

    public static void main(String[] args) {

        Humano sandra = new Humano("Homo sapiens",true,38,Genero.FEMENINO,0,"negro","Sandra");

        Mamifero dientitos = new Perro("Cánido",true,7,Genero.FEMENINO,5,"negro","Rottweiler","Dientitos",sandra);

        System.out.println(((Perro) dientitos).vigilarCasa());

        System.out.println(dientitos);
        System.out.println(dientitos.getEstadoAnimo());
        System.out.println(dientitos.emitirSonido());
        System.out.println(sandra.darChuches((Perro) dientitos,2));
        System.out.println(dientitos.getEstadoAnimo());
        System.out.println(dientitos.emitirSonido());

    }
}
