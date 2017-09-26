/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sait.business.Calculator;

/**
 *
 * @author 733196
 */
public class calculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstStr = request.getParameter("first");
        String secondStr = request.getParameter("second");
        String operation = request.getParameter("operation");
        
        if(firstStr == null || firstStr.isEmpty() || secondStr == null || secondStr.isEmpty() || operation == null || operation.isEmpty()){
            request.setAttribute("result", "Please enter both values and click on one of the operations.");
            request.setAttribute("firstValue", firstStr);
            request.setAttribute("secondValue", secondStr);
            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
            return;
        }
        
        if(secondStr.equals("0")  && operation.equals("%")){
            request.setAttribute("result", "Please don't divide by zero, the universe might implode.");
            request.setAttribute("firstValue", firstStr);
            request.setAttribute("secondValue", secondStr);
            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
            return;
        }
        
        double result = Calculator.operate(firstStr, secondStr, operation);
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

}
