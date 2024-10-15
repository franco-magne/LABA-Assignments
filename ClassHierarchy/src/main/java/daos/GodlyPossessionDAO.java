package daos;

import godlypossessions.GodlyPossession;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GodlyPossessionDAO extends AbstractDAO implements DAO<GodlyPossession> {

    public GodlyPossessionDAO(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public GodlyPossession getByID(int id) {
        String sqlQuery = "SELECT * FROM godly_possession WHERE (id = ?)";

        try (PreparedStatement stmt = getConnection().prepareStatement(sqlQuery)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery(sqlQuery);

            if (rs.next()) {
                return new GodlyPossession(rs.getString("name_godly_possession"), rs.getString("located_in"),
                        rs.getBoolean("was_found"), rs.getBoolean("is_activated") );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    @Override
    public List<GodlyPossession> getAll() {
        List<GodlyPossession> godlyPossessionsList = new ArrayList<>();
        String sqlQuery = "SELECT * FROM godly_possession";

        try(Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(sqlQuery)) {

            while (rs.next()) {
                String name = rs.getString("name_godly_possession");
                String locatedIn = rs.getString("located_in");
                boolean wasFound = rs.getBoolean("was_found");
                boolean isActivated = rs.getBoolean("is_activated");

                godlyPossessionsList.add(new GodlyPossession(name, locatedIn, wasFound, isActivated));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return godlyPossessionsList;
    }

    @Override
    public void insert(GodlyPossession obj) {
        String sqlQuery = "INSERT INTO godly_possession(name_godly_possession, located_in, was_found, is_activated) " +
                "VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = getConnection().prepareStatement(sqlQuery)) {
            stmt.setString(1, obj.getName());
            stmt.setString(2, obj.getLocatedIn());
            stmt.setBoolean(3, obj.getWasFound());
            stmt.setBoolean(4, obj.getIsActivated());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(GodlyPossession obj, int id) {
        String sqlQuery = "UPDATE godly_possession " +
                "SET name_godly_possession = ?, located_in = ?, was_found = ?, is_activated = ? " +
                "WHERE id = ?";

        try (PreparedStatement stmt = getConnection().prepareStatement(sqlQuery)) {
            stmt.setString(1, obj.getName());
            stmt.setString(2, obj.getLocatedIn());
            stmt.setBoolean(3, obj.getWasFound());
            stmt.setBoolean(4, obj.getIsActivated());
            stmt.setInt(5, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sqlQuery = "DELETE FROM godly_possession WHERE (id_godly_possession = ?)";

        try (PreparedStatement stmt = getConnection().prepareStatement(sqlQuery)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
