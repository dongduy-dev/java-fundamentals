package OOP.MovieManagement;

public class Producer {
	private String name;
	private String country;

	public Producer(String name, String country){
		this.name = name;
		this.country = country;
	}

	public String getName(){
		return this.name;
	}

	public String getCountry(){
		return this.country;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setCountry(String country){
		this.country = country;
	}

	@Override
	public String toString(){
		return name + " - " + country;
	}
}
