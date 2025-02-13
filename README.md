# Getting Started

- mvn clean install à la racine
- lancer TestMatawanApplication

Pour tester l'API: installer Postman ou autre logiciel capable d'envoyer et gérer des requêtes HTTP

# URLs mappées

- localhost:8080/player (GET)
- localhost:8080/player/{id} (GET)
- localhost:8080/team(?page=[])(?size=[])(?sortBy=[]) (GET)
- localhost:8080/team/{id} (GET)
- localhost:8080/team (POST)