package test;

public class BaseBallSample {
    public static void main(String[] args) {
        //インスタンスを生成
        BaseBallTeam hc = new BaseBallTeam();
        hc.setName("広島東洋カープ ");
        hc.setWin(88);
        hc.setLose(51);
        hc.setDraw(4);

        BaseBallTeam ht = new BaseBallTeam();
        ht.setName("阪神タイガース ");
        ht.setWin(78);
        ht.setLose(61);
        ht.setDraw(4);

        BaseBallTeam yb = new BaseBallTeam();
        yb.setName("横浜DeNAベイスターズ ");
        yb.setWin(73);
        yb.setLose(65);
        yb.setDraw(5);

        BaseBallTeam yg = new BaseBallTeam();
        yg.setName("読売ジャイアンツ ");
        yg.setWin(72);
        yg.setLose(68);
        yg.setDraw(3);

        BaseBallTeam cd = new BaseBallTeam();
        cd.setName("中日ドラゴンズ ");
        cd.setWin(59);
        cd.setLose(79);
        cd.setDraw(5);

        BaseBallTeam ts = new BaseBallTeam();
        ts.setName("東京ヤクルトスワローズ ¥");
        ts.setWin(45);
        ts.setLose(96);
        ts.setDraw(2);

        //勝敗情報を表示
        hc.getRate();
        hc.report();
        
        ht.getRate();
        ht.report();
        
        yb.getRate();
        yb.report();
        
        yg.getRate();
        yg.report();
        
        cd.getRate();
        cd.report();
        
        ts.getRate();
        ts.report();
    }
}
