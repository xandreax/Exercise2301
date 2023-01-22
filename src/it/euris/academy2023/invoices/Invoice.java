package it.euris.academy2023.invoices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {

    private int progressivo;
    private String ordine;
    private float valore;
    private Date dataEmissione;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Invoice(int progressivo, String ordine, float valore, String dataEmissione) throws ParseException {
        this.progressivo = progressivo;
        this.ordine = ordine;
        this.valore = valore;
        this.dataEmissione = convert(dataEmissione);
    }

    private Date convert(String dataEmissione) throws ParseException {
        return sdf.parse(dataEmissione);
    }

    public String toString() {
        String values = "INVOICE n°" + progressivo + "\n-------------";
        values = values + "\nORDINE:  " + ordine;
        values = values + "\nVALORE:  " + valore;
        values = values + "\nDATA EMISSIONE:  " + dataEmissione;
        return values;
    }

    public int getProgressivo() {
        return progressivo;
    }

    public float getValore() {
        return valore;
    }

    public Date getDataEmissione() {
        return dataEmissione;
    }
}
