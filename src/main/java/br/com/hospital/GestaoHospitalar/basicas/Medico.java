package br.com.hospital.GestaoHospitalar.basicas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Medico extends Pessoa {

    private String crm;
    //private List<EnumEspecialidade> especialidade

    public Medico() {

    }

}