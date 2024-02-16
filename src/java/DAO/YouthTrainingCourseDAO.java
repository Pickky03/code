package DAO;

import DTO.YouthTrainingCourse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class YouthTrainingCourseDAO {
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=FBM";
    private static final String DB_USERNAME = "sa";
    private static final String DB_PASSWORD = "haidang123";

    public void registerCourse(YouthTrainingCourse course) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO YouthTrainingCourse (IDYouthTrainingCourse, TimeRegist, TimeCloseRegist, TimeStart, Tuition, Information) "
                             + "VALUES (?, ?, ?, ?, ?, ?)")) {

            preparedStatement.setInt(1, course.getIDYouthTrainingCourse());
            preparedStatement.setString(2, course.getTimeRegist());
            preparedStatement.setString(3, course.getTimeCloseRegist());
            preparedStatement.setString(4, course.getTimeStart());
            preparedStatement.setString(5, course.getTuition());
            preparedStatement.setString(6, course.getInformation());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception here (e.g., throw a new exception or return an error value)
        }
    }
}