package com.softserve.edu.HW2;

class Sqrt {
    public int mySqrt(int x) {
        long y = 0;
        long longX = x;
        while (y * y <= longX) {
            y++;
        }
        return (int) (y - 1);
    }
}
