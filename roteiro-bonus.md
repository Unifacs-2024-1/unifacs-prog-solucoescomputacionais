### Integração com banco de dados

## Passo 1
- Cadastro no [Tembo.io](https://tembo.io/)
- Crie a instancia : Hobby
- Baixe o PGAdmim para visualização dos dados: [https://www.pgadmin.org/download/pgadmin-4-windows/](https://www.pgadmin.org/download/pgadmin-4-windows/)

## Passo 2
- Crie um novo projeto no java

##  Instalação das Dependências
Se estiver usando Maven, adicione a dependência do driver JDBC do PostgreSQL no seu arquivo pom.xml:

```
<dependencies>
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.2.19</version>
    </dependency>
</dependencies>
```

- OU -> Instalar driver [JDBC](https://jdbc.postgresql.org/download/)

## Passo 3 - Configuração do Banco de Dados
Se você estiver usando um banco de dados online, como o Amazon RDS ou Heroku Postgres, você precisará das credenciais de conexão que geralmente incluem:
- URL de Conexão
- Nome do Usuário
- Senha
- Nome do Banco de Dados


## Passo 4 - Conexão com o Banco de Dados

Crie uma classe para gerenciar a conexão com o banco de dados. Por exemplo:


```
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/testdb";
    private static final String USER = "testuser";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

```

## Passo 5 - Criar a classe Employee
```
public class Employee {
    private Long id;
    private String name;
    private String position;
    private double salary;
    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
```
## Passo 6 - Criação de método para Criar Tabelas
Vamos criar uma classe Java que executa o comando SQL para criar a tabela.

```
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperations {

    public void createTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS employees ("
                + "id SERIAL PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "position VARCHAR(100) NOT NULL, "
                + "salary NUMERIC(10, 2) NOT NULL, "
                + ");";

        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DatabaseConnection.getConnection();
            stmt = conn.createStatement();
            stmt.execute(createTableSQL);
            System.out.println("Tabela criada com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fechar o Statement e a Connection
            closeResources(stmt, conn);
        }
    }

    public void insertEmployee(Employee employee) {
        String insertSQL = "INSERT INTO employees (name, position, salary) VALUES (?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DatabaseConnection.getConnection();
            pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1, employee.getName());
            pstmt.setString(2, employee.getPosition());
            pstmt.setDouble(3, employee.getSalary());
            pstmt.executeUpdate();
            System.out.println("Empregado inserido com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fechar o PreparedStatement e a Connection
            closeResources(pstmt, conn);
        }
    }

    private void closeResources(AutoCloseable resource1, AutoCloseable resource2) {
        try {
            if (resource1 != null) {
                resource1.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (resource2 != null) {
                resource2.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

```


## Passo 7 - Execução de Consultas SQL

Crie uma classe para executar consultas SQL. Por exemplo:

```
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseOperations {
    public void fetchData() {
        String query = "SELECT * FROM employees";
        
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
