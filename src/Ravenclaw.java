public class Ravenclaw extends Hogwarts {
    private int mind;
    private int witty;
    private int creative;
    private int smart;

    public Ravenclaw(String nameOfPuple, int powerOfMagic, int trangressionDistance, int mind, int witty, int creative, int smart) {
        super(powerOfMagic, trangressionDistance, nameOfPuple);
        this.mind = mind;
        this.witty = witty;
        this.creative = creative;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return super.toString() + ", когтевранец (, знания = " + mind + " ,острый ум = " + witty + " , креативность = " + creative + " ,мудрость= " + smart + ")";
    }

    public static String comparePuple(Ravenclaw one, Ravenclaw two) {
        int firstPupleStats = one.mind + one.witty + one.creative + one.smart + one.getTrangressionDistance() + one.getPowerOfMagic();
        int secondPupleStats = two.mind + two.witty + two.creative + two.smart + two.getTrangressionDistance() + two.getPowerOfMagic();
        if (firstPupleStats > secondPupleStats) {
            return  one.nameOfPuple +" статы равны "+firstPupleStats+" лучший ученик, чем "+ two.nameOfPuple+" статы равны "+secondPupleStats;
        } else return two.nameOfPuple +" статы равны "+secondPupleStats+" лучший ученик, чем "+ one.nameOfPuple+" статы равны "+firstPupleStats;
    }
}
