import java.util.Scanner;

public class basic {
    public static void main(String[] args) {

        // AREA OF CIRCLE

        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter radius: ");
        // int n=sc.nextInt();
        // double PI=3.14159;
        // System.out.println("Area of circle is : "+(PI*n*n) );

        // VOLUME OF SPHERE : 4/3 * pi * r3
        // TOTAL SURFACE AREA OF CUBOID : 2 * (lb+bh+lh)

        // SIMPLE INTEREST
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter principle: ");
        // double p=sc.nextInt();
        // System.out.print("Enter rate: ");
        // double r=sc.nextInt();
        // System.out.print("Enter time: ");
        // double t=sc.nextInt();

        // System.out.println("Simple Interest: "+((p*r*t)/100));

        // EVEN ODD NUMBERS
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int n=sc.nextInt();
        // if(n%2==0) System.out.println("!! Even !!");
        // else System.out.println("!! Odd !!");

        // ABSOLUTE NUMBER
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int n=sc.nextInt();
        // System.out.print("Absolute value of "+n+" is ");
        // if(n<0) System.out.println(n*-1);
        // else System.out.println(n);

        // CALCULATE PROFIT OR LOSS
        // Profit = SP - CP (when SP > CP)
        // Loss = CP - SP (when CP > SP)
        // Profit % = (Profit ÷ CP) × 100
        // Loss % = (Loss ÷ CP) × 100
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter Cost price: ");
        // int cp=sc.nextInt();
        // System.out.print("Enter Selling price: ");
        // int sp=sc.nextInt();
        // if(cp>sp) System.out.println("Oh no! Suffered Loss of "+(cp-sp)+"rs !!");
        // else if(cp<sp) System.out.println("Hurray You made a profit of "+(sp-cp)+"rs
        // !!");
        // else System.out.println("No Loss ! No Profit !");

        // Problem to find whether point(x,y) lie in 1st,2nd,3rd,4th ,x,yor origin
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter X: ");
        // int x = sc.nextInt();
        // System.out.print("Enter Y: ");
        // int y = sc.nextInt();
        // if (x > 0 && y > 0)
        // System.out.println("Point (" + x + "," + y + ") lies in 1st Quadrant");
        // else if (x > 0 && y < 0)
        // System.out.println("Point (" + x + "," + y + ") lies in 4th Quadrant");
        // else if (x < 0 && y > 0)
        // System.out.println("Point (" + x + "," + y + ") lies in 2nd Quadrant");
        // else if (x < 0 && y < 0)
        // System.out.println("Point (" + x + "," + y + ") lies in 3rd Quadrant");
        // else if (x == 0 && y == 0)
        // System.out.println("Point (" + x + "," + y + ") on Origin");
        // else if (y == 0)
        // System.out.println("Point (" + x + "," + y + ") on x axis");
        // else
        // System.out.println("Point (" + x + "," + y + ") on y axis");

        // TO FIND GREATEST OF 3 NUMBERS
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int x2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int x3 = sc.nextInt();
        // if (x1 >= x2 && x1 >= x3)
        // System.out.println("x1 " + x1 + " is greatest");
        // else if (x2 >= x1 && x2 >= x3)
        // System.out.println("x2 " + x2 + " is greatest");
        // else
        // System.out.println("x3 " + x3 + " is greatest");

        // NESTED IF ELSE
        // if(x1>=x2){ // always x1 greater
        // if(x1>=x3) System.out.println("x1 " + x1 + " is greatest");
        // else System.out.println("x3 " + x3 + " is greatest");
        // }else{ //always x2 greater
        // if(x2>=x3) System.out.println("x2 " + x2 + " is greatest");
        // else System.out.println("x3 " + x3 + " is greatest");
        // }

        // TERNARY OPERATOR
        System.out.println(
            (x1 > x2) ? ((x1 > x3) ? "x1 " + x1 + " is greatest" : "x3 " + x3 + " is greatest")
                      : ((x2 > x3) ? "x2 " + x2 + " is greatest" : "x3 " + x3 + " is greatest")
            );

    }
}