package gau;

import gau.Works.FamilyBudget;
import gau.Works.FamilyMember;
import gau.Works.Works1_16;

public class Main {

    public static void main(String[] args) {
        Works1_16 w = new Works1_16();
//        w.m1();
//        w.m2();
//        w.m5();
//        w.m6();
//        w.m8();
//        w.m9(2);
//        w.m10();
//        w.m11();
//        w.m12();
//        w.m13();
//        w.m14(1221);
//        w.m15();
//        w.m16();
        FamilyBudget fb = new FamilyBudget();
        fb.setMoney(12000);
        FamilyMember fm = new FamilyMember("Lasha", "Tavlalashvili", 20, "Student");
    }
}
