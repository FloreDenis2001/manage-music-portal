package ro.mycode.managemusicportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.mycode.managemusicportal.model.Singer;

@Repository
public interface SingerRepository extends JpaRepository<Singer,Long> {
}
