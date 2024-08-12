package ch05.sec05;

public class CharAtExample2 {

    public static void main(String[] args) {
        String today = "20240812";  // 오늘 날짜
        String juminNum = "721222-1051454";  // 주민등록번호 예시 (90년대생)

        // 출생 연도 계산 (charAt을 사용하여 개별 숫자 가져오기)
        int birthYear = (juminNum.charAt(0) - '0') * 10 + (juminNum.charAt(1) - '0');

        // 성별 코드에 따른 세기 구분
        char genderCode = juminNum.charAt(7);
        if (genderCode == '1' || genderCode == '2') {
            birthYear += 1900;
        } else if (genderCode == '3' || genderCode == '4') {
            birthYear += 2000;
        }

        // 현재 연도 계산 (charAt을 사용하여 개별 숫자 가져오기)
        int currentYear = (today.charAt(0) - '0') * 1000 +
                          (today.charAt(1) - '0') * 100 +
                          (today.charAt(2) - '0') * 10 +
                          (today.charAt(3) - '0');

        // 나이 계산
        int age = currentYear - birthYear;

        // 요금 계산
        int fare = (age < 18) ? 500 : (age >= 60) ? 0 : 1000;

        // 결과 출력
        System.out.println("나이: " + age + "세");
        System.out.println("지하철 요금: " + fare + "원");
    }
}