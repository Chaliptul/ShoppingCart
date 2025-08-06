import Lib.*;
import Lib.Discount.*;
public class App {

    private static int passedCount = 0;
    private static int failedCount = 0;
    /**
     * เมธอดเสิรมสำหรับตรวจสอบเงื่อไขและพิมพ์ผลลัพธ์
     * @param testname ชื่อของกรณทดสอบ
     *@param condition เงื่อนไขที่ต้องเป็นจริงเพื่อให้เทสต์ผ่าน
     */
     
     private static void check(String testName, boolean condition){
        if(condition){
            System.out.println("PASSED: " + testName);
            passedCount++;
        }else{
            System.out.println("FAILED: " + testName);
            failedCount++;
        }
     }
     /**
      * จุดเริ่มต้นการทำงานของโปรแกรมทดสอบ
      * @param args
      */
}