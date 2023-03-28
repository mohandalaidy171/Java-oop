package newoop;

import java.util.*;

public class data_party {

	private int number;
	private party p1;

	public data_party(int x) {
		number=x;
		Random rand = new Random();
		int sum1 = 0;
		int count = 0;
		int sum2 = 0;
		int count2 = 0;
		int res;
		for (int i = 0; i < number; i += 2) {

			res = rand.nextInt(p1.values().length);

			if (res == 0) {
				count++;
				sum1 += 2;

			} else {
				count2++;
				sum2 += 2;
			}

		}

		System.out.println(" We have a group that you entered, party cards will be distributed based on the value you entered, where each person will take a scrap " );
		System.out.println("");
		System.out.println("");

		
		System.out.println("Other people : \n  sum of cart =  " + sum1 + "\n count =  " + count);
		System.out.println("**************************************************");
		System.out.println("VIP : \n  sum of cart = " + sum2 + "\n count =  " + count2);

	}

}
