package �峭���̱�;

import java.util.Random;

public class ToyMain {

	public static void main(String[] args) {
		
		RandomToyMachine rtm = new RandomToyMachine();
		Random r = new Random();
		Ball b = new Ball();
		Train t = new Train();
		Gun g = new Gun();
		
		
		//ball, train, gun �峭�� 1���� �߰�.(3)
		rtm.addToy(b);
		rtm.addToy(t);
		rtm.addToy(g);
		//2. �������� �峭�� �ϳ� ��ȯ�޾Ƽ� �ش� �峭���� play �޼ҵ� ȣ��
		
		Toy random_toy = rtm.getToy();
		random_toy.play();
		
		
	}

}
