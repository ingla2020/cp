package cp.repository;

import cp.model.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, Long> {

    @Query(value = "select T from Countries T")
    Optional<List<Countries>> listaPaises();

}
