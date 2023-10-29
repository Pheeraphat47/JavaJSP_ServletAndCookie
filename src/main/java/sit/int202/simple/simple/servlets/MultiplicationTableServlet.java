package sit.int202.simple.simple.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "MultiplicationTableServlet" , value = "/multiplicationTable")
public class MultiplicationTableServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {

        String param = request.getParameter("number");
        if(param == null || ! isDigit(param)) {
            request.setAttribute("message", "Invalid Parameter or No parameter"); // set Attribute
        }
        request.getRequestDispatcher("/multiplication_table.jsp").forward(request,response); // Link ไปที่หน้า JSP ด้วยวิธี Forward
    }

    private boolean isDigit(String number){
        for(int i=0; i<number.length() ; i++){
            if (!Character.isDigit(number.charAt(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    protected void doPost(HttpServletRequest request , HttpServletResponse response) throws  ServletException {

    }
}
