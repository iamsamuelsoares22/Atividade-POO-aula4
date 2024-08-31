import java.time.LocalDate;

public class Main {

    public static void main(String args[]) {


        //Instância de tarefa simples utilizando a classe abstrata
        Tarefa a1 = new TarefaSimples("Tarefa 1", Prioridade.baixa);
        System.out.println(a1.toString());
        a1.executar("Andrey");
        a1.setPrioridade(Tarefa.Prioridade.media);
        System.out.println(a1.toString());
        a1.finalizar();


        //Instância de tarefa simples utilizando a interface
        Executavel a2 = new TarefaSimples("Tarefa 2", Prioridade.alta);
        System.out.println(a2.toString());
        //Por que a linha comentada abaixo gera um erro? Neste caso, o que você faria se mudar a prioridade fosse importante para seu problema?
        //a2.setPrioridade(Prioridade.media);
        a2.executar();
        System.out.println(a2.toString());
        a2.finalizar();



        Executavel a3 = new TarefaComPrazo("Tarefa 3", Tarefa.Prioridade.media, LocalDate.of(2024, 11, 11));
        System.out.println(a3.toString());

        a3.executar();
        System.out.println(a3.toString());

        a3.finalizar();
        System.out.println();

        Projeto p1 = new Projeto("Projeto teste", LocalDate.of(2024, 10, 22), LocalDate.of(2024,11,30));
        p1.addTarefas(a1);
        p1.addTarefas(a2);
        p1.addTarefas(a3);

        System.out.println(p1.toString());
    }

}