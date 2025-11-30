package Models;

public class NodeClass {

	private String id;
	private int latencyMs;
	private double packetLoss; 
	private String status;
	
	public NodeClass() {
		
	}
	
	public NodeClass(String id, int latencyMs, double packetLoss, String status) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	} 
	
	
}
