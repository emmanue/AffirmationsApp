package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Add Resource annotation to distinguish between the two parameters
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
    ) {
}