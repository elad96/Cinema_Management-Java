package Auxiliry;

public class Projection {
	private Integer pId;
	private Double ticketPrice;
	private Integer ticketsSold;
	private Integer pMovieID;
	private String pTheaterString;
	private String pDateString;
	private String pTimeProjectedString;
	
	public Projection(Integer cPId, Double cTicketPrice, Integer cTicketsSold, Integer cMovieId, String cPTheatreString, String cPDateString, String CPTimeProjectedString) {
		setpId(cPId);
		setTicketPrice(cTicketPrice);
		setTicketsSold(cTicketsSold);
		setpMovie(cMovieId);
		setpTheaterString(cPTheatreString);
		setpDateString(cPDateString);
		setpTimeProjectedString(CPTimeProjectedString);
		
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public Integer getTicketsSold() {
		return ticketsSold;
	}

	public void setTicketsSold(Integer ticketsSold) {
		this.ticketsSold = ticketsSold;
	}

	public Integer getpMovie() {
		return pMovieID;
	}

	public void setpMovie(Integer pMovieID) {
		this.pMovieID = pMovieID;
	}


	public String getpTheaterString() {
		return pTheaterString;
	}

	public void setpTheaterString(String pTheaterString) {
		this.pTheaterString = pTheaterString;
	}

	public String getpDateString() {
		return pDateString;
	}

	public void setpDateString(String pDateString) {
		this.pDateString = pDateString;
	}
	
	public String getpTimeProjectedString() {
		return pTimeProjectedString;
	}

	public void setpTimeProjectedString(String pTimeProjectedString) {
		this.pTimeProjectedString = pTimeProjectedString;
	}

}
