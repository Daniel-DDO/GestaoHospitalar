package br.com.hospital.GestaoHospitalar.basicas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String email;
    private String login;
    private String senha;
    private LocalDate data_nascimento;
    private LocalDate data_cadastro;
    private String sexo;
    private String telefone;
    private Endereco endereco;

    public Pessoa() {

    }

}
