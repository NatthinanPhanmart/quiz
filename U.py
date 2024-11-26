import unittest

def evaluate_blood_pressure(systolic, diastolic):
    if systolic >= 160 or diastolic >= 100:
        return "ความดันโลหิตสูงระดับ 2 (กลุ่มที่ 3)"
    elif systolic >= 140 or diastolic >= 90:
        return "ความดันโลหิตสูงระดับ 1 (กลุ่มที่ 2)"
    else:
        return "ปกติ (กลุ่มที่ 1)"

def evaluate_blood_sugar(sugar):
    if sugar >= 126:
        return "ระดับน้ำตาลในเลือดสูง (กลุ่มที่ 3)"
    elif sugar >= 100:
        return "เสี่ยง (กลุ่มที่ 2)"
    else:
        return "ปกติ (กลุ่มที่ 1)"

class TestHealthCheck(unittest.TestCase):

    def test_case_1(self):
        systolic = 135
        diastolic = 85
        sugar = 110
        
        expected_bp = "เสี่ยง (กลุ่มที่ 2)"
        expected_sugar = "เสี่ยง (กลุ่มที่ 2)"
        
        actual_bp = evaluate_blood_pressure(systolic, diastolic)
        actual_sugar = evaluate_blood_sugar(sugar)
        
        self.assertEqual(expected_bp, actual_bp, "BP Evaluation failed for TC-1")
        self.assertEqual(expected_sugar, actual_sugar, "Sugar Evaluation failed for TC-1")

    def test_case_2(self):
        systolic = 160
        diastolic = 100
        sugar = 130
        
        expected_bp = "ความดันโลหิตสูงระดับ 2 (กลุ่มที่ 3)"
        expected_sugar = "ระดับน้ำตาลในเลือดสูง (กลุ่มที่ 3)"
        
        actual_bp = evaluate_blood_pressure(systolic, diastolic)
        actual_sugar = evaluate_blood_sugar(sugar)
        
        self.assertEqual(expected_bp, actual_bp, "BP Evaluation failed for TC-2")
        self.assertEqual(expected_sugar, actual_sugar, "Sugar Evaluation failed for TC-2")


if __name__ == '__main__':
    unittest.main()
