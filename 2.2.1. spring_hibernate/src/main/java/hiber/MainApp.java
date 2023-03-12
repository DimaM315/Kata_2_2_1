package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      //testSelectUserByCarSeries(userService);
      //getEntitis(userService);

      context.close();
   }

   public static void getEntitis(UserService userService) {
      List<User> users = userService.listUsers();
      List<Car> cars = userService.listCars();

      System.out.println("\n");
      for (User user : users) {System.out.println(user);}
      System.out.println("#### Cars: ####");
      for (Car car : cars) {System.out.println(car.getModel() + " - " + car.getSeries());}
   }
   public static void testSelectUserByCarSeries(UserService userService) {
      System.out.println("\n#### selectUserByCarSeries ####\n"+userService.getUserByCarSeries(4694) + "\n");
      System.out.println("\n#### selectUserByCarSeries ####\n"+userService.getUserByCarSeries(0) + "\n");
   }


}
