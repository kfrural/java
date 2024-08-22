package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteConnector {
    private Connection connection;

    public SQLiteConnector(String dbName) throws SQLException {
        String url = "jdbc:sqlite:" + dbName;
        this.connection = DriverManager.getConnection(url);
        
        // Criando as tabelas necessárias
        criarTabelaPessoa();
        criarTabelaAluno();
        criarTabelaDisciplina();
        criarTabelaProfessor();
    }

    public Connection getConnection() {
        return connection;
    }
    
    private void criarTabelaPessoa() {
        String sql = "CREATE TABLE IF NOT EXISTS pessoa (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "nome TEXT NOT NULL," +
                     "cpf TEXT NOT NULL," +
                     "idade INTEGER NOT NULL" +
                     ");";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela pessoa: " + e.getMessage());
        }
    }

    private void criarTabelaAluno() {
        String sql = "CREATE TABLE IF NOT EXISTS aluno (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "nome TEXT NOT NULL," +
                     "cpf TEXT NOT NULL," +
                     "curso TEXT NOT NULL," +
                     "idade INTEGER NOT NULL" +
                     ");";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela aluno: " + e.getMessage());
        }
    }

    private void criarTabelaDisciplina() {
        String sql = "CREATE TABLE IF NOT EXISTS disciplina (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "nome TEXT NOT NULL," +
                     "codigo TEXT NOT NULL," +
                     "ch INTEGER NOT NULL," +
                     "dpto TEXT NOT NULL" +
                     ");";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela disciplina: " + e.getMessage());
        }
    }

    private void criarTabelaProfessor() {
        String sql = "CREATE TABLE IF NOT EXISTS professor (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "nome TEXT NOT NULL," +
                     "cpf TEXT NOT NULL," +
                     "materia TEXT NOT NULL," +
                     "idade INTEGER NOT NULL" +
                     ");";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela professor: " + e.getMessage());
        }
    }
}
