package com.mattolivr.academico.enums;

public enum Prioridade implements EnumBase {
    IMEDIATA(0, "Imediata"),
    URGENTE(1, "Urgente"),
    ALTA(2, "Alta"),
    MEDIA(3, "Média"),
    BAIXA(4, "Baixa");

    private Integer codigo;
    private String descricao;

    Prioridade(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
