public class Pessoa{
    private String nome;
    private Area[] area;

    public Pessoa(String n){
        this.nome = n;
    }

    public void add_area(Area[] a){
        this.area = a;
    }

    public String mostra_pessoa(){
        return this.nome;
    }
    public Area[] mostra_area_p(){
        return this.area;
    }
}