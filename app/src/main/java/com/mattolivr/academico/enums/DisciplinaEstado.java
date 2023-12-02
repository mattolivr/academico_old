package com.mattolivr.academico.enums;

public enum DisciplinaEstado implements EnumBase {

    PENDENTE(1, "Pendente"),
    CURSANDO(2, "Cursando"),
    CONCLUIDA(3, "Concluída"),

    DEPENDENTE(4, "Em dependência"),

    RECURSANDO(5, "Cursando Novamente");

    private Integer codigo;
    private String descricao;

    DisciplinaEstado(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public Integer getCodigo() {
        return this.codigo;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }
}
