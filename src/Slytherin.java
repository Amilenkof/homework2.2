public class Slytherin extends Hogwarts {
    private int trick;
    private int ingenuity;
    private int ambition;
    private int determination;

    public Slytherin(String nameOfPuple, int powerOfMagic, int trangressionDistance, int trick, int ingenuity, int ambition, int determination) {
        super(powerOfMagic, trangressionDistance, nameOfPuple);
        this.trick = trick;
        this.ingenuity = ingenuity;
        this.ambition = ambition;
        this.determination = determination;
    }

    @Override
    public String toString() {
        return super.toString() + ", слизеринец ( хитрость = " + trick + " ,решительность = " + determination + " , амбиции = " + ambition + " ,находчивость = " + ingenuity + ")";
    }

    public static String comparePuple(Slytherin one, Slytherin two) {
        int firstPupleStats = one.trick + one.ingenuity + one.ambition + one.determination + one.getTrangressionDistance() + one.getPowerOfMagic();
        int secondPupleStats = two.trick + two.ingenuity + two.ambition + two.determination + two.getTrangressionDistance() + two.getPowerOfMagic();
        if (firstPupleStats > secondPupleStats) {
            return  one.nameOfPuple +" статы равны "+firstPupleStats+" лучший ученик, чем "+ two.nameOfPuple+" статы равны "+secondPupleStats;
        } else return two.nameOfPuple +" статы равны "+secondPupleStats+" лучший ученик, чем "+ one.nameOfPuple+" статы равны "+firstPupleStats;
    }
}
