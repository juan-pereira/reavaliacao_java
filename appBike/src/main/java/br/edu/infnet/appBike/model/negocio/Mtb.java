package br.edu.infnet.appBike.model.negocio;

public class Mtb extends Bike {

    private double diariaMtb;
    private String nomeMtb;
    private String descricaoMtb;
    private String acessoriosMtb;
    private String materialMtb;
    private double valorMtb;
    private int disponibilidadeMtb;

    @Override
    public String toString() {
        return  "diariaMtb=" + this.diariaMtb + ';' +
                " nomeMtb=" + this.nomeMtb + ';' +
                " descricaoMtb=" + this.descricaoMtb + ';' +
                " acessoriosMtb=" + this.acessoriosMtb + ';' +
                " materialMtb=" + this.materialMtb + ';' +
                " valorMtb=" + this.valorMtb + ';' +
                " disponibilidadeMtb=" + this.disponibilidadeMtb + ';';
    }

    public double getDiariaMtb() {
        return diariaMtb;
    }
    public void setDiariaMtb(double diariaMtb) {
        this.diariaMtb = diariaMtb;
    }
    public String getNomeMtb() {
        return nomeMtb;
    }
    public void setNomeMtb(String nomeMtb) {
        this.nomeMtb = nomeMtb;
    }
    public String getDescricaoMtb() {
        return descricaoMtb;
    }
    public void setDescricaoMtb(String descricaoMtb) {
        this.descricaoMtb = descricaoMtb;
    }
    public String getAcessoriosMtb() {
        return acessoriosMtb;
    }
    public void setAcessoriosMtb(String acessoriosMtb) {
        this.acessoriosMtb = acessoriosMtb;
    }
    public String getMaterialMtb() {
        return materialMtb;
    }
    public void setMaterialMtb(String materialMtb) {
        this.materialMtb = materialMtb;
    }
    public double getValorMtb() {
        return valorMtb;
    }
    public void setValorMtb(double valorMtb) {
        this.valorMtb = valorMtb;
    }
    public int getDisponibilidadeMtb() {
        return disponibilidadeMtb;
    }
    public void setDisponibilidadeMtb(int disponibilidadeMtb) {
        this.disponibilidadeMtb = disponibilidadeMtb;
    }
}
