package clean.code.chess.requirements;

public class Pawn extends ChessPiece{

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move( MovementType movementType, int newXCoordinate, int newYCoordinate ) throws InvalidMovementException
    {
        switch ( movementType )
        {
            case MOVE: {
                if (!isValidMoveForChessPiece(newXCoordinate, newYCoordinate)) {
                    throw new InvalidMovementException("Invalid movement", this, newXCoordinate, newYCoordinate, movementType);
                }
                break;
            }
            case CAPTURE: {
                if (!isValidCaptureForChessPiece(newXCoordinate, newYCoordinate)) {
                    throw new InvalidMovementException("Invalid movement", this, newXCoordinate, newYCoordinate, movementType);
                }
                break;
            }
            default:
                throw new InvalidMovementException( "Unrecognised MovementType: " + movementType, this, newXCoordinate, newYCoordinate, movementType );
        }

        ChessPiece occupyingPiece = getChessBoard().getPieceAtCoordinate( newXCoordinate, newYCoordinate );

        if ( occupyingPiece != null )
        {
            if ( this.getPieceColor().equals( occupyingPiece.getPieceColor() ) )
            {
                throw new InvalidMovementException( "A Chess piece on the same side already exists at position " + newXCoordinate + "," + newYCoordinate, this, newXCoordinate, newYCoordinate, movementType );
            }

            this.capturePiece( occupyingPiece );
        }

        this.setXCoordinate( newXCoordinate );
        this.setYCoordinate( newYCoordinate );

    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }


    public boolean isValidMoveForChessPiece( int xCoordinate, int yCoordinate )
    {
        // Pawns can only move one space forward
        if ( this.getInitYCoordinate() - 2 < 0 )
        {
            return ( yCoordinate - this.getYCoordinate() == 1 );
        }
        else
        {
            return ( yCoordinate - this.getYCoordinate() ) == -1;

        }


    }

    public boolean isValidCaptureForChessPiece( int xCoordinate, int yCoordinate )
    {
        throw new UnsupportedOperationException( "Need to implement Pawn.isValidCaptureForChessPiece()" );
    }
}