package test;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;
    private double rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public double getRate() {
        rate = (double)win/(win + lose);
        return rate;
    }

    public void report() {
        System.out.println(name + "の2017年の成績は" + win +"勝" + lose +"敗" + draw + "分、勝率は" + (double)rate + "です。");
    }
}
