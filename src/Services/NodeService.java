package Services;

import java.io.File;
import java.io.IOException;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import javax.management.RuntimeErrorException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import App.Main;
import Models.NodeClass;

public class NodeService {

	private double healthScore; 
	private String healthStatus;
	

	//load nodes
	public List<NodeClass> loadNodes(String filePath){
		ObjectMapper mapper = new ObjectMapper(); //converts json to java objects
		
		try {
		
		return mapper.readValue(new File(filePath), new TypeReference<List<NodeClass>>() {}); 
		}catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to load nodes"); 
		}
	}
	
	//determine health score
//	public double calculateHealthScore(double latencyMs, double packetLoss, int statusPenalty) {
//		//calculation
//		healthScore = 100
//				- latencyMs * 0.1
//                - packetLoss * 5
//                - statusPenalty;
//		
//		
//		return healthScore;				
//	}
	
	//determine by passing in whole node
	public double calculateHealthScore(NodeClass node) {
		int penalty = switch(node.getStatus()){
			case "OK" -> 0;
			case "WARN" -> 10;
			case "ERROR" -> 25;
			default -> 15;  
		};
		
		//calculation
		healthScore = 100
					 - node.getLatencyMs() *0.1
					 - node.getPacketLoss()
					 -penalty;
							
		return healthScore;
	}
	
	//classify health node
	public String healthStatus(double healthScore) {
		if(healthScore >= 80) {
			healthStatus = "HEALTHY";
		}else if(healthScore >= 50 && healthScore <= 79) {
			healthStatus = "DEGRADED";
		}else {
			healthStatus = "CRITICAL";
		}		
		return healthStatus;		
	}
	
	//print the results 
	public void printResults(List<NodeClass> nodes) {
		System.out.println("NODES LOADED SUCCESSFULLY: " + nodes.size());
		System.out.println("           NODE HEALTH RESULTS                 ");
		System.out.println("|    ID    |  Health Score  |  Health Status  |");
		for(NodeClass node: nodes) {
			double score = calculateHealthScore(node);
			String status = healthStatus(score); 
			
			System.out.println("|   " + node.getId() + "     |      " + score + "      |    " + status + "     |");
		}
	}
	
	
}
