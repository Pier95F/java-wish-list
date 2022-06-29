package jana60.desideri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		ArrayList<String> wishList = new ArrayList<String>();
		
		System.out.println("Esprimi un desiderio: ");
		
		boolean procedi = true;
		
		for (int i=0; i<5; i++) {
			
			while(procedi) {
				String wish = scan.nextLine();
				wishList.add(wish);
				
				System.out.println("Vuoi esprimere un altro desiderio? Si | No");
				String risposta = scan.nextLine();
				if (risposta.equalsIgnoreCase("Si")) {
					System.out.println("Esprimi un desiderio");
				} else {
					procedi = false;
				} if (i == 4) {
					System.out.println("Hai raggiunto il numero massimo di desideri!");
				} 
			}
		}
		
		Collections.sort(wishList);
		System.out.println("Lista dei desideri: " + wishList);
		
		scan.close();
	}

}
