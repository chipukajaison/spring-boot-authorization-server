package jaison.chipuka.samples.authserver.repository;

import jaison.chipuka.samples.authserver.model.OAuthClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OAuthClientRepository extends JpaRepository<OAuthClient, String> {
    Optional<OAuthClient> findByClientId(String clientId);
}
