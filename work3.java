public class work3 {
    public static void main(String[] args ){
        int i = 1;
        i = i++; //��1��temp=i��2��i=i+1 (3)i=temp
        System.out.println(i);

        int j=1;
        j=++j;//(1)j=j+1;(2)temp=j (3)j=temp
        System.out.println(i);


        int i1=10;
        int i2=20;
        int i3=i1++;//��ֵ��+
        System.out.println("i="+i3);
        System.out.println("i2="+i2);
        i3=--i2;//��-�ٸ�ֵ
        System.out.println("i="+i3);
        System.out.println("i2="+i2);


        int Days=57;
        int week = Days/7;
        int leftDays = Days%7;
        System.out.println("��"+week+"������"+leftDays+"��");

        double Fahrenheit = 456.4;
        double Celsius = 5.0/9*(Fahrenheit - 100);
        System.out.println("���϶�Ϊ��"+Fahrenheit+"��"+"���϶�Ϊ��"+Celsius);
    }
}

