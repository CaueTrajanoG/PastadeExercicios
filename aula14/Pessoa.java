package aula14;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected String experiencia;

    
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    //Metodos especiais
    protected void ganharExp(){

    }

    
    
    //Metodos acessores

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

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}
