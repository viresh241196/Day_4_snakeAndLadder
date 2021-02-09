public class SnakeAndLadder {
    public static final int ladder = 2;
    public static final int snake = 1;

    public static void main(String[] args) {
        int position=0;
        int player=0;
        int dice = (int)Math.floor(Math.random() * 10 ) % 6+1;
        int option = (int)Math.floor(Math.random() * 10 ) % 3;
        if (option==ladder)
            position+=dice;
        else if (option==snake)
            position-=dice;
        System.out.println("dice output : "+dice);
        System.out.println("option output : "+option);
        System.out.println("position output : "+position);
    }
}