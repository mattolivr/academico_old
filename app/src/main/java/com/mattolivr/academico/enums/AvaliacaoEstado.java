package com.mattolivr.academico.enums;

public enum AvaliacaoEstado implements EnumBase {

    PENDENTE(1, "Pendente"),
    DESENVOLVIMENTO(2, "Em desenvolvimento"),
    IMPEDIMENTO(3, "Em impedimento"),
    AGUARDANDO_CORRECAO(4, "Aguardando correção"),
    COMPLETA(5, "Completa"),
    NAO_REALIZADA(6, "Não Realizada");

    private Integer codigo;
    private String descricao;

    AvaliacaoEstado(Integer codigo, String descricao) {
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
