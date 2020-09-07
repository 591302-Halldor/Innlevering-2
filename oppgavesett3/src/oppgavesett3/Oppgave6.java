package oppgavesett3;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave6 {
	 	
		public static void main(String[] args) {
			String tall1 = showInputDialog("tall :");
			int a = Integer.parseInt ( tall1 );
		if (a>0) { 	
		for (int i=a; i>0 ;) {
			

			int svar = a*i;
			System.out.println(svar);
			i=i-1;
		}
		}
		

		}
			 
	 }

