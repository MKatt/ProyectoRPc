package negocio;
import java.sql.ResultSet;
import java.sql.SQLException;

import datos.ConsultasBasicas;

public class ValidarRegistro {
	
	public static boolean ValidarIgualdad( String contraseņa1,String contraseņa2){
		boolean igual=false;
		if(contraseņa1.equals(contraseņa2)){
			igual = true;
		}
		return igual;
		
	}
    public static boolean  VerificarExitencia(String usuario){
    	ResultSet rss;
		rss = ConsultasBasicas.consultarDatos("SELECT Usuario FROM usuarios WHERE Usuario = '"+ usuario +"'" );
		boolean existe= false;
		try {
			while(rss.next()){
				existe = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   return existe;
    }
   
}
