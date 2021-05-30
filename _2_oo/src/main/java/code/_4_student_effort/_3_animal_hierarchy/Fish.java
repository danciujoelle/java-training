package code._4_student_effort._3_animal_hierarchy;

public class Fish extends Animal implements Pet {
    public Fish(){
        super(0);
    }
    private String name;
    @Override
    public void eat() {
        System.out.println("This fish eats seaweed");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
         this.name=name;
    }

    @Override
    public void play() {
        System.out.println("This fish plays with people");
    }
    @Override
    public void walk(){
        System.out.println("Fish does NOT walk");
    }
}
