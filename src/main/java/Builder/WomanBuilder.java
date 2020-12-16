package Builder;

public class WomanBuilder extends AbstractBuilder {

    @Override
    void buildFirstName() {
        person.setFirstName("Ольга");
    }

    @Override
    void buildLastName() {
        person.setLastName("Фомина");
    }

    @Override
    void buildMiddleName() {
        person.setMiddleName("-");
    }

    @Override
    void buildCountry() {
        person.setCountry("Россия");
    }

    @Override
    void buildAddress() {
        person.setAddress("Москва");
    }

    @Override
    void buildPhone() {
        person.setPhone("103");
    }

    @Override
    void buildAge() {
        person.setAge(37);
    }

    @Override
    void buildGender() {
        person.setGender(Gender.WOMAN);
    }
}
