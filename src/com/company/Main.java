package com.company;

public class Main
{
    public static void main(String[] args)
    {
        for (int i = 2; i < 100; i++)
        {
            if (prime(i))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int counter = 0;
        for (int i = 2; i >= 2; i++)
        {
            if (prime(i))
            {
                System.out.print(i + " ");
                counter++;
            }
            if (counter == 100)
            {
                break;
            }
        }
    }

    static boolean prime(int n)
    {
        boolean prime = n > 1;
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
