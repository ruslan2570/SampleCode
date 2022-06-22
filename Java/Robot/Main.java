public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.DOWN);
        moveRobot(robot, -5, -10);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
       
        while(robot.getDirection() != Direction.DOWN)
            robot.turnLeft();

        

        if(robot.getX() < toX)
            robot.turnLeft();
        else robot.turnRight();

        while(robot.getX() != toX){
            robot.stepForward();
            printMap(robot, toX, toY);
        }

        if(robot.getY() < toY){    
            while(robot.getDirection() != Direction.UP)
                robot.turnLeft();
            }
            else {
                while(robot.getDirection() != Direction.DOWN)
                robot.turnLeft();
            }

        while(robot.getY() != toY){
            robot.stepForward();
            printMap(robot, toX, toY);
        }

    }

    static int minX, minY, maxX, maxY;
    static boolean flag;
    public static void printMap(Robot robot, int toX, int toY){
    
        if(!flag){

            if(robot.getX() > toX){
                minX = toX;
                maxX = robot.getX();
            } else{
                minX = robot.getX();
                maxX = toX;
            }

            if(robot.getY() > toY){
                minY = toY;
                maxY = robot.getY();
            } else{
                minY = robot.getY();
                maxY = toY;
            }

           //flag = true;
    }

        for(int i=maxY; i>=minY; i--){
            for(int j=maxX; j>=minX; j--){
                if(i == robot.y && j == robot.x){
                    System.out.print("*");
                } else if(i == toY && j == toX){
                    System.out.print("!");
                }
                else System.out.print(".");
            }
            System.out.println();
        }

        if(robot.getX() == toX && robot.getY() == toY){
            System.out.println("Robot is win!");
        }
    }
}