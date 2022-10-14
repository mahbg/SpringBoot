package testandoConhecimento.Eu;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
    @Id
    private long Id;

    private static String cpf;
    private static String nome;

    public Cliente() {
    }


    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        Cliente.cpf = cpf;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Cliente.nome = nome;
    }
}
