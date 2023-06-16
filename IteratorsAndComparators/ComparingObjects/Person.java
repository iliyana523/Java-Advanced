package IteratorsAndComparators.ComparingObjects;

public class Person implements Comparable<Person> {


    private String name;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    private int age;
    private String town;


    @Override
    public int compareTo(Person otherPerson) {
        if(this.getName().equals(otherPerson.name)) {
            if (this.getAge() == otherPerson.getAge()) {
                return this.getTown().compareTo(otherPerson.getTown());
            } else {
                return Integer.compare(this.getAge(), otherPerson.getAge());
            }
        }
        return this.getName().compareTo(otherPerson.getName());
    }
}
