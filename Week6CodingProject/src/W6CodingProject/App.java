package W6CodingProject;

public class App {

	public static void main(String[] args) {

		Player playerA = new Player("A");
		Player playerB = new Player("B");
		Deck deck = new Deck();
		deck.shuffle();
		
		
		for(int i = 1; i < 52; i++) {
			if(i % 2 == 0) {
				playerA.draw(deck);
			}else {
				playerB.draw(deck);
			}
			
		}
		
		for(int i = 0; i < 26; i++) {
			Card playerACard = playerA.flip();
		    Card playerBCard = playerB.flip();
		    
		    if(playerACard.getValue() > playerBCard.getValue()) {
		    	playerA.incrementScore();
		    }else if(playerACard.getValue() < playerBCard.getValue()) {
		    	playerB.incrementScore();
		    }
		}
		System.out.printf("Player A score = %d\n", playerA.getScore());
		System.out.printf("Player B score = %d\n", playerB.getScore());
		if(playerA.getScore() > playerB.getScore()) {
			System.out.println("Player A wins!");
		} else if (playerA.getScore() < playerB.getScore()) {
			System.out.println("Player B wins!");
		} else {
			System.out.println("We have a Draw!");
		}
		
		}
	}

