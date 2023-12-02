package com.mattolivr.academico.entidades;

import com.mattolivr.academico.entidades.base.Entidade;
import com.mattolivr.academico.enums.DisciplinaEstado;

public class Disciplina extends Entidade {

    private String nome;
    private DisciplinaEstado estado;
    private Integer totalAulas;

    private Professor professor;
    private Periodo periodo;

    public Disciplina() {
        this.nome = new String();
        this.estado = DisciplinaEstado.PENDENTE;
        this.totalAulas = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DisciplinaEstado getEstado() {
        return estado;
    }

    public void setEstado(DisciplinaEstado estado) {
        this.estado = estado;
    }

    public Integer getTotalAulas() {
        return totalAulas;
    }

    public void setTotalAulas(Integer totalAulas) {
        this.totalAulas = totalAulas;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
}
