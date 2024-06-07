public class N1 extends SuperClase {
    private final String columpio;
    private final String Bosque;

    public N1(String elemento, String arma, String columpio, String Bosque){
        super(elemento,arma);
        this.columpio=columpio;
        this.Bosque=Bosque;
    }

    public String mostrarDatos() {

        return STR." El elemento de Nahida es \{elemento}\n Su arma es un catalizador llamado \{arma}\n Nahida suele \{columpio}\n Nahida suele pasar su tiempo en \{Bosque}\n";
    }
}