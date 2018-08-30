package guru.springframework.repositories;

import guru.springframework.controllers.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
