package ksp.vilius.recipe.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest {
    Category category;

    @Before
    public void setUp() {

        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4l;
        category.setId(idValue);
        Assert.assertEquals(idValue, category.getId());

    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}