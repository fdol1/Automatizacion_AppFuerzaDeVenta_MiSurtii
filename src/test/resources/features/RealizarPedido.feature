# Autor: lpinedau@choucairtesting.com

Feature: Realizar un pedido en la app
  Como usuario de la app quiero realizar
  un pedido

  Background: Se inicia sesion en la app
    Given que Juan abre la app de SurtiMax
    When Iniciar sesion con sus datos
      | usuario    | clave      |
      | 0969947002 | 0969947002 |

  @RealizarPedido
  Scenario Outline: Intento de pedido, caso exitoso
    Given realiza un pedido en la app con la info del pedido
      | observacion   | fecha   | idCliente   | detallePedido   |
      | <observacion> | <fecha> | <idCliente> | <detallePedido> |
    Then al finalizar el pedido, ve su nombre en la pantalla de cliente
      | nombreCliente   |
      | <nombreCliente> |
    Examples:
      | observacion        | fecha         | nombreCliente             | idCliente       | detallePedido |
      | esto es una prueba | 24 junio 2022 | HERRERA HINCAPIE MAURICIO | 000001861863001 | 3118050       |