package pages;
import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;

public class DataGenerator {

    final Faker faker = new Faker(new Locale("en"));
    public static HashMap<String, String> myMap = new HashMap<String, String>();

    public String userLastName() {
        String lastName = faker.name().lastName();
        myMap.put("lastName", lastName );
        return  lastName;

    }
    public String userFirstName() {
        String firstName = faker.name().firstName();
        myMap.put("firstName", firstName);
        return firstName;
    }

    public String email() {
        String email = userLastName() + "@testmail.io";
        myMap.put("email", email);
        return email;
    }
     public Integer getRandomIndexBy31Days() {
         int a = 1;
         int b = 31;
         b-=a;
         int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числ
         return random_number1;
     }
    public Integer getRandomIndexBy30Days() {
        int a = 1;
        int b = 30;
        b-=a;
        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числ
        return random_number1;
    }
    public Integer getRandomIndexBy28Days() {
        int a = 1;
        int b = 28;
        b-=a;
        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числ
        return random_number1;
    }
    public Integer getRandomIndexBy29Days() {
        int a = 1;
        int b = 28;
        b-=a;
        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числ
        return random_number1;
    }
    public int getRandomValueByYears() {
        int a = 2003;
        int b = 2021;
        b-=a;
        int randomNumber1 = a + (int) (Math.random() * b);; // Генерация 1-го числ
        String str = Integer.toString(randomNumber1);
        myMap.put("randomYear", str);
        return randomNumber1;
    }//TODO закончить с конвертацией инт в стринг
    public Integer getRandomIndexByMonth() {
        int a = 1;
        int b = 13;
        b-=a;
        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числ
        return random_number1;
    }
}
