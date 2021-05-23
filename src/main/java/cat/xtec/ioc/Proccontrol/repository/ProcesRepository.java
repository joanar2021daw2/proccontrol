package cat.xtec.ioc.Proccontrol.repository;

import cat.xtec.ioc.Proccontrol.domain.Proces;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interfície del repositori de procés
 *
 * @author JoseAndrade
 */
public interface ProcesRepository extends JpaRepository<Proces, Long> {

    Proces findByNom(String nom);

    List<Proces> findByReferenciaIdReferencia(long idReferencia);
}
