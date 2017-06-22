package Clases;

public class Libros {
    private int idLibro;    
    private String nombreLibro;
    private String autor;
    private String editorial;
    private int anio;
    private int cantidad;
    private int idPrestamo;
    private String genero;
    private String Tipo;

    public String getNombreLibro() {
        return nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public int getAnio() {
        return anio;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return Tipo;
    }


    public void setNombre_Libro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

}
