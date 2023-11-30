package es1;

public class Dipendente {
    // LISTA ATTRIBUTI
    private double baseStipendio = 1000;
    private String matricola;
    private double OrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public String getMatricola() {
        return matricola;
    }
    public double getBaseStipendio() {
        return baseStipendio;
    }
    public double getOrarioStraordinario() {
        return OrarioStraordinario;
    }
    public Livello getLivello() {
        return livello;
    }
    public Dipartimento getDipartimento() {
        return dipartimento;
    }
    public void setOrarioStraordinario(double OrarioStraordinario) {
        this.OrarioStraordinario = OrarioStraordinario;
    }
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.baseStipendio= baseStipendio;
        this.OrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }
    public  Dipendente(String matricola, double baseStipendio, double OrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.baseStipendio = baseStipendio;
        this.OrarioStraordinario = OrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }
    public void stampaDatiDipendente() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Dipendente{" + "matricola=" + matricola + '/' + ", stipendio = " + baseStipendio + "OrarioStraordinario =" + OrarioStraordinario + ", livello = " + livello + "dipartimento = " + dipartimento + '}';
    }

    public void promuovi() {
        switch (this.livello) {
            case OPERAIO -> this.livello = livello.IMPIEGATO;
            case IMPIEGATO -> this.livello = livello.QUADRO;
            case QUADRO -> this.livello = livello.DIRIGENTE;
            case DIRIGENTE -> System.err.println("Il dipendente" + this.matricola + "è già un dirigente");
        }
    }


}