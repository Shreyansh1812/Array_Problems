import java.util.*;

public class Patterns {

    // Pattern 01: 5 rows of 5 stars each
    // * * * * * 
    // * * * * * 
    // * * * * * 
    // * * * * * 
    // * * * * * 
    public static void pattern01(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 02: Increasing stars
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    public static void pattern02(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 03: Decreasing stars
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern03(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 04: Increasing numbers
    // 1
    // 12
    // 123
    // 1234
    // 12345
    public static void pattern04(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Pattern 05: Diamond-like pattern with stars
    // *
    // * *
    // * * *
    // * *
    // *
    public static void pattern05(int n) {
        pattern02(n);
        pattern03(n - 1);
    }

    // Pattern 06: Diamond-like pattern with numbers (each row increases from 1 to row number)
    //  1
    // 12
    //123
    // 12
    //  1
    public static void pattern06(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Pattern 07: Pyramid pattern with numbers
    //    1
    //   121
    //  12321
    // 1234321
    //123454321
    public static void pattern07(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    // Pattern 08: Diamond-like pattern with numbers (each row decreases to 1 and then increases)
    //  1
    // 121
    //12321
    // 121
    //  1
    public static void pattern08(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int col = i; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= i; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int col = i; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= i; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    // Pattern 09: Increasing rows of same numbers
    // 1
    // 22
    // 333
    public static void pattern09(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    // Pattern 10: Pyramid pattern with stars
    //    *
    //   ***
    //  *****
    // *******
    //*********
    public static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Pattern 10: Pyramid pattern with stars
// *********
//  *******
//   *****
//    ***
//     *

public static void pattern11(int n) {
    for (int row = 1; row <= n; row++) {
        for (int space = 0; space < row; space++) {
            System.out.print(" ");
        }
        for (int col = 2 * (n - row) + 1; col >= 1; col--) {
            System.out.print("*");
        }
        System.out.println();
    }
}
// Pattern 12: Diamondn pattern with stars
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

static void pattern12(int n)
{
    for(int row=1;row<=n;row++)
    {
        for(int space=1;space<=(n-row);space++)
        {
            System.out.print(" ");
        }
        for(int col=1;col<=2*row-1;col++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    for(int row = n - 1; row >= 1; row--) {
        for(int space = 1; space <= (n - row); space++) {
            System.out.print(" ");
        }
        for(int col = 1; col <= 2 * row - 1; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
//                  Pattern 13:
// *
// ***
// *****
// *******
// *********
// *******
// *****
// ***
// *

static void pattern13(int n)
{
    for(int row=1;row<=n;row++)
    {
    
        for(int col=1;col<=2*row-1;col++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    for(int row = n - 1; row >= 1; row--) {
        for(int col = 1; col <= 2 * row - 1; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
//                Pattern 14:
// 1
// 01
// 101
// 0101
// 10101

public static void pattern14(int n) {
    int start = 1;
    for (int row = 0; row < n; row++) {
        if (row % 2 == 0) {
            start = 1;
        } else {
            start = 0;
        }
        for (int col = 0; col <= row; col++) {
            System.out.print(start);
            start = 1 - start; // Toggling Between 0 and 1 i.e. Only Left part I could not understand and also misunderstood col and row
        }
        System.out.println();
    }
} 
//                          Pattern15:
// 1       1
// 12     21
// 123   321
// 1234 4321
// 1234554321

public static void pattern15(int n) {
    int start = 2 * n - 1;
    for (int row = 1; row <= n; row++) {
        for (int col = 1; col <= row; col++) {
            System.out.print(col);
        }
        for (int spa = 1; spa <= start; spa++) {
            System.out.print(" ");
        }
        for (int col = row; col >= 1; col--) {
            System.out.print(col);
        }
        start -= 2; // Decrease the number of spaces after each row // Khali aaj noti khbr paidi
        System.out.println();
    }
}
public static void pattern16(int n)
{
    int num=1;
    for(int row=1;row<=n;row++)
    {
        for(int col=1;col<=row;col++)
        {
            System.out.print(num);
            num=num+1;
        }
        System.out.println();
    }
}
public static void pattern17(int n)
{
    for(int row=1;row<=n;row++)
    {
        for(char ch='A';ch<'A'+row;ch++)
        {
            System.out.print(ch);
        }
        System.out.println();
    }
}
public static void pattern18(int n) {
    for (int row = 1; row <= n; row++) {
        for (char ch = 'A'; ch <= 'A' + (n - row); ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
public static void pattern19(int n) {
    for (int row = 1; row <= n; row++) {
        char ch = (char) ('A' + row - 1); 
        for (int col = 1; col <= row; col++) {
            System.out.print(ch); // I was Printing Number of Row i.e The Reason it was showing number of Rows
        }
        System.out.println(); 
    }
}
public static void pattern20(int n) {
    for (int row = 1; row <= n; row++) {
        
        for (int col = 0; col < n - row; col++) {
            System.out.print(" ");
        }
        
        char ch = 'A';
        int breakpoint = (2 * row - 1) / 2;


        for (int col = 0; col < 2 * row - 1; col++) {
            System.out.print(ch);
            if (col < breakpoint) {
                ch++;
            } else {
                ch--;
            }
        }
        System.out.println();
    }
}
 static void pattern21(int n) {
    // Upper part of the diamond
    for (int row = 1; row <= n; row++) {
        // Print leading spaces
        for (int space = 1; space <= (n - row); space++) {
            System.out.print(" ");
        }
        // Print stars and spaces
        for (int col = 1; col <= 2 * row - 1; col++) {
            if (col == 1 || col == 2 * row - 1) {
                System.out.print("*"); // Print boundary stars
            } else {
                System.out.print(" "); // Print internal spaces
            }
        }
        System.out.println();
    }
    // Lower part of the diamond
    for (int row = n - 1; row >= 1; row--) {
        // Print leading spaces
        for (int space = 1; space <= (n - row); space++) {
            System.out.print(" ");
        }
        // Print stars and spaces
        for (int col = 1; col <= 2 * row - 1; col++) {
            if (col == 1 || col == 2 * row - 1) {
                System.out.print("*"); // Print boundary stars
            } else {
                System.out.print(" "); // Print internal spaces
            }
        }
        System.out.println();
    }
}





    public static void main(String[] args) {
        // pattern01(5);
        // pattern02(5);
        // pattern03(5);
        // pattern04(5);
        // pattern05(5);
        // pattern06(3);
        // pattern07(5);
        // pattern08(3);
        // pattern09(3);
        // pattern10(5);
        // pattern11(4);
        // pattern12(5);
        // pattern13(4);
        // pattern14(5);
        // pattern15(5);
        // pattern16(4);
        // pattern17(4);
        // pattern18(5);
        // pattern19(5);
        // pattern20(6);
        pattern21(6);
    }
}
