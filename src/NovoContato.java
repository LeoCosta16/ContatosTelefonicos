public class NovoContato {
    
    private int indice;
    private String nome;
    private String numero;
    private String email;
    private String grupo;

    public NovoContato(int indice, String nome, String numero, String email, String grupo) {
        this.indice = indice;
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.grupo = grupo;
    }
    
    public  int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    public NovoContato(){
        System.out.println("Novo contato criado");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Nome: " + this.nome);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
        System.out.println("Número: " + this.numero);
    }
    
}
