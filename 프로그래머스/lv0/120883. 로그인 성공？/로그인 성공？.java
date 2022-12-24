class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String[] id_pw2 = new String[2];
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    answer = "login";
                } else {
                    if (answer.contains("login")) {
                        continue;
                    } else {
                        answer = "wrong pw";
                    }
                }
            } else {
                if (!answer.equals("login") && !answer.equals("wrong pw")) {
                    answer = "fail";
                }
            }
        }
        return answer;
    }
}