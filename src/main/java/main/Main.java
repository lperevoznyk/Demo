package main;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Eatable;
import database.DBConnection;
import database.DbMySqlEmulator;
import database.DbPostgresEmulator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static DBConnection dbConnection = new DbPostgresEmulator();

    public static void main(String[] args) {
        Animal cat = new Animal("name", 12);
        List<Animal> animals = new ArrayList<>();
    }
}