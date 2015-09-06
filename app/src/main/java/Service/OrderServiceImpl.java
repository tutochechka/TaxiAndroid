package Service;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.List;

import Domain.Order;


/**
 * Created by Sveta on 9/1/2015.
 */
public class OrderServiceImpl implements OrderService {

    // this uses h2 by default but change to match your database
    String databaseUrl = "jdbc:mysql://localhost/taxiandroid?user=tutochechka&password=jkl123";

    private final Dao<Order, String> orderDao;


    public OrderServiceImpl() throws SQLException {
        // create a connection source to our database
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        // instantiate the dao
        orderDao = DaoManager.createDao(connectionSource, Order.class);

//        // if you need to create the 'accounts' table make this call
//        TableUtils.createTable(connectionSource, Order.class);

    }

    @Override
    public int create(Order order) throws SQLException {
        return orderDao.create(order);
    }

    @Override
    public void update(Order order) throws SQLException {
        orderDao.update(order);

    }

    @Override
    public Order read(Long id) throws SQLException {
        return orderDao.queryForId(id.toString());
    }

    @Override
    public void delete(Order order) throws SQLException {

        orderDao.delete(order);
    }

    @Override
    public List<Order> findAll() throws SQLException {
        return orderDao.queryForAll();
    }
}
