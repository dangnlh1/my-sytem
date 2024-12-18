//package Study.hibernate_jpa.jdbc;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//@Component
//public class Jdbc {
//
//    @Value("${spring.datasource.url}")
//    private String dbUrl;
//
//    @Value("${spring.datasource.username}")
//    private String username;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    public boolean saveStudent() throws SQLException {
//        String query = "INSERT INTO student (first_name, last_name, email) VALUES (?, ?, ?)";
//        Connection connection = DriverManager.getConnection(dbUrl, username, password);
//
//        PreparedStatement statement = connection.prepareStatement(query);
//        statement.setString(1, "Paul");
//        statement.setString(2, "Doe");
//        statement.setString(3, "paul.doe@example.com");
//        statement.executeUpdate();
//        connection.close();
//        return true;
//    }
//}
