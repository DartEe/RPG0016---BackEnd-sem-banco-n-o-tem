package cadastro.model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorBD {

	// Usuario
	private static String usuario = "root";

	// Senha
	private static String senha = "root6406";

	// URL
	private static final String url = "jdbc:mysql://localhost:3306/lojadb";

	/*
	 * Conexão com banco de dados
	 */

	public static Connection createConnectionToMySQL() throws ClassNotFoundException, SQLException {

		// Faz com que a classe seja carregada pela JVM
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Não foi pocivel carregar o Driver");

		}
		// Cria a conexão com banco de dados
		Connection connection = DriverManager.getConnection(url, usuario, senha);
		return connection;
	}

	public static void main(String[] args) throws Exception {

		// Recuperar uma conexão com banco de dados
		Connection con = createConnectionToMySQL();

		// Testa se a coneão é nula
		if (con != null) {
			System.out.println("Conexão obitida com suceso!");
			con.close();
		}

	}

}
