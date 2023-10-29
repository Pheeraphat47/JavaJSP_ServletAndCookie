package sit.int202.simple.simple.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sit.int202.simple.simple.entities.Subject;
import sit.int202.simple.simple.repositories.SubjectRepository;

import java.util.*;

import java.io.IOException;

@WebServlet(name = "SubjectListServlet", value = "/SubjectList")
public class SubjectListServlet extends HttpServlet {

    private long startTime;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Subject> subjects = (List) new SubjectRepository().findAll();
        request.setAttribute("subjects",subjects);
        request.getRequestDispatcher("/subjects_list.jsp").forward(request,response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    // Method Destroy
    @Override
    public void destroy() {
        System.out.println("This servlet life time is " + (System.currentTimeMillis() - startTime ) + " milliseconds");
    }

    // Method init
    @Override
    public void init() throws ServletException {
        startTime = System.currentTimeMillis();
    }
}
