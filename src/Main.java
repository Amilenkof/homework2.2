import java.sql.SQLOutput;

public class Main {
    public static int random() {
        return (int) (Math.random() * 99);

    }

    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Гарри Поттер", random(), random(), random(), random(), random());
        Griffindor hermioneGranger = new Griffindor("Гермиона Грейнджер", random(), random(), random(), random(), random());
        Griffindor ronWeasley = new Griffindor("Рон Уизли", random(), random(), random(), random(), random());

        Hufflepuff zakharyaSmith = new Hufflepuff("Захария Смит", random(), random(), random(), random(), random());
        Hufflepuff sedrickDiggory = new Hufflepuff("Седрик Диггори", random(), random(), random(), random(), random());
        Hufflepuff justinFinchFlachly = new Hufflepuff("Джастин Финч-Флечли", random(), random(), random(), random(), random());

        Ravenclaw chjoyChang = new Ravenclaw("Чжоу Чанг", random(), random(), random(), random(), random(), random());
        Ravenclaw padmePattil = new Ravenclaw("Падме Паттил", random(), random(), random(), random(), random(), random());
        Ravenclaw markusBelby = new Ravenclaw("Маркус Белби", random(), random(), random(), random(), random(), random());

        Slytherin drakoMalfoy = new Slytherin("Драко Малфой", random(), random(), random(), random(), random(), random());
        Slytherin gregoryGoil = new Slytherin("Грегори Гойл", random(), random(), random(), random(), random(), random());
        Slytherin grakhamMontegu = new Slytherin("Грехам Монтегю", random(), random(), random(), random(), random(), random());

        System.out.println("Задание 1. Вывод инфо по ученикам ");
        System.out.println(harryPotter.toString());
        System.out.println(zakharyaSmith.toString());
        System.out.println(chjoyChang.toString());
        System.out.println(grakhamMontegu.toString());

        System.out.println("Задание 2. Сравнение учеников в школе");
        System.out.println(Hogwarts.сomparePuple(hermioneGranger, sedrickDiggory));
        System.out.println(Hogwarts.сomparePuple(drakoMalfoy, padmePattil));

        System.out.println("Задание 3.Сравнение  учеников факультета");
        System.out.println(Griffindor.comparePuple(harryPotter, ronWeasley));
        System.out.println(Slytherin.comparePuple(gregoryGoil, drakoMalfoy));
        System.out.println(Ravenclaw.comparePuple(padmePattil, chjoyChang));
        System.out.println(Hufflepuff.comparePuple(zakharyaSmith, justinFinchFlachly));

    }
}