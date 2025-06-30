import java.math.BigInteger;
import java.util.*;
import pack1.Course;
import pack1.Instructor;
import pack1.Student;

public class AdminCourse 
{
    private static final String ADMIN_NAME = "Admin";
    private static String password = "TrueId@123";
    private static final BigInteger MOB_NUM = new BigInteger("9876543210");
    private int attempts = 3;
    static  Scanner sc = new Scanner(System.in);

    static List<Student> students = new ArrayList<>();
    static List<Course> courses = new ArrayList<>();
    static List<Instructor> instructors = new ArrayList<>();
    static Map<String,String> assign=new HashMap<>();
    static HashMap<Integer, Map<String,String>> enrollments = new HashMap<>(); 
    
    static 
    {
        courses.add(new Course(201, "Java", 10));
        courses.add(new Course(202, "Python", 5));
        courses.add(new Course(203, "Data Science", 6));
    }
    static 
    {
        instructors.add(new Instructor(301, "John", "Java"));
        instructors.add(new Instructor(302, "Prasad", "Python"));
        instructors.add(new Instructor(303, "Shiva", "Machine Learning"));
        instructors.add(new Instructor(304, "Amala", "Data Science"));

    }
    public void viewCourses()
    {
        for(Course c:courses)
        {
            System.out.println(c);
        }
    }
    public void viewInstructors()
    {
        for(Instructor i:instructors)
        {
            System.out.println(i);
        }
    }
    public void loginSystem() 
    {
        System.out.println("--- Admin Login ---");
        while (attempts > 0) 
        {
            System.out.print("Enter Username: ");
            String name = sc.nextLine();
            if (name.equals(ADMIN_NAME)) 
            {
                if (authenticate()) {
                    System.out.println("------- Admin Login Successfully -------");
                    selectOption();
                    return;
                }
            } else {
                System.out.println("Incorrect Username. Attempts Remaining: " + (--attempts));
            }
        }
        System.out.println("Account Blocked.");
    }

    private boolean authenticate() 
    {
        System.out.print("Enter Password: ");
        String inputPassword = sc.nextLine();
        if (inputPassword.equals(password)) 
        {
            return true;
        }

        System.out.println("Wrong Password. Reset Required.");
        resetPassword();
        return false;
    }

    private void resetPassword() 
    {
        System.out.print("Enter Your Mobile Number: ");
        BigInteger phoneNum = new BigInteger(sc.nextLine());
        while (!MOB_NUM.equals(phoneNum)) 
        {
            System.out.println("Incorrect Mobile Number. Try Again.");
            phoneNum = new BigInteger(sc.nextLine());
        }
        System.out.print("Set New Password: ");
        password = sc.nextLine();
    }
    void selectOption() 
    {
        while (true) 
        {
            System.out.println("1) Add Student");
            System.out.println("2) View Courses ");
            System.out.println("3)View Instructors");
            System.out.println("4) Add Course");
            System.out.println("5) Add Instructor");
            System.out.println("6) Assign Instructor");
            System.out.println("7) Enroll Student");
            System.out.println("8) View Reports");
            System.out.println("9) Exit");
            System.out.print("Enter your choice: ");
            int n = sc.nextInt();
            sc.nextLine();

            switch (n) 
            {
                case 1 -> addStudent();
                case 2 -> viewCourses();
                case 3 -> viewInstructors();
                case 4 -> addCourse();
                case 5 -> addInstructor();
                case 6 -> assignInstructor();
                case 7 -> enrollStudent();
                case 8 -> viewReports();
                case 9 -> 
                {
                    System.out.println("Exiting..."); return;
                }
                default -> System.out.println("Invalid choice. Please enter again.");
            }
        }
    }

    void addStudent() 
    {
        System.out.print("Enter Student ID: ");
        int Sid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String Sname = sc.nextLine();
        System.out.print("Enter Student Email: ");
        String Smail = sc.nextLine();
        students.add(new Student(Sid, Sname, Smail));
        enrollments.put(Sid, new HashMap<>());
        System.out.println("Student Added Successfully!");
    }

    void addCourse() 
    {
        System.out.print("Enter Course ID: ");
        int Cid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course Name: ");
        String Cname = sc.nextLine();
        System.out.print("Enter Course Duration (in months): ");
        int duration = sc.nextInt();
        courses.add(new Course(Cid, Cname, duration));
        System.out.println("Course Added Successfully!");
    }

    void addInstructor() 
    {
        System.out.print("Enter Instructor ID: ");
        int Iid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Instructor Name: ");
        String Iname = sc.nextLine();
        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();
        instructors.add(new Instructor(Iid, Iname, specialization));
        System.out.println("Instructor Added Successfully!");
    }

    void assignInstructor() 
    {
        System.out.print("Enter Course ID to assign instructor: ");
        int Cid = sc.nextInt();
        System.out.print("Enter Instructor ID: ");
        int Iid = sc.nextInt();

        Course course = null;
        for (Course c : courses) 
        {
            if (c.getCid() == Cid) 
            {
                course = c;
                break;
            }
        }

        Instructor instructor = null;
        for (Instructor i : instructors) 
        {
            if (i.getIid() == Iid) 
            {
                instructor = i;
                break;
            }
        }

        if (course != null && instructor != null) 
        {
            System.out.println(course.getCname());
            assign.put(course.getCname().toLowerCase(),instructor.getIname());
            System.out.println("Instructor Assigned Successfully");
        } 
        else 
        {
            System.out.println("Invalid Course ID or Instructor ID.");
        }
    }

    void enrollStudent() 
    {
        System.out.print("Enter Student ID: ");
        int Sid = sc.nextInt();
        System.out.print("Enter Course Name: ");
        String CName = sc.next().toLowerCase();

        if(!assign.containsKey(CName))
        {
            System.out.println("This Course has no Instructor");
            return;
        }
        if(!enrollments.containsKey(Sid))
        {
            System.out.println("Student with ID "+ Sid +" not registered");
            return;
        }
        enrollments.get(Sid).put(CName, assign.get(CName));
        System.out.println("--------Student Enrolled Successfully-------");
    }

    void viewReports() 
    {
        System.out.println("1 Student Report:");
        System.out.println("2 Course Report:");
        System.out.println("3.Instructor Report:");
        System.out.println("4 Enrollment Report:");
        int n=sc.nextInt();
        sc.nextLine();
        switch (n) {
            case 1 -> 
            {
                for (Student student : students)
                {
                    System.out.println(student);
                }
            }
            case 2 -> 
            {
                for (Course course : courses)
                {
                    System.out.println(course);
                }
            }
            case 3 -> 
            {
                for (Instructor instructor : instructors)
                {
                    System.out.println(instructor);
                }
            }
            default -> {
                for (Map.Entry<Integer, Map<String, String>> entry : enrollments.entrySet()) {
                    int studentId = entry.getKey();
                    Map<String, String> courses = entry.getValue();
            
                    if (courses.isEmpty()) 
                    {
                        System.out.println("Student ID: " + studentId + " - Not Enrolled Yet");
                    } 
                    else 
                    {
                        System.out.println("Student ID: " + studentId + " - Enrolled in Courses: " + courses);
                    }
                }
            }
            
        }
}
}

   