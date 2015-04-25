package com.java.lessons.l2.abst.lib;

import java.util.Date;

/*Podtrida PersonalTask: dedi od TaskAbstract
attributy: timeSolved

datesolved() //if <due_to tak getissolved vyreseno ontime.
automaticky se to uzavre Closed();

*/
public class PersonalTask extends TaskAbstract{
	
    public PersonalTask(int id, String description, String length, Date dueTo,
			String name) {
		super(id, description, length, dueTo, name);
		this.isClosed = false;
		// TODO Auto-generated constructor stub
	}

	private boolean onTimeSolved = false;
    private Date dateSolved;
    
    public void setDateSolved(Date dSolved) {
      this.dateSolved = dSolved;
      if (this.dueTo.after(dSolved) ) {
    	  onTimeSolved = true;
    	  this.isClosed = true;
      }
    }
    
	public boolean getIsSolvedOnTime() {
		return this.onTimeSolved;
	}

	@Override
	public boolean getIsSolved() {
		boolean retVal = false;
		if ( this.dateSolved != null) { retVal = true;
		}
		return retVal;
	}	
	
	
	@Override
	public void close() {
		this.isClosed = true;
	}
	
@Override 
public String toString() {
	String sOut = super.toString() + "\n Solved onTime:" +  getIsSolvedOnTime() + "\n Solved:" +  getIsSolved();
	return sOut;
}
	
}
