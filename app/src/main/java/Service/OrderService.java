package Service;

import java.sql.SQLException;
import java.util.List;

import Domain.Order;

/**
 * Created by Sveta on 9/1/2015.
 */
public interface OrderService {
    int create(Order order) throws SQLException;
    void update(Order order) throws SQLException;
    Order read (Long id) throws SQLException;
    void delete (Order order) throws SQLException;
    List<Order> findAll() throws SQLException;
}
