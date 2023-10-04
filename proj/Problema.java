public class Problema{
    private String name_p;
    private String alvo_p;

    public Problema(String n, String a){
        this.name_p = n;
        this.alvo_p = a;
    }

    public String mosatraproblema(){
        return this.name_p;
    }

    public String mostrapublico(){
        return this.alvo_p;
    }

}