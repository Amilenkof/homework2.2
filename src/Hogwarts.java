public abstract class Hogwarts {
    private int powerOfMagic;
    private int trangressionDistance;
    String nameOfPuple;

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTrangressionDistance() {
        return trangressionDistance;
    }

    public Hogwarts(int powerOfMagic, int trangressionDistance, String nameOfPuple) {
        this.nameOfPuple = nameOfPuple;
        this.powerOfMagic = powerOfMagic;
        this.trangressionDistance = trangressionDistance;

    }

    @Override
    public  String toString() {
        return "Ученик - " + nameOfPuple + " , Сила магии = " + powerOfMagic + " , дистанция трассгрессии = " + trangressionDistance;
    }

    public static String сomparePuple(Hogwarts one, Hogwarts two) {
        int onePupleStats = one.powerOfMagic + one.trangressionDistance;
        int twoPupleStats = two.powerOfMagic + two.trangressionDistance;
        if (onePupleStats > twoPupleStats) {
            return  one.nameOfPuple +(" статы равны "+onePupleStats)+" лучший ученик, чем "+ two.nameOfPuple+(" статы равны "+twoPupleStats);
        } else return two.nameOfPuple +("статы равны "+twoPupleStats)+" лучший ученик, чем "+ one.nameOfPuple+("статы равны "+onePupleStats);
    }


}
