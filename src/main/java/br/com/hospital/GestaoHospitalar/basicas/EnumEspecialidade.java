package br.com.hospital.GestaoHospitalar.basicas;

public enum EnumEspecialidade {
    Cardiologista("Cardiologista"),
    Dermatologista("Dermatologista"),
    Pediatra("Pediatra");

    private final String descricao;

    EnumEspecialidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
