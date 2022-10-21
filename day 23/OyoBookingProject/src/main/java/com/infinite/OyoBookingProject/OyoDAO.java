package com.infinite.OyoBookingProject;


import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OyoDAO {
	SessionFactory sessionFactory;
	
	public  String generateRoomId(){
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession(); 
		Criteria cr=session.createCriteria(Rooms.class);
		List<Rooms> roomList= cr.list();
		session.close();
		String id=roomList.get(roomList.size()-1).getRoomId();
		int id1=Integer.parseInt(id.substring(1));
		id1++;
		String id2=String.format("R%03d",id1);
		return id2;
		
		
		
	}
	
	public String addRoom(Rooms room){
		//room.setRoomId("R001");
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession(); 
	    String roomId = generateRoomId();
	    room.setRoomId(roomId);
	    room.setStatus(Status.AVAILABLE);
		Criteria cr=session.createCriteria(Rooms.class);
		Transaction tran = session.beginTransaction();
		session.save(room);
		tran.commit();
		session.close();
		return "Room Added Successfully  ";
		
		
		
		
		
		
		
	}
}
