import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* 1. Lista de Tarefas
* Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implemente os seguintes métodos:
*
* adicionarTarefa(String descricao): Adicionada uma nova tarefa à lista com a descrição descrita.
* removerTarefa(String descricao): Remova uma tarefa da lista com base em sua descrição.
* obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
* obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas da lista.
* @Luiz-EUARDO1987
*/
public class ListaTarefas 
{
    Scanner ler = new Scanner(System.in);
    String descricao;
    String nome;
    List<Tarefa>  listaTarefas;
    
    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }
    //------- adicionar
    public void adicionarTarefa()
    {
        System.out.println("Digite o nome da tarefa:");
        nome = ler.nextLine();
        limparTela();

        System.out.println("Digite a descrição da tarefa:");
        descricao = ler.nextLine();
        listaTarefas.add(new Tarefa(nome ,descricao));
        limparTela();

    }
    //------- remover
    @SuppressWarnings("unlikely-arg-type")
    public void removerTarefa()
    {
        System.out.println("Digite o nome da tarefa:");
        nome = ler.nextLine();
        limparTela();
        
        for(int i =0 ; i < listaTarefas.size(); i++)
        {
            if(listaTarefas.get(i).equalsIgnoreCase(nome))
            {
                listaTarefas.remove(nome);
            }
        }
    }
    //------- total
    public void obterNumeroTotalTarefas()
    {
        System.out.println("Total de tarefas: " + listaTarefas.size());
    }
    //------- descrição
    public void obterDescricoesTarefas()
    {
        for(Tarefa  tarefa : listaTarefas)
        {
            System.out.println(tarefa.getTarefa());
            System.out.println(tarefa.getDescrição());
        }
    }

       // Função para limpar a tela
       public static void limparTela() {
        try {
            // Detecta o sistema operacional
            if (System.getProperty("os.name").contains("Windows")) {
                // Comando para limpar a tela no Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Comando para limpar a tela no Linux/Mac
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Se ocorrer uma exceção, imprime várias linhas em branco como alternativa
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
        }
    }
}