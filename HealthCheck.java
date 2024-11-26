public class HealthCheck {

    public static String checkBloodPressure(int systolic, int diastolic) {
        if (systolic < 120 && diastolic < 80) {
            return "ปกติ (กลุ่มที่ 1)";
        } else if (systolic >= 120 && systolic <= 139 || diastolic >= 80 && diastolic <= 89) {
            return "เสี่ยง (กลุ่มที่ 2)";
        } else if (systolic >= 140 && systolic <= 159 || diastolic >= 90 && diastolic <= 99) {
            return "ความดันโลหิตสูงระดับ 1 (กลุ่มที่ 3)";
        } else if (systolic >= 160 || diastolic >= 100) {
            return "ความดันโลหิตสูงระดับ 2 (กลุ่มที่ 4)";
        } else {
            return "ข้อมูลไม่ถูกต้อง";
        }
    }

   
    public static String checkBloodSugar(int fastingSugar) {
        if (fastingSugar < 100) {
            return "ปกติ (กลุ่มที่ 1)";
        } else if (fastingSugar >= 100 && fastingSugar <= 125) {
            return "เสี่ยง (กลุ่มที่ 2)";
        } else if (fastingSugar > 125) {
            return "ระดับน้ำตาลในเลือดสูง (กลุ่มที่ 3)";
        } else {
            return "ข้อมูลไม่ถูกต้อง";
        }
    }

    public static void main(String[] args) {
        
        int systolic = 135; 
        int diastolic = 85; 
        int fastingSugar = 110;

        System.out.println("ผลการตรวจความดันโลหิต: " + checkBloodPressure(systolic, diastolic));
        System.out.println("ผลการตรวจน้ำตาลในเลือด: " + checkBloodSugar(fastingSugar));
    }
}
