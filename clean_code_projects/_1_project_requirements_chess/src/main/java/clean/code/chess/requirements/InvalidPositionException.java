package clean.code.chess.requirements;

public class InvalidPositionException extends ChessBoardException {
        protected int xCoordinate;
        protected int yCoordinate;

        public InvalidPositionException( String message, ChessBoard chessBoard, int xCoordinate, int yCoordinate )
        {
            super( message, chessBoard );
            this.xCoordinate = xCoordinate;
            this.yCoordinate = yCoordinate;
        }

        public InvalidPositionException( String message, ChessBoard chessBoard, int xCoordinate, int yCoordinate, Throwable cause )
        {
            super( message, chessBoard, cause );
            this.xCoordinate = xCoordinate;
            this.yCoordinate = yCoordinate;
        }

        public int getxCoordinate()
        {
            return xCoordinate;
        }

        public int getyCoordinate()
        {
            return yCoordinate;
        }

        @Override
        public String toString()
        {
            final StringBuilder sb = new StringBuilder( "InvalidPositionException{" );
            sb.append( "chessboard=" ).append( getChessBoard() );
            sb.append( ", xCoordinate=" ).append( xCoordinate );
            sb.append( ", yCoordinate=" ).append( yCoordinate );
            sb.append( '}' );
            return sb.toString();
        }
}
