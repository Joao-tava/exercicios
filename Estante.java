public class Estante{
    private ArrayList<Livro> livros;
    public Estante(){
    livro = new ArrayList<>;
    }
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    
    public void listarLivros(){
        if(livros.isEmpty()){
            System.out.println("A estante está vazia");
        }else{ 
            System.out.println("Livros na estante");
            for(Livro livro : livros){
                System.out.println("Titulo :" + livro.getTitulo());
            }
        }
    }