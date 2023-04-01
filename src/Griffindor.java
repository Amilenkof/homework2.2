public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int brave;

    public Griffindor(String nameOfPuple, int powerOfMagic, int trangressionDistance, int nobility, int honor, int brave) {
        super(powerOfMagic, trangressionDistance, nameOfPuple);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    @Override
    public String toString() {
        return super.toString() + " , гриффиндорец ( благородство = " + nobility + ", честь = " + honor + ", храбрость=" + brave + " )";
    }

    public static String comparePuple(Griffindor one, Griffindor two) {
        int firstPupleStats = one.nobility + one.honor + one.brave + one.getTrangressionDistance() + one.getPowerOfMagic();
        int secondPupleStats = two.nobility + two.honor + two.brave + two.getTrangressionDistance() + two.getPowerOfMagic();
        if (firstPupleStats > secondPupleStats) {
            return one.nameOfPuple + " статы равны " + firstPupleStats + " лучший ученик, чем " + two.nameOfPuple + " статы равны " + secondPupleStats;
        } else
            return two.nameOfPuple + " статы  равны " + secondPupleStats + " лучший ученик, чем " + one.nameOfPuple + " статы равны " + firstPupleStats;

    }
}
