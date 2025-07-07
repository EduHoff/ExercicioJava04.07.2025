package application;

import entities.Contract;
import services.ContractService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contract obj = new Contract();
		ContractService service = new ContractService();
		service.processContract(obj, 3);

	}

}
