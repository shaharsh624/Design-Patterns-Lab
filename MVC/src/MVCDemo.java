import java.sql.*;

public class MVCDemo {
    public static void main(String[] args) {

        // Fetch student record based on his roll no from the database
        Car model = retrieveCarFromDatabase();

        // Create a view to write student details on console
        CarView view = new CarView();
        Controller controller = new Controller(model, view);
        controller.updateView();

        // Update model data
        controller.setName("Tata Safari EV");
        controller.setEngine("1.5L");
        controller.updateView();
    }

    private static Car retrieveCarFromDatabase() {
        Car car = new Car();

        String url = "jdbc:mysql://localhost:3306/DP_LAB?useSSL=false";
        String username = "root";
        String password = "***";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to database!");

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CARS");

            while (resultSet.next()) {
                String name = resultSet.getString("CAR_NAME");
                String engine = resultSet.getString("CAR_ENGINE");
                car.setName(name);
                car.setEngine(engine);
            }
        } catch (SQLException ex) {
            System.err.println("Error connecting to database: " + ex.getMessage());
        }
        return car;

    }
}
