package hk.edu20250723.day15;

import java.util.ArrayList;
import java.util.List;

//Card 52장이 담긴 List객체를 가지고 있는 클래스 구현
public class D2_CardCase {
	
	//card 객체를 저장할 List 멤버필드 정의
	private List<D2_Card> cards;
	
	//카드의 총 장수 저장
	//							  static: 클래스명.멤버필드
	private static final int NUMOFCARDS=D2_Card.DECK.length*D2_Card.STECK.length;
	
	public D2_CardCase() {
		cards=new ArrayList<D2_Card>();
		shuffle();
	}
	
	//카드를 생성해서 cards(List 객체)에 저장하는 메서드
	public void shuffle() {
		int i=0;
		while(true) { //D2_Card.card.equals(D2_Card.card)
			D2_Card cc = new D2_Card(); //카드 한 장 만들어지는 개념
			if(!cards.contains(cc)) { //Cards에 중복된 card가 없다면
				cards.add(cc); //card를 추가하자
				i++;
			}
			if(i==NUMOFCARDS) {
				break;
			}
		}	
	}
	public List<D2_Card> getCards(){
		return cards;
	}
}
