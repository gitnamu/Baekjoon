import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static int[][] temp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		Student[] arr = new Student[n];
		
		for(int i=0;i<n;i++) {
			String name = sc.next();
			int korean = sc.nextInt();
			int english = sc.nextInt();
			int math = sc.nextInt();
			
			arr[i] = new Student(name,korean,english,math);
		}
		
		Arrays.sort(arr, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.korean() != o2.korean()) return o2.korean() - o1.korean();
				else if(o1.english() != o2.english()) {
					return o1.english() - o2.english();
				}else if(o1.math() != o2.math()) {
					return o2.math() - o1.math();
				}else {
					for(int i=0;i<o1.name().length();i++) {
						if(o1.name().charAt(i) != o2.name().charAt(i)) {
							return o1.name().charAt(i) - o2.name().charAt(i);
						}
					}
					return 0;
				}
			}
		});
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i].name());
		}
	}
	
	static class Student{
		String _name;
		int _korean;
		int _english;
		int _math;
		
		private Student(String name, int korean, int english, int math) {
			this._name = name;
			this._korean = korean;
			this._english = english;
			this._math = math;
		}
		
		private String name() {
			return this._name;
		}
		private int korean() {
			return this._korean;
		}
		private int english() {
			return this._english;
		}
		private int math() {
			return this._math;
		}
	}
}
