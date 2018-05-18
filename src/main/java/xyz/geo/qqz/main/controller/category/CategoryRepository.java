package xyz.geo.qqz.main.controller.category;

import org.springframework.data.repository.CrudRepository;
import xyz.geo.qqz.main.entity.category.Category;

public interface CategoryRepository extends CrudRepository<Category, String> {
    Iterable<Category> findCategoryByNameEquals(String name);
}
