package clean.code.chess.requirements;
public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) throws InvalidPositionException {
        if ( !IsLegalBoardPosition( xCoordinate, yCoordinate ) )
        {
            throw new InvalidPositionException( "Position: " + xCoordinate + "," + yCoordinate + " outwith board limits", this, xCoordinate, yCoordinate);
        }
        pawn.setXCoordinate( xCoordinate );
        pawn.setYCoordinate( yCoordinate );
        pawn.setChessBoard( this );
        this.pieces[xCoordinate][yCoordinate] = pawn;
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if ( xCoordinate < 0 || xCoordinate >= MAX_BOARD_WIDTH || yCoordinate < 0 || yCoordinate >= MAX_BOARD_HEIGHT )
        {
            System.out.println( "Coordinate: {"+xCoordinate+"},{"+yCoordinate+"} is outwith this board's limits");
            return false;
        }

        if ( null != getPieceAtCoordinate( xCoordinate, yCoordinate ) )
        {
            System.out.println("Coordinate: {"+xCoordinate+"},{"+yCoordinate+"} is already populated");
            return false;
        }

        return true;
    }

    public Pawn getPieceAtCoordinate( int xCoordinate, int yCoordinate )
    {
        return this.pieces[xCoordinate][yCoordinate];
    }
}