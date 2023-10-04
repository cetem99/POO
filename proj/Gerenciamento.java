public class Gerenciamento {
    public void start(){
        
        //area
        Area intel_art = new Area("inteligencia artificial");
        Area cloud = new Area("cloud e tecnologia que permite acesso remoto a softwares, armazenamento de arquivos e processamento de dados por meio da internet. ");
        //pessoa
        Pessoa junin = new Pessoa("junin"); 
        Pessoa aurea = new Pessoa("aurea");
        Pessoa catem = new Pessoa("catem");


            //arey de pessoas
            Pessoa[] juntap = {aurea, junin, catem};
            //area de interesse da pessoa
            Area[] listjunin = {intel_art, cloud};
            junin.add_area(listjunin);

        //prblema
        Problema prova = new Problema("prova de paradigima", "aluno do ceub");

        //criaçao
        Criaçao sitetop = new Criaçao("sitetop", "me auculiara a estudar os conteudos de paradigimas");

        //Planejamentos
        Planejamento estudos = new Planejamento(juntap, prova, 10, sitetop);


        //etapas
        Etapas etap = new Etapas("estudar");
        Etapas opa = new Etapas("escuragar o bombom para o prof caio");

        Etapas [] a = {etap, opa};

        estudos.nova_etapa(a); 

        System.out.print(estudos.mostraplao());
        System.out.print(estudos.mostraetapas());
        
    }
}
