package ksp.vilius.recipe.repositories;

import ksp.vilius.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {

}
