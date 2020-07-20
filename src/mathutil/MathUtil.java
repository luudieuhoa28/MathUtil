/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static hoa.util.MathUtil.computeFactorial;

/**
 *
 * @author dell
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + computeFactorial(5));
        //tui muon xem 5! chay dung hong
        //v tui in ket qua xư lý của hàm ra (actual value)
        //tui so sánh nó coi có bang 120 mà tui tính trước đó hay không
        //nếu hàm có 1 value trả về (actual - giả sử 120)
        //và khớp vói cái tui cần nó phải thế (excepted - giả sử mình cần hàm  trả về 120)
        //actual khớp với expected, hàm chạy như mong  hàm chạy đúng test chẳn qua là chạy app
        // chạy hàm coi kết quả trả về có đúng như mình mong đợi hay khống - actual và expected là như nhau
        // nếu không khớp code có bù hoặc mình kì vọng sai
        
        //expected: 720
        System.out.println("6! = " + computeFactorial(6));
        //expected: 1
        System.out.println("1! = " + computeFactorial(1));
        //expected: 1
        System.out.println("0! = " + computeFactorial(0));
        
        //kỹ thuật này dùng mắt đối chiếu kết quả không ổn, nhưng không hiệu quả
        
    }
    
}
