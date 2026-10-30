# Product Explorer

Application Android de catalogue produit, construite pas à pas avec **Kotlin** et **Jetpack Compose** dans le cadre des TP du cours « Développement Android avec Jetpack Compose » (projet fil rouge `TPFilRouge`).

Les données sont pour l'instant **locales** (définies dans le code). Ce fichier est mis à jour à chaque TP.

## Fonctionnalités actuelles

- **Écran d'accueil** (`ProductHomeScreen`) : en-tête, barre de recherche visuelle, produit mis en avant, catégories, offre du jour.
- **Écran de détail produit** (`ProductDetailScreen`) : image, titre, marque, catégorie, prix et remise, note, stock et livraison, description, garantie, bouton « Ajouter au panier ».
- **Navigation simple** : le bouton « Voir le produit » de l'accueil ouvre le détail, et le bouton retour revient à l'accueil. Il s'agit d'un simple état (`showDetail`), pas encore de Navigation Compose.
- **Fiche produit de démonstration** (`ProductCardDemo.kt`) : carte cliquable avec bouton favori, conservée des premiers TP. Elle n'est pas affichée dans l'app, seulement dans les previews.

## Limites connues

- Le bouton « Ajouter au panier » et le bouton favori ne font rien (pas encore de gestion d'état).
- La barre de recherche est purement visuelle.
- L'image produit est un placeholder Android.
- Un seul produit est affiché dans l'app. Le second exemple (`sampleProductOutOfStock()`) n'apparaît que dans une preview.

## Stack technique

| Élément | Détail |
|---|---|
| Langage | Kotlin |
| UI | Jetpack Compose, Material 3 |
| Icônes | `material-icons-extended` |
| Dépendances | Version Catalog (`gradle/libs.versions.toml`) et Compose BOM |
| Package | `com.example.tpfilrouge` |

## Structure du code

```
app/src/main/java/com/example/tpfilrouge/
├── MainActivity.kt        Activité, ProductUi, données d'exemple, écran de détail et ses composants
├── ProductHomeScreen.kt   Écran d'accueil et ses sections
├── ProductCardDemo.kt     Fiche produit des TP 2 et 3
└── ui/theme/              Thème (couleurs, typographie)
```

## Lancer le projet

1. Ouvrir le dossier dans Android Studio.
2. Laisser Gradle se synchroniser (« Sync Now » si proposé).
3. Lancer sur un émulateur ou un téléphone (**Run**), ou ouvrir un fichier `.kt` et utiliser le volet **Preview** (« Build & Refresh »).

Vérification en ligne de commande :

```
./gradlew :app:compileDebugKotlin
```

## Historique des TP

| TP | Contenu | Statut |
|---|---|---|
| 1 | Première application, `Greeting`, `Surface`, `padding` | Fait (remplacé par la suite) |
| 2 | Composables, paramètres, « state down, events up » | Fait |
| 3 | Composants réutilisables, `Modifier`, accessibilité | Fait |
| 4 | Écran de détail produit (`Text`, `Image`, `Icon`, `Card`, `TextField`) | Fait |
| 5 | Écran d'accueil (`Column`, `Row`, `Box`, `Spacer`, `Surface`) | Fait |

## Prochaines étapes

- [ ] Catalogue local de produits avec listes (`LazyColumn`)
- [ ] Gestion d'état réelle (favoris, panier)
- [ ] Navigation entre écrans (Navigation Compose)
- [ ] Données distantes
