package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UtilClass {
    public static File file = new File("D:\\java\\projects\\lab9\\fisier.json");
    public static ObjectMapper mapper  = new ObjectMapper();
    public static void writeFile(List<Person> newPeople){
        try {
            // Read existing content from the file
            List<Person> existingPeople = readExistingData();

            // Combine existing data with the new data
            List<Person> combinedPeople = new ArrayList<>(existingPeople);
            combinedPeople.addAll(newPeople);

            // Write the combined list to the JSON file
            mapper.writeValue(file, combinedPeople);

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile() throws IOException {
        try {
            // Use TypeReference to handle an array of Person objects
            //Person[] persons = new Person[3];
            //Person[] people = mapper.readValue(file, Person[].class);
            TypeReference<List<Person>> list = new TypeReference<>() {};
            List<Person> people = mapper.readValue(file, list);

            for (Person person : people) {
                System.out.println("Nume: " + person.getNume());
                System.out.println("Varsta: " + person.getVarsta());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static List<Person> readExistingData() {
        try {
            // Read existing content from the file
            TypeReference<List<Person>> listType = new TypeReference<List<Person>>() {};
            return mapper.readValue(file, listType);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
