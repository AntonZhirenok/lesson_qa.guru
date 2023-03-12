package lesson_8.tests;

import com.github.javafaker.Faker;

import java.util.Random;

public class TestData {

    public  String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    public  String[] subjects = {"Accounting", "Maths", "Arts", "English", "Physics", "Chemistry",
            "Computer Science", "Economics", "Social Studies", "History", "Civics", "Commerce", "Hindi", "Biology"};
    public String[] hobbiess = {"Reading", "Sports", "Music"};
    public String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
    public String[] genders = {"Male", "Female", "Other"};
    String[] cities = new String[0];

    Faker faker = new Faker();

    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String phoneNumber = "8" + faker.phoneNumber().subscriberNumber(9);
    String address = faker.address().fullAddress();
    String gender = genders[new Random().nextInt(genders.length)];
    String year = String.valueOf(faker.number().numberBetween(1960, 2005));
    String month = months[new Random().nextInt(months.length)];
    String day = String.format("%02d", faker.number().numberBetween(1, 28));
    String subject = subjects[new Random().nextInt(subjects.length)];
    String hobby = hobbiess[new Random().nextInt(hobbiess.length)];
    String state = states[new Random().nextInt(states.length)];
    String cite = getRandomCity(state);
    String uploadFile  = "lesson_3/123.png";

    public String getRandomCity(String state) {
        switch (state) {
            case "NCR" : cities = new String[] {"Delhi", "Gurgaon", "Noida"};
                break;
            case "Uttar Pradesh" : cities = new String[]{"Agra", "Lucknow", "Merrut"};;
                break;
            case "Haryana" : cities = new String[]{"Karnal", "Panipat"};
                break;
            case "Rajasthan" : cities = new String[]{"Jaipur", "Jaiselmer"};
                break;
        };
        return cities[new Random().nextInt(cities.length)];
    }
}