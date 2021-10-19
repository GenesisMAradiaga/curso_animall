/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.curso_de_rescate_animal.newpackage;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Genesis Maradiaga
 */
public class Curso_animal {
    public int getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(int _id) {
        this._id = _id;
    }

    /**
     * @return the _nombre
     */
    public String getNombre() {
        return _nombre;
    }

    /**
     * @param _nombre the _nombre to set
     */
    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    /**
     * @return the _precio
     */
    public String getPrecio() {
        return _precio;
    }

    /**
     * @param _precio the _precio to set
     */
    public void setPrecio(String _precio) {
        this._precio = _precio;
    }

    /**
     * @return the _fechaentrada
     */
    public Date getFechaentrada() {
        return _fechaentrada;
    }

    /**
     * @param _fechaentrada the _fechaentrada to set
     */
    public void setFechaentrada(Date _fechaentrada) {
        this._fechaentrada = _fechaentrada;
    }

    /**
     * @return the _duracion
     */
    public String getDuracion() {
        return _duracion;
    }

    /**
     * @param _duracion the _duracion to set
     */
    public void setDuracion(String _duracion) {
        this._duracion = _duracion;
    }
    /**
     * @return the _id
     */
  
    private int _id;
    private String _nombre;
    private String  _precio;
    private Date _fechaentrada;
    private String _duracion;
    
    public Curso_animal(){
        this._id = 0;
        this._nombre = "";
        this._precio = "";
        this._duracion = "";
        this._fechaentrada =  new Date();
    }
    
    public Curso_animal(int id, String nombre, String precio, String duracion, Date fechaentrada) {
        this._id = id;
        this._nombre = nombre;
        this._precio = "";
        this._duracion = "";
        this._fechaentrada =  new Date();
    }

    public ArrayList<String> obtenerCampos(){
        ArrayList<String> campos = new ArrayList<String>();
        campos.add(String.valueOf(this.getId()));
        campos.add(this.getNombre());
        campos.add(this.getPrecio());
        campos.add(this.getDuracion());
        campos.add("________");

        return campos;

    }
}
