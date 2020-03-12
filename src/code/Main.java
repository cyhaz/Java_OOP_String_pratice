package code;

public class Main {

	public static void main(String[] args) {
		
//		< String.format() >
//		1. "2 X 1 = 2" 출력
		int num1 = 2;
		int num2 = 1;
		// String.format("출력양식", 양식에들어갈변수들차례대로)
			// %d -> 정수 int 자리에 대입
			// %f -> 실수 double 자리에 대입 -> %.nf (n == 소수점자리)
			// %s -> 문자열 String 자리에 대입
			// => "2 X 1 = 2"은 "%d X %d = %d"와 같이 작성
		System.out.println(String.format("%d X %d = %d", num1, num2, num1*num2));  // 출력 : 2 X 1 = 2

//		2. 신상정보 "이사랑 - 25세, 170.3cm" 출력
		String name = "이사랑";
		int age = 25;
		double height = 170.3;
		// String.format("출력양식", 양식에들어갈변수들차례대로)
		// 따로 변수 지정
		String message = String.format("%s - %d세, %.1fcm", name, age, height);
		System.out.println(message);  // 출력 : 이사랑 - 25세, 170.3cm
		
		
//		< String 객체지향 응용문제 >
//		1. hello 변수를 모두 소문자로 출력
		String hello = "Hello World!!";
		// String class의 toLowerCase() 메쏘드 사용
		hello = hello.toLowerCase();
		System.out.println(hello);  // 출력 : hello world!!
		
		
//		< split >
//		1. 신상정보를 String배열로 받아 따로 출력
		String userInfo = "이사랑,1996,010-1111-2222";
		// ,를 기준으로 쪼개서 String배열로 받기
		// String변수.split("분리기준")
		//  => String변수 분리기준은 ","뿐 아니라 한글자가 아닌 것도 가능 (ex. /##/)
		String[] userInfoArray = userInfo.split(",");
		// userInfoArray 출력
		System.out.println(userInfoArray[0]);  // 출력 : 이사랑
		System.out.println(userInfoArray[1]);  // 출력 : 1996
		System.out.println(userInfoArray[2]);  // 출력 : 010-1111-2222

//		2. 해시태그 출력
		String hashTagStr = "우리집/./강아지/./바니";
		String[] tags = hashTagStr.split("/./");
		for (String tag : tags) {
			System.out.println(String.format("#%s", tag));
		}
		// 출력 : #우리집   #강아지   #바니
		
//		< replace() >
//		1. replace()로 교시 확인하기
		// 1교시는 국어 / 2교시는 수학
		// 변경할변수.replace("찾을문구", "바꿔줄문구")
		// => 찾을문구를 찾아서 바꿔줄문구로 치환 (원본을 바꾸는게 아닌, 바뀐 새로운 문장을 리턴)
		String classnInfo = "1교시는 국어입니다.";
		String newPeriodInfo = classnInfo.replace("1", "2");
		String newSubjectInfo = newPeriodInfo.replace("국어", "수학");
		// 출력
		System.out.println(classnInfo);  // 출력 : 1교시는 국어입니다.
		System.out.println(newPeriodInfo);  // 출력 : 2교시는 국어입니다.
		System.out.println(newSubjectInfo);  // 출력 : 2교시는 수학입니다.
		
		
//		< 응용문제. 학생 수 출력 >
//		1. studentListStr에 적힌 사람 수 출력
		String studentListStr = "김**,이**,박**,최**,황**,서**,유**,정**,장**,왕**,양**,민**,지**";
		// 변수 쪼개서 배열로 받기 (,로 분리)
		String[] studentListStrArray = studentListStr.split(",");
		// String.format으로 출력양식 작성 후, 배열길이를 변수로 넣기
		System.out.println(String.format("학생은 총 %d명입니다.", studentListStrArray.length));
		// 출력 : 학생은 총 13명입니다.
		
//		2. studentListStr에 적힌 "이"씨 학생은 몇 명일까?
		int leeCount = 0;
		// for문으로 studentListArray에서 학생 이름을 하나씩 꺼내보기 -> studentName에 담기
		for (String studentName : studentListStrArray) {
			// startsWith(찾는내용) => 배열에서 꺼낸 이름 중 찾는내용으로 "시작"하는 이름을 찾으면 leeCount++;
			if (studentName.startsWith("이")) {
				leeCount++;
			}
		}
		System.out.println(String.format("이씨 학생은 총 %d명입니다.", leeCount));
		// 출력 : 이씨 학생은 총 1명입니다.
	}

}