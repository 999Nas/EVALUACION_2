/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;

/**
 *
 * @author Cetecom
 */
public class RegistroUsuario {
    private String nombreUsuario;
    private String idUsuario;
    private ArrayList<Contenido> lista = new ArrayList<>();
    private ArrayList<RegistroUsuario> listaUsuario = new ArrayList<>();
    
    //private ArrayList<Pelicula> listaPelicula = new ArrayList<>();
    /**
    private ArrayList<Serie> listaSerie = new ArrayList<>();
    private ArrayList<Documental> listaDocumental = new ArrayList<>();
    **/




    public RegistroUsuario() {
    }

    public RegistroUsuario(String nombreUsuario, String idUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ArrayList<Contenido> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Contenido> lista) {
        this.lista = lista;
    }

    
   
    //VALIDACION
    public boolean validacion(int codigoAlfaUnico){
        for(Contenido contenido : lista){
            if(contenido.getCodigoAlfanumericoUnico() == codigoAlfaUnico){
                System.out.println("ERROR: ESE CODIGO YA EXISTE!!");
                return true;
            }
        }
        System.out.println("CODIGO VALIDO!!");
        return false;
    }
    
    
    public void agregarContenido(Contenido contenido){
        lista.add(contenido);
        System.out.println("CONTENIDO AGREGADO!!");

    }
    public  void listarContenido(){
        for(Contenido content : lista){
            System.out.println(content);
        }
    }
    public void largoLista(){
        System.out.println(lista.size());
    }

    
    public void agregarUsuario(RegistroUsuario user){
        RegistroUsuario nuevoUsuario = new RegistroUsuario(getNombreUsuario(),getIdUsuario());
        listaUsuario.add(nuevoUsuario);

        System.out.println("USUARIO AGREGADO!!");
        
    }
    public  void listarUsuario(){
        for(RegistroUsuario user : listaUsuario){
            System.out.println(user);
        }
    }
    public void largoListaUsuario(){
        System.out.println(listaUsuario.size());
    }
    
    @Override
    public String toString() {
        return "RegistroUsuario{" + "nombreUsuario=" + nombreUsuario + ", idUsuario=" + idUsuario +'}';
    }
}
