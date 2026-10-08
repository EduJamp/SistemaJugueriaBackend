package com.app.changui.web.controller;

import com.app.changui.domain.dto.CategoryDTO;
import com.app.changui.domain.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/categories" )
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // POST: http://localhost:8080/api/categories/create
    @PostMapping("/create")
    public ResponseEntity<CategoryDTO> create(@RequestBody CategoryDTO categoryDTO) {
        return new ResponseEntity<>(categoryService.createCategory(categoryDTO), HttpStatus.CREATED);
    }

    // GET: http://localhost:8080/api/categories
    @GetMapping("/all")
    public ResponseEntity<List<CategoryDTO>> getAll() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    // GET: http://localhost:8080/api/categories/1
    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO> getById(@PathVariable("id") Integer idCategory) {
        return categoryService.getByCategory(idCategory)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // PUT: http://localhost:8080/api/categories/1
    @PutMapping("/{id}")
    public ResponseEntity<CategoryDTO> update(@PathVariable("id") Integer idCategory,
                                              @RequestBody CategoryDTO categoryDTO) {
        return categoryService.updateCategory(idCategory, categoryDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // DELETE: http://localhost:8080/api/categories/1
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer idCategory) {
        if (categoryService.deleteCategory(idCategory)) {
            return ResponseEntity.noContent().build(); // 204 No Content
        }
        return ResponseEntity.notFound().build(); // 404 Not Found
    }
}
