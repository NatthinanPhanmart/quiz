import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HealthCheckTest {

    // ฟังก์ชันที่ใช้ในการคำนวณผลลัพธ์ของ BP
    public String calculateBPResult(int systolic, int diastolic) {
        if (systolic >= 160 || diastolic >= 100) {
            return "ความเสี่ยงโลหิตสูงระดับ 2 (กลุ่มที่ 2)";
        } else if (systolic >= 140 || diastolic >= 90) {
            return "เสี่ยง (กลุ่มที่ 2)";
        } else {
            return "ปกติ (กลุ่มที่ 1)";
        }
    }

    // ฟังก์ชันที่ใช้ในการคำนวณผลลัพธ์ของน้ำตาล
    public String calculateSugarResult(int sugar) {
        if (sugar >= 126) {
            return "ระดับน้ำตาลในเลือดสูง (กลุ่มที่ 3)";
        } else if (sugar >= 100) {
            return "เสี่ยง (กลุ่มที่ 2)";
        } else {
            return "ปกติ (กลุ่มที่ 1)";
        }
    }

    // Test Case 1
    @Test
    public void testCase1() {
        assertEquals("เสี่ยง (กลุ่มที่ 2)", calculateBPResult(135, 85));
        assertEquals("เสี่ยง (กลุ่มที่ 2)", calculateSugarResult(110));
    }

    // Test Case 2
    @Test
    public void testCase2() {
        assertEquals("ความเสี่ยงโลหิตสูงระดับ 2 (กลุ่มที่ 2)", calculateBPResult(160, 100));
        assertEquals("ระดับน้ำตาลในเลือดสูง (กลุ่มที่ 3)", calculateSugarResult(130));
    }

    // Test Case 3
    @Test
    public void testCase3() {
        assertEquals("ปกติ (กลุ่มที่ 1)", calculateBPResult(115, 75));
        assertEquals("ปกติ (กลุ่มที่ 1)", calculateSugarResult(90));
    }

    // Test Case 4
    @Test
    public void testCase4() {
        assertEquals("เสี่ยง (กลุ่มที่ 2)", calculateBPResult(140, 95));
        assertEquals("เสี่ยง (กลุ่มที่ 2)", calculateSugarResult(105));
    }

    // Test Case 5
    @Test
    public void testCase5() {
        assertEquals("ปกติ (กลุ่มที่ 1)", calculateBPResult(110, 70));
        assertEquals("ข้อมูลไม่ถูกต้อง", calculateSugarResult(-10));
    }
}
