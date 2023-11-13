package jp.ac.chitose.db_prac;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreExem {
    private String gakusekiCode;
    private String familyName;
    private String firstName;
    private int point;

    public PreExem(String gakusekiCode, String familyName, String firstName, int point) {
        this.gakusekiCode = gakusekiCode;
        this.familyName = familyName;
        this.firstName = firstName;
        this.point = point;
    }

    public void print() {
        System.out.println(gakusekiCode + "さんは" + point + "点");
    }

    // Add other methods as needed for your class
}
