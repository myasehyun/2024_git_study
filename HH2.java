import java.util.Scanner;
import java.util.Calendar;

public class HH2 { 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		int birthYear, birthMonth,birthDay, admission, age = 20, thisYear, thisMonth,thisDay, grade;
		String name, city, gu, dong, university, major;
		
		System.out.print("이름:");
		name = in.next();
		
		System.out.print("생년:");
		birthYear = in.nextInt();
		
		System.out.print("생일:");
		birthMonth = in.nextInt();
		birthDay = in.nextInt();
		
		
		System.out.println("주소");		
		System.out.print(" 시:");
		city = in.next();
		
		System.out.print(" 구:");
		gu = in.next();
		
		System.out.print(" 동:");
		dong = in.next(); 
		
		System.out.print("대학교:");
		university = in.next();
		
		System.out.print("학과:");
		major = in.next();
		
		System.out.print("입학년도:");
		admission = in.nextInt();
		
		thisYear = cal.get(Calendar.YEAR); // 올해 년도를 받아오는 코드
		thisMonth = cal.get(Calendar.MONTH); // 이번 달이 몇 월인지 데이터를 받아오는 코드
		thisDay = cal.get(Calendar.DAY_OF_MONTH);
		if (thisMonth > birthMonth||(thisMonth == birthMonth && thisDay >= birthDay)) {
	
		}
		else age = thisYear - birthYear - 1;
		grade = thisYear - admission+1; 
		
		System.out.printf("%s(만,%d세)학생은 %s %s에 %d학년으로 재학중이다.\n", name, age, university, major, grade); 
		System.out.printf("\"%s %s %s\"에 거주 중이다.", city, gu, dong);
		
		in.close();
	}
}
