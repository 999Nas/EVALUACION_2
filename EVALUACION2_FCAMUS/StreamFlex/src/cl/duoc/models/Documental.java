/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Documental extends Contenido implements CostoMensual{
    private String enfoqueEducativo;
    private int duracionMinutos;

    public Documental() {
    }

    public Documental(String enfoqueEducativo, int duracionMinutos) {
        this.enfoqueEducativo = enfoqueEducativo;
        this.duracionMinutos = duracionMinutos;
    }

    public Documental(String enfoqueEducativo, int duracionMinutos, int codigoAlfanumericoUnico, boolean recomendacionesDeUsuario) {
        super(codigoAlfanumericoUnico, recomendacionesDeUsuario);
        this.enfoqueEducativo = enfoqueEducativo;
        this.duracionMinutos = duracionMinutos;
    }

    public String getEnfoqueEducativo() {
        return enfoqueEducativo;
    }

    public void setEnfoqueEducativo(String enfoqueEducativo) {
        this.enfoqueEducativo = enfoqueEducativo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Documental{codigoAlfanumericoUnico="+ getCodigoAlfanumericoUnico() + ", enfoqueEducativo=" + enfoqueEducativo + ", duracionMinutos=" + duracionMinutos + '}';
    }  
    
    public double costoMensualSuscripcion(){
        double costoMes = CostoMensual.costoBaseSuscripcion;
        double costoFinal = costoMes;
        if(getDuracionMinutos()> 90){
            costoFinal = costoMes * 1.05;
        }
        return costoFinal;
    }
}