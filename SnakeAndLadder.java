public class SnakeAndLadder {
    public static final int ladder = 2;
    public static final int snake = 1;
    public static final int no_pay = 0;

    public static void main(String[] args) {
        int player1 = 0;
        int player2 = 0;
        int checker = 1;
        while (true) {
            if (player1 == 100 || player2 == 100)
                break;
            int dice1 = (int) Math.floor(Math.random() * 10) % 6 + 1;
            int option = (int) Math.floor(Math.random() * 10) % 3;
            switch (checker) {
                case 1:
                    switch (option) {
                        case ladder:
                            checker = 1;
                            if (player1 + dice1 <= 100) {
                                player1 += dice1;
                            }
                            break;
                        case snake:
                            if (player1 - dice1 >= 0) {
                                player1 -= dice1;
                            } else {
                                player1 = 0;
                            }
                            checker = 2;
                            break;
                        default:
                            checker = 2;
                    }
                    System.out.println("dice outcome " + dice1);
                    System.out.println("option case outcome " + option);
                    System.out.println("player1 position " + player1);
                case 2:
                    switch (option) {
                        case ladder:
                            checker = 2;
                            if (player2 + dice1 <= 100) {
                                player2 += dice1;
                            }
                            break;
                        case snake:
                            if (player2 - dice1 >= 0) {
                                player2 -= dice1;
                            } else {
                                player2 = 0;
                            }
                            checker = 1;
                            break;
                        default:
                            checker = 1;
                    }
                    System.out.println("dice outcome " + dice1);
                    System.out.println("option case outcome " + option);
                    System.out.println("player2 position " + player2);
            }
        }
        if (player1 == 100)
            System.out.println("player1 won");
        else
            System.out.println("player2 won");
    }
}
