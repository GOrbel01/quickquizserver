package xyz.geo.qqz.main.entity.category;

import java.io.Serializable;

public class SubCategoryPK implements Serializable {
    private String parentname;
    private String name;

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubCategoryPK that = (SubCategoryPK) o;

        return ((this.name.equals(that.name)) && (this.parentname.equals(that.parentname)));
    }

    @Override
    public int hashCode() {
        int result = parentname != null ? parentname.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
