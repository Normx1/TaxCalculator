package com.example.TaxConverter;

import TaxPackeg.TaxOperation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Taxes", value = "/taxes")
public class App extends HttpServlet {

    private final List<String> taxes = new ArrayList<>();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String first_name = req.getParameter("first_name");
        String last_name = req.getParameter("last_name");
        String gender = req.getParameter("gender");
        String region = req.getParameter("region");
        String[] courses = req.getParameterValues("courses");
        Double taxes = Double.valueOf(req.getParameter("salary"));
        Double baseValue = Double.valueOf(req.getParameter("baseValue"));
        taxes = (new Logic(region, last_name, gender, taxes, baseValue)).allTax();
        System.out.println(taxes);

        try {
            writer.println("<p>First name: " + first_name + "</p>");
            writer.println("<p>Last name: " + last_name + "</p>");
            writer.println("<p>Gender: " + gender + "</p>");
            writer.println("<p>Region: " + region + "</p>");
            writer.printf("<p>Taxes:  %.2f %n Rub", taxes );

         } finally {
            writer.close();

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = req.getParameter("str");
        taxes.add(text);
    }
}