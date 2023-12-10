package org.example;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.type.TypeReference;

public class Main {
    public static void main(String[] args) throws IOException,JsonGenerationException, JsonMappingException {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setNume("Joni");
        person1.setVarsta("25");
        person2.setNume("Moni");
        person2.setVarsta("19");
        List<Person> listPeople = new ArrayList<>();
        listPeople.add(person1);
        listPeople.add(person2);
        UtilClass.writeFile(listPeople);
        UtilClass.readFile();
    }
}
