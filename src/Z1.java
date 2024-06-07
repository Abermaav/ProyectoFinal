public class Z1 extends SuperClase {
    private final String pasatiempo;
    private final String ciudad;

    public Z1(String elemento, String arma, String pasatiempo, String ciudad){
        super(elemento,arma);
        this.pasatiempo=pasatiempo;
        this.ciudad=ciudad;
    }

    public String mostrarDatos() {

        return STR." El elemento de Zhongli es \{elemento}\n Su arma es una lanza llamada \{arma}\n A Zhongli le gusta \{pasatiempo} Zhongli suele pasear en su ciudad \{ciudad}\n";
    }
}

