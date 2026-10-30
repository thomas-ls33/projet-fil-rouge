package com.example.tpfilrouge

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tpfilrouge.ui.theme.TPFilRougeTheme

// Fiche produit des TP 2 et 3, conservée à part.

@Composable
fun ProductDemoScreen(modifier: Modifier = Modifier) {
    ProductCard(
        name = "Sac à dos",
        price = 49.99,
        isAvailable = true,
        isFavorite = false,
        onProductClick = {
            // Plus tard : ouvrir le détail du produit
        },
        onFavoriteClick = {
            // Pour l’instant, nous ne modifions pas encore l’état.
            // Nous verrons cela dans la séance sur la gestion d’état.
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp)
    )
}

@Composable
fun ProductCard(
    name: String,
    price: Double,
    isAvailable: Boolean,
    isFavorite: Boolean,
    onProductClick: () -> Unit,
    onFavoriteClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .clickable(
                role = Role.Button,
                onClick = onProductClick
            )
            .semantics {
                contentDescription = "Ouvrir le détail du produit $name"
            }
    ) {
        ProductCardContent(
            name = name,
            price = price,
            isAvailable = isAvailable,
            isFavorite = isFavorite,
            onFavoriteClick = onFavoriteClick
        )
    }
}

@Composable
fun ProductCardContent(
    name: String,
    price: Double,
    isAvailable: Boolean,
    isFavorite: Boolean,
    onFavoriteClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(16.dp)
    ) {
        ProductTitle(
            name = name,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        ProductPrice(
            price = price,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        ProductAvailability(
            isAvailable = isAvailable,
            modifier = Modifier.padding(bottom = 12.dp)
        )
        FavoriteButton(
            isFavorite = isFavorite,
            onFavoriteClick = onFavoriteClick,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun ProductTitle(
    name: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = name,
        modifier = modifier
    )
}

@Composable
fun ProductPrice(
    price: Double,
    modifier: Modifier = Modifier
) {
    Text(
        text = "$price €",
        modifier = modifier
    )
}

@Composable
fun ProductAvailability(
    isAvailable: Boolean,
    modifier: Modifier = Modifier
) {
    Text(
        text = if (isAvailable) {
            "Produit disponible"
        } else {
            "Produit indisponible"
        },
        modifier = modifier
    )
}

@Composable
fun FavoriteButton(
    isFavorite: Boolean,
    onFavoriteClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onFavoriteClick,
        modifier = modifier
    ) {
        Text(
            text = if (isFavorite) {
                "★ Favori"
            } else {
                "☆ Ajouter aux favoris"
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProductDemoScreenPreview() {
    TPFilRougeTheme {
        ProductDemoScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun ProductCardAvailablePreview() {
    TPFilRougeTheme {
        ProductCard(
            name = "Sac à dos",
            price = 49.99,
            isAvailable = true,
            isFavorite = false,
            onProductClick = {},
            onFavoriteClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProductCardUnavailableFavoritePreview() {
    TPFilRougeTheme {
        ProductCard(
            name = "Casque audio",
            price = 89.99,
            isAvailable = false,
            isFavorite = true,
            onProductClick = {},
            onFavoriteClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp)
        )
    }
}
