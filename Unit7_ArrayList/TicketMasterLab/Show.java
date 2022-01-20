package Unit7_ArrayList.TicketMasterLab;

public class Show {
    private String date;
    private Double price;
    private Integer quantity;
    private String performer;
    private String city;

    public Show(String date, Double price, Integer quantity, String performer, String city) {
        this.date = date;
        this.price = price;
        this.quantity = quantity;
        this.performer = performer;
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString(){
        String row = "";
        row += date + "\t$" + price + "\t\t" + quantity + "\t\t" + performer;
        if(performer.length() <= 11 && performer.length() >= 7){
            row += "\t\t\t\t" + city;
        }
        else if(performer.length() <= 15 && performer.length() >= 12){
            row += "\t\t\t" + city;
        }
        else if(performer.length() >= 16){
            row += "\t\t" + city;
        }
        else{
            row += "\t\t\t\t\t" + city;
        }
        return row + "\n";
    }
}
