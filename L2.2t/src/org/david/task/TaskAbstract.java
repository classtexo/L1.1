package org.david.task;

import java.util.Date;

/*
 * f Ukol: Hlavni abstraktni trida: TaskAbstract chranene atributy:
 * id,description , length, due_to, name, isClosed neimplementovana metoda:
 * getIsSolved, close Podtrida ProgrammersTask: dedi od TaskAbstract atributy
 * isSolved
 */

public abstract class TaskAbstract {
	public final static String DEFAULT_ERROR_MSG = "DEF_MSG";
	// something new..
	protected int id;
	protected String description;
	protected String length;
	protected Date dueTo;
	protected String name;
	protected boolean isClosed;
	static int taskIdIndex = 0;

	// ALT-SHIFT-S <<< menu Get& set
	// Atributy Private nebo Protected a nastavit Get/Set

	public TaskAbstract() {
		super();
		this.setId(++taskIdIndex);
	}

	public abstract boolean getIsSolved();

	// metoda se implementuje az v potomkovi.
	public abstract void close() throws Exception;

	// muzu sem uz vypsat i nejake implementace nebo to musi zustat prazdne jak
	// u Iface?
	// musim si u sebe vsechny implementovat nebo jen nektere?

	public TaskAbstract(int id, String description, String length, Date due_to,
			String name) { // konstruktor pro mnoho parm
		this();
		this.description = description;
		this.length = length;
		this.dueTo = due_to;
		this.name = name;
		this.isClosed = false;
	}

	public TaskAbstract(int id, String description) {
		this(); // konstruktor pro omezeny pocet parm
		this.description = description;
	}

	public int getId() {
		return id;
	}

	// musi byt minimalne protected, nechceme aby nám nekdo z venci nastavoval
	// id, ktere si sami vygeneruje tady uvnitr.
	protected void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description; // Proc tady uz nepotrebuji this. ???
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public Date getDue_to() {
		return dueTo;
	}

	public void setDue_to(Date due_to) {
		this.dueTo = due_to;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isClosed() {
		return isClosed;
	}

	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}

	@Override
	public String toString() {
		String sOut = "(" + this.id + ")" + description + "|" + this.length
				+ "|" + this.dueTo + "|" + this.name + "|" + this.isClosed;
		return sOut;
	}

}
