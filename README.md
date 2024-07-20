# projet-suivi-promo-mars-2024

### Projet de Fin de Formation en Java avec Angular : Système de Gestion de Restaurant

#### Objectif :
Développer un système de gestion de restaurant permettant de gérer les réservations, les commandes, et la facturation des clients. Le backend sera développé en Java avec Spring Boot, et le frontend sera développé en Angular.

#### Spécifications Techniques de Base :
1. **Langage de Programmation** : Java
2. **Framework Backend** : Spring Boot v3.3.2
3. **Base de Données** : PostgreSQL
4. **ORM** : Hibernate
5. **Framework Frontend** : Angular v17
6. **Gestion des Dépendances (Backend)** : Maven v3.9.6
7. **Gestion des Dépendances (Frontend)** : npm
8. **Authentification** : Spring Security (Backend) et JWT (Frontend)
9. **Tests Unitaires (Backend)** : JUnit5 Mockito
10. **Tests Unitaires (Frontend)** : Jasmine et Karma
11. **Gestion des Versions** : Git

#### Fonctionnalités Principales :
1. Gestion des utilisateurs (clients et administrateurs)
2. Gestion des réservations de tables
3. Gestion des menus et des plats
4. Prise de commande et facturation
5. Notifications (confirmation de réservation, commande prête)
6. Historique des commandes et des réservations

#### User Stories et Découpage des Features :

##### User Story 1 : Enregistrement et Authentification
**En tant que** nouveau client, **je veux** pouvoir m'inscrire et me connecter au système **afin de** pouvoir réserver une table et passer des commandes.

- **Feature 1.1** : Inscription des utilisateurs (Frontend et Backend)
    - Champs requis : Nom, Prénom, Email, Mot de passe, Numéro de téléphone
    - API : POST `/api/users/register`
    - Composant Angular : Formulaire d'inscription

- **Feature 1.2** : Authentification des utilisateurs (Frontend et Backend)
    - Utiliser Spring Security pour la gestion des sessions et JWT pour l'authentification
    - API : POST `/api/users/login`
    - Composant Angular : Formulaire de connexion

##### User Story 2 : Gestion des Réservations de Tables
**En tant que** client, **je veux** pouvoir réserver une table **afin de** garantir une place au restaurant.

- **Feature 2.1** : Réservation de tables (Frontend et Backend)
    - Champs requis : Date, Heure, Nombre de personnes, Préférences (si disponible)
    - API : POST `/api/reservations`
    - Composant Angular : Formulaire de réservation

- **Feature 2.2** : Confirmation et annulation de réservation (Frontend et Backend)
    - API : GET `/api/reservations/{id}`, DELETE `/api/reservations/{id}`
    - Composant Angular : Vue des réservations

##### User Story 3 : Gestion des Menus et des Plats
**En tant que** administrateur, **je veux** pouvoir gérer les menus et les plats **afin de** tenir à jour l'offre culinaire du restaurant.

- **Feature 3.1** : Ajout de nouveaux plats au menu (Frontend et Backend)
    - Champs requis : Nom du plat, Description, Prix, Catégorie (entrée, plat principal, dessert)
    - API : POST `/api/menus`
    - Composant Angular : Formulaire d'ajout de plat

- **Feature 3.2** : Modification et suppression des plats (Frontend et Backend)
    - API : PUT `/api/menus/{id}`, DELETE `/api/menus/{id}`
    - Composant Angular : Formulaire de modification, Vue des plats pour la suppression

- **Feature 3.3** : Consultation des menus (Frontend et Backend)
    - API : GET `/api/menus`
    - Composant Angular : Vue des menus

##### User Story 4 : Prise de Commande
**En tant que** client, **je veux** pouvoir passer des commandes **afin de** choisir mes plats préférés.

- **Feature 4.1** : Sélection de plats et ajout au panier (Frontend)
    - Composant Angular : Sélection des plats

- **Feature 4.2** : Validation de la commande (Frontend et Backend)
    - API : POST `/api/orders`
    - Composant Angular : Panier et validation de commande

- **Feature 4.3** : Affichage du récapitulatif de commande et du total à payer (Frontend)
    - Composant Angular : Récapitulatif de commande

##### User Story 5 : Facturation
**En tant que** client, **je veux** recevoir une facture **afin de** payer mes commandes.

- **Feature 5.1** : Génération de la facture après validation de la commande (Backend)
    - API : GET `/api/orders/{id}/invoice`

