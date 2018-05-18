package xyz.geo.qqz.main.controller.subcategory;

import org.springframework.data.repository.CrudRepository;
import xyz.geo.qqz.main.entity.category.SubCategory;
import xyz.geo.qqz.main.entity.category.SubCategoryPK;

public interface SubCategoryRepository extends CrudRepository<SubCategory, SubCategoryPK> {
    Iterable<SubCategory> findSubCategoriesByParentnameLike(String parentname);
}
