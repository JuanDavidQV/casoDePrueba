#language: es

  Característica: Validar que los elementos realicen sus acciones correspondientes
  Yo como usuario
  Quiero ingresar mis credenciales y cancelar el logueo
  Para validar que los botones estén funcionando correctamente
#    @ObtenerUno
#  Escenario: Validar que el botón cancelar del login funcione
#    Dado que ingreso al sitio web
#    Cuando seleccione el logueo e ingrese mi usuario pruebas@gmail.com y seleccione cancelar
#    Entonces se cerrará el cuadro del login

    @ObtenerUno
    Escenario: Realizar una busqueda de hotel
      Dado que ingreso al sitio webb
      Cuando seleccione el lugar
      Y seleccione los datos con los parametros establecido
      Entonces se debe seleccionar el hotel más económico que cumpla con los filtros