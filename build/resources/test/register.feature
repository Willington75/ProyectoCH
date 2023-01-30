
  Feature: User want to register in the page

    @register
    Scenario: Register User
      Given User open the page startsharp
      When  Click in the link 'Registrar una cuenta nueva'
      And   User fills out formulary
      Then  User can validate his activate account
