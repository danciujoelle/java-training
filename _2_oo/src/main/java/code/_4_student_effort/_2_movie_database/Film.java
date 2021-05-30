package code._4_student_effort._2_movie_database;

public class Film {
    private String nume;
    private Integer anAparitie;
    private Actor[] actori;
    public Film(Integer anAparitie,String nume, Actor[] actori){
        this.anAparitie=anAparitie;
        this.nume=nume;
        this.actori=actori;
    }
    public Actor[] getActori(){
        return actori;
    }
    public String getNumeFilm(){
        return nume;
    }
}
