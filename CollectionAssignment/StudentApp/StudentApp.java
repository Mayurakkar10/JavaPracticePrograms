package StudentApp;

import java.util.*;

public class StudentApp {
	public static void main(String[] args) {
		Vector<Student> v = new Vector<Student>();
		v.add(new Student(1, "rakesh", 60));
		v.add(new Student(2, "mukesh", 44));
		v.add(new Student(4, "suresh", 50));
		v.add(new Student(5, "ganesh", 70));
		v.add(new Student(3, "rajesh", 55));

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("===============Welcome to Student App===============");
			System.out.println("1. Add Student in Vector");
			System.out.println("2. Show all student in vector");
			System.out.println("3. Delete student using id");
			System.out.println("4. Search student using it's id or name");
			System.out.println("5. Sort all students record in desceding order");
			System.out.println("6. Find second and third topper");
			System.out.println("7. Find student who have maximum marks: ");
			System.out.println("8. Find student whose marks between 50 to 70");
			System.out.println("9. Find student whose name is same: ");
			System.out.println("10.Find student who having same marks and same name");
			System.out.println("====================================================");
			System.out.println("Enter choice: ");
			int choice = sc.nextInt();
			Student st = new Student();
			switch (choice) {
			case 1:
				System.out.println("\nEnter id,name,per: ");
				int id = sc.nextInt();
				String name = sc.next();
				int per = sc.nextInt();
				v.add(new Student(id, name, per));
				break;
			case 2:
				System.out.println("================StudentApp========================");
				System.out.println("Id  Name     Per");
				for (Student student : v) {
					System.out.println(student.getId() + "   " + student.getName() + "   " + student.getPer());
				}
				System.out.println("==================================================");
				break;
			case 3:
				System.out.println("\nEnter id to delete");
				int sid = sc.nextInt();
				Student studentToRemove = null;
				for (Student std : v) {
					if (sid == std.getId()) {
						studentToRemove = std;
						break;
					}
				}

				if (studentToRemove != null) {
					v.remove(studentToRemove);
					System.out.println("Removed successfully....");
				} else {
					System.out.println("Not found");
				}

				break;
			case 4:
				System.out.println("1. Search by id: ");
				System.out.println("2. Search by name: ");
				System.out.println("Enter choice: ");
				int searchChoice = sc.nextInt();
				Student stdt = null;
				switch (searchChoice) {
				case 1:
					System.out.println("Enter search id: ");
					int searchid = sc.nextInt();
					for (Student std : v) {
						if (searchid == std.getId()) {
							System.out.println("found");
							stdt = std;
						}
					}
					if (stdt != null) {
						System.out.println(stdt.getId() + " " + stdt.getName() + " " + stdt.getPer());
					} else {
						System.out.println("Not found");
					}
					break;
				case 2:
					System.out.println("\nEnter Name to search: ");
					String str = sc.next();
					for (Student std : v) {
						if (std.getName().indexOf(str) != -1) {
							System.out.println(std.getId() + "  " + std.getName() + "  " + std.getPer());
						}
					}
					break;

				}
				break;
			case 5:
				System.out.println("================SortedStudentsRecord==============");
//		       v.sort((s1, s2) -> compare(s2.getPer(), s1.getPer()));
				System.out.println("1.SortById: ");
				System.out.println("2.SortByName: ");
				System.out.println("3.SortByPer: ");
				System.out.println("Enter choice: ");
				int sortChoice = sc.nextInt();
				switch (sortChoice) {
				case 1:
					Collections.sort(v, new IdComparator());
					break;
				case 2:
					Collections.sort(v, new NameComparator());
					break;
				case 3:
					Collections.sort(v, new PerComparator());
					break;
				}

				for (Student student : v) {
					System.out.println(student.getId() + " " + student.getName() + " " + student.getPer());
				}
				System.out.println("==================================================");
				break;

			case 6:
				Collections.sort(v, new PerComparator());
				for (int i = 0; i < 3; i++) {
					Student topper = v.get(i);
					System.out.println((i + 1) + " " + topper.getName() + " with " + topper.getPer() + "marks");
				}
				break;

			case 7:
				Student maxStudent = null;
				
				for (Student std : v) {
					if (maxStudent == null || std.getId() > maxStudent.getId()) {
						maxStudent = std;
					}
				}
				System.out.println("Student with maximum marks: ");
				System.out.println("ID: " + maxStudent.getId() + " Name: " + maxStudent.getName() + " Per" + maxStudent.getPer());
			    break;
			    case 8: 
			    	 for(Student std: v) {
			    	     if(std.getPer()>=50 && st.getPer()<=70) {
			    	    	 System.out.println(std.getId()+ "  "+std.getName()+"  "+std.getPer()); 
			    	     }
			         }
			    	 break;
			    case 9:
			    	 boolean foundDuplicates = false;
			    	System.out.println("Students with the same name and marks:");
			        for (int i = 0; i < v.size(); i++) {
			            Student s1 = v.get(i);
			            for (int j = i + 1; j < v.size(); j++) {
			                Student s2 = v.get(j);
			                if (s1.getName().equals(s2.getName()) && s1.getPer() == s2.getPer()) {
			                    foundDuplicates = true;
			                    System.out.println("ID: " + s1.getId() + ", Name: " + s1.getName() + ", Marks: " + s1.getPer());
			                    System.out.println("ID: " + s2.getId() + ", Name: " + s2.getName() + ", Marks: " + s2.getPer());
			                }
			            }
			        }

			        if (!foundDuplicates) {
			            System.out.println("No students with the same name and marks found.");
			        }
			        break;
			} 
		} while (true);

	}
}
