public class Animal {

    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.setNome(nome);
        ;
        this.setIdade(idade);
        ;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "O Nome do animal é: " + nome + "\nIdade: " + idade + " Meses.\n";
    }

}