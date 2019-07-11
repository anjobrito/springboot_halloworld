package com.org.ajbnetsys.ajbnetwebapi.controller.aluno;

import java.util.Date;

public class Aluno {
	
	private int id;
	private String name;
	private Date bournDate;
	private String state;
	
	private Aluno( int id,String name,Date bournDate,String state) {		
		 this.id=id;
		 this.name=name;
		 this.bournDate =bournDate;
		 this.state = state;		
	}
	
     public static class AlunoBuilder {
    	 
    		public  int id;
    		public String name;
    		public Date bournDate;
    		public String state;
    	 
	    	 public AlunoBuilder() {
	    		 
	    	 }
	    	 
	    	 public AlunoBuilder id(int id) {
	    		 this.id=id;
	    		 return this;
	    	 }
	    	 
	    	 public AlunoBuilder name(String name) {
	    		 this.name=name;
	    		 return this;
	    	 }
	    	 
	    	 public AlunoBuilder bournDate(Date bournDate) {
	    		 this.bournDate=bournDate;
	    		 return this;
	    	 }
	    	 
	    	 
	    	 public AlunoBuilder state(String state) {
	    		 this.state=state;
	    		 return this;
	    	 }
	    	 
	    	 public Aluno builder() {
	    		 return new Aluno(id,name,bournDate,state);
	    	 }		 
		 
	 }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBournDate() {
		return bournDate;
	}
	public void setBournDate(Date bournDate) {
		this.bournDate = bournDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
