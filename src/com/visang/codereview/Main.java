package com.visang.codereview;

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
        int result = 0;
        //TODO fruits 배열에서 2글자로 된 단어의 총 개수를 result 변수에 저장하는 함수 내용을 작성해주세요. test
        int a = 0;
        int b = 0;



        return result;
    }

    /**
     * "바나나" 가 몇 번 나왔는지 알아내는 함수
     * @param fruits
     * @return
     */
    private static int getCountAllBananas(String[] fruits) {
        int result = 0;

        //TODO fruits 배열에서 "바나나" 의 총 개수를 result 변수에 저장하는 함수 내용을 작성해주세요.

        return result;
    }

    /**
     * 중복을 제거하여 문자열 배열을 반환하는 함수
     * @param fruits
     * @return
     */
    private static String[] getStringArrayWithoutOverlap(String[] fruits) {
        String[] result = new String[fruits.length];

        //TODO fruits 배열에서 중복이 되지 않는 항목들만 result 변수에 저장하는 함수 내용을 작성해주세요.
        int a = 000000;

        return result;
    }

    /**
     * "애플" 이 포함된 단어의 개수를 알아내는 함수
     * @param fruits
     * @return
     */
    private static int getCountContainApple(String[] fruits) {
        int result = 0;

        //TODO fruits 배열에서 "애플"문자열을 포함하는 총 개수를 result 변수에 저장하는 함수 내용을 작성해주세요.

        return result;
    }
}
