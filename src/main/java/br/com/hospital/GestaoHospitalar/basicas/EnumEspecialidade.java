package br.com.hospital.GestaoHospitalar.basicas;

public enum EnumEspecialidade {
  
    Cardiologia("Cardiologia"),
    Dermatologia("Dermatologia"),
    Pediatria("Pediatria"),
    Ortopedia("Ortopedia"),
    Acupuntura("Acupuntura"),
    Anestesiologia("Anestesiologia"),
    ClinicaMedica("Clínica Médica"),
    Endocrinologia("Endocrinologia"),
    Endoscopia("Endoscopia"),
    Gastroenterologia("Gastroenterologia"),
    Geriatria("Geriatria"),
    Ginecologia("Ginecologia"),
    Hematologia("Hematologia"),
    Homeopatia("Homeopatia"),
    Infectologia("Infectologia"),
    Mastologia("Mastologia"),
    Nefrologia("Nefrologia"),
    Neurocirurgia("Neurocirurgia"),
    Neurologia("Neurologia"),
    Nutrologia("Nutrologia"),
    Oftalmologia("Oftalmologia"),
    OncologiaClinica("Oncologia Clínica")
    Otorrinolaringologia("Otorrinolaringologia"),
    Patologia("Patologia"),
    Pneumologia("Pneumologia"),
    Radiologia("Radiologia"),
    Reumatologia("Reumatologia"),
    Urologia("Urologia"),
    CirurgiaGeral("Cirurgia Geral"),
    CirurgiaOncologica("Cirurgia Oncológica"),
    CirurgiaPediatrica("Cirurgia Pediátrica"),
    CirurgiaPlastica("Cirurgia Plástica"),
    CirurgiaToracica("Cirurgia Torácica"),
    CirurgiaVascular("Cirurgia Vascular");

    private final String descricao;

    EnumEspecialidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
