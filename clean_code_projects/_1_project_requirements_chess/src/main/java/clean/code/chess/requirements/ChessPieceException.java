package clean.code.chess.requirements;

public class ChessPieceException extends Exception
{
    private ChessPiece chessPiece;

    public ChessPieceException( String message, ChessPiece chessPiece )
    {
        super( message );
        this.chessPiece = chessPiece;
    }

    public ChessPieceException( String message, ChessPiece chessPiece, Throwable cause )
    {
        super( message, cause );
        this.chessPiece = chessPiece;
    }
}

