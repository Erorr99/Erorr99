package queuecircle;

public class Car {

    public String number; // ทะเบียน
    public String type; //  ประเภทรถ
    public String owner; //  เจ้าของ
    public String tel; // เบอร์โทรศัพท์
    public float weight; // น้ำหนักรถ

    Car() {
        number = "none";
        type = "none";
        owner = "none";
        tel = "0";
    }

    Car(String n, String t, String o, String te, float w) {
        number = n;
        type = t;
        owner = o;
        tel = te;
        weight = w;
    }
}
