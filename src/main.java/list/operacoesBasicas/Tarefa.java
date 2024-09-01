/**
* @author : Luiz Eduardo
 */
public class Tarefa 
{
    private String  nome = "";
    private String  descrição = "";
    public  Tarefa(String nome, String descrição) 
    {
        this.nome = nome;
        this.descrição = descrição;
    }
    public String getTarefa()
    {
        return nome;
    }
    public String getDescrição()
    {
        return descrição;
    }
    public boolean equalsIgnoreCase(String nome2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'equalsIgnoreCase'");
    }
} 