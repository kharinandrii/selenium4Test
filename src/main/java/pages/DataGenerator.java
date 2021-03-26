package pages;
import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;

public class DataGenerator {

    final Faker faker = new Faker(new Locale("en"));
    public static HashMap<String, String> myMap = new HashMap<String, String>();

    public String userLastName() {
        return faker.name().lastName();

    }

    public String email() {
        return userLastName() + "@testmail.io";
    }
}
