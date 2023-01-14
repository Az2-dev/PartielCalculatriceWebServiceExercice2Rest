package ma.ac.emi.partielcalculatricewebserviceexercice2rest.controllers;

import ma.ac.emi.partielcalculatricewebserviceexercice2rest.services.CalculatriceService;
import org.springframework.web.bind.annotation.*;

/**@RestController spécifie le type de type retour = format JSon*/
@RestController
@RequestMapping("/PartielCalculatriceWebServiceExercice2/calculatrice")

public class CalculatriceController {
  /**Injection de service via le constructeur CalculatriceController*/
  private final CalculatriceService calculatriceService;

  public CalculatriceController(CalculatriceService calculatriceService) {
    this.calculatriceService = calculatriceService;
  }


  /**Spécifier le type d'opération + valeurs des operandes dans le path variable */
  @GetMapping("/{operation}")
  public float operationAction(@PathVariable String operation,
                         @RequestParam("operande1") float operande1,
                         @RequestParam("operande2") float operande2) {

    /**Retourner le résultat selon type d'opération souhaité en faisant appel au service*/
    return switch (operation) {
      case "soustraire" -> calculatriceService.soustraire(operande1, operande2);
      case "multiplier" -> calculatriceService.multiplier(operande1, operande2);
      case "diviser" -> calculatriceService.diviser(operande1, operande2);
      default -> calculatriceService.additionner(operande1, operande2);
    };
  }
}
