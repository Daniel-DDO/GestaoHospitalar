package br.com.hospital.GestaoHospitalar.basicas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
public class Medico extends Pessoa {

    private String crm;
    private List<EnumEspecialidade> especialidades;

    public Medico() {

    }

}