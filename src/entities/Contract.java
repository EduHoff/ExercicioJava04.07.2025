package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer number;
    private Date date;
    private Double totalValue;
    
    private List<Installment> installment = new ArrayList<>();

    public Contract(){

    }

    public Contract(Integer number, Date date, Double totalValue){
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }
    
    

}
