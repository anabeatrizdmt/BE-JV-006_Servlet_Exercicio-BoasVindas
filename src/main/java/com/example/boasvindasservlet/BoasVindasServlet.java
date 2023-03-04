package com.example.boasvindasservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(name = "BoasVindasServlet", urlPatterns = "/pagInicial")
public class BoasVindasServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nome = req.getParameter("nome");
        String email = req.getParameter("emailCadastro");
        int horaAtual = LocalDateTime.now().getHour();
        String mensagemPorHorario;

        if (horaAtual < 12) {
            mensagemPorHorario = "Bom dia";
        } else if (horaAtual < 18) {
            mensagemPorHorario = "Boa tarde";
        } else {
            mensagemPorHorario = "Boa noite";
        }

        req.setAttribute("mensagemPorHorario", mensagemPorHorario);
        req.setAttribute("nome", nome);
        resp.setHeader("mensagemPorHorario", mensagemPorHorario);
        req.getRequestDispatcher("/paginaInicial.jsp").forward(req, resp);



    }
}
