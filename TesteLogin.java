public class TesteLogin {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Usuario123", "Senha123");
        if (usuario.verificarLogin("Usuario123" , "Senha123")) {
            System.out.println("login bem sucedido!");
        }
        else{
            System.out.println("login falhou. Verifique seu usuário e senha.");
        }
    }
}
