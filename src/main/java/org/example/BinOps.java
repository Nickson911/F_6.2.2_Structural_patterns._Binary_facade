package org.example;

public class BinOps {
    int a, b, c;

    public String sum(String a, String b) {
        this.a = Integer.parseInt(a, 2);
        this.b = Integer.parseInt(b, 2);
        c = this.a + this.b;
        return Integer.toBinaryString(c);
    }

    public String mult(String a, String b) {
        this.a = Integer.parseInt(a, 2);
        this.b = Integer.parseInt(b, 2);
        c = this.a * this.b;
        return Integer.toBinaryString(c);
    }
}
