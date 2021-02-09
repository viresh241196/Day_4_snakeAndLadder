public class SnakeAndLadder {
    public static final int ladder = 2;
    public static final int snake = 1;
    public static void main(String[] args) {
        int position = 0;
        int counter = 0;
        while (position<100) {
            int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
            int option = (int) Math.floor(Math.random() * 10) % 3;
            switch (option){
                case ladder:
                if (position + dice <= 100) {
                    position += dice;
                }
                break;
                case snake:
                if (position - dice >= 0) {
                    position -= dice;
                } else {
                    position = 0;
                }
                break;
            }
            counter++;
            System.out.println("position output : " + position);
        }
        System.out.println("dice was roll for : " + counter + " times");
    }
}