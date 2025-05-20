package br.com.hospital.GestaoHospitalar.basicas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private LocalDate data_nascimento;
    private LocalDate data_cadastro;
    private String email;
    private String sexo; //Enum
    private String nacionalidade;

    public Pessoa() {

    }

    public Pessoa(String nome, String cpf, LocalDate data_nascimento, LocalDate data_cadastro, String email, String sexo, String nacionalidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.data_cadastro = data_cadastro;
        this.email = email;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
    }
}
