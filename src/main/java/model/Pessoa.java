package model;

public class Pessoa {

	private int id;
    private String nome ;
    private String nascimento;
    private String cidade;
    private String email;
    private String senha ;
    private String endereco;

    public Pessoa(){

    }

    public Pessoa(String nome, String nascimento,String cidade,String email, String senha, String endereco) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cidade = cidade;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = getNascimento();
    }

   public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
