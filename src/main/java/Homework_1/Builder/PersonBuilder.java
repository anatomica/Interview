package Homework_1.Builder;

public class PersonBuilder {

    public static void main( String[] args ) {
        Director director = new Director();
        director.setAbstractBuilder(new WomanBuilder());
        Person woman = director.buildPerson();
        director.setAbstractBuilder(new ManBuilder());
        Person man = director.buildPerson();
        System.out.println(woman + "\n");
        System.out.println(man);
    }
}
