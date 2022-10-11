package chess;

import boardGame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetUp();
		
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	public void newPlacePiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	
	public void initialSetUp() {
		newPlacePiece('a', 8, new Rook(board, Color.BLACK));
		newPlacePiece('h', 8, new Rook(board, Color.BLACK));
		newPlacePiece('a', 1, new Rook(board, Color.WHITE));
		newPlacePiece('h', 1, new Rook(board, Color.WHITE));
		newPlacePiece('e', 8, new King(board, Color.BLACK));
		newPlacePiece('e', 1, new King(board, Color.WHITE));
	}
}




