package com.demo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.ProspectDaoInterface;
import com.demo.connection.JDBCconnection;
import com.demo.domain.Prospect;

public class ProspectDaoImpl implements ProspectDaoInterface {

	private final String insertSql = "INSERT INTO prospect(fName, lName, nic, loanAmt, repayPeriod, InterestRate, installmentVal) VALUES(?,?,?,?,?,?,?)";
	
	Connection con;
	PreparedStatement ps;
	
	@Override
	public void insertAccount(Prospect p) throws SQLException {
		 
		 try {
				con = JDBCconnection.getMyConnection();
				if (con == null) {
						System.out.println("Connection Error");
						return;
				}
			con.setAutoCommit(false);
		 
			ps=con.prepareStatement(insertSql);
			ps.setString(1,p.getfName());
			ps.setString(2,p.getlName());
			ps.setString(3,p.getNic());
			ps.setDouble(4,p.getLoanAmt());
			ps.setInt(5,p.getRepayPeriod());
			ps.setDouble(6,p.getInterestRate());
			ps.setDouble(7,p.getInstallmentVal());
			ps.execute();
		 	
			con.commit();
		 	
			}catch (SQLException e) {
				try {
					if (con != null) {
						con.rollback();
					}
				} catch (SQLException e1) {
					throw e1;
				}
				throw e;
			}
			finally {
				try {
					JDBCconnection.closePreparedStatement(ps);
					JDBCconnection.closeConnection(con);
				} catch (SQLException e2) {
					throw e2;
				}
			}
		}	 
	
	
}
