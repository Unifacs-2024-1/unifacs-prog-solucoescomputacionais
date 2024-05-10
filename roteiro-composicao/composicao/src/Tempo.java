public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return this.horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String toString() {
        return this.horas + ":" + this.minutos + ":" + this.segundos;
    }
}