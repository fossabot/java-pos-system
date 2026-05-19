package com.pos.service;


import com.pos.exception.UserException;
import com.pos.payload.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    CategoryDTO createCategory(CategoryDTO dto) throws UserException;
    List<CategoryDTO> getCategoriesByStore(Long storeId);
    CategoryDTO updateCategory(Long id, CategoryDTO dto) throws UserException;
    void deleteCategory(Long id) throws UserException;
}
