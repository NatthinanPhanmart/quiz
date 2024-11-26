import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HealthTest {

    @Test
    void testCase1() {
        int systolic = 135; // Input systolic
        int diastolic = 85; // Input diastolic
        int sugar = 110;    // Input sugar

        String expectedBP = "เสี่ยง (กลุ่มที่ 2)";
        String expectedSugar = "เสี่ยง (กลุ่มที่ 2)";

        String actualBP = evaluateBloodPressure(systolic, diastolic);
        String actualSugar = evaluateBloodSugar(sugar);

        assertEquals(expectedBP, actualBP, "BP Evaluation failed for TC-1");
        assertEquals(expectedSugar, actualSugar, "Sugar Evaluation failed for TC-1");
    }

    @Test
    void testCase2() {
        int systolic = 160;
        int diastolic = 100;
        int sugar = 130;

        String expectedBP = "ความดันโลหิตสูงระดับ 2 (กลุ่มที่ 3)";
        String expectedSugar = "ระดับน้ำตาลในเลือดสูง (กลุ่มที่ 3)";

        String actualBP = evaluateBloodPressure(systolic, diastolic);
        String actualSugar = evaluateBloodSugar(sugar);

        assertEquals(expectedBP, actualBP, "BP Evaluation failed for TC-2");
        assertEquals(expectedSugar, actualSugar, "Sugar Evaluation failed for TC-2");
    }

    // เพิ่ม Test Case ตามรายการอื่น ๆ ในตาราง...

    private String evaluateBloodPressure(int systolic, int diastolic) {
        if (systolic >= 160 || diastolic >= 100) {
            return "ความดันโลหิตสูงระดับ 2 (กลุ่มที่ 3)";
        } else if (systolic >= 140 || diastolic >= 90) {
            return "ความดันโลหิตสูงระดับ 1 (กลุ่มที่ 2)";
        } else {
            return "ปกติ (กลุ่มที่ 1)";
        }
    }

    private String evaluateBloodSugar(int sugar) {
        if (sugar >= 126) {
            return "ระดับน้ำตาลในเลือดสูง (กลุ่มที่ 3)";
        } else if (sugar >= 100) {
            return "เสี่ยง (กลุ่มที่ 2)";
        } else {
            return "ปกติ (กลุ่มที่ 1)";
        }
    }
}
