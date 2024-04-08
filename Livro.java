public class Livro {
    private String Autor;
    private String titulo;
    private String isbn;
    private String dataEmpretimo;
    private String estante;
    
    public Livro(String isbn,String titulo, String dataEmprestimo, String estante) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = Autor;
        this.dataEmprestimo = dataEmprestimo;
        this.estante = estante
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return Autor;
    }
    
    public void setAutor(String Autor) {
        this.autor = Autor;
    }
    
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
    
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public String getEstante() {
        return estante;
    }
    
    public void setEstante(String estante) {
        this.estante = estante;
    }
}
