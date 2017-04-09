package org.web.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.web.constants.CommonConstants;
import org.web.models.ReservationEvent;

public class RepositoryService {
	
	public static  Connection connection=null;
	public static PreparedStatement preparedStatement = null;
	public static ResultSet resultSet = null;
	public static int count=0;

	static{
		try{
			Class.forName(CommonConstants.DRIVER_CLASS);
			System.out.println("Driver Loaded");
			connection=DriverManager.getConnection(CommonConstants.CONNECTION_URL, CommonConstants.USERNAME, CommonConstants.PASSWORD);
			System.out.println("Connected to Database");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static int InsertReservationEventDetails(ReservationEvent reservationEvent){
		try{
			preparedStatement=connection.prepareStatement(CommonConstants.INSERT_RESERVATIONEVENT_DATA);
			preparedStatement.setInt(1, reservationEvent.getReservationId());
			preparedStatement.setString(2, reservationEvent.getPnrNumber());
			preparedStatement.setString(3, reservationEvent.getSubType());
			
			count=preparedStatement.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return count;
	}

	public static ReservationEvent GetReservationDetails(Integer reservationId){
		ReservationEvent reservationEvent=null;
		try{
			preparedStatement=connection.prepareStatement(CommonConstants.SELECT_RESERVATION_DATA_BASED_ON_ID);
			preparedStatement.setInt(1, reservationId);
			ResultSet rs=preparedStatement.executeQuery();
			
			while(rs.next()){
				reservationEvent = new ReservationEvent(rs.getInt(1), rs.getString(2), rs.getString(3));
				System.out.println(reservationEvent.getReservationId());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return reservationEvent;
	}
	
	
	
}
