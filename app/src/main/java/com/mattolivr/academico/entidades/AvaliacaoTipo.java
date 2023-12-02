package com.mattolivr.academico.entidades;

import com.mattolivr.academico.entidades.base.Tipo;
import com.mattolivr.academico.interfaces.Ordenavel;
import com.mattolivr.academico.utils.Ordem;

public class AvaliacaoTipo extends Tipo implements Ordenavel<AvaliacaoTipo> {

    private Ordem<AvaliacaoTipo> ordem = new Ordem<>();

    @Override
    public Ordem<AvaliacaoTipo> getOrdenacao() {
        return ordem;
    }
}
