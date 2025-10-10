/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfase;

/**
 *
 * @author YARITZA
 */
public class funciones {
    
    
    
    public int cantvendedor = 1 ;
    public int cantusuario = 1 ;
    public String vendedores [][] = new String [cantvendedor][4];
    public String usuario [][] = new String [cantusuario][4];
    public int IDusuarioactual = 0;
    
    public String gvendedor(String nombre , String cedula, String email , String contrasena){
        
        vendedores [cantvendedor][0] = nombre;
        vendedores [cantvendedor][1] = cedula;
        vendedores [cantvendedor][2] = email;
        vendedores [cantvendedor][3] = contrasena;
        cantvendedor++;
        
        String cara = "(=_=)";
        return cara;
    
    }
    
     public String GuardarUsuario(String nombre , String cedula, String email , String contrasena){
        
        usuario [cantusuario][0] = nombre;
        usuario [cantusuario][1] = cedula;
        usuario [cantusuario][2] = email;
        usuario [cantusuario][3] = contrasena;
        cantusuario++;
        
        String cara = "(=_=)";
        return cara;
    
    }
    
    public static boolean validarCedula(String cedula) {
        return cedula.length() >= 8 && cedula.length() <= 10 && cedula.matches("\\d+");
    }
    
    
    
    
    
    /////
    
    
    
    
    
}
