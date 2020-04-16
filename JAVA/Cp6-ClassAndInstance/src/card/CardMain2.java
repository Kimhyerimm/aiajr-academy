package card;

public class CardMain2 {

	public static void main(String[] args) {

		for(int i=0; i<4; i++) {
			for(int j=1; j<4; j++) {
				
				String kind = "";
				
				switch(i) {
				case 0:
					kind = "Spade";
					break;
				case 1:
					kind = "Clover";
					break;
				case 2:
					kind = "Diamond";
					break;
				case 3:
					kind = "Heart";
					break;
				}
				
				Card c = new Card();
				c.kind = kind;
				c.number = j;
					
				System.out.println("카드의 높이가" +Card.height+ "폭이 " +Card.width+ "인 카드 " +c.kind+ " " +c.number);
				}
			}
		}

	}


