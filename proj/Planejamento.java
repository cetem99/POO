public class Planejamento {
    private Pessoa[] pessoa;
    private Problema problema;
    private int diff;
    private Criaçao cria;
    private Etapas[] etapas;

    public Planejamento(Pessoa[] p, Problema mulher, int d, Criaçao c){
        this.pessoa = p;
        this.problema = mulher;
        this.diff = d;
        this.cria = c;
    }

    public void nova_etapa(Etapas[] s){
        this.etapas = s;
    }


    public String mostraplao(){
        StringBuilder val = new StringBuilder("O projeto será realizado por ");
        for (int i = 0; i < this.pessoa.length; i++) {
            val.append(this.pessoa[i].mostra_pessoa());
            if (i < this.pessoa.length - 2) {
                val.append(", ");
            }else if(i < this.pessoa.length - 1){
                val.append(" e ");
            }
        }
        val.append(String.format("%ncom o propósito de resolver \"%s\"%n", this.problema.mosatraproblema()));
        val.append(String.format("e o %s será o publico alvo do projeto.%n", this.problema.mostrapublico()));
        val.append(String.format("Em uma escala de 0 a 10, essa será a dificuldade do projeto: %d%n", this.diff));
    
        return val.toString();
    }

    public String mostraetapas() {
        StringBuilder txt = new StringBuilder(String.format("As Etapas para realisaçao do projeto: %s%n", this.cria.getNomeCri()));
    
        for (int i = 0; i < this.etapas.length; i++) {
            txt.append(i+1 + " - ");
            txt.append(this.etapas[i].mostraetapa() + "\n");

        }
        
        return txt.toString();
    }
}