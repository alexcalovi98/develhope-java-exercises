package zoo;

public class Animal {

    private final String name; //final because the name doesn't change in time
    private final String color; //final because the color doesn't change in time
    private final String type; //final because the type doesn't change in time
    private int age; //not final because the age changes in time

    public Animal(String name, String color, String type, int age) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
