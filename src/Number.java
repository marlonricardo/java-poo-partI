/*Crie um classe Number, que representa um número.
Esta classe deve ter:
    um método increment() que incrementa o número.
    um método add() que recebe dois números e retorna uma novo objeto Number que representa a soma
Também deve haver uma forma de a classe conseguir contar quantos objetos foram criados
* */
public class Number {
    private static int instances;
    private int number;

    public Number(int number){
        this.number = number;
        instances++;
    }

    public static int getInstance() {
        return instances;
    }

    public int getNumber(){
        return number;
    }
    public static Number add(Number n1, Number n2){
        return new Number(n1.getNumber() + n2.getNumber());
    }
    public static void main(String[] args) {

        var n1 = new Number(10);
        System.out.println(n1.getNumber());

        var n2 = new Number(5);

        var n3 = Number.add(n1, n2);
        System.out.println(n3.getNumber());

        System.out.println("Numero de instancias criadas: " + Number.getInstance());

    }


}
