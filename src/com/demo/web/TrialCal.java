package com.demo.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.impl.ProspectDaoImpl;
import com.demo.domain.Prospect;

@WebServlet("/index")
public class TrialCal extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.service(request, response);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		/*String error = null ;
		if(req.getParameter("loanAmt") != null) {
			if(req.getParameter("repayPeriod") != null) {
				if(req.getParameter("interestRate") != null) {
						double loanAmt=Double.parseDouble(req.getParameter("loanAmt"));
						int repayPeriod = Integer.parseInt(req.getParameter("repayPeriod"));
						double interestRate=Double.parseDouble(req.getParameter("interestRate"));
						
						//double instalmentVal =Calculation.calInstalmentVal( loanAmt, interestRate, repayPeriod); 					
						
				}else {
						error="Enter value for Interest Rate";
				}
			}else {
				error="Enter value for Repayment Period";
			}
		}else {
			error="Enter value for Loan Amount ";
		}
			
		if(error != null) {
			req.setAttribute("error", error);
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}*/
		
		
		String fname=req.getParameter("firstName");
		String lname=req.getParameter("lastName");
		String nic=req.getParameter("nic");
		double loanAmt=Double.parseDouble(req.getParameter("loanAmt"));
		int repayPeriod = Integer.parseInt(req.getParameter("repayPeriod"));
		double interestRate=Double.parseDouble(req.getParameter("interestRate"));
		double installmentValue=Double.parseDouble(req.getParameter("installmentValue"));
		
		Prospect p1=new Prospect(fname, lname, nic, loanAmt, repayPeriod, interestRate, installmentValue);
		ProspectDaoImpl pd1=new ProspectDaoImpl();
		try {
			pd1.insertAccount(p1);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}


































