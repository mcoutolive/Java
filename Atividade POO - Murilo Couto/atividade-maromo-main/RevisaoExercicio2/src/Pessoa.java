public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazAniversario(){
        this.setIdade(this.getIdade() + 1);
    }

    public void imprimirDados(){
        System.out.println("\nNome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade() + "\n");
    }
}
