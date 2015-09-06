package Service;

import java.sql.SQLException;
import java.util.List;

import Domain.User;

/**
 * Created by Sveta on 9/1/2015.
 */
public interface UserService {
    int create(User user) throws SQLException;
    void update(User user) throws SQLException;
    User read (Long id) throws SQLException;
    void delete (User user) throws SQLException;
    List<User> findAll() throws SQLException;
}
