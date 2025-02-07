package hiber.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="model")
    private String model;

    @Column(name="series")
    private int series;

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
}
