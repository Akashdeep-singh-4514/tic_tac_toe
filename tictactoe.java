import java.util.Scanner;

public class tictactoe 
{
    static char board[][] = new char[3][3];

    void printboard() 
    {
        System.out.println(" "+board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("-----------");
        System.out.println(" "+board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("-----------");
        System.out.println(" "+board[2][0] + " | " + board[2][1] + " | " + board[2][2]);

    }
    void changevalue(int input,char s)
    {
        switch (input) 
            {
                case 1:
                    board[0][0] =s;
                    break;
                case 2:
                    board[0][1] =s;
                    break;
                case 3:
                    board[0][2] =s;
                    break;
                case 4:
                    board[1][0] =s;
                    break;
                case 5:
                    board[1][1] =s;
                    break;
                case 6:
                    board[1][2] =s;
                    break;
                case 7:
                    board[2][0] =s;
                    break;
                case 8:
                    board[2][1] =s;
                    break;
                case 9:
                    board[2][2] =s;
                    break;

                default:
                    break;
            }


    }
    boolean checkwinner()
    {
        if (board[0][0]==(board[0][1]) && board[0][1]==(board[0][2]) )
        {
            return true;
        }
        if (board[1][0]==(board[1][1]) && board[1][1]==(board[1][2]) )
        {
            return true;
        }
        if (board[2][0]==(board[2][1]) && board[2][1]==(board[2][2]) )
        {
            return true;
        }
        if (board[0][0]==(board[1][0]) && board[1][0]==(board[2][0]) )
        {
            return true;
        }
        if (board[0][1]==(board[1][1]) && board[1][1]==(board[2][1]) )
        {
            return true;
        }
        if (board[0][2]==(board[1][2]) && board[1][2]==(board[2][2]) )
        {
            return true;
        }
        if (board[0][0]==(board[1][1]) && board[1][1]==(board[2][2]) )
        {
            return true;
        }
        if (board[0][2]==(board[1][1]) && board[1][1]==(board[2][0]) )
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        tictactoe obj = new tictactoe();
        int c = 48;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++) 
            {

                c++;
                board[i][j] = (char) c;

            }

        }
        System.out.println("welcome to the game of TIC TAC TOE ");
        obj.printboard();
        

        for (int i = 0; i < 9; i++) 
        {
            if (i % 2 == 0) 
            {
                System.out.println("player 1's turn enter slot number.");
                int input = sc.nextInt();
                obj.changevalue(input,'X');
                obj.printboard();
                if (obj.checkwinner())
                {
                 System.out.println("player1 is winner");
                 break;
                }
            }
            
           
            if (i % 2 != 0) 
            {
                System.out.println("player 2's turn enter slot number.");
                int input = sc.nextInt();
                obj.changevalue(input,'O');
                obj.printboard();
                if (obj.checkwinner())
                {
                    System.out.println("player2 is winner");
                    break;
                    
                }
            
            }
            
            
           
        }

    }

}
