import java.util.*;

public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] course = new Course[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            int quiz = sc.nextInt();
            int handson = sc.nextInt();
            String cName = sc.nextLine();
            String cAdmin = sc.nextLine();
            course[i] = new Course(id, quiz, handson, cName, cAdmin);
        }

        String admin = sc.nextLine();
        int ans1 = findAvgOfQuizByAdmin(course, admin);
        if (ans1 != 0) {
            System.out.println(ans1);
        } else {
            System.out.println("No Course found");
        }
        int hands=sc.nextInt();
        Course[] ans2= sortCourseByHandsOn(course, hands);
        if(ans2!=null){
            for(int i=0;i<ans2.length;i++){
                System.out.println(ans2[i].getName());
            }
        }else{
            System.out.println("No courses found");
        }

    }

    public static Course[] sortCourseByHandsOn(Course[] courses, int hands){

    }

    public static int findAvgOfQuizByAdmin(Course[] course, String str) {
        int sum = 0, count = 0;
        for (int i = 0; i < course.length; i++) {
            if (course[i].getAdmin().equalsIgnoreCase(str)) {
                sum += course[i].getQuiz();
                count++;
            }
        }
        if (count > 0) {
            int avg = sum / count;
            return avg;
        } else {
            return 0;
        }
    }
}

class Course {
    private int courseId, qiuz, handson;
    private String courseName, courseAdmin;

    Course(int courseId, int quiz, int handson, String courseName, String courseAdmin) {
        this.courseId = courseId;
        this.qiuz = quiz;
        this.handson = handson;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
    }

    // setter
    public void setId(int courseId) {
        this.courseId = courseId;
    }

    // getter
    public int getId() {
        return courseId;
    }

    public void setQuiz(int quiz) {
        this.qiuz = quiz;
    }

    public int getQuiz() {
        return quiz;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }

    public int getHandson() {
        return handson;
    }

    public void setName(String courseName) {
        this.courseName = courseName;
    }

    public String getName() {
        return courseName;
    }

    public void setAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public String getAdmin() {
        return courseAdmin;
    }
}