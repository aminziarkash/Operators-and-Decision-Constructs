import java.util.Objects;

/**
 * Created by aziarkash on 13-1-2016.
 */
public class Application {

    public static void main(String[] args) {

        instanceOfTest();

        usingParentheses();

        incrementTest();

        stringBuilderTest();

        charTest();

        ifTest();

        switchTest();

    }

    private static void instanceOfTest(){
        // int a[] = {1, 2};
        // int b = 23;
        // if (a instanceof Object | b instanceof Object){
        //    System.out.println();
        // }
    }

    private static void usingParentheses(){
        int i = 3, j = 3, k = 3;
        System.out.println("The value for i before calculation\t=\t" + i);
        i = (i+1) * (j + 1) / k;
        System.out.println("The value for i after calculation\t=\t" + i);
        addSeparator();

        int ii = 21, jj = 42, kk = 11;
        System.out.println("The value for ii before calculation\t=\t" + ii);
        ii = ii - jj + kk * 7;
        System.out.println("The value for ii after calculation\t=\t" + ii);
        addSeparator();

        int iii = 21, jjj = 42, kkk = 11;
        System.out.println("The value for iii before calculation\t=\t" + iii);
        iii = (iii - jjj + kkk) * 7;
        System.out.println("The value for iii after calculation\t\t=\t" + iii);
        addSeparator();
    }

    private static void incrementTest(){
        int x = 2;
        System.out.println("The value for x before calculation\t=\t" + x);
        x += x++ * x++ * x++;
        System.out.println("The value for x after calculation\t=\t" + x);
        addSeparator();

        int y = 2;
        System.out.println("The value for y before calculation\t=\t" + y);
        y = y;
        y++;
        System.out.println("The value for y after calculation\t=\t" + y);
        addSeparator();

        int xx = 5;
        int yy = 5;
        System.out.println("The values for x and y before calculation\t:\t" + xx + "\t" + yy);
        System.out.println("Below, values for these variables after some calculations");
        System.out.println("The value for xx\t=\t" + ++xx); // print: x + 1
        System.out.println("The value for xx\t=\t" + xx); // print:x
        System.out.println("The value for yy\t=\t" + yy++); // print y
        System.out.println("The value for yy\t=\t" + yy); // print y + 1
        System.out.println("The value for yy\t=\t" + xx);
        addSeparator();
    }

    private static void stringBuilderTest(){
        String s = "aaa";
        System.out.println("String s before\t:\t" + s);
        StringBuilder sb = new StringBuilder("bbb");
        System.out.println("StringBuilder sb before\t:\t" + sb);
        testStringBuilderRefs(s, sb);
        System.out.print("The values for String s and StringBuilder sb after changes\t:\t");
        System.out.println("s = " + s + "sb = " + sb);
        addSeparator();
    }

    private static void testStringBuilderRefs(String str, StringBuilder sb){
        str = str + sb.toString();
        sb.append(str);
        str = null;
        sb = null;
        System.out.println(sb);
    }

    private static void charTest(){
        int i = 5;
        float f = 5.5f;
        double d = 3.8;
        char c = 'a';
        if (i == f) c++;
        if (((int)(f + d)) == ((int) f + (int) d)) c += 2;
        System.out.println("The char 'c'\t=\t" + c);
        addSeparator();
    }

    private static void ifTest(){
        if (true)
            if (false)
                System.out.println("The if statement resulted\t:\tFALSE");
        else
                System.out.println("The if statement resulted\t:\tTRUE");
        addSeparator();
    }

    private static void switchTest(){
        int i = 5;
        switch (i){
            default:
            case 1:
                System.out.println("In case " + 1);
            case 0:
                System.out.println("In case " + 0);
            case 2:
                System.out.println("In case " + 2);
                break;
            case 3:
                System.out.println("In case " + 3);
        }
        addSeparator();
    }
    
    private static void addSeparator(){
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
}
