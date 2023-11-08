package lecture2;

import java.util.Scanner;

public class kadai3 {

    public static void main(String[] args) {
        String[][] gaku_pass = new String[5][2]; // gaku_passのデータ型をStringに変更
        Scanner input = new Scanner(System.in);
        Logins login = new Logins();

        gaku_pass[0][0] = "2222380";
        gaku_pass[0][1] = "12345";
        gaku_pass[1][0] = "222238";
        gaku_pass[1][1] = "1234";
        gaku_pass[2][0] = "22223";
        gaku_pass[2][1] = "123";
        gaku_pass[3][0] = "2222";
        gaku_pass[3][1] = "12";
        gaku_pass[4][0] = "222";
        gaku_pass[4][1] = "1";
        System.out.print("学籍番号を入力してください: ");
        String gakuseki = input.next(); // 入力を文字列として読み取る
        int studentIndex = login.gaku_hantei(gaku_pass, gakuseki);

        if (studentIndex != -1) {
            System.out.print("パスワードを入力してください: ");
            String password = input.next(); // 入力を文字列として読み取る
            login.psw_hantei(gaku_pass, studentIndex, password);
        }
    }
}

class Logins {
    public int gaku_hantei(String[][] gaku_pass, String value) {
        for (int i = 0; i < 5; i++) {
            if (gaku_pass[i][0].equals(value)) {
                return i;
            }
        }
        System.out.println("該当する学生が見つかりませんでした。");
        return -1;
    }

    public void psw_hantei(String[][] gaku_pass, int value, String psw) {
        if (gaku_pass[value][1].equals(psw)) {
            System.out.println("ログイン完了");
        } else {
            System.out.println("不正なアクセスです");
            System.exit(0);
        }
    }
}
