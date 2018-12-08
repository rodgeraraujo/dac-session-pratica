package br.edu.ifpb.infra;

import br.edu.ifpb.domain.Banda;
import br.edu.ifpb.intefaces.BandaInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.sql.DataSource;

/**
 *
 * @author rodger
 */
@Stateless
@Remote(BandaInterface.class)
@Resource(lookup = "java:app/jdbc/sessionbeans")
public class BandaDAO implements BandaInterface {

    private DataSource dataSource;

    @Override
    public boolean adicionar(Banda banda) {
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement createStatement = con.prepareStatement(
                    "INSERT INTO Banda(LocalOrigem,NomeFantasia,UrlDoPerfil) VALUES (?,?,?);"
            );

            createStatement.setString(1, banda.getLocalOrigem());
            createStatement.setString(2, banda.getNomeFantasia());
            createStatement.setString(3, banda.getUrlDoPerfil());
            createStatement.executeUpdate();
            createStatement.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BandaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Banda> bandas() {
        List<Banda> lista = new ArrayList<>();
        try {

            Connection con = dataSource.getConnection();
            Statement createStatement = con.createStatement();
            ResultSet result = createStatement.executeQuery("SELECT * FROM Banda;");
            iterarComBandas(result, lista);
            createStatement.close();
        } catch (SQLException ex) {
            Logger.getLogger(BandaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    @Override
    public Banda buscar(int id) {
        try (Connection conn = dataSource.getConnection()) {
            String query = "SELECT * FROM Banda WHERE id = ? ;";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, id);
                ResultSet result = stmt.executeQuery();
                if (result.next()) {
                    return criarBanda(result);
                }
            } catch (SQLException ex) {
                Logger.getLogger(BandaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BandaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean atualizar(Banda banda) {
        try {
            Connection con = dataSource.getConnection();

            PreparedStatement createStatement = con.prepareStatement("UPDATE Banda SET localDeorigem = ?, "
                    + "nomeFantasia = ? ,urlDoPerfil? WHERE id = ?");
            createStatement.setString(1, banda.getLocalOrigem());
            createStatement.setString(2, banda.getNomeFantasia());
            createStatement.setString(2, banda.getUrlDoPerfil());
            createStatement.setInt(4, banda.getId());
            createStatement.executeUpdate();
            createStatement.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BandaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean remover(Banda banda) {
        try (Connection conn = dataSource.getConnection()) {

            String sql = "DELETE CASCADE FROM Banda WHERE id = ?;";
            int result = 0;
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, banda.getId());
                result = stmt.executeUpdate();
            }
            return result > 0;
        } catch (SQLException ex) {
            Logger.getLogger(BandaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void iterarComBandas(ResultSet result, List<Banda> lista) throws SQLException {
        while (result.next()) {
            lista.add(
                    criarBanda(result)
            );
        }

    }

    private Banda criarBanda(ResultSet result) throws SQLException {
        String localDeOrigem = result.getString("localDeOrigem");
        String nomeFantasia = result.getString("nomeFantasia");
        String urlDoPerfil = result.getString("urlDoPerfil");
        String integrantes = result.getString("");
        int id = result.getInt("id");

        return new Banda(id, localDeOrigem, nomeFantasia, urlDoPerfil);

    }

}
