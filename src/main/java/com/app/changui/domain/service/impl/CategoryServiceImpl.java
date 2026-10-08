package com.app.changui.domain.service.impl;

import com.app.changui.domain.dto.CategoryDTO;
import com.app.changui.domain.mapper.CategoryMapper;
import com.app.changui.domain.service.CategoryService;

import com.app.changui.persistence.entity.Category;
import com.app.changui.persistence.repository.CategoryRepository;
import com.app.changui.util.enums.GeneralStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category = categoryMapper.toCategory(categoryDTO);

        category.setIdCategory(null);

        if (category.getStateCategory() == null) {
            category.setStateCategory(GeneralStatus.activo);
        }

        return categoryMapper.toCategoryDTO( categoryRepository.save(category) );
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream()
                .map( categoryMapper::toCategoryDTO )
                .collect( Collectors.toList() );
    }

    @Override
    public Optional<CategoryDTO> getByCategory(Integer idCategory) {
        return categoryRepository.findById(idCategory)
                .map(categoryMapper::toCategoryDTO);
    }

    @Override
    public Optional<CategoryDTO> updateCategory(Integer idCategory, CategoryDTO categoryDTO) {
        return categoryRepository.findById(idCategory)
                .map(existingCategory -> {
                    existingCategory.setNameCategory(categoryDTO.getNameCategory());
                    existingCategory.setDescription(categoryDTO.getDescriptionCategory());

                    if (categoryDTO.getStateCategory() != null) {
                        existingCategory.setStateCategory(categoryDTO.getStateCategory());
                    }

                    Category savedCategory = categoryRepository.save(existingCategory);
                    return categoryMapper.toCategoryDTO(savedCategory);
                });
    }


    @Override
    public boolean deleteCategory(Integer idCategory) {
        if (categoryRepository.existsById(idCategory)) {
            categoryRepository.deleteById(idCategory);
            return true;
        }
        return false;
    }
}
