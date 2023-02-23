public class Dog {

    final private String name;
    final private String breed;
    final private int age;
    final private int weight;

    public Dog(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public static void main(String[] args){
        Dog d1= new Dog("Happy", "Hound", 5, 70);
    }
}
