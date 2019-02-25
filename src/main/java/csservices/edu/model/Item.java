package csservices.edu.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Getter
@Setter
@Entity
public class Item extends ModelBase{
    private String name;
    private String code;
    private Byte[] image;

    @OneToOne(targetEntity = SubCategory.class)
    private SubCategory subCategory;

}