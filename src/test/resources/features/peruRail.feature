@PeruRail
Feature: PeruRail
  Scenario Outline: Automazation Web Peru Rail
    Given el usuario ingresa a la pagina de PeruRail
    When selecciono el destino "<destino>", la ruta "<ruta>" y seleccionamos el tren "<tren>"
    And selecciona la fecha de salida "<mesAnioSalida>" y "<diaSalida>"
    And selecciono el tipo de cabina "<tipo_cabina>" u la cantidad de canibas "<cant_cabinas>"
    And ingresamos la informacion de los pasajeros
    | nombre | apellido | fecha_cumpleanio  | nacionalidad | tipo_documento       | nro_documento | sexo | tefefono | email          |
    | DORIS   | ARRAIZA | 31-12-1988        | Peru          | Identification Card | 45633761      | Male | 980643987 | test@gmail.com|
    When doy click en continuar en la pagina de pasajeros
    Then se mostrara la pantalla de pago "PAYMENT METHOD"
    And elegimos como "<metodo_pago>" e ingresamos el "<nro_tarjeta>", "<mes_expiracion>", "<anio_expiracion>", "<codigo_seguridad>" y "<nombre>"
    Examples:
      | destino | ruta       | tren                           | mesAnioSalida | diaSalida   | tipo_cabina  | cant_cabinas  | metodo_pago| nro_tarjeta      | mes_expiracion  | anio_expiracion | codigo_seguridad  | nombre |
      | Cusco   |Puno > Cusco|Andean Explorer, A Belmond Train| September 2022| 28          | SUITE        | 1 CABIN       | visa       | 4242424242424242 | 12              | 25              | 123               | Doris  |