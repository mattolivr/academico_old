package com.mattolivr.academico.interfaces;

import com.mattolivr.academico.utils.Ordem;

public interface Ordenavel<T> {

    Ordem<T> getOrdenacao();

    default void reordenar(Integer novaPosicao) {
        getOrdenacao().reordenar(novaPosicao);
    }
}
