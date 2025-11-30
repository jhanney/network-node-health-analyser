package App;

import java.util.List;

import Models.NodeClass;
import Services.NodeService;

public class Main {
	public static void main(String[] args) {
		
		NodeService service = new NodeService(); 
		List<NodeClass> nodes = service.loadNodes("nodes.json"); 
		
		System.out.println("Loaded Nodes: " + nodes.size());
		
		for(NodeClass node: nodes) {
			double score = service.calculateHealthScore(node);
			String status = service.healthStatus(score); 
			
			System.out.println(node.getId() + " → " + score + " → " + status);
		}
	}
}
