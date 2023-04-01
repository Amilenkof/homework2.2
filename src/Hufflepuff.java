public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String nameOfPuple, int powerOfMagic, int trangressionDistance, int diligence, int loyalty, int honesty) {
        super(powerOfMagic, trangressionDistance, nameOfPuple);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", пуффендуец ( усердие =" + diligence + ", лояльность= " + loyalty + " ,честность= " + honesty + ")";
    }

    public static String comparePuple(Hufflepuff one, Hufflepuff two) {
        int firstPupleStats = one.diligence + one.loyalty + one.honesty + one.getTrangressionDistance() + one.getPowerOfMagic();
        int secondPupleStats = two.diligence + two.loyalty + two.honesty + two.getTrangressionDistance() + two.getPowerOfMagic();
        if (firstPupleStats > secondPupleStats) {
            return  one.nameOfPuple +" статы равны "+firstPupleStats+" лучший ученик, чем "+ two.nameOfPuple+" статы равны "+secondPupleStats;
        } else return two.nameOfPuple +" статы  равны "+secondPupleStats+" лучший ученик, чем "+ one.nameOfPuple+" статы равны "+firstPupleStats;
    }
}
