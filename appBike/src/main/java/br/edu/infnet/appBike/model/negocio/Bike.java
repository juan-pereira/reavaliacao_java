package br.edu.infnet.appBike.model.negocio;

public class Bike {

    private Integer id;
    private String nomeCategoria;
    private String descricaoCategoria;
    private int idCategoria;
    private int nivelBikes;
    private String nomeNiveis;
    private int disponibilidadeCategorias;

    @Override
    public String toString() {
        return  "nomeCategoria=" + this.nomeCategoria + ';' +
                " descricaoCategoria=" + this.descricaoCategoria + ';' +
                " idCategoria=" + this.idCategoria + ';' +
                " nivelBikes=" + this.nivelBikes + ';' +
                " nomeNiveis=" + this.nomeNiveis + ';' +
                " disponibilidadeCategorias=" + this.disponibilidadeCategorias + ';';
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }
    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }
    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }
    public int getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public int getNivelBikes() {
        return nivelBikes;
    }
    public void setNivelBikes(int nivelBikes) {
        this.nivelBikes = nivelBikes;
    }
    public String getNomeNiveis() {
        return nomeNiveis;
    }
    public void setNomeNiveis(String nomeNiveis) {
        this.nomeNiveis = nomeNiveis;
    }
    public int getDisponibilidadeCategorias() {
        return disponibilidadeCategorias;
    }
    public void setDisponibilidadeCategorias(int disponibilidadeCategorias) {
        this.disponibilidadeCategorias = disponibilidadeCategorias;
    }
}
