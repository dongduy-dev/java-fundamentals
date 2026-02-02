package OOP.MovieManagement;

public class Movie {
	private String title;
	private int productionYear;
	private Producer producer;
	private double price;
	private Date releaseDate;
	
	public Movie(String title, int productionYear, Producer producer, double price, Date releaseDate){
		this.title = title;
		this.productionYear = productionYear;
		this.producer = producer;
		this.price = price;
		this.releaseDate = releaseDate;
	}

    public String getTitle() {
        return title;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public Producer getProducer() {
        return producer;
    }

    public double getPrice() {
        return price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

	public boolean checkCheaperPrice(Movie movie){
		return (this.price < movie.getPrice());
	}

	public String getProducerName(){
		return this.producer.getName();
	}

	public double priceAfterDiscount(double x){
//		return (price - (price * x / 100.0));
        return (price*(1 - x / 100.0));
	}

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", productionYear=" + productionYear +
                ", producer=" + producer +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
























