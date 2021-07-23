package clean.code.chess.requirements;

public class ChessBoardException extends Exception {
    protected ChessBoard chessBoard;

    public ChessBoardException( String message, ChessBoard chessBoard )
    {
        super( message );
        this.chessBoard = chessBoard;
    }

    public ChessBoardException( String message, ChessBoard chessBoard, Throwable cause )
    {
        super( message, cause );
        this.chessBoard = chessBoard;
    }

    public ChessBoard getChessBoard()
    {
        return this.chessBoard;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder( "ChessboardException{" );
        sb.append( "chessBoard=" ).append( chessBoard );
        sb.append( '}' );
        return sb.toString();
    }
}
