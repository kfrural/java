package service;

import classes.Disciplina;
import interfaces.IRepositorioDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kfrural
 */
public class RepositorioDisciplina implements IRepositorioDados<Disciplina> {
    private SQLiteConnector connector;

    public RepositorioDisciplina(SQLiteConnector connector) {
        this.connector = connector;
    }

    @Override
    public void salvar(Disciplina disciplina) {
        String sql = "INSERT INTO disciplina (nome, codigo, ch, dpto) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(sql)) {
            stmt.setString(1, disciplina.getNome());
            stmt.setString(2, disciplina.getCod());
            stmt.setString(3, disciplina.getCh());
            stmt.setString(4, disciplina.getDpto());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(int idDisciplina) {
        String sql = "DELETE FROM disciplina WHERE id = ?";
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(sql)) {
            stmt.setInt(1, idDisciplina);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Disciplina> listar() {
        String sql = "SELECT * FROM disciplina";
        List<Disciplina> disciplinas = new ArrayList<>();
        try (Statement stmt = connector.getConnection().createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                disciplinas.add(new Disciplina(
                    rs.getString("nome"),
                    rs.getString("codigo"),
                    rs.getString("ch"),
                    rs.getString("dpto")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return disciplinas;
    }

    void excluir(String idDisciplina) {
        
    }
}
