package Clases;

import Util.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibrosB {

    public List<Libros> BuscarTodos() throws SQLException {
		String query = "select*from tblLibros;";
		try(Connection con = DB.getConnection()) {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			List<Libros> list = new ArrayList<>();
			List<Libros> list2 = new ArrayList<>();
			while(rs.next()) {				
				list.add(crearDTO(rs));
			}
                        try{
                            for(int i = (list.size()-1); i > (list.size()-7) ; i-- ){
                                list2.add(list.get(i));
                            }
                            return list2;
                        }catch(Exception e){
                            return list;
                        }
		}
	}
    
    public List<Libros> BuscarPrestamos() throws SQLException {
		String query = "select tblLibros.idLibro, tblLibros.nombreLibro, tblLibros.Autor, tblLibros.Editorial, tblLibros.Genero, tblLibros.Anio, tblLibros.idPersona, tblLibros.cantidad, Prestamos.idPrestamo from tblLibros INNER JOIN Prestamos ON tblLibros.idLibro = Prestamos.idLibro WHERE Prestamos.status = true ;";
		try(Connection con = DB.getConnection()) {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			List<Libros> list = new ArrayList<>();
			List<Libros> list2 = new ArrayList<>();
			while(rs.next()) {				
				list.add(crearDTO2(rs));
			}
                        try{
                            for(int i = (list.size()-1); i > (list.size()-7) ; i-- ){
                                list2.add(list.get(i));
                            }
                            return list2;
                        }catch(Exception e){
                            return list;
                        }
		}
	}
    
    public void PrestarLB( int idLibro, int idUser) throws SQLException{
        
        System.out.println(idLibro);
        System.out.println(idUser);
        String query = "call HacerPrestamo(?,?);";
        try(Connection con = DB.getConnection()){
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idUser);
            ps.setInt(2, idLibro);
            ResultSet rs = ps.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
    public void DevolverLB( int idLibro, int idPrestamo) throws SQLException{
        
        String query = "call QuitarPrestamo(?,?);";
        try(Connection con = DB.getConnection()){
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idPrestamo);
            ps.setInt(2, idLibro);
            ResultSet rs = ps.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
    public void SubirLb( String idLibro, String nombreLibro, String Autor, String Editorial, String Genero, String Anio, String cantidad) throws SQLException{
            String query = "call SubirL(?,?,?,?,?,?,?,?);";
            try(Connection con = DB.getConnection()){
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, idLibro);
                ps.setString(2, nombreLibro);
                ps.setString(3, Autor);
                ps.setString(4, Editorial);
                ps.setString(5, Genero);
                ps.setString(6, Anio);
                ps.setString(7, "2");
                ps.setString(8, cantidad);
                ResultSet rs = ps.executeQuery();
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
    
    private Libros crearDTO(ResultSet rs) throws SQLException {
        Libros p = new Libros();
        p.setIdLibro(rs.getInt("idLibro"));
        p.setNombre_Libro(rs.getString("NombreLibro"));
        p.setAutor(rs.getString("Autor"));
        p.setEditorial(rs.getString("Editorial"));
        p.setGenero(rs.getString("Genero"));
        p.setAnio(rs.getInt("Anio"));
        p.setTipo("Usuario");
        p.setCantidad(rs.getInt("cantidad"));
        return p;
    }
    
    private Libros crearDTO2(ResultSet rs) throws SQLException {
        Libros p = new Libros();
        p.setIdLibro(rs.getInt("idLibro"));
        p.setNombre_Libro(rs.getString("NombreLibro"));
        p.setAutor(rs.getString("Autor"));
        p.setEditorial(rs.getString("Editorial"));
        p.setGenero(rs.getString("Genero"));
        p.setAnio(rs.getInt("Anio"));
        p.setTipo("Usuario");
        p.setCantidad(rs.getInt("cantidad"));
        p.setIdPrestamo(rs.getInt("idPrestamo"));
        return p;
    }


}
