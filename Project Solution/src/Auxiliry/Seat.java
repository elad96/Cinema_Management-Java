package Auxiliry;

public class Seat {
	private String seatTheatreString;
	private Integer row;
	private Integer col;
	public Boolean isTaken;
	
	public Seat(String cSeatTheatreString, Integer cRow, Integer cCol)
	{
		setSeatTheatreString(cSeatTheatreString);
		setRow(cRow);
		setCol(cCol);
		isTaken=false;		
	}

	public String getSeatTheatreString() {
		return seatTheatreString;
	}

	public void setSeatTheatreString(String seatTheatreString) {
		this.seatTheatreString = seatTheatreString;
	}

	public Integer getCol() {
		return col;
	}

	public void setCol(Integer col) {
		this.col = col;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}
	
}
