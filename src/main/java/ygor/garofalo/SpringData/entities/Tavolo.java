package ygor.garofalo.SpringData.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Tavolo {


    @Id
    @GeneratedValue
    private long id;


    private int numTable;
    private int numMaxCoperti;
    private boolean isFree;
    private double costoCoperto;

//    @OneToOne
//    @JoinColumn(name = "order_id")
//    private Order order;

    public Tavolo(int numTable, int numMaxCoperti, boolean isFree, double costoCoperto) {
        this.numTable = numTable;
        this.numMaxCoperti = numMaxCoperti;
        this.isFree = isFree;
        this.costoCoperto = costoCoperto;

    }

    public void print() {
        System.out.println("numero tavolo--> " + numTable);
        System.out.println("numero massimo coperti--> " + numMaxCoperti);
        System.out.println("occupato/libero--> " + (this.isFree ? "Libero" : "Occupato"));
    }
}
