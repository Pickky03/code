<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html> 
<html> <head> 
        <title>Đăng ký khóa học</title>
    </head> 
    <body>
        <h2>Đăng ký khóa học</h2>
        <form action="YouthTrainingCourseServlet" method="post">
            <label for="IDYouthTrainingCourse">id:</label>
            <input type="text" id="IDYouthTrainingCourse" name="IDYouthTrainingCourse"><br>
            <br>
            <label for="timeRegist">Ngày đăng ký:</label> 
            <input type="date" id="timeRegist" name="timeRegist"><br>
            <br>

    <label for="timeCloseRegist">Ngày đóng đăng ký:</label>
    <input type="date" id="timeCloseRegist" name="timeCloseRegist"><br><br>
    
    <label for="timeStart">Ngày bắt đầu khóa học:</label>
    <input type="date" id="timeStart" name="timeStart"><br><br>
    
    <label for="tuition">Học phí:</label>
    <input type="text" id="tuition" name="tuition"><br><br>
    
    <label for="information">Thông tin:</label>
    <input type="text" id="information" name="information"><br><br>
    
    <input type="submit" value="Đăng ký">
</form>
</body> 
</html>