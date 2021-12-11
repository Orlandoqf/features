#language: es
@CASOS
  Característica: Registrar Formulario
    Yo un nuevo cliente
    Quiero registrar mis datos
    Para que tengan mi informacion actualizada

    @CASO1
    Escenario: Registro de formulario con Datos Validos
      Dado que la web DEMOQA esta disponiblee
      Cuando registro mis datoss
      Y Doy Click en el botonn
      Entonces se muestran mis datos en la pantalla



    @CASO2
    Escenario: Hacer login en una pagina de pruebas
      Dado que la web Mercury tours esta disponible
      Cuando tipeo mis datos
      Y Doy Click en el boton
      Entonces se muestra un mensaje de exito