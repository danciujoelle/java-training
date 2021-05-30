package code._4_student_effort._3_animal_hierarchy;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d=new Fish();
        Cat c=new Cat("Fluffy");
        Animal a=new Fish(); //casting objects
        Animal e=new Spider(); //casting objects
        Pet p=new Cat();
        Animal c1=new Cat(); // as far as I can see we can access only the methods from the Animal class

        // calling the methods in each object
        d.setName("Nemo");
        p.setName("Tom");
        a.walk();
        e.walk();
        c1.walk();
        System.out.println("Fish's name is: "+d.getName());
        System.out.println("Cat's name is: "+c.getName());
        System.out.println("Pet's name is:"+p.getName());



    }
}
