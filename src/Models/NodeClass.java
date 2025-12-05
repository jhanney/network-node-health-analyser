package Models;

public class NodeClass {

	private String id;
	private int latencyMs;
	private double packetLoss; 
	private Status status;
	
	public NodeClass() {
		
	}
	
	public NodeClass(String id, int latencyMs, double packetLoss, Status status) {
		super();
		this.id = id;
		this.latencyMs = latencyMs;
		this.packetLoss = packetLoss;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLatencyMs() {
		return latencyMs;
	}

	public void setLatencyMs(int latencyMs) {
		this.latencyMs = latencyMs;
	}

	public double getPacketLoss() {
		return packetLoss;
	}

	public void setPacketLoss(double packetLoss) {
		this.packetLoss = packetLoss;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	} 
	
	
}
