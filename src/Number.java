/*Crie um classe Number, que representa um número.
Esta classe deve ter:
    um método increment() que incrementa o número.
    um método add() que recebe dois números e retorna uma novo objeto Number que representa a soma
Também deve haver uma forma de a classe conseguir contar quantos objetos foram criados
Second: usando a mesma classe Number, faça as modificações necessárias para que apenas a própria calsse possa criar seus objetos
não permitindo que códigos externos à classe criem instância.
 */
public class Number {
    private static int instances;
    private final int number;

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

    public static Number newNumber(int n){
        return new Number(n);
    }

}
