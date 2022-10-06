package com.infinite.agentproject;

import java.util.List;

public class AgentBAL {
	static StringBuilder sb = new StringBuilder();
	static AgentDAO dao = new AgentDAO();
	public String  deleteAgentBal(int Agentid){
		return dao.deleteAgentDao(Agentid);
		
	}
	public List<Agent> showAgentBal(){
		return dao.showAgentDao();
	} 
	public Agent searchAgentBal(int Agentid){
		return dao.searchAgentDao(Agentid);
		
	} 
	public String addAgentBal(Agent agent) throws AgentException{
		if(isValid(agent)==false){
			throw new AgentException(sb.toString());
		}
		return dao.addAgentDao(agent);
	}
	public String updateAgentBal(Agent agent) throws AgentException{
		if(isValid(agent)==false){
			throw new AgentException(sb.toString());
		}
		return dao.updateAgentDao(agent); 
	}
	public boolean isValid(Agent agent){
		boolean valid =true;
		if(agent.getAgentid() <= 0){
			valid=false;
			sb.append("Agent Id cannot be Negative or Zero...\r\n");
		}
		if(agent.getFirstname().length() <6){
			valid=false;
			sb.append("Agent FirstName contains min . 5 Chars...\r\n");
			
		}
		if(agent.getLastname().length() <6){
			valid=false;
			sb.append("Agent LastName contains min . 5 Chars...\r\n");
			
		}
	
		if(agent.getPremium()<10000 ){
			valid=false;
			sb.append("Agent premium  must be min 10000 ...\r\n");
		}
		
		return valid;
	}
}
