public class Lesson_number_4 {
    public static void main(String[] args){
        under_dog r = new under_dog();
        r.Scan();
        r.jojo=count(r.jojo);
        r.dio=count(r.dio);
        r.Scan(r.jojo, r.dio);
    }
    private static int count(int x){
        return x+1;
    }

}