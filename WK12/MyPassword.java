import javax.swing.JOptionPane;
public class MyPassword{

	private String name;
	private String surname;
	private String passwordPart1,passwordPart2;
	private int id;

	public void getName(String name){

		this.name = name;

	}
	public void getSurname(String surname){

		this.surname = surname;

	}
	public void getID(int id){

		this.id = id;

	}


	public void setPasswordPart1(){

		StringBuffer sb = new StringBuffer();
		String idstr = Integer.toString(id);
		int length = idstr.length();
		sb.append(idstr.charAt(0));
		sb.append(idstr.charAt(length - 1));

		passwordPart1 = sb.toString();


	}

	public void setPasswordPart2(){

			StringBuffer sb = new StringBuffer();
			sb.append(name.charAt(0));
			sb.append(surname.charAt(0));

			passwordPart2 = sb.toString();


	}

	public void generatePassword(){

		JOptionPane.showMessageDialog(null,"Your new password is : " + passwordPart1 + passwordPart2 + "2026");

	}

}