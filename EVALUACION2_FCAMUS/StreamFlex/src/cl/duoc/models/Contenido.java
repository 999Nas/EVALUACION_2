/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public abstract class Contenido {
    private int codigoAlfanumericoUnico;
    private boolean recomendacionesDeUsuario;

    public Contenido() {
    }

    public Contenido(int codigoAlfanumericoUnico, boolean recomendacionesDeUsuario) {
        this.codigoAlfanumericoUnico = codigoAlfanumericoUnico;
        this.recomendacionesDeUsuario = recomendacionesDeUsuario;
    }

    public int getCodigoAlfanumericoUnico() {
        return codigoAlfanumericoUnico;
    }

    public void setCodigoAlfanumericoUnico(int codigoAlfanumericoUnico) {
        this.codigoAlfanumericoUnico = codigoAlfanumericoUnico;
    }

    public boolean isRecomendacionesDeUsuario() {
        return recomendacionesDeUsuario;
    }

    public void setRecomendacionesDeUsuario(boolean recomendacionesDeUsuario) {
        this.recomendacionesDeUsuario = recomendacionesDeUsuario;
    }

    @Override
    public String toString() {
        return "Contenido{" + "codigoAlfanumericoUnico=" + codigoAlfanumericoUnico + ", recomendacionesDeUsuario=" + recomendacionesDeUsuario + '}';
    }
    
    
    
    
    
}
