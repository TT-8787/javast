import java.util.Scanner;

public class fenzhi2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入信用分");
        int grade = myScanner.nextInt();
        if(grade==100){
            System.out.println("信用极好");
        } else if (grade >80&& grade<=99) {
            System.out.println("信用优秀");
        } else if (grade >60&&grade<=80){
            System.out.println("信用一般");
        } else if(grade<=60&&grade>=0){
            System.out.println("信用不及格");
        }
        else {
            System.out.println("无效输入");
        }
    }
}
