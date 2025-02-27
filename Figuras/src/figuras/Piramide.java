package figuras;
public final class Piramide extends FiguraGeométrica {
private final double base; 
private final double altura; 
private final double apotema; 
public Piramide(double base, double altura, double apotema) {
this.base = base;
this.altura = altura;
this.apotema = apotema;
this.setVolumen(calcularVolumen()); 
this.setSuperficie(calcularSuperficie());
}
public double calcularVolumen() {
double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
return volumen;
}
public double calcularSuperficie() {
double áreaBase = Math.pow(base, 2.0);
double áreaLado = 2.0 * base * apotema;
return áreaBase + áreaLado;
}
}
