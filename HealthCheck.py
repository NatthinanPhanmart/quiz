def check_blood_pressure(systolic, diastolic):
    if systolic < 120 and diastolic < 80:
        return "ปกติ (กลุ่มที่ 1)"
    elif 120 <= systolic <= 139 or 80 <= diastolic <= 89:
        return "เสี่ยง (กลุ่มที่ 2)"
    elif 140 <= systolic <= 159 or 90 <= diastolic <= 99:
        return "ความดันโลหิตสูงระดับ 1 (กลุ่มที่ 3)"
    elif systolic >= 160 or diastolic >= 100:
        return "ความดันโลหิตสูงระดับ 2 (กลุ่มที่ 4)"
    else:
        return "ข้อมูลไม่ถูกต้อง"

def check_blood_sugar(fasting_sugar):
    if fasting_sugar < 100:
        return "ปกติ (กลุ่มที่ 1)"
    elif 100 <= fasting_sugar <= 125:
        return "เสี่ยง (กลุ่มที่ 2)"
    elif fasting_sugar > 125:
        return "ระดับน้ำตาลในเลือดสูง (กลุ่มที่ 3)"
    else:
        return "ข้อมูลไม่ถูกต้อง"

if __name__ == "__main__":
    systolic = 135
    diastolic = 85
    fasting_sugar = 110

    print("ผลการตรวจความดันโลหิต:", check_blood_pressure(systolic, diastolic))
    print("ผลการตรวจน้ำตาลในเลือด:", check_blood_sugar(fasting_sugar))
