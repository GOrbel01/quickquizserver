package xyz.geo.qqz.main.controller.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xyz.geo.qqz.main.entity.category.Category;
import xyz.geo.qqz.main.entity.category.SubCategory;

@Controller
@CrossOrigin(origins="http://localhost:3001")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("cat/all")
    @ResponseBody
    Iterable<Category> getCategories() {
        Iterable<Category> cats = categoryRepository.findAll();
        System.out.println("At CATS!");
        cats.forEach(c -> System.out.println(c.getName()));
        return cats;
    }

    @GetMapping("cat/search")
    @ResponseBody
    Iterable<Category> getCategoryByName(@RequestParam String catName) {
        Iterable<Category> cat = categoryRepository.findCategoryByNameEquals(catName);
        return cat;
    }

}
