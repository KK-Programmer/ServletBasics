package org.web.constants;

public interface CommonConstants {
	
	public static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	public static final String CONNECTION_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	public static final String USERNAME = "system";
	public static final String PASSWORD = "123";
	public static final String INSERT_RESERVATIONEVENT_DATA = "insert into reservationevent values(?,?,?)";
	public static final String SELECT_RESERVATION_DATA_BASED_ON_ID="select * from reservationevent where reservationId=?";
}
