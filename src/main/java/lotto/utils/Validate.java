package lotto.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validate {
    public static int purchaseAmount(String userInput) {
        try {
            int amount = Integer.parseInt(userInput);

            if (amount % 1000 != 0) {
                throw new IllegalArgumentException("[ERROR] 1000원 단위로 입력 하세요.");
            }

            return amount;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 유효한 숫자를 입력 하세요.");
        }
    }

    public static int lotteryNumber(String numberString) {
        try {
            int number = Integer.parseInt(numberString);

            if (number < 0 || number > 45) {
                throw new IllegalArgumentException("[ERROR] 1 ~ 45 사이의 로또 번호를 입력 하세요.");
            }

            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 유효한 숫자를 입력 하세요.");
        }
    }

    public static void hasDuplicateNumbers(List<Integer> numbers) {
        Set<Integer> numberSet = new HashSet<>();
        for (Integer number : numbers) {
            if (numberSet.contains(number)) {
                throw new IllegalArgumentException("[ERROR] 숫자를 중복 되지 않게 입력 하세요.");
            }

            numberSet.add(number);
        }
    }

}
