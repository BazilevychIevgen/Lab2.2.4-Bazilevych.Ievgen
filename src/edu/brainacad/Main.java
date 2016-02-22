package edu.brainacad;

/**
 * Created by Admin on 22.02.2016.
 */
public class Main{

    public static void main(String[] args) {

        Person person1 =new Person();

        person1.name("Eugene","Bazilevych","Male");
        person1.name("Eugene",25,5625891);
        person1.name("Eugene","Bazilevych",25);
        person1.name("Eugene","Bazilevych",5625891,25);
        person1.name("Eugene",25,"Male");
    }


}
