package com.bsuir.repository;

import com.bsuir.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Interface of Category repository that extends CrudRepository. Contains CRUD methods.
 *
 * @author Stsiapan Balashenka
 * @version 1.0
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, UUID> {
    Category findFirstByName(String name);
}

