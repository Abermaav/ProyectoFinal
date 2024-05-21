public class sP2 extends sP {
    private String hogar;
    private String cariñosa;

    public sP2(String rol, String elemento, String hogar, String cariñosa){
        super(rol,elemento);
        this.hogar=hogar;
        this.cariñosa=cariñosa;
    }

    public void mostrarDatos() {
        System.out.println("Marge\nColor: " + rol);
        System.out.println("Actividad: "+ elemento);
        System.out.println("Marge hace tareas del hogar: "+ hogar);
        System.out.println("Marge es muy cariñosa: "+ cariñosa + "\n");
    }
}

