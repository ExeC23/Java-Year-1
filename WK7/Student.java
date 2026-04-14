public class Student{

	//data members
	private int id;
	private String name;
	private String programme;

	public Student(){

		id = 0;
		name = "";
		programme = "";
	}

	public Student(int id, String name, String programme){

		this.id = id;
		this.name = name;
		this.programme = programme;
	}

	//set method
	public void setId(int id){

		this.id = id;
	}

	public void setName(String name){

		this.name = name;
	}
	public void setProgramme(String programme){

		this.programme = programme;
	}

	public String getName(){

		return name;
	}
	public String getProgramme(){

			return programme;
	}
	public int getId(){

			return id;
	}
}


