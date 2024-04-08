

public class ItemEmprestimo {
    private String nomeItem;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    
    public ItemEmprestimo(String nomeItem, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.nomeItem = nomeItem;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    
    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    
    public boolean estaAtrasado() {
        LocalDate hoje = LocalDate.now();
        return hoje.isAfter(dataDevolucao);
    }

    
    public int calcularDiasAtraso() {
        if (estaAtrasado()) {
            return (int) (LocalDate.now().toEpochDay() - dataDevolucao.toEpochDay());
        } else {
            return 0;
        }
    }


    public String toString() {
        return "ItemEmprestimo{" +
                "nomeItem='" + nomeItem + '\'' +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}
