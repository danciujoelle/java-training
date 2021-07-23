package clean.code.chess.requirements;

public interface IChessPiece {
    void Move( MovementType movementType, int newXCoordinate, int newYCoordinate ) throws InvalidMovementException;

    boolean isValidMoveForChessPiece( int xCoordinate, int yCoordinate );

    boolean isValidCaptureForChessPiece( int xCoordinate, int yCoordinate );

}
