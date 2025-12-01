package App;

import java.util.List;

import Models.NodeClass;
import Services.NodeService;

public class Main {
	public static void main(String[] args) {
		 
		NodeService service = new NodeService();
		
		List<NodeClass> nodes = service.loadNodes("nodes.json"); 

		service.printResults(nodes);
	}
}
