package com.org.abn.recipe.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.abn.recipe.model.Recipe;
import com.org.abn.recipe.repository.RecipeRepository;

@Service
@Transactional
public class RecipeDAO {

	@Autowired
	RecipeRepository recipeRepository;
	
	public Recipe save(Recipe rec) {
		return recipeRepository.save(rec);
	}
	
	public List<Recipe> findAll(){
		return recipeRepository.findAll();
	}
	
	public Recipe findOne(Long recid) {
		return recipeRepository.findById(recid).orElse(null);
	}
	
	public void delete(Recipe rec) {
		recipeRepository.delete(rec);
	}
	
	public void deleteAll() {
		recipeRepository.deleteAll();
	}
}
