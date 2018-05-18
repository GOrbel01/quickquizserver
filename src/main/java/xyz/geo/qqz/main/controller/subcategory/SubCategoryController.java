package xyz.geo.qqz.main.controller.subcategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.geo.qqz.main.entity.category.SubCategory;

@Controller
@RequestMapping("subcat")
public class SubCategoryController {
    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @GetMapping("/query")
    @ResponseBody
    Iterable<SubCategory> getSubcategories(@RequestParam String catName) {
        return subCategoryRepository.findSubCategoriesByParentnameLike(catName);
    }
}
