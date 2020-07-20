/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import hoa.util.MathUtil;
import static hoa.util.MathUtil.computeFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dell
 */
public class MathUtilTest {
    //day la 1 class đặc biết mà c  mỗi hàm dùng để test các hàm bên class
    //của dự án ví dụ test cF() coi chạy đúng không
    //mỗi hàm sẽ chạy 1 hoặc nhiều lệnh cF() tùy bạn để kiếm tra coi 
    //actual có khớp với expected hay không

    @Test
    public void testSuccessFullCase() {
        // assertEquals(120, 720);
        assertEquals(120, computeFactorial(6));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailCases() {
        computeFactorial(-5);
    }

}
