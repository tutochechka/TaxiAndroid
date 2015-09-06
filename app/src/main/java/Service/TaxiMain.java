package Service;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

import Domain.Order;
import Domain.User;

/**
 * Created by Sveta on 9/1/2015.
 */
public class TaxiMain {
    private static Logger log = Logger.getLogger(TaxiMain.class.toString());

    public static void main(String[] args) throws SQLException {

        OrderService orderService = new OrderServiceImpl();
        UserService userService = new UserServiceImpl();

        User user = new User("Kolya", "Kolya", "Kolya", 673453623,  true, "Kolya");
        System.out.println(userService.create(user));
        user.setUserName("Vasya");
        userService.update(user);
        System.out.print(userService.read((long) 1));

        Order order = new Order("Vasya", "Here", "There", Calendar.getInstance().getTime(), 123L);
        System.out.println(orderService.create(order));
        order.setSum(120L);
        orderService.update(order);
        System.out.println(userService.read(1L));






    }
}