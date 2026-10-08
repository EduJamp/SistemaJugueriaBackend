package com.app.changui.domain.service;

import com.app.changui.domain.dto.CategoryDTO;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    CategoryDTO createCategory(CategoryDTO categoryDTO); //crear
    List<CategoryDTO> getAllCategories(); //listar todas las categorias
    Optional<CategoryDTO> getByCategory(Integer idCategory); //buscar la categoria por su id
    Optional<CategoryDTO> updateCategory(Integer idCategory, CategoryDTO categoryDTO); //actualizar categoria
    boolean deleteCategory(Integer idCategory); //eliminar categoria
}
