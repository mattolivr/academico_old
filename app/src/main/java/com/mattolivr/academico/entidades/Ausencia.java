package com.mattolivr.academico.entidades;

import com.mattolivr.academico.entidades.base.Entidade;

import java.util.Date;

public class Ausencia extends Entidade {

    private Date data;
    private Integer quantidadeAulas;

    private Disciplina disciplina;

    public Ausencia() {
        // TODO: Verificar como será feita a manipulação de datas
        this.data = new Date();
        this.quantidadeAulas = 0;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getQuantidadeAulas() {
        return quantidadeAulas;
    }

    public void setQuantidadeAulas(Integer quantidadeAulas) {
        this.quantidadeAulas = quantidadeAulas;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
