package com.softserve.edu.HW2;

class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int tmp = rev*10 + x%10;
            if ((tmp - x%10)/10 != rev) {
                return 0;
            } else {
                rev = tmp;
            }
            x /= 10;
        }
        return rev;
    }
}
