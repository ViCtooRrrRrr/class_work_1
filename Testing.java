import java.util.Scanner;

public class Testing {

    public static void main (String [] args){
        Person [] persons = new Person[4];

        persons[0] = new Person("Lol",30,"M");
        persons[1] = new Student("Lola",20,"G","ad1",21.1);
        persons[2] = new Teacher("LOx",21,"M",20000.0,"ComputerScience");
        persons[3] = new CollegeStudent("LOLad",20,"M","ww12",21.1,2,"Undeclared");

        for (Person person: persons){
            System.out.println(person);


        }
    }
}