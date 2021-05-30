package code._4_student_effort._1_two_fighters;

public class BoxingMatch {
    private Fighter fighter1, fighter2;
    public BoxingMatch(Fighter f1,Fighter f2){
        this.fighter1=f1;
        this.fighter2=f2;
    }
    public String fight(Fighter f1,Fighter f2){
        if(f1.attack(f2)==1){
            return f1.getName();
        }
        return f2.getName();
    }
}
