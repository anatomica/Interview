package Homework_1.Builder;

public class Director {

    AbstractBuilder abstractBuilder;

    public void setAbstractBuilder(AbstractBuilder abstractBuilder) {
        this.abstractBuilder = abstractBuilder;
    }

    Person buildPerson(){
        abstractBuilder.createPerson();
        abstractBuilder.buildFirstName();
        abstractBuilder.buildLastName();
        abstractBuilder.buildMiddleName();
        abstractBuilder.buildCountry();
        abstractBuilder.buildAddress();
        abstractBuilder.buildPhone();
        abstractBuilder.buildAge();
        abstractBuilder.buildGender();

        return abstractBuilder.getPerson();
    }
}
