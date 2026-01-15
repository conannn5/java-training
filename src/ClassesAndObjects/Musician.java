package ClassesAndObjects;

public class Musician extends Human {
    private String profession;

    public Musician(String name, String surname, int age, int weight, int height, String profession) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setWeight(weight, age);
        setHeight(height, age);
        setProfession(profession);
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }
    @Override
    public String toString() {
        return super.toString() + " Профессия " + profession;

    }
}
