/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package co.edu.udea.reto10;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *datosNTFs
 * @author santiago
 */
@WebServlet("/datosNTFs")
public class NTFsServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html lang=" + "en" + ">");
            out.println("<head>");
            out.println("<meta charset=" +"UTF-8" + ">");
            out.println("<meta http-equiv=" +"X-UA-Compatible" + "content=" + "IE=edge" +">");
            out.println("<meta name=" +"viewport" +"content="+"width=device-width, initial-scale=1.0"+">");
            out.println("<title>Document</title>");
            out.println("<link rel="+"stylesheet"+" href=" +"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css" +">");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class="+"row"+">");
            out.println("<div class="+"col s12 m12"+">");
            out.println("<div class="+"card"+">");
            out.println("<div class="+"card-image"+">");
            out.println("<img src="+"https://dinahosting.com/blog/cont/uploads/2022/03/NTFS.jpg" +" "+ "height="+"300"+">");
            out.println("<span class="+"card-title"+"> <h2>¿Que son los NTFs ?</h2>  </span>");
            out.println("</div>");
            out.println("<div class="+"card-content"+">");
            out.println("<p>Los NFT o ‘tokens’ no fungibles, son activos digitales certificados mediante la tecnología blockchain. La criptografía de estos tokens es la que convierte estos activos en únicos: no hay dos iguales, y no se pueden cambiar entre sí. Esto permite acreditar que la persona que lo ha comprado es su único propietario.Los NFTs pueden ser prácticamente cualquier cosa que se pueda digitalizar: desde obras de arte, hasta memes, tuits, fotografías… El universo es enorme.</p>");
            out.println("</div>");
            out.println("<div class="+"card-action"+">");
            out.println("<h4>Links de interes</h4>");
            out.println("<ul>");
            out.println("<li><a target=\"_blank\" href="+"https://www.lasexta.com/como-que-cuando/nft_20220221620f89e07879d80001f5b74b.html"+">Link 1</a></li>");
            out.println("<li><a target=\"_blank\" href="+"https://www.techedgegroup.com/es/blog/nfts-pagamos-ello"+">Link 2</a></li>");
            out.println("<li><a target=\"_blank\" href="+"https://www.bbva.com/es/que-son-los-ntfs-los-tokens-para-el-coleccionismo-de-bienes-digitales/"+">Link 3</a></li>");
            out.println("<li><a target=\"_blank\" href="+"https://www.youtube.com/watch?v=0KrdRZVr-q4&ab_channel=Fazt"+">Link 4</a></li>");
            out.println("<li><a target=\"_blank\" href="+"https://www.youtube.com/watch?v=l0okMAaZcJU&ab_channel=EmprendeAprendiendo"+">Link 5</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("<script src="+"https://code.jquery.com/jquery-3.3.1.js"+" integrity="+"sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="+" crossorigin="+"anonymous"+"></script>");
            out.println("<script src="+"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"+"></script>");
            out.println("</body>");
            out.println("</html>");
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
