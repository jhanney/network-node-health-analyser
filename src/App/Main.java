package App;

import java.util.List;
import java.util.Scanner;

import Models.NodeClass;
import Services.NodeService;

public class Main {
	public static void main(String[] args) {
		 
		NodeService service = new NodeService();
		
		// Creating Scanner class object
        Scanner scn = new Scanner(System.in);
		
		List<NodeClass> nodes = service.loadNodes("nodes.json"); 
		
		//ask user how to sort results
		System.out.println("Please Enter 1 to sort by ID\nPlease Enter 2 to sort by health score\nPlease Enter 3 to sort by health status: ");
		int choice = scn.nextInt(); 
		service.sortNodes(nodes, choice); //call sort nodes 
		service.printResults(nodes);

	}
}
