package model.dao;

import connection.SQLiteConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.entities.Aluno;

/**
 *
 * @author kfrural
 */
public class AlunoDAO implements IDAO<Aluno> {
    private SQLiteConnector connector;

    public AlunoDAO(SQLiteConnector connector) {
        this.connector = connector;
    }

    public AlunoDAO() throws SQLException {
        this.connector = new SQLiteConnector();
    }


     @Override
    public void salvar(Aluno aluno) {
        String sql = "INSERT INTO aluno (nome, cpf, curso, idade) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(sql)) {
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getCurso());
            stmt.setInt(4, aluno.getIdade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar aluno", e);
        }
    }

    @Override
    public void excluir(int idAluno) {
        String sql = "DELETE FROM aluno WHERE id = ?";
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(sql)) {
            stmt.setInt(1, idAluno);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir aluno", e);
        }
    }

      @Override
    public List<Aluno> listar() {
        String sql = "SELECT * FROM aluno";
        List<Aluno> alunos = new ArrayList<>();
        try (Statement stmt = connector.getConnection().createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                alunos.add(new Aluno(
                    rs.getString("cpf"),
                    rs.getString("nome"),
                    rs.getInt("idade"),
                    rs.getString("curso")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar alunos", e);
        }
        return alunos;
    }

    /**
     *
     * @param codEscolhido
     */

public void excluir(String codEscolhido) {
        String sql = "DELETE FROM aluno WHERE id = ?";
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(sql)) {
            stmt.setString(1, codEscolhido);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir aluno", e);
        }
    }

}
