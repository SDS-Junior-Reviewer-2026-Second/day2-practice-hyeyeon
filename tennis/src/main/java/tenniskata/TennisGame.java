package tenniskata;

public class TennisGame {
    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;
    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    private static final String[] SCORE_NAMES = {
            "Love",
            "Fifteen",
            "Thirty",
            "Forty"
    };

    public void wonPointPlayer1(){
        player1Score +=1;
    }
    public void wonPointPlayer2(){
        player2Score +=1;
    }

    public String getScore() {
        if (player1Score==player2Score)
        {
            return getEqualScore();
        }
        else if (player1Score>=4 || player2Score>=4)
        {
            return getAdvantageOrWinScore();
        }
        else
        {
            return getNormalScore();
        }
    }
    public String getEqualScore(){
        if( this.player1Score >= 3) return "Deuce";
        return SCORE_NAMES[this.player1Score]+ "-All";
    }

    public String getAdvantageOrWinScore(){
        int difference = this.player1Score-this.player2Score;
        if (difference==1) return "Advantage player1";
        else if (difference>=2) return "Win for player1";
        else if (difference==-1) return "Advantage player2";
        else return "Win for player2";
    }

    public String getNormalScore(){
        return SCORE_NAMES[this.player1Score]
                +"-"
                +SCORE_NAMES[this.player2Score];
    }
}