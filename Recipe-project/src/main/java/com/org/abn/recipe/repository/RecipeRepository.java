package com.org.abn.recipe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.abn.recipe.model.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{

}
