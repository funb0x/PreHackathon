package com.grandhackathon.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet(name = "getjson", urlPatterns = { "/getjson" })
public class GetJSON extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String parameterValue = req.getParameter("number");
		Gson gson1 = new Gson();
		String jsonString = gson1.toJson(new TempEntity("fieldS1"
				+ parameterValue, "fieldS2" + parameterValue));
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println(jsonString);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

}
