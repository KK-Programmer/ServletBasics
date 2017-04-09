package org.web.models;

public class ReservationEvent {

	private Integer reservationId;
	private String pnrNumber;
	private String subType;

	public ReservationEvent() {
		super();
	}

	public ReservationEvent(Integer reservationId, String pnrNumber, String subType) {
		super();
		this.reservationId = reservationId;
		this.pnrNumber = pnrNumber;
		this.subType = subType;
	}

	public Integer getReservationId() {
		return reservationId;
	}

	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}

	public String getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

}
