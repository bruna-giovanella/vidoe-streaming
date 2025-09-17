package com.vidoe.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "visualizacoes")
public class Visualizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long visualizacaoId;

    @JoinColumn(name = "perfil", referencedColumnName = "id")
    @ManyToOne
    private Perfil perfil;

    @JoinColumn(name = "video_id", referencedColumnName = "id")
    @ManyToOne
    private Video video;

    private LocalDate dataHora;

    private int progresso;

    public Long getVisualizacaoId() {
        return visualizacaoId;
    }

    public void setVisualizacaoId(Long visualizacaoId) {
        this.visualizacaoId = visualizacaoId;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }

    public int getProgresso() {
        return progresso;
    }

    public void setProgresso(int progresso) {
        this.progresso = progresso;
    }
}
