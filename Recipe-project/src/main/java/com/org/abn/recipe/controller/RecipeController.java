package com.org.abn.recipe.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.org.abn.recipe.dao.RecipeDAO;
import com.org.abn.recipe.model.Recipe;

@Controller
public class RecipeController {

	@Autowired
	RecipeDAO recipeDAO;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginUser(Model modelMap) {
		
		//Recipe recipe = new Recipe();
		//modelMap.addAttribute("recipe", recipe);
		return "login";

	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String mainPage(Model modelMap) {
		
		//Recipe recipe = new Recipe();
		//modelMap.addAttribute("recipe", recipe);
		return "main1";

	}
	
	
	

	@RequestMapping(value = "/getForm", method = RequestMethod.GET)
	public String newRecipe(Model modelMap) {
		Recipe recipe = new Recipe();
		modelMap.addAttribute("recipe", recipe);
		return "addRecipes";

	}

	@RequestMapping(value = "/recipes", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = {
			MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public String saveRecipe(@Valid Recipe recipe, BindingResult result, ModelMap model,
			RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "addRecipes";
		}
		recipeDAO.save(recipe);
		return "redirect:/viewrecipes";
	}

	@GetMapping("/viewrecipes")
	public ModelAndView getAllRecipe() {
		List<Recipe> list = recipeDAO.findAll();
		return new ModelAndView("viewRecipe", "list", list);
	}

	@GetMapping("/recipes/{id}")
	public ResponseEntity<Recipe> getRecipeById(@PathVariable(value = "id") Long recid) {
		Recipe rec = recipeDAO.findOne(recid);
		rec.getCreatedAt();
		if (rec == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Recipe>(rec, HttpStatus.OK);
	}

	@GetMapping("/editrecipe/{id}")
	public String editRecipe(@PathVariable(value = "id") Long recid, ModelMap modelMap) {
		Recipe rec = recipeDAO.findOne(recid);
		modelMap.addAttribute("recipe", rec);
		return "editRecipe";
	}

	@RequestMapping(value = "/editsave/{id}", method = RequestMethod.POST)
	public String editSave(@Valid @ModelAttribute("recipe") Recipe recipe) {
		Recipe rec = recipeDAO.findOne(recipe.getId());
		rec.setName1(recipe.getName1());
		rec.setCategory(recipe.getCategory());
		rec.setDetail(recipe.getDetail());
		rec.setVegOrNonveg(recipe.getVegOrNonveg());
		recipeDAO.save(rec);

		return "redirect:/viewrecipes";
	}

	@GetMapping("/deleterecipe/{id}")
	public String deleteRecipe(@PathVariable(value = "id") Long recid) {
		Recipe rec = recipeDAO.findOne(recid);
		recipeDAO.delete(rec);
		return "redirect:/viewrecipes";
	}

	@GetMapping("/deleteallrecipes")
	public String deleteAllRecipe() {
		recipeDAO.deleteAll();
		return "deleteMessage";
	}
}
