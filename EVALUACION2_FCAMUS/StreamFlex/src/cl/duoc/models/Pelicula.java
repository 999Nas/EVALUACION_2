/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Pelicula extends Contenido implements CostoMensual{
    private double duracion;
    private double calificacion;

    public Pelicula() {
    }

    public Pelicula(double duracion, double calificacion) {
        this.duracion = duracion;
        this.calificacion = calificacion;
    }

    public Pelicula(double duracion, double calificacion, int codigoAlfanumericoUnico, boolean recomendacionesDeUsuario) {
        super(codigoAlfanumericoUnico, recomendacionesDeUsuario);
        this.duracion = duracion;
        this.calificacion = calificacion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    
    
    @Override
    public String toString() {
        return "Pelicula{codigoAlfanumericoUnico="+ getCodigoAlfanumericoUnico() + ", duracion=" + duracion + ", calificacion=" + calificacion + '}';
    }
    
    public double costoMensualSuscripcion(){
        double costoMes = CostoMensual.costoBaseSuscripcion;
        double costoFinal = costoMes;
        if(getCalificacion() > 4.5){
            costoFinal = costoMes * 1.1;
        }
        return costoFinal;
    }
    
    
}