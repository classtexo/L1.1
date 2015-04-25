package org.david.task;

import java.util.Date;

/*
 * Podtrida PersonalTask: dedi od TaskAbstract attributy: timeSolved
 * 
 * datesolved() //if <due_to tak getissolved vyreseno ontime. automaticky se to
 * uzavre Closed();
 */
public class PersonalTask extends TaskAbstract {

	private boolean onTimeSolved = false;

	private Date dateSolved;

	public PersonalTask() {
		super();
	}

	/**
	 * Je potreba generovat javadoc, popsat atributy
	 * 
	 * @param id
	 * @param description
	 * @param length
	 * @param dueTo
	 * @param name
	 */
	public PersonalTask(int id, String description, String length, Date dueTo,
			String name) {
		super(id, description, length, dueTo, name);
		this.isClosed = false;
		// TODO Auto-generated constructor stub
	}

	// setter by mel byt hloupy - delat jen to, ze nastavi hodnotu.
	public void setDateSolved(Date dSolved) {
		dateSolved = dSolved;
		if (dueTo.after(dSolved)) {
			onTimeSolved = true;
			isClosed = true;
		}
	}

	// TODO vygenerovat javacod, popsat ho.
	/**
	 * tady jsem prave chtel, aby byla logika misto v setDateSolved, to je ale
	 * detail.
	 * 
	 * @return
	 */
	public boolean getIsSolvedOnTime() {
		return this.onTimeSolved;
	}

	// TODO chybi getter Date solved

	@Override
	public boolean getIsSolved() {
		boolean retVal = false;
		if (dateSolved != null) {
			retVal = true;
		}
		return retVal;
	}

	@Override
	public void close() throws Exception {
		if (getIsSolved()) {
			super.setClosed(true);
		} else {
			// TODO premenit na nas novy typ exception :)
			throw new Exception(TaskAbstract.DEFAULT_ERROR_MSG);
		}

	}

	@Override
	public String toString() {
		String sOut = super.toString() + "\n Solved onTime:"
				+ getIsSolvedOnTime() + "\n Solved:" + getIsSolved();
		return sOut;
	}

}
