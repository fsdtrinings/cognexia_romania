package p1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WorkStation {

	@Id
	private int wsNumber;
	private int computerId;
	private Long phoneNumber;
	public WorkStation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkStation(int wsNumber, int computerId, Long phoneNumber) {
		super();
		this.wsNumber = wsNumber;
		this.computerId = computerId;
		this.phoneNumber = phoneNumber;
	}
	public int getWsNumber() {
		return wsNumber;
	}
	public void setWsNumber(int wsNumber) {
		this.wsNumber = wsNumber;
	}
	public int getComputerId() {
		return computerId;
	}
	public void setComputerId(int computerId) {
		this.computerId = computerId;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	
	
}
