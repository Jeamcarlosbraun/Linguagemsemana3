package Pastaatividades9.at4;

import javax.xml.crypto.Data;
import java.util.Date;

public class EntradaDeCinema {
    private Data dataDoFilme;
    private float horario;
    private int sala;
    private float valor;

    public EntradaDeCinema(Data dataDoFilme, float horario, int sala, float valor) {
        this.dataDoFilme = dataDoFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }

}
