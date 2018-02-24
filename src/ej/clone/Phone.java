package ej.clone;

public class Phone implements Cloneable {

    private int code;
    private int area;
    private int phone;

    public Phone(int code, int area, int phone) {
        this.code = code;
        this.area = area;
        this.phone = phone;
    }

    public int getCode() {
        return code;
    }

    public int getArea() {
        return area;
    }

    public int getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "code=" + code +
                ", area=" + area +
                ", phone=" + phone +
                '}';
    }

    @Override
    public Phone clone() {
        try {
            return (Phone) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new AssertionError(); // Can't happen
        }
    }

    public static void main(String[] args) {
        Phone p = new Phone(1,2,3);
        Phone p2 = p.clone();

        System.out.println(p2);
    }
}
