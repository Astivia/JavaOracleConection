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
public class Empleados {
    private int id;
    private String nombre;
    private String ap_pat;
    private String ap_mat;
    private int edad;
    private String email;
    private double numero;
    private double salario;
    private int estatus;

    public Empleados(){
        
    }

    public Empleados(int id, String nombre, String ap_pat, String ap_mat, int edad, String email, double numero,double salario,int estatus) {
        this.id = id;
        this.nombre = nombre;
        this.ap_pat = ap_pat;
        this.ap_mat = ap_mat;
        this.edad = edad;
        this.email = email;
        this.numero = numero;
        this.estatus = estatus;
    }


    
    //METODO PARA INSERTAR
    public int Insertar_Empleados(String nombre, String ap_pat, String ap_mat, int edad, String email, double numero,double salario) {
        int respuesta = 0;
        Connection conect = null;
        PreparedStatement ps = null;
        int alta=1;
        try {
            String sql = "INSERT INTO EMPLEADOS (nombre,ap_pat,ap_mat,edad,email,telefono,salario,estatus) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
            conect = Conexion.Conectar();
            ps = conect.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, ap_pat);
            ps.setString(3, ap_mat);
            ps.setInt(4, edad);
            ps.setString(5, email);
            ps.setDouble(6, numero);
            ps.setDouble(7, salario);
            ps.setInt(8, alta);
            respuesta = ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null)
                    ps.close();
                if (conect != null)
                    conect.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return respuesta;
    }
    
    //METODO PARA SELECT
    public DefaultTableModel Consultar_Empleados() {
        Connection conect = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String[] campos = {"id", "nombre","edad","email","telefono","salario"};
        String[] registro = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, campos);
        

        try {
            String sql = "select * from EMPLEADOS where estatus = 1 order by id";
            conect = Conexion.Conectar();
            ps = conect.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("nombre")+" "+rs.getString("ap_pat")+" "+rs.getString("ap_mat");
                registro[2] = rs.getString("edad");
                registro[3] = rs.getString("email");
                registro[4] = rs.getString("telefono");
                registro[5] = rs.getString("salario");
                modelo.addRow(registro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (ps != null)
                    ps.close();
                if (conect != null)
                    conect.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return modelo;
    }
    
    //METODO PARA ACTUALIZAR
    public int Actualizar_Empleado(String nombre, String ap_pat, String ap_mat, int edad, String email, double numero,double salario,int id) {
        int respuesta = 0;
        Connection conect = null;
        PreparedStatement ps = null;

        try {
            String sql = "update EMPLEADOS set nombre = ?, ap_pat= ?,ap_mat = ?,edad = ?,email = ?, telefono = ? ,salario=? where id = ?";
            conect = Conexion.Conectar();
            ps = conect.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, ap_pat);
            ps.setString(3, ap_mat);
            ps.setInt(4, edad);
            ps.setString(5, email);
            ps.setDouble(6, numero);
            ps.setDouble(7, salario);
            ps.setInt(8, id);
            respuesta = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null)
                    ps.close();
                if (conect != null)
                    conect.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return respuesta;
    }
    
    //METODO PARA ELIMINAR
    public int Elimina_Empleado(int id) {
        int respuesta = 0;
        Connection conect = null;
        PreparedStatement ps = null;

        try {
            String sql = "DELETE FROM EMPLEADOS where id = ?";
            conect = Conexion.Conectar();
            ps = conect.prepareStatement(sql);
            ps.setInt(1, id);
            respuesta = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (ps != null)
                    ps.close();
                if (conect != null)
                    conect.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return respuesta;
    }
    
    public ArrayList Combo_Empleados(){
        ArrayList listaLibros = new ArrayList();
        Empleados obj = null;
        
        Connection conect = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String sql = "select * from EMPLEADOS where estatus = 1 order by id";
            conect = Conexion.Conectar();
            ps = conect.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                obj = new Empleados();
                obj.setId(rs.getInt("id"));
                obj.setNombre(rs.getString("nombre"));
                obj.setAp_pat(rs.getString("ap_pat"));
                obj.setAp_mat(rs.getString("ap_mat"));
                obj.setEdad(rs.getInt("edad"));
                obj.setEmail(rs.getString("email"));
                obj.setNumero(rs.getDouble("telefono"));
                obj.setSalario(rs.getDouble("salario"));
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_pat() {
        return ap_pat;
    }

    public void setAp_pat(String ap_pat) {
        this.ap_pat = ap_pat;
    }

    public String getAp_mat() {
        return ap_mat;
    }

    public void setAp_mat(String ap_mat) {
        this.ap_mat = ap_mat;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
}
