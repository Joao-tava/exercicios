public class Emprestimo{
    private String Data;
    private List Livros;
    
    public Emprestimo( String Data, List Livros){
        this.Data = Data;
        this.Livros = Livros;
    }
    public String getData(){
        return Data;
    }
    public void setData(String Data){
        this.Data = Data;
    }
    public List getLivros(){
        return Livros;
    }
    public void setLivros(List Livros){
        this.Livros = Livros;
    }
    public void adicionarLivro(Livro Livro){
        Livros.add(Livros);
    }
}
