package Controller;

import DAO.YouthTrainingCourseDAO;
import DTO.YouthTrainingCourse;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/YouthTrainingCourseServlet")
public class YouthTrainingCourseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward đến trang register.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("YouthTrainingCourse.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Xử lý đăng ký khóa học và chuyển hướng đến trang thành công
        String IDYouthTrainingCourse = request.getParameter("IDYouthTrainingCourse");
        String timeRegist = request.getParameter("timeRegist");
        String timeCloseRegist = request.getParameter("timeCloseRegist");
        String timeStart = request.getParameter("timeStart");
        String tuition = request.getParameter("tuition");
        String information = request.getParameter("information");

        YouthTrainingCourse  course = new YouthTrainingCourse ();
        course.setTimeRegist(timeRegist);
        course.setTimeCloseRegist(timeCloseRegist);
        course.setTimeStart(timeStart);
        course.setTuition(tuition);
        course.setInformation(information);

        YouthTrainingCourseDAO dao = new YouthTrainingCourseDAO();
        dao.registerCourse(course);

        // Chuyển hướng đến trang thành công
        response.sendRedirect("success.jsp");
    }
}