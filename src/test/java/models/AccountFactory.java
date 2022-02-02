package models;

import com.github.javafaker.Faker;

public class AccountFactory {
    static Faker faker = new Faker();
    public static Account get(){
        return  Account.builder()
                .userName(faker.name().username())
                .password(faker.internet().password())
                .email(faker.internet().emailAddress())
                .build();
    }
}
