package com.courier_system.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.courier_system.dao.ConnectionProvider;
import com.courier_system.dao.DeliveryDao;

public class Customer_info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Connection con=ConnectionProvider.getCon();
	String PFname=request.getParameter("pfname");
	String PLname=request.getParameter("plname");
	
	String _mobile=request.getParameter("pmobile");
	
	int Pmobile=Integer.parseInt(_mobile);
	
	String PEmail=request.getParameter("pemail");
	
	String PHouseNo=request.getParameter("phouseno");
	
	String PStreet=request.getParameter("pstreet");
	
	String PLandmark=request.getParameter("plandmark");
	
	String PCity=request.getParameter("pcity");
	
	String Pin=request.getParameter("ppincode");
	
	int PicupPinCode=Integer.parseInt(Pin);
//........................................
	//..product information
	/*String Category=request.getParameter("category");
	
	String DeliverOption=request.getParameter("deliveroption");*/
	
	/*String TimeSlot=request.getParameter("timeslot");
	
	String wght=request.getParameter("weight");
	
	int Weight=Integer.parseInt(wght);
	
	//...............................
	//..Delivery customer info..
	
String DyFname=request.getParameter("dname");
	
	String DyLname=request.getParameter("dname");
	
	String Dmobile=request.getParameter("dmobile");
	
	int Dymobile=Integer.parseInt(Dmobile);
	
	String DyEmail=request.getParameter("demail");
	
	String DyHouseNo=request.getParameter("dhouseno");
	
	String DyStreet=request.getParameter("dstreet");
	
	String DyLandmark=request.getParameter("dlandmark");
	
	String DyCity=request.getParameter("dcity");
	
	String DPin=request.getParameter("dpincode");
	
	int DyPinCode=Integer.parseInt(Pin);
	*/
	//................................
	
	DeliveryDao dd=new DeliveryDao(); 
	
	dd.addPickupData(PFname,PLname,Pmobile,PEmail,PHouseNo,PStreet,PLandmark,PCity,PicupPinCode,con);
	
	//dd.addPickupData("rajesh", "didshe",9404127455l, "abc@gmail.com", "5623", "khou galli", "ghar", "pune", 12525, con);
		
	}

}
