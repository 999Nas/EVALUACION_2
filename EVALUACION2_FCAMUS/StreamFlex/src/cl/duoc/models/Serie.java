/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Serie extends Contenido implements CostoMensual{
    private int numeroTemporadas;
    private boolean Finalizada;

    public Serie() {
    }

    public Serie(int numeroTemporadas, boolean Finalizada) {
        this.numeroTemporadas = numeroTemporadas;
        this.Finalizada = Finalizada;
    }

    public Serie(int numeroTemporadas, boolean Finalizada, int codigoAlfanumericoUnico, boolean recomendacionesDeUsuario) {
        super(codigoAlfanumericoUnico, recomendacionesDeUsuario);
        this.numeroTemporadas = numeroTemporadas;
        this.Finalizada = Finalizada;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public boolean isFinalizada() {
        return Finalizada;
    }

    public void setFinalizada(boolean Finalizada) {
        this.Finalizada = Finalizada;
    }

    @Override
    public String toString() {
        return "Serie{codigoAlfanumericoUnico="+ getCodigoAlfanumericoUnico() + "numeroTemporadas=" + numeroTemporadas + ", Finalizadas=" + Finalizada + '}';
    }
    
    public double costoMensualSuscripcion(){
        double costoMes = CostoMensual.costoBaseSuscripcion;
        double costoFinal = costoMes;
        if(getNumeroTemporadas()> 3){
            if (isFinalizada()){
                costoFinal = costoMes * 1.08;
            }
        }
        return costoFinal;
    }
}