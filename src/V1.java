public class V1 extends SuperClase {
    private final String Musica;
    private final String comida;

    public V1(String elemento, String arma, String Musica, String comida){
        super(elemento,arma);
        this.Musica=Musica;
        this.comida=comida;
    }

    public String mostrarDatos() {

        return STR." El elemento de Venti es \{elemento}\nSu arma es un arco llamado \{arma}\n A Venti le gusta tocar musica con \{Musica}\n A venti le gusta comer \{comida}\n";
    }
}