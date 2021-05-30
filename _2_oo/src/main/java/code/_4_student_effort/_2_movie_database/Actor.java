package code._4_student_effort._2_movie_database;

public class Actor {
    private String nume;
    private Integer varsta;
    private Premiu[] premii;
    public Actor(String nume, Integer varsta, Premiu[] premii){
        this.nume=nume;
        this.varsta=varsta;
        this.premii=premii;
    }
    public String getNumeActor(){
        return nume;
    }
    public Integer getVarstaActor(){
        return varsta;
    }

}
