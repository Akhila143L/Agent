package com.infinite.agentproject;

import java.util.ArrayList;
import java.util.List;

import com.infinite.agentproject.Agent;
import com.infinite.employproject.Employ;

public class AgentDAO {
		static List<Agent> agentList;
		static{
			agentList = new ArrayList<Agent>();
			
		}
		public String updateAgentDao( Agent agentNew){
			Agent agentFound = searchAgentDao(agentNew.getAgentid());
			if(agentFound!=null){
				for(Agent agent: agentList){
					if(agent.getAgentid()==agentNew.getAgentid()){
						agent.setFirstname(agentNew.getFirstname());
						agent.setLastname(agentNew.getLastname());
                        agent.setPaymode(agentNew.getPaymode());
						agent.setPremium(agentNew.getPremium());

					}
				}	
			return "Agent Record Deleted";
			}
			return "Agent Record Not Found...";
			
		}
		public String deleteAgentDao(int Agentid){
			Agent agentFound = searchAgentDao(Agentid);
			if(agentFound!=null){
				agentList.remove(agentFound);
			
			return "Agent Record Deleted";
			}
			return "Agent Record Not Found...";
			
		}
		public Agent searchAgentDao(int Agentid){
			Agent agentFound = null;
			for(Agent agent : agentList){
				if(agent.getAgentid()==Agentid){
					agentFound = agent;
				}
			}
			return agentFound;
		}
		public List<Agent> showAgentDao(){
			return agentList;

		}
		public String addAgentDao(Agent agent){
			agentList.add(agent);
			return "Agent Record Inserted...";
			
		}
}

