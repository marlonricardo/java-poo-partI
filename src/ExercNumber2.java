public class ExercNumber2 {
    public static void main(String[] args) {
        var n1 = Number.newNumber(10);
        System.out.println(n1.getNumber());

        var n2 = Number.newNumber(5);
        var n3 = Number.add(n1, n2);
        System.out.println(n3.getNumber());

        System.out.println(Number.getInstance());


    }
}
