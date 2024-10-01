public class Scoreboard
{
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;


    public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }

    public String getScore()
    {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }

    public void recordPlay(int score) {
        if (score > 0 && activeTeam == teamOne) {
            teamOneScore += score;
        } else if (score > 0 && activeTeam == teamTwo) {
            teamTwoScore += score;
        } else if (score == 0){
            if (activeTeam == teamOne) {
                activeTeam = teamTwo;
            } else if (activeTeam == teamTwo) {
                activeTeam = teamOne;
            }
        }
    }

}

