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
        p.setNombre_Libro(rs.getString("NombreLibro"));
        p.setAutor(rs.getString("Autor"));
        p.setEditorial(rs.getString("Editorial"));
        p.setGenero(rs.getString("Genero"));
        p.setAnio(rs.getInt("Anio"));
        p.setTipo("Usuario");
        return p;
    }


}
