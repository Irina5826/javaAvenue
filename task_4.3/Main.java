import sun.font.TrueTypeFont;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(10, 5, 7);
        Cat cat2 = new Cat(5, 7, 9);
        System.out.println(cat2.fight(cat1));
    }
}

class Cat {
    public int age; //1-10
    public int weight; //3-8
    public int strength; //5-15

    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        boolean True = true;
        boolean False = false;
        if (age > anotherCat.age && weight > anotherCat.weight && strength > anotherCat.strength) return True;
        else if (age > anotherCat.age && weight > anotherCat.weight && strength < anotherCat.strength) return True;
        else if (age > anotherCat.age && weight < anotherCat.weight && strength > anotherCat.strength) return True;
        else if (age < anotherCat.age && weight > anotherCat.weight && strength > anotherCat.strength) return True;
        else return False;
    }
}
