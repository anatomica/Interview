package Builder;

public abstract class AbstractBuilder {

    Person person;

    /**
     * Метод отвечает за создание человека
     */
    void createPerson() {
        person = new Person();
    }
    abstract void buildFirstName();
    abstract void buildLastName();
    abstract void buildMiddleName();
    abstract void buildCountry();
    abstract void buildAddress();
    abstract void buildPhone();
    abstract void buildAge();
    abstract void buildGender();

    /**
     * Метод возвращает созданного человека
     * @return
     */
    Person getPerson(){
        return person;
    }

}
