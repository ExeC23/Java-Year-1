import javax.swing.JOptionPane;

public class TicketApp{

	public static void main(String Args[]){

		TicketManager myTic = new TicketManager();

		String name = JOptionPane.showInputDialog(null,"Enter your name");
		int myLoop = 0;
		int myLoop2 = 0;
		int myTotalPrice;

		//Ticket amount part
		while(myLoop == 0){

			int ticketAmount = Integer.parseInt(JOptionPane.showInputDialog(null,"	how many tickets \n	you would like to buy"));

			myTic.getName(name);
			myTic.getTicketAmount(ticketAmount);
			myTic.comTicketAmount(0);
			myLoop = myTic.returnLoop();

			//Phone number part
			while(myLoop2 == 0 && myLoop == 1){

				String phone = JOptionPane.showInputDialog(null,"Enter your Phone Number");

				myTic.getPhone(phone);
				myTic.comPhone(0);
				myLoop2 = myTic.returnLoop2();

				if(myLoop2 == 1){

					myTic.comPrice(60);
					myTotalPrice = myTic.getPrice();
					myTic.comConfNum();

				}

			}

		}

	}

}