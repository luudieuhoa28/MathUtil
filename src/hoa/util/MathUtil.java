/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoa.util;

/**
 *
 * @author dell
 */
//đây là class chứa các hàm toán học ta tự viết, mục đích là công cụ
//xài chung cho mọi nơi. Phàm cái gì mà được thế kế để xài chung
//ta dùng kĩ thuật STATIC
public class MathUtil {

    //tinh n! = 1.2.3.4...n vi n! tang rat nhanh, se tran int somw
    //int chi toi da 2 ty 1, nen minhf caif long an toanf hon
    //15! to lam roi, tinh toi da 15!
    public static long computeFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
