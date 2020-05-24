package ksp.vilius.recipe.services;

import ksp.vilius.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
