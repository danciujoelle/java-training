package code._4_student_effort._2_foobarqix;

public class Main {
    public static void main(String[] args) {
       int n=3;
        System.out.println(compute(n));
        int n1=5;
        System.out.println(compute(n1));
        int n2=7;
        System.out.println(compute(n2));
        int n3=15;
        System.out.println(compute(n3));
        int n4=8;
        System.out.println(compute(n4));
        int n5=303;
        System.out.println(compute2(n5));
        int n6=10101;
        System.out.println(compute2(n6));
    }
    public static String compute(int number){
        StringBuilder result=new StringBuilder();
        int copy=number;
        if(number%3==0)
            result.append("Foo");
        if(number%5==0)
            result.append("Bar");
        if(number%7==0)
            result.append("Qix");
        while(copy>0){
            if(copy%10==3)
                result.append("Foo");
            if (copy % 10 == 5)
                result.append("Bar");
            if (copy % 10 == 7)
                result.append("Qix");
            copy=copy/10;
        }
        if(result.length()==0) result.append(number);
        return result.toString();
    }
    public static String compute2(int number){
        StringBuilder result=new StringBuilder();
        int copy=number;
        if(number%3==0)
            result.append("Foo");
        if(number%5==0)
            result.append("Bar");
        if(number%7==0)
            result.append("Qix");
        while(copy>0){
            if(copy%10==3)
                result.append("Foo");
            if (copy % 10 == 5)
                result.append("Bar");
            if (copy % 10 == 7)
                result.append("Qix");
            if (copy % 10 == 0)
                result.append('*');
            copy=copy/10;
        }
        if(result.length()==0) result.append(number);
        return result.toString();
    }
}
