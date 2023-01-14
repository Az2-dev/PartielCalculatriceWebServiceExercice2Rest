package ma.ac.emi.partielcalculatricewebserviceexercice2rest.services;

import org.springframework.stereotype.Service;

/**@Service = permet d'injecter le service dans le controller*/
@Service
public class CalculatriceService {

  /**Définir l'ensemble des opérations que notre "Calculatrice" va utiliser.*/
  public float additionner(float firstNumber, float secondNumber) {
    return firstNumber + secondNumber;
  }

  public float soustraire(float firstNumber, float secondNumber) {
    return additionner(firstNumber, -secondNumber);
  }

  public float multiplier(float firstNumber, float secondNumber) {
    return firstNumber * secondNumber;
  }

  public float diviser(float firstNumber, float secondNumber) {
    return multiplier(firstNumber, (float) 1 / secondNumber);
  }
}
