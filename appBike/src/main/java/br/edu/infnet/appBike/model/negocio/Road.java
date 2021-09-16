package br.edu.infnet.appBike.model.negocio;

public class Road extends Bike {

    private double diariaRoad;
    private String nomeRoad;
    private String descricaoRoad;
    private String acessoriosRoad;
    private String materialRoad;
    private double valorRoad;
    private int disponibilidadeRoad;

    @Override
    public String toString() {
        return  "diariaRoad=" + this.diariaRoad + ';' +
                " nomeRoad=" + this.nomeRoad + ';' +
                " descricaoRoad=" + this.descricaoRoad + ';' +
                " acessoriosRoad=" + this.acessoriosRoad + ';' +
                " materialRoad=" + this.materialRoad + ';' +
                " valorRoad=" + this.valorRoad + ';' +
                " disponibilidadeRoad=" + this.disponibilidadeRoad + ';';
    }

    public double getDiariaRoad() {
        return diariaRoad;
    }
    public void setDiariaRoad(double diariaRoad) {
        this.diariaRoad = diariaRoad;
    }
    public String getNomeRoad() {
        return nomeRoad;
    }
    public void setNomeRoad(String nomeRoad) {
        this.nomeRoad = nomeRoad;
    }
    public String getDescricaoRoad() {
        return descricaoRoad;
    }
    public void setDescricaoRoad(String descricaoRoad) {
        this.descricaoRoad = descricaoRoad;
    }
    public String getAcessoriosRoad() {
        return acessoriosRoad;
    }
    public void setAcessoriosRoad(String acessoriosRoad) {
        this.acessoriosRoad = acessoriosRoad;
    }
    public String getMaterialRoad() {
        return materialRoad;
    }
    public void setMaterialRoad(String materialRoad) {
        this.materialRoad = materialRoad;
    }
    public double getValorRoad() {
        return valorRoad;
    }
    public void setValorRoad(double valorRoad) {
        this.valorRoad = valorRoad;
    }
    public int getDisponibilidadeRoad() {
        return disponibilidadeRoad;
    }
    public void setDisponibilidadeRoad(int disponibilidadeRoad) {
        this.disponibilidadeRoad = disponibilidadeRoad;
    }
}
