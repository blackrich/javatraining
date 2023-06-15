package homework;

import java.math.*;
import java.util.*;

public class ex2 {

	public static void main(String[] args) {
		
        Set<Integer> numbers = new HashSet<>();

        Random random = new Random();

        while (numbers.size() < 6) {
            int randomNumber = random.nextInt(45) + 1;
            numbers.add(randomNumber);
        }

        System.out.println("랜덤으로 선택된 숫자: " + numbers);
		
	}
}
