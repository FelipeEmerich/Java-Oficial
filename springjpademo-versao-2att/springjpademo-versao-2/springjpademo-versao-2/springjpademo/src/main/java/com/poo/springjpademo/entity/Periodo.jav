import com.poo.springjpademo.entity.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodoRepository extends JpaRepository<Periodo, Long> {
}