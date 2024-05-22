package org.example.objectContainers1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class MainTest {
    public static void main(String[] args) {


        Person a=new Unemployed("Stela Popescu",56);
        Person b=new Hired("Popescu Cristi",35);
        Person c=new Student("Ilie Nastase",78);
        Person d=new Unemployed("Ion Tiriac",62);
        Person e=new Unemployed("Ion Tiriac",62);

        TreeSet<Person> treeName=new TreeSet<>(new SortByname());
        treeName.add(a);
        treeName.add(b);
        treeName.add(c);
        treeName.add(d);
        System.out.println("Persons sorted by name"+treeName);

        TreeSet<Person> treeAge=new TreeSet<>(new SortByAge());
        treeAge.add(a);
        treeAge.add(b);
        treeAge.add(c);
        treeAge.add(d);
        System.out.println("Persons sorted by name"+treeAge);


        System.out.println("===================");

        Hobby golf=new Hobby("Golf",1);
        Hobby football=new Hobby("Football",3);
        Hobby boxing=new Hobby("Boxing",4);

        golf.adresses.add(new Adress("Italy","Verona","Fuimicino",12134));
        golf.adresses.add(new Adress("France","Lyon","Chalet",13414));
        football.adresses.add(new Adress("Spain","Madrid","Perez",15234));
        football.adresses.add(new Adress("Germany","Berlin","Laporta",21234));
        boxing.adresses.add(new Adress("Ucraine","Kyiv","Schevcenko",71234));
        boxing.adresses.add(new Adress("Russia","Moscow","Stalin",61234));

        a.hobbies.add(golf);
        a.hobbies.add(boxing);
        b.hobbies.add(football);
        c.hobbies.add(golf);
        d.hobbies.add(golf);
        d.hobbies.add(football);
        d.hobbies.add(boxing);
        e.hobbies.add(golf);
        e.hobbies.add(football);
        e.hobbies.add(boxing);


        HashMap<Person, List<Hobby>> map=new HashMap<>();
        map.put(a,a.hobbies);
        map.put(b,b.hobbies);
        map.put(c,c.hobbies);
        map.put(d,d.hobbies);

        if(map.containsKey(e)){
            for(Hobby h: e.hobbies)
            System.out.println("Hobby-urile lui Ion Tiriac  "+h.name+"  "+h.getCountries());
        }




    }
}
