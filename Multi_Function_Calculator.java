import java.util.Scanner;
public class Multi_Function_Calculator
{
    public static void main(String[] args)
    {
        try (Scanner read = new Scanner(System.in)) {
            while(true)
            {
                System.out.println("Hello");
                System.out.println("Welcome to Multi Function Calculator");
                System.out.println();
                System.out.println("1) Type (add) or (1) for Addition");
                System.out.println("2) Type (sub) or (2) for Subtraction");
                System.out.println("3) Type (mult) or (3) for Multiplication");
                System.out.println("4) Type (div) or (4) for Division");
                System.out.println("5) Type (power) or (5) for finding Power");
                System.out.println("6) Type (remainder) or (6) for finding Remainder");
                System.out.println("7) Type (sq root) or (7) for finding Square Root");
                System.out.println("8) Type (root) or (8) for finding Root");
                System.out.println("9) Type (percentage) or (9) for finding percentage");
                System.out.println("10) Type (exit) or (10) to close Calculator");
                System.out.println();
                System.out.println("Enter your choice:");
                String type=read.nextLine();
                System.out.println();

                if(type.equalsIgnoreCase("add") || type.equalsIgnoreCase("1"))
                {
                    System.out.println("Welcome to the Addition Calculator");
                    System.out.println();
                    while(true)
                    {
                        System.out.println("Type First Number");
                        double a=read.nextDouble();
                        System.out.println();
                        System.out.println("Type Second Number");
                        double b=read.nextDouble();
                        read.nextLine();
                        System.out.println();
                        double c=(a+b);
                        System.out.println("The sum of "+a+" + "+b+" is = "+c);
                        System.out.println();
                        System.out.println("Do you want to leave Addition Calculator then Type exit");
                        System.out.println("If you want to Continue then Type anything to Restart");
                        String ans=read.nextLine();
                        System.out.println();
                        if(ans.equalsIgnoreCase("exit"))
                        {
                            break;
                        }
                    }
                }

                else if(type.equalsIgnoreCase("sub") || type.equalsIgnoreCase("2"))
                {
                    System.out.println("Welcome to the Subtraction Calculator");
                    System.out.println();
                    while(true)
                    {
                        System.out.println("Type First Number");
                        double a=read.nextDouble();
                        System.out.println();
                        System.out.println("Type Second Number");
                        double b=read.nextDouble();
                        read.nextLine();
                        System.out.println();
                        double c=(a-b);
                        System.out.println("The sub of "+a+" - "+b+" is = "+c);
                        System.out.println();
                        System.out.println("Do you want to Leave Subtraction Calculator then Type exit");
                        System.out.println("If you want to Continue then Type anything to Restart");
                        String ans=read.nextLine();
                        System.out.println();
                        if(ans.equalsIgnoreCase("exit"))
                        {
                            break;
                        }
                    }
                }

                else if(type.equalsIgnoreCase("mult") || type.equalsIgnoreCase("3"))
                {
                    System.out.println("Welcome to the Multiplication Calculator");
                    System.out.println();
                    while(true)
                    {
                        System.out.println("Type First Number");
                        double a=read.nextDouble();
                        System.out.println();
                        System.out.println("Type Second Number");
                        double b=read.nextDouble();
                        read.nextLine();
                        System.out.println();
                        double c=(a*b);
                        System.out.println("The mult of "+a+" x "+b+" is = "+c);
                        System.out.println();
                        System.out.println("Do you want to leave Multiplication Calculator then Type exit");
                        System.out.println("If you want to Continue then Type anything to Restart");
                        String ans=read.nextLine();
                        System.out.println();
                        if(ans.equalsIgnoreCase("exit"))
                        {
                            break;
                        }
                    }
                }

                else if(type.equalsIgnoreCase("div") || type.equalsIgnoreCase("4"))
                {
                    System.out.println("Welcome to the Division Calculator");
                    System.out.println();
                    while(true)
                    {
                        System.out.println("Type Numerator");
                        double a=read.nextDouble();
                        System.out.println();
                        System.out.println("Type Denominator");
                        double b=read.nextDouble();
                        read.nextLine();
                        System.out.println();
                        if(b==0)
                        {
                            System.out.println("Denominator can't be Zero");
                        }
                        else
                        {
                            double c=(a/b);
                            System.out.println(a);
                            System.out.println("----");
                            System.out.println(b);
                            System.out.println("= "+c);
                            System.out.println();
                        }
                        System.out.println("Do you want to leave division Calculator then Type exit");
                        System.out.println("If you want to Continue then Type anything to Restart");
                        String ans=read.nextLine();
                        System.out.println();
                        if(ans.equalsIgnoreCase("exit"))
                        {
                            break;
                        }
                    }
                }

                else if(type.equalsIgnoreCase("power") || type.equalsIgnoreCase("5"))
                {
                    System.out.println("Welcome to Power Calculator");
                    System.out.println();
                    while(true)
                    {
                        System.out.println("Type Number");
                        double no=read.nextDouble();
                        if(no>0)
                        {
                            System.out.println(" ");
                            System.out.println("Type Power");
                            int power=read.nextInt();
                            if(power>0)
                                {
                                    double b=no;
                                    if(power==1)
                                    {
                                        System.out.println(" ");
                                        System.out.println("Value is");
                                        System.out.println(b);
                                    }
                                    if (power!=1)
                                    {
                                        while(power>1)
                                        {
                                            no=no*b;
                                            power--;
                                        }
                                        System.out.println(" ");
                                        System.out.println("Value is");
                                        System.out.println(no);
                                    }
                                    System.out.println(" ");
                                }
                            if(power<0)
                            {
                                System.out.println("power can't be Negative");
                                System.out.println("Try again");
                                System.out.println();
                            }
                            if(power==0)
                            {
                                System.out.println();
                                System.out.println("value is");
                                System.out.println("1");
                                System.out.println();
                            }
                        }
                        if(no==0)
                        {
                            System.out.println("Number can't be zero");
                            System.out.println("Try again");
                            System.out.println(" "); 
                        }
                        if(no<0)
                        {
                        System.out.println(" ");
                        System.out.println("Type Power");
                        int power=read.nextInt();
                        if(power>0)
                            {
                                double b=no;
                                if(power==1)
                                {
                                    System.out.println(" ");
                                    System.out.println("Value is");
                                    System.out.println(b);
                                }
                                if (power!=1)
                                {
                                    while(power>1)
                                    {
                                        no=no*b;
                                        power--;
                                    }
                                    System.out.println(" ");
                                    System.out.println("Value is");
                                    System.out.println(no);
                                }
                                System.out.println(" ");
                            } 
                        }
                        read.nextLine();
                        System.out.println("Do you want to leave Power Calculator then Type exit");
                        System.out.println("If you want to Continue then Type anything to Restart");
                        String ans=read.nextLine();
                        System.out.println();
                        if(ans.equalsIgnoreCase("exit"))
                        {
                            break;
                        }
                    }
                }

                else if(type.equalsIgnoreCase("remainder") || type.equalsIgnoreCase("6"))
                {
                    System.out.println("Welcome to the Remainder Calculator");
                    System.out.println();
                    while(true)
                    {
                        System.out.println("Type Divident");
                        double a=read.nextDouble();
                        read.nextLine();
                        System.out.println();
                        if(a>0)
                        {
                            System.out.println("Type Divisor");
                            double b=read.nextDouble();
                            read.nextLine();
                            System.out.println();
                            if(b<=a)
                            {
                                if(b>0)
                                {
                                    double c=(a%b);
                                    System.out.println( "   ______");
                                    System.out.println(b+")"+ a  +"(");
                                    System.out.println("X(Remainder)= "+c);
                                    System.out.println();
                                }
                                if(b==0)
                                {
                                    System.out.println("Divisor can't be Zero");
                                    System.out.println("Try again");
                                    System.out.println();
                                }
                                if(b<0)
                                {
                                    System.out.println("Divisor can't be Negative");
                                    System.out.println("Try again");
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Divisor must be smaller than than or equal to divident");
                                System.out.println("Try again");
                                System.out.println();
                            }
                        }
                        else
                        {
                            System.out.println("Divident must be greater than 0");
                            System.out.println("Try again");
                            System.out.println();
                        }
                        System.out.println("Do you want to leave Remainder Calculator then Type exit");
                        System.out.println("If you want to Continue then Type anything to Restart");
                        String ans=read.nextLine();
                        System.out.println();
                        if(ans.equalsIgnoreCase("exit"))
                        {
                            break;
                        }
                    }
                }

                else if(type.equalsIgnoreCase("sq root") || type.equalsIgnoreCase("7"))
                {
                    System.out.println("Welcome to Square root Root Calculator");
                    System.out.println();
                    while(true)
                    {
                        System.out.println("Type Number");
                        Double no=read.nextDouble();
                        read.nextLine();
                        System.out.println();
                        if(no>=0)
                        {
                            double a=Math.pow(no,1.0/2);
                            System.out.println("Square root of "+no+" is= "+a);
                            System.out.println();
                        }
                        else if(no<0)
                        {
                            System.out.println("This Calculator don't support Negative Values");
                            System.out.println("Try again");
                            System.out.println();
                        }
                        System.out.println("Do you want to leave Square root Calculator then Type exit");
                        System.out.println("If you want to Continue then Type anything to Restart");
                        String ans=read.nextLine();
                        System.out.println();
                        if(ans.equalsIgnoreCase("exit"))
                        {
                            break;
                        }
                    }
                }

                else if(type.equalsIgnoreCase("root") || type.equalsIgnoreCase("8"))
                {
                    while(true)
                    {
                        System.out.println("Hello");
                        System.out.println("Welcome to Root Calculator");
                        System.out.println();
                        System.out.println("Type Number");
                        double no=read.nextDouble();
                        read.nextLine();
                        System.out.println();
                        if(no>=0)
                        { 
                            System.out.println("Type Numerator");
                            double numerator=read.nextDouble();
                            System.out.println();
                            System.out.println("Type Denominator");
                            double denominator=read.nextDouble();
                            read.nextLine();
                            if(denominator==0)
                            {
                                System.out.println("Denominator can't be zero");
                                System.out.println("Try again");
                                System.out.println();
                            }
                            else
                            {
                                System.out.println("power= "+numerator);
                                System.out.println("       ---");
                                System.out.println("       "+denominator);
                                double a=Math.pow(no,numerator/denominator);
                                System.out.println();
                                System.out.println("Ans is "+a);
                                System.out.println();
                            }
                        }
                        if(no<0)
                        {
                            System.out.println("This Calculator doesn't support Negative Values");
                            System.out.println();
                        }
                        System.out.println("Do you want to leave root Calculator then Type exit");
                        System.out.println("If you want to Continue then Type anything to Restart");
                        String ans=read.nextLine();
                        System.out.println();
                        if(ans.equalsIgnoreCase("exit"))
                        {
                            break;
                        }
                    }
                }

                else if(type.equalsIgnoreCase("percentage") || type.equalsIgnoreCase("9"))
                {
                    System.out.println("Welcome to the Percentage Calculator");
                    System.out.println();
                    while(true)
                    {
                        System.out.println("ENTRE MAXIMUM MARKS");
                        double a=read.nextDouble();
                        System.out.println();
                        if (a>0)
                        {
                            System.out.println("ENTRE OBTAINED MARKS");
                            double b=read.nextDouble();
                            read.nextLine();
                            System.out.println();
                            if(a>=b)
                            {
                                if (b>=0)
                                {
                                    double c=(b*100)/a;
                                    System.out.println("PERCENTAGE OBTAINED IS");
                                    System.out.println(c+"%");
                                    System.out.println();
                                }
                                if (b<0)
                                {
                                    System.out.println("OBTAINED MARKS CANT BE NEGATIVE");
                                    System.out.println("TRY AGAIN");
                                    System.out.println();
                                }
                            }
                            else
                            {
                                System.out.println("Obtained marks can't be greater than Maximum marks");
                                System.out.println("Try again");
                                System.out.println();
                            }
                        }
                        if (a<0)
                        { 
                            System.out.println("MAXIMUM MARKS CANT BE NEGATIVE");
                            System.out.println("TRY AGAIN");
                            System.out.println();
                        }
                        if (a==0)
                        { 
                            System.out.println("MAXIMUM MARKS CANT BE ZERO");
                            System.out.println("TRY AGAIN");
                            System.out.println();
                        }
                        System.out.println("Do you want to leave Percentage Calculator then Type exit");
                        System.out.println("If you want to Continue then Type anything to Restart");
                        String ans=read.nextLine();
                        System.out.println();
                        if(ans.equalsIgnoreCase("exit"))
                        {
                            break;
                        }
                    }
                }
                
                else if(type.equalsIgnoreCase("exit") || type.equalsIgnoreCase("10"))
                {
                    System.out.println("Thank you");
                    System.out.println("Bye");
                    break;
                }
                else
                {
                    System.out.println("Invalid Input");
                    System.out.println("Try again");
                }
                System.out.println("Do you want to leave Basic Calculator then Type exit");
                System.out.println("If want to Continue then Type anything to Restart");
                String ans=read.nextLine();
                System.out.println();
                if(ans.equalsIgnoreCase("exit"))
                {
                    System.out.println("Thank you");
                    System.out.println("Bye");
                    break;
                }
            }
        }
    }
}