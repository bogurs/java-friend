package com.visang.codereview;

import java.util.Arrays;
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
     *
     * @param fruits
     * @return
     */
    private static int getCountTwoLengthCorrectly(String[] fruits) {
        // check: String[] fruits) { : 띄어쓰기. { 앞에.
        // check: if는 중괄호 치
        int result = 0;

        // 람다는 성능 이슈 + 가독성
        // 람다의 가독성을 좋게 하는 방법
        // TODO 람다 찾아보기
        result = (int) Arrays.stream(fruits).filter(x -> x.length() == 2).count();

        return result;
    }

    /**
     * "바나나" 가 몇 번 나왔는지 알아내는 함수
     * @param fruits
     * @return
     */
    private static int getCountAllBananas(String[] fruits) {
        int result = 0;
        // TODO equals 와 ==의 차이 정리하기.
        // 검색어: ==과 equals
        // TODO 고랭을 한 번 간단히 보자. 문법 20개 쯤
        // 나쁜 네이밍을 쓰지 말자. 예. 파라메터 x
        result = (int) Arrays.stream(fruits).filter(fruit -> fruit == "바나나").count();
        return result;
    }

    /**
     * 중복을 제거하여 문자열 배열을 반환하는 함수
     * @param fruits
     * @return
     */
    private static String[] getStringArrayWithoutOverlap(String[] fruits) {
        String[] result;

        // TODO lambda String[]::new
        result = Arrays.stream(fruits).distinct().toArray(String[]::new);

        return result;
    }

    /**
     * "애플" 이 포함된 단어의 개수를 알아내는 함수
     * @param fruits
     * @return
     */
    private static int getCountContainApple(String[] fruits) {
        int result = 0;

        //TODO lambda 사용법

        return result;
    }

    // TODO:
    // next Week : '혼자서 공부하는 자바'
    // collection framework 556p
}
