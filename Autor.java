public class Autor {
    private String nome;
    private Livro livro;

    public Autor(String nome, Livro livro) {
        this.nome = nome;
        this.livro = livro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
