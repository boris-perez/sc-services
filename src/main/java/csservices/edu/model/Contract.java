package csservices.edu.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Getter
@Setter
@Entity
public class Contract extends ModelBase{
    @OneToOne(optional = false)
    private Employee employee;

    @OneToOne(optional = false)
    private Position position;

    private Date initDate;
    private Date endDate;

}