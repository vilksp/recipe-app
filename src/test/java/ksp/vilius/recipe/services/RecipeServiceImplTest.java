package ksp.vilius.recipe.services;

import ksp.vilius.recipe.domain.Recipe;
import ksp.vilius.recipe.repositories.RecipeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {
    @Mock
    RecipeService recipeService;
    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository) {
        };
    }

    @Test
    public void getRecipes() {

        Recipe recipe = new Recipe();
        HashSet recipesData = new HashSet();
        recipesData.add(recipe);
        when(recipeRepository.findAll()).thenReturn(recipesData);


        Set<Recipe> recipes = recipeService.getRecipes();

        Assert.assertEquals(recipes.size(), 1);

        verify(recipeRepository,times(1)).findAll();
    }
}