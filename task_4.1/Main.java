public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Жужик");
        cat.setName("Жужик");
        System.out.println(cat);
    }
}

class Cat {
    private String name = "безымянный кот";

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        if (this.name != null)
            System.out.println("Кота зовут " + this.name);
    }
}
