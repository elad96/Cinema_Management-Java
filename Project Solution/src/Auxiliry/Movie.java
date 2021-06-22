package Auxiliry;

public class Movie {
	private Integer mId;
	private Integer yearPublished;
	private Double duration;
	private Integer ticketsSold;
	private Double moneyEarned;
	private String movieNameString;	
	private String directorString;
	private String descriptionString;
	
	public Movie(String cmovieName, Integer cmID)
	{
		setmId(cmID);
		setMovieName(cmovieName);
	}
	
	public Movie(Integer cMid, Integer cYearPublished, double cDuration, String cMovieName, String cDirector, String cDescription)
	{
		setmId(cMid);
		setYearPublished(cYearPublished);
		setDuration(cDuration);		
		setMovieName(cMovieName);
		setDirector(cDirector);
		setDescription(cDescription);		
	}
	
	public Integer getmId() {
		return mId;
	}
	public void setmId(Integer mId) {
		this.mId = mId;
	}
	public Integer getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(Integer yearPublished) {
		this.yearPublished = yearPublished;
	}
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	public Integer getTicketsSold() {
		return ticketsSold;
	}
	public void setTicketsSold(Integer ticketsSold) {
		this.ticketsSold = ticketsSold;
	}
	public Double getMoneyEarned() {
		return moneyEarned;
	}
	public void setMoneyEarned(Double moneyEarned) {
		this.moneyEarned = moneyEarned;
	}
	public String getMovieName() {
		return movieNameString;
	}
	public void setMovieName(String movieName) {
		this.movieNameString = movieName;
	}
	public String getDirector() {
		return directorString;
	}
	public void setDirector(String director) {
		this.directorString = director;
	}
	public String getDescription() {
		return descriptionString;
	}
	public void setDescription(String description) {
		descriptionString = description;
	}
	
	
}
