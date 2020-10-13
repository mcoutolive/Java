package net.maromo;

public class Aluno {
    private int rm;
    private String nome;
    private String email;
    private String senha;
    private String curso;
    private String cidade;



    //métodos construtores
    public Aluno(){
        this.cidade = "Mogi Mirim";

    }

    public Aluno(String email, String senha){
        this();
        this.email = email;
        this.senha = senha;
        System.out.println("Vou verificar as credenciais");
        //vai no banco e verifica, se ok
        //trago de lá as demais informações
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "rm=" + rm +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", curso='" + curso + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
