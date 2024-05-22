package org.example.objectContainers1;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    protected String name;
    protected int frequency;

    public  List<Adress> adresses=new ArrayList<>();


    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }
    public List<String> getCountries(){
        List<String> countries=new ArrayList<>();
        for(Adress adress:adresses){
            countries.add(adress.getCountry());
        }
        return countries;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", adresses=" + adresses +
                '}';
    }
}
