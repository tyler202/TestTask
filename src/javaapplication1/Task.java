/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Tomas
 */
public class Task {
    //atributos de la tarea
   private String titulo; //toda tarea debe tener un nombre
   private String descripcion; // una descripción que diga de que se trata la tarea
   private boolean completa; //un estado que sirva para indicar si la tarea está completa o no, en caso de valor verdadero la tarea está completa en caso de falso la tarea está incompleta
   private boolean activo; //esto me permite manejar una tarea únicamente cuando esté activa( el estado completo /incompleto no es lo mismo)
   private int diaLimite, mesLimite, añoLimite; //usamos los 3 valores por separado para la fecha  (investigar algún método mejor para esto)
   private int posicion; // para mostrar el lugar entre nuestras tareas (la posición la veremos de agregar o dependiendo de cuando se aguegue la tarea o de cual tiene su fecha límite más cercana a la actual)
   private int tiemporestante; 
    
    
    //constructor
    public Task(String titulo, String descripcion, int diaLimite, int mesLimite, int añoLimite, int tiemporestante, int posicion ){
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.completa=false; //siempre debe iniciar como una tarea incompleta
        this.activo=false;
        this.diaLimite=diaLimite;
        this.mesLimite=mesLimite;
        this.añoLimite=añoLimite;
        this.posicion=posicion;
        this.tiemporestante=tiemporestante;
    }
    
    
    
//gets y sets
    
    
    //...
    //completa
    //...
    
    public boolean isCompleta() {
        return completa;
    }
    
    public void setCompleta(boolean completa) {
        this.completa = completa;
    }
    //...
    //completa
    //...
    //...
    //activo
    //...

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    //...
    //activo
    //...
    //...
    //DiaLimite
    //...

    public int getDiaLimite() {
        return diaLimite;
    }

    public void setDiaLimite(int diaLimite) {
        this.diaLimite = diaLimite;
    }
    //...
    //DiaLimite
    //...
    //...
    //MesLimite
    //...
    public int getMesLimite() {
        return mesLimite;
    }

    public void setMesLimite(int mesLimite) {
        this.mesLimite = mesLimite;
    }
    //...
    //MesLimite
    //...
    //...
    //AñoLimite
    //...

    public int getAñoLimite() {
        return añoLimite;
    }

    public void setAñoLimite(int añoLimite) {
        this.añoLimite = añoLimite;
    }
    //...
    //AñoLimite
    //...
    //...
    //posicion
    //...

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    //...
    //posicion
    //...
    //...
    //tiempoRestante
    //...

    public int getTiemporestante() {
        return tiemporestante;
    }

    public void setTiemporestante(int tiemporestante) {
        this.tiemporestante = tiemporestante;
    }
    //...
    //tiempoRestante
    //...
    //...
    //Titulo
    //...
    String getTitulo(){
        return titulo;
    }
    void setTitulo(String titulo){
        this.titulo= titulo;
    }
    //...
    //Titulo
    //...
    //...
    //descripcion
    //...
    String getDescripcion(){
        return descripcion;
    }
    void setDescripcion(String descripcion){
        this.descripcion= descripcion;
    }
    //...
    //descripcion
    //...
}