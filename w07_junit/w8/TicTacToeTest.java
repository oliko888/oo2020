import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void firstTest() {
        TicTacToe objj = new TicTacToe();
        objj.populateEmptyBoard();
        assertEquals("8th element is 9", TicTacToe.board[8], "9");
    }

    @Test
    public void secondTest() {
        TicTacToe objj = new TicTacToe();
        assertEquals(objj.checkWinner(), null);
        /* NULL - mangige edasi, DRAW - koik kaigud kaidud
           O/X - voitja */
    } 
} 