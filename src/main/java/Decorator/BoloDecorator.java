package Decorator;

public abstract class BoloDecorator implements Bolo {
    protected Bolo boloDecorado;

    public BoloDecorator(Bolo boloDecorado) {
        this.boloDecorado = boloDecorado;
    }

    public String getDescricao() {
        return boloDecorado.getDescricao();
    }

    public double getCusto() {
        return boloDecorado.getCusto();
    }
}
