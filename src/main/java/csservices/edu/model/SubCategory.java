package csservices.edu.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Getter
@Setter
@Entity

public class SubCategory extends ModelBase{
    private String name;
    private String code;

    @OneToOne(optional = false)
    private Category category;
}