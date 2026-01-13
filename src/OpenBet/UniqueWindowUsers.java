package OpenBet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueWindowUsers {

	public static void main(String[] args) {
		
		List<Bet> bets = new ArrayList<>();
		
		Bet b = new Bet();
		b.setUserId(10);
		b.setTime(100);
		bets.add(b);
		
		Bet b1 = new Bet();
		b1.setUserId(20);
		b1.setTime(110);
		bets.add(b1);
		
		
		Bet b2 = new Bet();
		b2.setUserId(10);
		b2.setTime(150);
		bets.add(b2);
		
		Bet b3 = new Bet();
		b3.setUserId(30);
		b3.setTime(155);
		bets.add(b3);
		
		int window = 160;
		
		Set<Integer> user = new HashSet<>();
		
		for(Bet bs:bets) {
			if(!user.contains(bs.getUserId()) && bs.getTime()<window) {
				user.add(bs.getUserId());
			}
			
		}
		
		System.out.println("Unique users : "+user.size());
		
		
		
		

	}

}
