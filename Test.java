import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, sum = 0, max = -999999, min = 999999;
        System.out.println("ใส่เลขไรก็ใส่จะหยุดใส่-1ให้มันหยุด");

        while (true) {
            int num = sc.nextInt();
            if (num == -1)
                break;
            count++;
            sum += num;
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        if (count == 0) {

            System.out.println("ไม่มีข้อมูล");
        } else {
            double avg = (double) sum / count;
            System.out.println("จำนวน: " + count);
            System.out.println("รวม: " + sum);
            System.out.println("ค่าเฉลี่ย: " + avg);
            System.out.println("สูงสุด: " + max);
            System.out.println("ต่ำสุด: " + min);
        }
    }
}
