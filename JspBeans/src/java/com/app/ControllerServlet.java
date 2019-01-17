/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;
import com.app.Movie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mj
 */
public class ControllerServlet extends HttpServlet {
    RequestDispatcher rd;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String genre = request.getParameter("genre");
            System.out.println(genre);
            Movie mo = new Movie();
            mo.setGenre("Abc");
            mo.setMovieName("xyz");
            ArrayList<Movie> action = new ArrayList<>();
            action.add(mo);
            action.add(new Movie("Action","Misson Impossible"));
            ArrayList<Movie> scifi = new ArrayList<>();
            scifi.add(new Movie("SciFi","The Prestige"));
            scifi.add(new Movie("SciFi","Avatar"));
            System.out.println(action);
            if(genre.equals("action")){
                request.setAttribute("mymovies", action);
                rd = request.getRequestDispatcher("DisplayMovieList.jsp");
                rd.forward(request, response);
            
            } else if(genre.equals("scifi")){
                request.setAttribute("mymovies", scifi);
                rd = request.getRequestDispatcher("DisplayMovieList.jsp");
                rd.forward(request,response);
           }else{
                out.println("No movies found of genre: "+genre);
            }
         }catch(Exception e){
             System.out.println(e);
           }
            
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
