package adapters;

import abstracrs.UserCheckService;
import entities.User;

import mernisService.USJKPSPublicSoap12;

public class MernisServiceAdapter implements UserCheckService {
    @Override
    public boolean checkIfRealPerson(User user) {
        USJKPSPublicSoap12 client = new USJKPSPublicSoap12();
        try {
            return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getDateOfBirth().getYear());
        } catch (Exception e) {
            return false;
        }
    }
}
