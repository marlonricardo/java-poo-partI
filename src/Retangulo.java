public class Retangulo {
    private final double largura, altura, square;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
        square = largura * altura;
    }

    public Retangulo(double largura){
        this(largura, largura);
    }
    double square(){
        return square;
    }



}
