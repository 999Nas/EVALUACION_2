/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamflex;

import cl.duoc.models.Documental;
import cl.duoc.models.Pelicula;
import cl.duoc.models.RegistroUsuario;
import cl.duoc.models.Serie;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Cetecom
 */
public class StreamFlex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        Scanner entradaO = new Scanner(System.in);

        Pelicula pelicula = new Pelicula();
        Serie serie = new Serie();
        Documental documental = new Documental();
        RegistroUsuario lista = new RegistroUsuario();
        RegistroUsuario usuario = new RegistroUsuario();
        double costoSuscripcion = 0;
        
        

        //LISTAR TODO EL CONTENIDO
        //Pelicula pelicula1 = new Pelicula(1, 1, 1, true);
        //Pelicula pelicula2 = new Pelicula(2, 2, 2, true);
        //lista.agregarContenido(pelicula1);
        //lista.agregarContenido(pelicula2);
        

        
        int opcion = 0;
        while(opcion != 4){
            System.out.println("BIENVENDIO A STREAMFLEX");
            System.out.println("QUE QUIERE HACER");
            System.out.println("[1] AGREGAR USUARIO Y CONTENIDO");
            System.out.println("[2] LISTAR CONTENIDO");
            System.out.println("[3] MOSTRAR COSTO MENSUAL");
            System.out.println("[4] SALIR");
            opcion = entradaO.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("INGRESE NOMBRE:");
                    usuario.setNombreUsuario(entrada.next());
                    System.out.println("INGRESE ID_USUARIO:");
                    usuario.setIdUsuario(entrada.next());
                    
                    usuario.agregarUsuario(usuario);
                    
                    
                    int opc = 0;
                    while (opc !=4){
                        System.out.println("QUE CONTENIDO QUIERE AGREGAR");
                        System.out.println("[1] PELICULA");
                        System.out.println("[2] SERIE");
                        System.out.println("[3] DOCUMENTAL");
                        System.out.println("[4] SALIR");
                        
                        opc = entradaO.nextInt();
                        switch(opc){
                            case 1:
                                
                                System.out.println("INGRESE LOS DATOS DE PELICULA");
                                System.out.println("INGRESE CODIGO ALFANUMERICO UNICO:");
                                pelicula.setCodigoAlfanumericoUnico(entrada.nextInt());
                                
                                System.out.println("INGRESE DURACION EN HORAS:");
                                pelicula.setDuracion(entrada.nextDouble());

                                System.out.println("INGRESE CALIFICACION:");
                                pelicula.setCalificacion(entrada.nextDouble());
                                pelicula.setRecomendacionesDeUsuario(true);
                                

                                lista.agregarContenido(pelicula);
                                pelicula.costoMensualSuscripcion();
                                costoSuscripcion = costoSuscripcion + pelicula.costoMensualSuscripcion();
                                System.out.println("PELICULA AGREGADA CORRECTAMENTE");
                                System.out.println("COSTO MENSUAL DE ESTA PELICULA:" + pelicula.costoMensualSuscripcion());
                                
                                
                                //VALIDACION
                                /** 
                                System.out.println("INGRESE CODIGO ALFANUMERICO UNICO:");
                                pelicula.setCodigoAlfanumericoUnico(entrada.nextInt());
                                if (lista.validacion(pelicula.getCodigoAlfanumericoUnico())){
                                    System.out.println("INGRESE DURACION EN HORAS:");
                                    pelicula.setDuracion(entrada.nextDouble());

                                    System.out.println("INGRESE CALIFICACION:");
                                    pelicula.setCalificacion(entrada.nextDouble());

                                    lista.agregarPelicula(pelicula);
                                    pelicula.costoMensualSuscripcion();
                                    System.out.println("PELICULA AGREGADA CORRECTAMENTE");
                                    System.out.println("COSTO MENSUAL DE ESTA PELICULA:" + pelicula.costoMensualSuscripcion());;
                                } else {
                                    System.out.println("error");;
                                }
                                **/
                                
                                
                                 
                                
                                break;
                            case 2:
                                System.out.println("INGRESE LOS DATOS DE SERIE");
                                
                                System.out.println("INGRESE CODIGO ALFANUMERICO UNICO:");
                                serie.setCodigoAlfanumericoUnico(entrada.nextInt());
                                
                                System.out.println("INGRESE NUMERO DE TEMPORADAS:");
                                serie.setNumeroTemporadas(entrada.nextInt());
                                
                                System.out.println("LA SERIE ESTA FINALIZADA (true/false:");
                                serie.setFinalizada(entrada.nextBoolean());
                                serie.setRecomendacionesDeUsuario(true);
                                
                                lista.agregarContenido(serie);
                                serie.costoMensualSuscripcion();
                                costoSuscripcion = serie.costoMensualSuscripcion();
                                System.out.println("SERIE AGREGADA CORRECTAMENTE");
                                System.out.println("COSTO MENSUAL DE ESTA SERIE:" + serie.costoMensualSuscripcion());
                                break;
                            case 3:
                                System.out.println("INGRESE LOS DATOS DE DOCUMENTAL");
                                
                                System.out.println("INGRESE CODIGO ALFANUMERICO UNICO:");
                                documental.setCodigoAlfanumericoUnico(entrada.nextInt());
                                
                                System.out.println("INGRESE EL ENFOQUE EDUCATIVO:");
                                documental.setEnfoqueEducativo(entrada.next());
                                
                                System.out.println("INGRESE LA DURACION EN MINUTOS:");
                                documental.setDuracionMinutos(entrada.nextInt());
                                documental.setRecomendacionesDeUsuario(true);

                                lista.agregarContenido(documental);
                                documental.costoMensualSuscripcion();
                                costoSuscripcion = documental.costoMensualSuscripcion();
                                System.out.println("DOCUMENTAL AGREGADO CORRECTAMENTE");
                                System.out.println("COSTO MENSUAL DE ESTE DOCUMENTAL:" + documental.costoMensualSuscripcion());
                                break;
                            case 4:
                                System.out.println("SALIENDO!!");
                                break;
                            default:
                                System.out.println("OPCION INVALIDA!!");
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("LISTADO DE CONTENIDO");
                    lista.listarContenido();
                    System.out.println("CONTENIDO TOTAL:");
                    lista.largoLista();
                    break;
                case 3:
                    System.out.println("LISTADO DE USUARIOS:");
                    usuario.listarUsuario();
                    System.out.println("COSTO MENSUAL DE SUSCRIPCION= " + costoSuscripcion); 
                    System.out.println("CANTIDAD DE USUARIOS:");
                    usuario.largoListaUsuario();
                    break;
                case 4:
                    System.out.println("SALIENDO!!");
                    break;
                default:
                    System.out.println("OPCION INVALIDA!!");
            }
            
        }
    }
    
}
