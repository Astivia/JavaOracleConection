/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AstiviaMax
 */
public class Libros {
    private int id;
    private String titulo;
    private String autor;
    private String editorial;
    private String descripcion;
    private int paginas;
    private double precio;
    private int estatus;
    
    public Libros(){
        
    }
    //METODO CONSTRUCTOR
    public Libros(int id, String titulo, String autor, String editorial, String descripcion, int paginas, double precio, int estatus) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.descripcion = descripcion;
        this.paginas = paginas;
        this.precio = precio;
        this.estatus = estatus;
    }
    
    
    //METODO PARA INSERTAR
    public int Insertar_Libro(String titulo, String autor, String editorial, String descripcion, int paginas, double precio) {
        int respuesta = 0;
        Connection conect = null;
        PreparedStatement ps = null;
        int alta=1;
        try {
            String sql = "INSERT INTO LIBROS (titulo, autor, editorial, descripcion, paginas, precio, estatus) VALUES (?, ?, ?, ?, ?, ?, ?)";
            conect = Conexion.Conectar();
            ps = conect.prepareStatement(sql);
            ps.setString(1, titulo);
            ps.setString(2, autor);
            ps.setString(3, editorial);
            ps.setString(4, descripcion);
            ps.setInt(5, paginas);
            ps.setDouble(6, precio);
            ps.setInt(7, alta);
            respuesta = ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null)
                    ps.close();
                if (conect != null)
                    conect.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return respuesta;
    }
    
    //METODO PARA SELECT
    public DefaultTableModel Consultar_Libros() {
        Connection conect = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String[] campos = {"id", "titulo", "autor", "editorial","descripcion","paginas","precio"};
        String[] registro = new String[7];
        DefaultTableModel modelo = new DefaultTableModel(null, campos);
        

        try {
            String sql = "select * from LIBROS where estatus = 1 order by id";
            conect = Conexion.Conectar();
            ps = conect.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("titulo");
                registro[2] = rs.getString("autor");
                registro[3] = rs.getString("editorial");
                registro[4] = rs.getString("descripcion");
                registro[5] = rs.getString("paginas");
                registro[6] = rs.getString("precio");
                modelo.addRow(registro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (ps != null)
                    ps.close();
                if (conect != null)
                    conect.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return modelo;
    }
    
    //METODO PARA ACTUALIZAR
    public int Actualizar_Libro(String titulo, String autor, String editorial, String descripcion, int paginas, double precio,int id) {
        int respuesta = 0;
        Connection conect = null;
        PreparedStatement ps = null;

        try {
            String sql = "update LIBROS set titulo = ?, autor = ?,editorial = ?,descripcion = ?,paginas = ?, precio = ? where id = ?";
            conect = Conexion.Conectar();
            ps = conect.prepareStatement(sql);
            ps.setString(1, titulo);
            ps.setString(2, autor);
            ps.setString(3, editorial);
            ps.setString(4, descripcion);
            ps.setInt(5, paginas);
            ps.setDouble(6, precio);
            ps.setInt(7, id);
            respuesta = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null)
                    ps.close();
                if (conect != null)
                    conect.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return respuesta;
    }
    
    //METODO PARA ELIMINAR
    public int Elimina_Libro(int id) {
        int respuesta = 0;
        Connection conect = null;
        PreparedStatement ps = null;

        try {
            String sql = "DELETE FROM LIBROS where id = ?";
            conect = Conexion.Conectar();
            ps = conect.prepareStatement(sql);
            ps.setInt(1, id);
            respuesta = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null)
                    ps.close();
                if (conect != null)
                    conect.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return respuesta;
    }
    
    public ArrayList Combo_Libros(){
        ArrayList listaLibros = new ArrayList();
        Libros obj = null;
        
        Connection conect = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "select * from LIBROS where estatus = 1 order by id";
            conect = Conexion.Conectar();
            ps = conect.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                obj = new Libros();
                obj.setId(rs.getInt("id"));
                obj.setTitulo(rs.getString("titulo"));
                obj.setAutor(rs.getString("autor"));
                obj.setEditorial(rs.getString("editorial"));
                obj.setDescripcion(rs.getString("descripcion"));
                obj.setPaginas(rs.getInt("paginas"));
                obj.setPrecio(rs.getDouble("precio"));
                listaLibros.add(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (ps != null)
                    ps.close();
                if (conect != null)
                    conect.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaLibros;
    }
    
    
    public int getId() {
        return id;
    }
    

    public void setId(int id) {
        this.id = id;
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
}
