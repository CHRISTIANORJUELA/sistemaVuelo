package services.interfaces;

import models.Flyghts;
import models.Users;

public interface ReservedService {
    String generatedReserved(Users user, Flyghts flyghts);
}
