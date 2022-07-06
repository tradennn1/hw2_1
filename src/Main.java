import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double rand = Math.random();
        {

            System.out.println("Random Number:" + rand);

        }


        System.out.println(Student(29, 48));
        System.out.println(Student(60, 30));
        System.out.println(Student(80, 38));
        System.out.println(Student(28, 20));
        System.out.println(Student(24, 36));
    }

    private static String Student(int age, int temp) {
        String Yahom = ("Можно идти гулять");
        String GoHome = ("Оставайтесь дома");
        if ((age > 20 && age < 45) && (temp > -20 && temp < 30)) {
            return Yahom;
        } else if ((age < 20) && (temp >= 0 && temp < 28)) {
            return Yahom;
        } else if ((age > 45) && (temp > -10 && temp < 25)) {
            return Yahom;
        } else {
            return GoHome;
        }
    }

}