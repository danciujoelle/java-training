package code._4_student_effort._1_two_fighters;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Jack",400);
        Fighter f2=new Fighter("Alfie",500);
        BoxingMatch match=new BoxingMatch(f1,f2);
        System.out.println("The winner is: "+match.fight(f1,f2));
    }
}
