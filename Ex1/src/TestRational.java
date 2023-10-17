public class TestRational {
    public static void main(String[] args) throws Exception {
        int num = 3;
        int den = 2;

        Rational rational = null;
        rational = new Rational(num, den);
        
        //System.out.println("Fraction: " + rational.num + "/" + rational.den);
        System.out.println(rational.toString());

        int numModified = 3;
        int denModified = 10;

        Rational rationalModified = null;
        rationalModified = new Rational(numModified, denModified);
        System.out.println(rationalModified.toString());

    }
}
