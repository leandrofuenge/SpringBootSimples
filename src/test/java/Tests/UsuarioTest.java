package Tests;

import java.util.Date;


public class UsuarioTest {
    public static void main(String[] args) {
        // Criando um objeto Usuario para teste
        Long id = 1L;
        String cpf = "123.456.789-00";
        String senha = "senha123";
        String nomeCompleto = "Fulano de Tal";
        String email = "fulano@example.com";
        Date dataNascimento = new Date(); // Data de nascimento atual, apenas para exemplo

        Usuario usuario = new Usuario(id, cpf, senha, nomeCompleto, email, dataNascimento);

        // Testando se os atributos foram atribuídos corretamente
        System.out.println("ID: " + usuario.getId());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Senha: " + usuario.getSenha());
        System.out.println("Nome Completo: " + usuario.getNomeCompleto());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Data de Nascimento: " + usuario.getDataNascimento());
    }
}

class Usuario {
    private Long id;
    private String cpf;
    private String senha;
    private String nomeCompleto;
    private String email;
    private Date dataNascimento;

    public Usuario(Long id, String cpf, String senha, String nomeCompleto, String email, Date dataNascimento) {
        this.id = id;
        this.cpf = cpf;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}