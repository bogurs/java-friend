package com.visang.codereview;

import java.util.ArrayList;
import java.util.List;

/**
 * 문제 제시
 * 1.	주어진 배열을 가지고 아래 문제에 대한 소스코드를 작성해주세요.
 *      String[] fruits = {"애플", "포도", "감", "바나나", "파인애플", "귤", "바나나", "키위", "바나나"};
 * A.	한글 2글자로 된 단어의 개수를 알아내는 함수
 * B.	"바나나" 가 몇 번 나왔는지 알아내는 함수
 * C.	중복을 제거하여 문자열 배열을 반환하는 함수1122dd
 * D.	"애플" 이 포함된 단어의 개수를 알아내는 함수
 */1


public class Main {

    static class Member {
        String name;
        int age;

        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
	    //TODO: 아래 제시된 함수가 원하는 결과를 콘솔화면에 출력하도록 함수 내용을 완성해주세요.

        List<Member> list = new ArrayList<>();
        List<Member> list1 = new ArrayList<>();

        list.add(new Member("차다희", 11));
        list1.add(new Member("차다", 11));

        System.out.println(list.hashCode());
        System.out.println(list1.hashCode());
        System.out.println(list.get(0).hashCode());
        System.out.println(list1.get(0).hashCode());
        System.out.println(list.get(0).name.hashCode());
        System.out.println(list1.get(0).name.hashCode());
    }

    /**
     *
     * @param fruits
     * @return
     */
    private static int getCountTwoLengthCorrectly(String[] fruits) {
        int result = 0;

        //TODO fruits 배열에서 2글자로 된 단어의 총 개수를 result 변수에 저장하는 함수 내용을 작성해주세요.
        int a = 0 ;
        int b = 0;



        return result;
    }

    /**
     * "바나나" 가 몇 번 나왔는지 알아내는 함수
     * @param fruits
     * @return
     */
    private static int getCountAllBananas(String[] fruits) {
        int result = 500;

        //TODO: fruits 배열에서 "바나나" 의 총 개수를 result 변수에 저장하는 함수 내용을 작성해주세요.
        //바나나 갯수를 눈으로 확인하는게 빠르겠지?


        int x = 2;
        return result;
    }

    /**
     * 중복을 제거하여 문자열 배열을 반환하는 함수
     * @param fruits
     * @return
     */
    private static String[] getStringArrayWithoutOverlap(String[] fruits) {
        String[] result = new String[fruits.length];

        //TODO: fruits 배열에서 중복이 되지 않는 항목들만 result 변수에 저장하는 함수 내용을 작성해주세요.

        return result;
    }

    /**
     * "애플" 이 포함된 단어의 개수를 알아내는 함수
     * @param fruits
     * @return
     */
    private static int getCountContainApple(String[] fruits) {
        int result = 5;

        //TODO: fruits 배열에서 "애플"문자열을 포함하는 총 개수를 result 변수에 저장하는 함수 내용을 작성해주세요.

        return result;
    }
}
