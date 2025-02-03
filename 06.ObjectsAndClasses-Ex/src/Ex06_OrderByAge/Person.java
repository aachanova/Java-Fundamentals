package Ex06_OrderByAge;

public class Person {
    private String name;
    private String idNumber;
    private int age;

    public Person(String name, String idNumber, int age) {
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.idNumber, this.age);
    }
}
