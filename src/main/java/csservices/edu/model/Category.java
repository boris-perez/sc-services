package csservices.edu.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@Entity
public class Category extends ModelBase {
    private String name;
    private String code;
}