package 장난감뽑기;

import java.util.Random;

public class ToyMain {

	public static void main(String[] args) {
		
		RandomToyMachine rtm = new RandomToyMachine();
		Random r = new Random();
		Ball b = new Ball();
		Train t = new Train();
		Gun g = new Gun();
		
		
		//ball, train, gun 장난감 1개씩 추가.(3)
		rtm.addToy(b);
		rtm.addToy(t);
		rtm.addToy(g);
		//2. 랜덤으로 장난감 하나 반환받아서 해당 장난감의 play 메소드 호출
		
		Toy random_toy = rtm.getToy();
		random_toy.play();
		
		
	}

}