- **Feature 5.2** : Affichage et téléchargement de la facture (Frontend)
    - Composant Angular : Vue de la facture

##### User Story 6 : Notifications
**En tant que** client, **je veux** recevoir des notifications **afin de** savoir quand ma table est réservée ou quand ma commande est prête.

- **Feature 6.1** : Notification par email pour la confirmation de réservation (Backend)
    - API : POST `/api/notifications/reservation`

- **Feature 6.2** : Notification par email ou SMS pour informer que la commande est prête (Backend)
    - API : POST `/api/notifications/order`

##### User Story 7 : Historique des Commandes et Réservations
**En tant que** client, **je veux** pouvoir consulter l'historique de mes commandes et réservations **afin de** suivre mes activités passées au restaurant.

- **Feature 7.1** : Affichage de l'historique des réservations (Frontend et Backend)
    - API : GET `/api/users/{id}/reservations`
    - Composant Angular : Vue de l'historique des réservations

- **Feature 7.2** : Affichage de l'historique des commandes (Frontend et Backend)
    - API : GET `/api/users/{id}/orders`
    - Composant Angular : Vue de l'historique des commandes

#### Plan de Réalisation :

##### 1. Initialisation du Projet
1. **Backend :**
    - Créer le projet Spring Boot avec Maven.
    - Ajouter les dépendances nécessaires dans le fichier `pom.xml` (Spring Boot, Hibernate, PostgreSQL, Spring Security).
    - Configurer la base de données PostgreSQL et Hibernate dans `application.properties` ou `application.yml`.
    - Configurer Spring Security pour la gestion des sessions et l'utilisation de JWT.

2. **Frontend :**
    - Initialiser le projet Angular avec Angular CLI.
    - Installer les dépendances nécessaires (Angular Material, Angular JWT).
    - Configurer les routes et les composants de base.

##### 2. Développement des Fonctionnalités de Base
1. **Backend :**
    - Implémenter les entités JPA pour les utilisateurs, les réservations, les plats, les commandes, etc.
    - Développer les contrôleurs REST pour les opérations CRUD.
    - Mettre en place JWT pour l'authentification.

2. **Frontend :**
    - Créer les services Angular pour interagir avec les API REST.
    - Développer les composants de base pour l'inscription et la connexion des utilisateurs.

##### 3. Gestion des Réservations de Tables
1. **Backend :**
    - Implémenter les services et contrôleurs nécessaires pour gérer les réservations.

2. **Frontend :**
    - Développer les composants Angular pour permettre la réservation et la gestion des réservations.

##### 4. Gestion des Menus et des Plats
1. **Backend :**
    - Implémenter les services et contrôleurs pour la gestion des plats et des menus.

2. **Frontend :**
    - Développer les composants pour ajouter, modifier, supprimer et consulter les plats et les menus.

##### 5. Prise de Commande et Facturation
1. **Backend :**
    - Implémenter les services et contrôleurs pour la prise de commande et la génération de factures.

2. **Frontend :**
    - Développer les composants pour permettre aux utilisateurs de passer des commandes et consulter les factures.

##### 6. Système de Notification
1. **Backend :**
    - Configurer le système de notification (email/SMS).
    - Implémenter les services pour envoyer des notifications.

2. **Frontend :**
    - Développer les composants pour afficher les notifications aux utilisateurs.

##### 7. Historique des Commandes et Réservations
1. **Backend :**
    - Implémenter les services et contrôleurs pour gérer l'historique des commandes et réservations.

2. **Frontend :**
    - Développer les composants pour afficher l'historique des commandes et réservations aux utilisateurs.

##### 8. Tests et Validation
1. **Backend :**
    - Écrire des tests unitaires avec JUnit pour toutes les fonctionnalités.

2. **Frontend :**
    - Écrire des tests unitaires avec Jasmine et Karma pour les composants et services.

##### 9. Déploiement
1. **Documentation du Projet :**
    - Rédiger une documentation complète du projet, incluant les spécifications techniques, les instructions d'installation et d'utilisation, ainsi que la documentation du code.

2. **Préparation pour le Déploiement :**
    - Préparer le package de l'application pour le déploiement.
    - Fournir des instructions claires pour installer et configurer l'application sur un serveur de production.

3. **Déploiement sur un Serveur de Production :**
    - Déployer l'application sur un serveur de production (par exemple, AWS, Heroku, etc.).
    - Effectuer les tests finaux pour s'assurer que tout fonctionne correctement en production.
