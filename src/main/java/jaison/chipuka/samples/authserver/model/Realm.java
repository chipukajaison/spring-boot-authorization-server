package jaison.chipuka.samples.authserver.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "`realms`")
public class Realm {

    @Id
    private String id;
    private String displayName;
    private String themeName;          // "default", "dark", "acme"
    private boolean registrationAllowed;
    private boolean resetPasswordAllowed;
    private boolean emailVerificationRequired;
    private boolean otpRequired;       // force 2FA for all users
}
