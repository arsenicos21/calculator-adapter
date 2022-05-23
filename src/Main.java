public class Main {

    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sub(50, 10));
        System.out.println(calc.mult(11, 6));
        System.out.println(calc.div(45, 9));
        System.out.println(calc.pow(2, 3));
    }
}
