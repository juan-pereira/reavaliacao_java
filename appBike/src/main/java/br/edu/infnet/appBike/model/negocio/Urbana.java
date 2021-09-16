package br.edu.infnet.appBike.model.negocio;

public class Urbana extends Bike {

    private double diariaUrbana;
    private String nomeUrbana;
    private String descricaoUrbana;
    private String acessoriosUrbana;
    private String materialUrbana;
    private double valorUrbana;
    private int disponibilidadeUrbana;

    @Override
    public String toString() {
        return "Urbana{" +
                "diariaUrbana=" + this.diariaUrbana + ';' +
                ", nomeUrbana='" + this.nomeUrbana + ';' +
                ", descricaoUrbana='" + this.descricaoUrbana + ';' +
                ", acessoriosUrbana='" + this.acessoriosUrbana + ';' +
                ", materialUrbana='" + this.materialUrbana + ';' +
                ", valorUrbana=" + this.valorUrbana + ';' +
                ", disponibilidadeUrbana=" + this.disponibilidadeUrbana + ';';
    }

    public double getDiariaUrbana() {
        return diariaUrbana;
    }
    public void setDiariaUrbana(double diariaUrbana) {
        this.diariaUrbana = diariaUrbana;
    }
    public String getNomeUrbana() {
        return nomeUrbana;
    }
    public void setNomeUrbana(String nomeUrbana) {
        this.nomeUrbana = nomeUrbana;
    }
    public String getDescricaoUrbana() {
        return descricaoUrbana;
    }
    public void setDescricaoUrbana(String descricaoUrbana) {
        this.descricaoUrbana = descricaoUrbana;
    }
    public String getAcessoriosUrbana() {
        return acessoriosUrbana;
    }
    public void setAcessoriosUrbana(String acessoriosUrbana) {
        this.acessoriosUrbana = acessoriosUrbana;
    }
    public String getMaterialUrbana() {
        return materialUrbana;
    }
    public void setMaterialUrbana(String materialUrbana) {
        this.materialUrbana = materialUrbana;
    }
    public double getValorUrbana() {
        return valorUrbana;
    }
    public void setValorUrbana(double valorUrbana) {
        this.valorUrbana = valorUrbana;
    }
    public int getDisponibilidadeUrbana() {
        return disponibilidadeUrbana;
    }
    public void setDisponibilidadeUrbana(int disponibilidadeUrbana) {
        this.disponibilidadeUrbana = disponibilidadeUrbana;
    }
}
