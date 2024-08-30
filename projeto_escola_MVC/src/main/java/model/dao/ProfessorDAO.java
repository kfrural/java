package model.dao;

import connection.SQLiteConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.entities.Professor;

/**
 *
 * @author kfrural
 */
public class ProfessorDAO implements IDAO<Professor> {
    private SQLiteConnector connector;

    public ProfessorDAO(SQLiteConnector connector) {
        this.connector = connector;
    }

    @Override
    public void salvar(Professor professor) {
        String sql = "INSERT INTO professor (nome, cpf, materia, idade) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(sql)) {
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getCpf());
            stmt.setString(3, professor.getMateria());
            stmt.setInt(4, professor.getIdade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(int idProfessor) {
        String sql = "DELETE FROM professor WHERE id = ?";
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(sql)) {
            stmt.setInt(1, idProfessor);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Professor> listar() {
        String sql = "SELECT * FROM professor";
        List<Professor> professores = new ArrayList<>();
        try (Statement stmt = connector.getConnection().createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                professores.add(new Professor(
                    rs.getString("cpf"),
                    rs.getString("nome"),
                    rs.getInt("idade"),
                    rs.getString("materia")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return professores;
    }
    
    /**
     *
     * @param cpfProf
     */
    public void excluir(String cpfProf){
        String sql = "DELETE FROM professor WHERE id = ?";
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(sql)) {
            stmt.setString(1, cpfProf);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
