public class Player {
    private int currentCard;

    public void Play() {
    BetMore_Game Bet = new BetMore_Game();
    currentCard = Bet.pickCard();
    }
    public int getCurrentCard(){
        return currentCard;
    }
}
