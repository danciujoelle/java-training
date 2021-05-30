package code._4_student_effort._1_two_fighters;

public class Fighter {
    private String name;
    private int heath;
    private int damagePerAttack;
    public Fighter(String name,int damagePerAttack){
        this.name=name;
        this.damagePerAttack=damagePerAttack;
    }
    public int attack(Fighter opponent){
        if(this.damagePerAttack>opponent.damagePerAttack){
            return 1;
        }
        return 0;
    }
    public String getName(){
        return name;
    }

}
