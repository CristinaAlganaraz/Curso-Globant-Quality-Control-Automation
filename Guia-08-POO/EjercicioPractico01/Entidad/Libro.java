/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Libro {
    
    private String isbn;
    private String titulo;
    private String autor;
    private int nroPags;
    
    public Libro() {
        
    }

    public Libro(String isbn, String titulo, String autor, int nroPags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPags = nroPags;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPags() {
        return nroPags;
    }

    public void setNroPags(int nroPags) {
        this.nroPags = nroPags;
    }
        
}
