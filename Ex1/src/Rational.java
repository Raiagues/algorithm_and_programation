public class Rational {
    public int num;
    public int den;
    public float frac;

    public Rational (int num, int den) {
        this.num = num;
        this.den = den;
        this.frac = num/den;
    }

    @Override
    public String toString(){
        return "Frac: " + (float) frac + "\nDen: " + num + "\nDen: " + den + "\n";
    }
    
}

