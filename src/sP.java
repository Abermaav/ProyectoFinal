public class sP {
    protected String rol;
    protected String elemento;

    public sP(String color, String actividad){
        this.rol=color;
        this.elemento=actividad;
    }

    public String getColor(){ return rol;}
    public String getActividad(){ return elemento;}

}