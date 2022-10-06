package com.infinite.agentproject;

import com.infinite.agentproject.PayMode;

public class Agent {
	private int agentid;
	private String firstname;
	private String lastname;
	private  PayMode paymode;
	private double premium;
	@Override
	public String toString() {
		return "Agent [agentid=" + agentid + ", firstname=" + firstname + ", lastname=" + lastname + ", paymode="
				+ paymode + ", premium=" + premium + "]";
	}
	public Agent(int agentid, String firstname, String lastname, PayMode paymode, double premium) {
		this.agentid = agentid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.paymode = paymode;
		this.premium = premium;
	}
	public Agent() {
		
	}
	public int getAgentid() {
		return agentid;
	}
	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public PayMode getPaymode() {
		return paymode;
	}
	public void setPaymode(PayMode paymode) {
		this.paymode = paymode;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
}
