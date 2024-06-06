Feature: Login na Loja Online

  Scenario Outline: Fazer login com sucesso
    Given Eu estou na página inicial da loja Online
    When Eu clico no botão para fazer o login
    And Digito e-mail válido "<email>"
    And Digito password válida "<password>"
    And Clico para iniciar a sessão
    Then Eu sou direcionado para a página de de pedidos

    Examples:
      | email             | password  |
      | jsilvamtc@yopmail.com | Recif&01 |
