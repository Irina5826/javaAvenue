public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 10);
        System.out.println("Меня зовут " + dog.getName() + " " + "мне " + dog.getAge() + " лет");
    }
}

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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
}
