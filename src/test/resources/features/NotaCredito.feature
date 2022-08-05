# Autor: lpinedau@choucairtesting.com

Feature: Realizar una nota de credito en la app
  Como usuario de la app quiero realizar
  un nota de credito

  Background: Se inicia sesion en la app
    Given que Juan abre la app de SurtiMax
    When Iniciar sesion con sus datos
      | usuario    | clave      |
      | 0969947002 | 0969947002 |

  @RealizarNotaCredito
  Scenario Outline: Intento de nota de credito, caso exitoso
    Given que realiza una nota de credito en la app
      | nroFactura   | nroDetalle   |fechaI   | fechaF   | valorReal   | cantidad   | motivo   | idCliente   |
      | <nroFactura> | <nroDetalle> |<fechaI> | <fechaF> | <valorReal> | <cantidad> | <motivo> | <idCliente> |
    Then se verifica que la nota de credito se haya creado
    Examples:
      | nroFactura | nroDetalle | fechaI     | fechaF     | valorReal | cantidad | motivo  | idCliente       |
      | 9420505462 | 0937259    | 2022-06-16 | 2022-06-16 | 12920     | 2        | AVERIAS | 000001861863001 |