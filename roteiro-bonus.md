### Integração com banco de dados


## Conexão com o Banco de Dados

Crie uma classe para gerenciar a conexão com o banco de dados. Por exemplo:


```import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/testdb";
    private static final String USER = "testuser";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
```
## Criação de método para Criar Tabelas
Vamos criar uma classe Java que executa o comando SQL para criar a tabela.

```
public static void createTable(String args) {
      String createTableSQL = "CREATE TABLE IF NOT EXISTS employees ("
              + "id SERIAL PRIMARY KEY, "
              + "name VARCHAR(100) NOT NULL, "
              + "position VARCHAR(100) NOT NULL, "
              + "salary NUMERIC(10, 2) NOT NULL, "
              + "hire_date DATE NOT NULL"
              + ");";

      Connection conn = this.getConnection();
      Statement stmt = conn.createStatement()) {

      // Execute the SQL statement
      stmt.execute(createTableSQL);
      System.out.println("Table created successfully");
  }
```


## Execução de Consultas SQL

Crie uma classe para executar consultas SQL. Por exemplo:

```
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseOperations {
    public void fetchData() {
        String query = "SELECT * FROM your_table";
        
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                // Process the result set
                System.out.println("Column1: " + rs.getString("column1"));
                System.out.println("Column2: " + rs.getInt("column2"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
