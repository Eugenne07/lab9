package org.example;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
public class Person {
    public String nume;
    public String varsta;
    public Person(){

    };

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }
    public String getVarsta() {
        return varsta;
    }


}