package csservices.edu.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Position extends ModelBase{
    private String name;
}