public class Lesson_number_3 {
    public static void main(String[] args){
        under_dog r = new under_dog();
        r.Scan();
        r.jojo=count(r.jojo);
        r.dio=count(r.dio);
        System.out.println(r.jojo);
        System.out.println(r.dio);
    }
    private static int count(int x){
        return x=x+1;
    }

}