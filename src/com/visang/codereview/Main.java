package com.visang.codereview;

import java.util.TreeSet;

/**
 * 문제 제시
 * 1.	주어진 배열을 가지고 아래 문제에 대한 소스코드를 작성해주세요.
 *      String[] fruits = {"애플", "포도", "감", "바나나", "파인애플", "귤", "바나나", "키위", "바나나"};
 * A.	한글 2글자로 된 단어의 개수를 알아내는 함수
 * B.	"바나나" 가 몇 번 나왔는지 알아내는 함수
 * C.	중복을 제거하여 문자열 배열을 반환하는 함수
 * D.	"애플" 이 포함된 단어의 개수를 알아내는 함수
 */
public class Main {

    public static void main(String[] args) {
	    //TODO 아래 제시된 함수가 원하는 결과를 콘솔화면에 출력하도록 함수 내용을 완성해주세요.
        String[] fruits = {"애플", "포도", "감", "바나나", "파인애플", "귤", "바나나", "키위", "바나나"};

        int result1 = getCountTwoLengthCorrectly(fruits);
        int result2 = getCountAllBananas(fruits);
        String[] result3 = getStringArrayWithoutOverlap(fruits);
        int result4 = getCountContainApple(fruits);

        System.out.println(result1); // 원하는 결과: 3
        System.out.println(result2); // 원하는 결과: 3
        for (String fruit : result3) {
            System.out.print(fruit + " "); // 원하는 결과: 애플 포도 감 바나나 파인애플 귤 키위
        }
        System.out.println(result4); // 원하는 결과: 2
    }

    /**
     * 한글 2글자로 된 단어의 개수를 알아내는 함수
     * @param fruits 설명을 적어라
     * @return
     */
    private static int getCountTwoLengthCorrectly(String[] fruits) {
        String testFriend = "For testing commit2";
        int result = 0;
        for (String fruit : fruits) {
            if(fruit.length() == 2) {
                result++;
            }
        }
        return result;
    }

    /**
     * "바나나" 가 몇 번 나왔는지 알아내는 함수
     * @param fruits
     * @return
     */
    private static int getCountAllBananas(String[] fruits) {
        int result = 0;
        String word = "바나나";

        for (String fruit : fruits) {
            if(fruit.contentEquals(word)) {
                result++;
            }
        }

        return result;
    }

    /**
     * 중복을 제거하여 문자열 배열을 반환하는 함수
     * @param fruits
     * @return
     */
    private static String[] getStringArrayWithoutOverlap(String[] fruits) {
        String[] result;
        TreeSet<String> ts = new TreeSet<>();

        for (String fruit : fruits) {
            ts.add(fruit);
        }

        result = ts.toArray(new String[fruits.length]);
        return result;
    }

    /**
     * "애플" 이 포함된 단어의 개수를 알아내는 함수
     * @param fruits
     * @return
     */
    private static int getCountContainApple(String[] fruits) {
        int result = 0;

        for (String fruit : fruits) {
            if (fruit.contains("애플")) {
                result++;
            }
        }

        return result;
    }
}
