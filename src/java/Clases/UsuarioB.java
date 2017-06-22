package Clases;
import Util.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioB {

    public List<Usuario> BuscarTodos() throws SQLException {
            String query = "SELECT * FROM TblDatos INNER JOIN TblAcceso ON TblAcceso.idPersona=TblDatos.idPersona;";
            try(Connection con = DB.getConnection()) {
                    PreparedStatement ps = con.prepareStatement(query);
                    ResultSet rs = ps.executeQuery();
                    List<Usuario> list = new ArrayList<>();
                    while(rs.next()) {				
                            list.add(crearDTO(rs));
                    }
                    
                    return list;
            }
    }
    
    public void Registrar(String nombre, String paterno, String materno, String email, String usuario, String password, String tipo) throws SQLException{
        String query = "call RegistrarU(?,?,?,?,?,?,?);";
        try(Connection con = DB.getConnection()){
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, paterno);
            ps.setString(3, materno);
            ps.setString(4, email);
            ps.setString(5, usuario);
            ps.setString(6, password);
            ps.setString(7, tipo);
            ResultSet rs = ps.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        

    }
    
    
    public Usuario BuscarPorUsuario(String usuario) throws SQLException {
            String query = "SELECT * FROM TblDatos INNER JOIN TblAcceso ON TblAcceso.idPersona=TblDatos.idPersona WHERE usuario = ?";
            try(Connection con = DB.getConnection()) {
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, usuario);
                    ResultSet rs = ps.executeQuery();
                    Usuario p = null;
                    if(rs.next()) {
                            p = crearDTO(rs);
                    }
                    return p;
            }
    }
     
     private Usuario crearDTO(ResultSet rs) throws SQLException {
        Usuario p = new Usuario();
        p.setUsuario(rs.getString("Usuario"));
        p.setPassword(rs.getString("Contrasenia"));
        p.setEmail(rs.getString("Email"));
        p.setNombre(rs.getString("Nombre"));
        p.setPaterno(rs.getString("Apaterno"));
        p.setMaterno(rs.getString("Amaterno"));
        p.setId(rs.getString("IdPersona"));
        switch(rs.getString("idTipo")){
            case "1":
                p.setTipo("Administrador");
                break;
            case "2":
                p.setTipo("Proveedor");
                break;
            case "3":
                p.setTipo("Bibliotecario");
                break;
            case "4":
                p.setTipo("Usuario");
            }
        return p;
    }
     
    public void ActualizarU(String nombre, String paterno, String materno, String email, String usuario, String password, String id) throws SQLException{
        String query = "call ActualizarU(?,?,?,?,?,?,?);";
        try(Connection con = DB.getConnection()){
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, paterno);
            ps.setString(3, materno);
            ps.setString(4, email);
            ps.setString(5, usuario);
            ps.setString(6, password);
            ps.setString(7, id);
            ResultSet rs = ps.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
      
      public void EliminarU(String Usuario) throws SQLException{
        String query = "call EliminarU(?);";
        try(Connection con = DB.getConnection()){
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, Usuario);
            ResultSet rs = ps.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
      }
}