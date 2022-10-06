package com.infinite.agentproject;

import java.util.List;
import java.util.Scanner;

import com.infinite.employproject.Employ;
import com.infinite.employproject.EmployException;

public class AgentMain {
	static Scanner sc = new Scanner(System.in);
	static AgentBAL bal = new AgentBAL();
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println(" O P T I O N S");
			System.out.println("--------------");
			System.out.println("1. Add Agent");
			System.out.println("2. Show Agent");
			System.out.println("3. Search Agent");
			System.out.println("4. Delete Agent");
			System.out.println("5. Update Agent");
			System.out.println("3. Exit");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
	switch(choice){
	case 1:
		try {
			addAgentMain();
		} catch (AgentException e) {
	System.out.println(e.getMessage());	
		}
		break;
	case 2:
		showAgentMain();
		break;
		
		case 3:
			searchAgentMain();
			break;
			case 4:
				deleteAgentMain();
				break;
			
			case 5:
				try{
					updateAgentMain();

				}catch (AgentException e){
					System.err.println(e.getMessage());
				}
				break;
	}
		} while (choice!=6);
	}
	public static void showAgentMain(){
		List<Agent> agentList = bal.showAgentBal();
		for(Agent agent :agentList){
			System.out.println(agent);
		}
	}
	public static void deleteAgentMain(){
		int Agentid;
		System.out.println("Enter Agent Number  ");
		Agentid = sc.nextInt();
	System.out.println(bal.deleteAgentBal(Agentid));
	}
	public static void searchAgentMain(){
		int Agentid;
		System.out.println("Enter Agent Number  ");
		Agentid = sc.nextInt();
		Agent agentFound = bal.searchAgentBal(Agentid);
		if(agentFound!=null){
			System.out.println(agentFound);
	}
			else
			{
				System.out.println("*** Record Not Found ***");
			}
		}
	public static void addAgentMain() throws AgentException{
		Agent agent =new Agent ();
		System.out.println("Enter Agent Id  ");
		agent.setAgentid(sc.nextInt());
		System.out.println("Enter Agent firstName ");
		agent.setFirstname(sc.next());
		System.out.println("Enter Agent LastName ");
		agent.setLastname(sc.next());
		System.out.println("Enter PayMode (YEARLY/HALFYEARLY/QUARTERLY) ");
		String pay = sc.next();
		if(pay.toUpperCase().equals("YEARLY")){
			agent.setPaymode(PayMode.YEARLY);
		}
		if(pay.toUpperCase().equals("HALFYEARLY")){
			agent.setPaymode(PayMode.HALFYEARLY);
		}if(pay.toUpperCase().equals("QUARTERLY")){
			agent.setPaymode(PayMode.QUARTERLY);
		}
		System.out.println("enter premium  ");
		agent.setPremium(sc.nextDouble());
		System.out.println(bal.addAgentBal(agent));
	}
	public static void updateAgentMain() throws AgentException{
		Agent agent =new Agent ();
		System.out.println("Enter Agent Id  ");
		agent.setAgentid(sc.nextInt());
		System.out.println("Enter Agent firstName ");
		agent.setFirstname(sc.next());
		System.out.println("Enter Agent LastName ");
		agent.setLastname(sc.next());
		System.out.println("Enter PayMode (YEARLY/HALFYEARLY/QUARTERLY) ");
		String pay = sc.next();
		if(pay.toUpperCase().equals("YEARLY")){
			agent.setPaymode(PayMode.YEARLY);
		}
		if(pay.toUpperCase().equals("HALFYEARLY")){
			agent.setPaymode(PayMode.HALFYEARLY);
		}if(pay.toUpperCase().equals("QUARTERLY")){
			agent.setPaymode(PayMode.QUARTERLY);
		}
		System.out.println("enter premium  ");
		agent.setPremium(sc.nextDouble());
		System.out.println(bal.addAgentBal(agent));
	}
}
