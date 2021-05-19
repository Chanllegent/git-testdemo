public class Person {
    private String name;
    private String sex;
    private String address;
    private final String index = "Candy";

    public Person(String name, String sex, String address) {
        this.name = name;
        this.sex = sex;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

