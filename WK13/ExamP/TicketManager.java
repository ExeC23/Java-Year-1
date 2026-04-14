import javax.swing.JOptionPane;

public class TicketManager{

	private int ticketAmount;
	private int myLoop;
	private int myLoop2;
	private String name;
	private String phone;
	private int totalPrice;

	public void getName(String name){

			this.name = name;

	}

	public void getTicketAmount(int ticketAmount){

		this.ticketAmount = ticketAmount;

	}

	public void comTicketAmount(int myLoop){

		if(ticketAmount < 5){

			myLoop++;
			this.myLoop = myLoop;

		}else{

			JOptionPane.showMessageDialog(null,"<html><font color = 'red'>You can not book more than 4 tickets</font></html>");
			this.myLoop = myLoop;

		}

	}

	public int returnLoop(){

		return myLoop;

	}

	public void getPhone(String phone){

		this.phone = phone;

	}

	public void comPhone(int myLoop2){

		if(phone.length() == 10 && phone.charAt(0) == '0' && phone.charAt(1) == '8' && (phone.charAt(2) == '5' || phone.charAt(2) == '6' || phone.charAt(2) == '7')){

			myLoop2++;
			this.myLoop2 = myLoop2;

		}else{

			JOptionPane.showMessageDialog(null,"<html><font color = 'red'>Invalid phone number</font></html>");
			this.myLoop2 = myLoop2;

		}

	}

	public int returnLoop2(){

		return myLoop2;

	}

	public void comPrice(int ticketPrice){

		totalPrice = ticketPrice * ticketAmount;
		this.totalPrice = totalPrice;

	}

	public int getPrice(){

		return totalPrice;

	}

	public void comConfNum(){

		String ticketstr = Integer.toString(ticketAmount);

		int size = phone.length() - 1;
		char n1 = phone.charAt(size - 2);
		char n2 = phone.charAt(size - 1);
		char n3 = phone.charAt(size);
		char n4 = name.charAt(0);
		String n5 = ticketstr;

		StringBuffer sb = new StringBuffer();

		sb.append(n1);
		sb.append(n2);
		sb.append(n3);
		sb.append(n4);
		sb.append(n5);

		JOptionPane.showMessageDialog(null,"Name : " + name + "\n" + "Phone number : " + phone + "\n" + "Number of Tickets : " + ticketAmount + "\n" + "Total cost : " + totalPrice + "\n" + "Confirm number : " + sb);

	}

}