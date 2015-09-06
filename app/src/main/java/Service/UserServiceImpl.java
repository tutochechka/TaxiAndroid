package Service;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.List;

import Domain.User;

/**
 * Created by Sveta on 9/1/2015.
 */
public class UserServiceImpl implements UserService {

    // this uses h2 by default but change to match your database
    String databaseUrl = "jdbc:mysql://localhost/taxiandroid?user=tutochechka&password=jkl123";
    private final Dao<User, String> userDao;


    public UserServiceImpl() throws SQLException {
        // create a connection source to our database
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);


        // instantiate the dao
        userDao = DaoManager.createDao(connectionSource, User.class);

        // if you need to create the 'accounts' table make this call
//        TableUtils.createTable(connectionSource, User.class);

    }

    @Override
    public int create(User user) throws SQLException {
        return userDao.create(user);
    }

    @Override
    public void update(User user) throws SQLException {
        userDao.update(user);

    }

    @Override
    public User read(Long id) throws SQLException {
        return userDao.queryForId(id.toString());
    }

    @Override
    public void delete(User user) throws SQLException {
        userDao.delete(user);

    }

    @Override
    public List<User> findAll() throws SQLException {
        return userDao.queryForAll();
    }
}
