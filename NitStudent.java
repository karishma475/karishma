public class NitStudent {
	int rollNo;
	String name;
	int maths;
	int sci;
	int eng;

	int fee;
	int attd;
	public NitStudent(int rollNo, String name, int maths, int sci, int eng, int fee, int attd) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;
		this.fee = fee;
		this.attd = attd;
	}

	@Override
	public String toString() {
		return "NitStudent [rollNo=" + rollNo + ", name=" + name + ", maths=" + maths + ", sci=" + sci + ", eng=" + eng
				+ ", fee=" + fee + ", attd=" + attd + "]";
	}

}

public class StudentMarks {

	static int getRandomNo(int max, int min) {

		int range = max - min + 1;

		return (int) (Math.random() * range) + min;

	}

	
		int max = 350;

		NitStudent[] allStus = new NitStudent[max];

		for (int i = 0; i < max; i++) {
			allStus[i] = new NitStudent(getRandomNo(1000, 500), "Stu" + getRandomNo(0, 100), getRandomNo(60, 90),
					getRandomNo(0, 80), getRandomNo(50, 100), getRandomNo(20000, 45000), getRandomNo(30, 69));

		}

		for (int i = 0; i < max; i++) {
			System.out.println(allStus[i]);
		}

		System.out.println("All Student Passed List....");
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		getAllPassedStudentList(allStus);
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		
		System.out.println("All Student Failed in Science List....");
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		getAllFailedSubStudentList(allStus,"sci");
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		
		
	}

	private static void getAllFailedSubStudentList(NitStudent[] allStus, String string) {
		

		NitStudent eachStu;
		for (int i = 0; i < allStus.length; i++) {
			eachStu = allStus[i];
			if (
					(eachStu.sci < 35)  
					
				) {
				
				System.out.println(eachStu);

			}
		}

		
	}

	private static void getAllPassedStudentList(NitStudent[] allStus) {

		NitStudent eachStu;
		for (int i = 0; i < allStus.length; i++) {
			eachStu = allStus[i];
			if ((eachStu.maths > 35) && 
					(eachStu.sci > 35) && 
					(eachStu.eng > 35)
				) {
				
				System.out.println(eachStu);

			}
		}

	}

}

	public static void main(String[] args) {
		

	}

}
