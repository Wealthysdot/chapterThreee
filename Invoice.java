package chapterThree;
public class Invoice{

    private String number;
    private String description;
    private int quantity;
    private double price;

    //constructor
    public Invoice(String number, String description, int quantity, double price){
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }
    //set and get
    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return number;
    }

    public void setDescription(String description){
        this.description = description;

    }
    public String getDescription(){
        return description;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;

    }
    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double price){
        this.price = price;

    }
    public double getPrice(){
        return price;
    }

//create method

    private double invoiceAmount;

    public double getInvoiceAmount(){

        if(quantity <= 0){
                price = 0;
        }
        invoiceAmount = quantity*price;
        return invoiceAmount;


    }


}

