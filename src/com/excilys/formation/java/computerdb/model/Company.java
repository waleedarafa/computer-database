package com.excilys.formation.java.computerdb.model;

/**
 * A company is represented by an id, and a name
 * @author Waleed Arafa
 *
 */
public class Company {
	/**
	 * id of the company
	 */
	private int id;

	/**
	 * name of the company
	 */
	private String name;

	public Company(){}

	public Company(int id, String name){
		this.id = id;
		this.name=name;
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

	@Override
	public String toString(){
		return "Company n°"+this.id+" de nom "+this.name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
