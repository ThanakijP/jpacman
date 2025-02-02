package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/***
 * Board.
 */
public class BoardTest {

    private Board board;

    /***
     * Board.setUp.
     */
    @BeforeEach
    void setUp() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);
    }

    /***
     * Board.testBoard.
     */
    @Test
    void testBoard() {
        assertEquals(1, board.getWidth());
        assertEquals(1, board.getHeight());
    }

    /*
    @Test
    void testSquareAt() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;
        board = new Board(grid);
        assertNull(board.squareAt(0, 0));
    }
    */
}
