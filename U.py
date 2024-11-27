import unittest

# ฟังก์ชันสำหรับคำนวณผลลัพธ์ของ BP (ความดันโลหิต)
def calculate_bp_result(systolic, diastolic):
    if systolic >= 160 or diastolic >= 100:
        return "ความเสี่ยงโลหิตสูงระดับ 2 (กลุ่มที่ 2)"
    elif systolic >= 140 or diastolic >= 90:
        return "เสี่ยง (กลุ่มที่ 2)"
    else:
        return "ปกติ (กลุ่มที่ 1)"

# ฟังก์ชันสำหรับคำนวณผลลัพธ์ของระดับน้ำตาล
def calculate_sugar_result(sugar):
    if sugar >= 126:
        return "ระดับน้ำตาลในเลือดสูง (กลุ่มที่ 3)"
    elif sugar >= 100:
        return "เสี่ยง (กลุ่มที่ 2)"
    elif sugar >= 0:
        return "ปกติ (กลุ่มที่ 1)"
    else:
        return "ข้อมูลไม่ถูกต้อง"

# Unit Tests
class TestHealthResults(unittest.TestCase):

    # Test Case 1
    def test_case_1(self):
        self.assertEqual(calculate_bp_result(135, 85), "เสี่ยง (กลุ่มที่ 2)")
        self.assertEqual(calculate_sugar_result(110), "เสี่ยง (กลุ่มที่ 2)")

    # Test Case 2
    def test_case_2(self):
        self.assertEqual(calculate_bp_result(160, 100), "ความเสี่ยงโลหิตสูงระดับ 2 (กลุ่มที่ 2)")
        self.assertEqual(calculate_sugar_result(130), "ระดับน้ำตาลในเลือดสูง (กลุ่มที่ 3)")

    # Test Case 3
    def test_case_3(self):
        self.assertEqual(calculate_bp_result(115, 75), "ปกติ (กลุ่มที่ 1)")
        self.assertEqual(calculate_sugar_result(90), "ปกติ (กลุ่มที่ 1)")

    # Test Case 4
    def test_case_4(self):
        self.assertEqual(calculate_bp_result(140, 95), "เสี่ยง (กลุ่มที่ 2)")
        self.assertEqual(calculate_sugar_result(105), "เสี่ยง (กลุ่มที่ 2)")

    # Test Case 5
    def test_case_5(self):
        self.assertEqual(calculate_bp_result(110, 70), "ปกติ (กลุ่มที่ 1)")
        self.assertEqual(calculate_sugar_result(-10), "ข้อมูลไม่ถูกต้อง")


# รันการทดสอบ
if __name__ == '__main__':
    unittest.main()
