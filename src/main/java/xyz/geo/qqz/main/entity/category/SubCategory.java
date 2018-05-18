package xyz.geo.qqz.main.entity.category;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(SubCategoryPK.class)
@Table(name="qq_subcategory")
public class SubCategory {
    @Id
    private String name;
    @Id
    private String parentname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }
}
