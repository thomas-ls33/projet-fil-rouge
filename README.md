# Product Explorer

Application Android de catalogue produit, construite pas à pas avec **Kotlin** et **Jetpack Compose** dans le cadre des TP du cours « Développement Android avec Jetpack Compose » (projet fil rouge `TPFilRouge`).

Les données sont pour l'instant **locales** (définies dans le code). Ce fichier est mis à jour à chaque TP.

## Fonctionnalités actuelles

- **Catalogue de produits** (`ProductCatalogScreen`) : écran de lancement. Un `LazyColumn` affiche un titre, une description, une ligne de catégories (`LazyRow`) et quatre produits sous forme de cartes.
- **Écran de détail produit** (`ProductDetailScreen`) : image, titre, marque, catégorie, prix et remise, note, stock et livraison, description, garantie, bouton « Ajouter au panier ».
- **Navigation simple** : le bouton « Voir le produit » d'une carte ouvre le détail de ce produit, et le bouton retour revient au catalogue. Il s'agit d'un simple état (`selectedProduct`), pas encore de Navigation Compose.
- **Thème Material 3** : palettes claire et sombre, typographie et formes personnalisées, appliquées à toute l'application. Les couleurs dynamiques (Material You) sont désactivées.
- **Écran d'accueil** (`ProductHomeScreen`) et **fiche produit de démonstration** (`ProductCardDemo.kt`) : conservés des TP précédents, mais non affichés dans l'app (visibles seulement dans les previews).

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
├── MainActivity.kt         Activité, ProductUi, produits d'exemple, écran de détail et ses composants
├── ProductCatalogScreen.kt Catalogue, liste de produits, catégories
├── ProductHomeScreen.kt    Écran d'accueil et ses sections (dont CategoryChip)
├── ProductCardDemo.kt      Fiche produit des TP 2 et 3
└── ui/theme/               Thème (couleurs, formes, typographie)
```

## Lancer le projet

1. Ouvrir le dossier dans Android Studio.
2. Laisser Gradle se synchroniser (« Sync Now » si proposé).
3. Lancer sur un émulateur ou un téléphone (**Run**), ou ouvrir un fichier `.kt` et utiliser le volet **Preview** (« Build & Refresh »).

Vérification en ligne de commande :

```
./gradlew :app:compileDebugKotlin
```
