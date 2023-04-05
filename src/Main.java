import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(35,12));
        System.out.println(ageAndTemperature(27,26));
        System.out.println(ageAndTemperature(39,-1));
        System.out.println(ageAndTemperature(14,13));
        System.out.println(ageAndTemperature(61,8));
        System.out.println(ageAndTemperature(generateRandomAge(),generateRandomAge()));
    }

    public static String ageAndTemperature(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30)
            return "Можно идти гулять";
        else if (age < 20 && temperature >= 0 && temperature <= 28)
            return "Можно идти гулять";
        else if (age > 45 && temperature >= -10 && temperature <= 25)
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }

    public static int generateRandomAge(){
        Random random = new Random();
        int rn = random.nextInt(100);
        return rn;
    }
}
