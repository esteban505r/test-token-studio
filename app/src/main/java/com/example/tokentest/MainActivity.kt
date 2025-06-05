package com.example.tokentest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tokentest.ui.theme.TokenTestTheme
import com.example.tokentest.ui.theme.Primary
import com.example.tokentest.ui.theme.Secondary
import com.example.tokentest.ui.theme.ErrorColor
import com.example.tokentest.ui.theme.Surface
import com.example.tokentest.ui.theme.Background
import com.example.tokentest.ui.theme.PaddingSmall
import com.example.tokentest.ui.theme.PaddingMedium
import com.example.tokentest.ui.theme.PaddingLarge
import com.example.tokentest.ui.theme.BorderRadiusSmall
import com.example.tokentest.ui.theme.BorderRadiusMedium
import com.example.tokentest.ui.theme.BorderRadiusLarge
import com.example.tokentest.ui.theme.HeadingLarge
import com.example.tokentest.ui.theme.HeadingMedium
import com.example.tokentest.ui.theme.BodyLarge
import com.example.tokentest.ui.theme.Purple50
import com.example.tokentest.ui.theme.Purple500
import com.example.tokentest.ui.theme.Green200
import com.example.tokentest.ui.theme.Green600
import com.example.tokentest.ui.theme.Red200
import com.example.tokentest.ui.theme.Red500
import android.util.Log

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Log app startup and initial token values
        Log.d("AppStartup", "🚀 TokenTest App Starting...")
        Log.d("AppStartup", "📱 Current timestamp: ${System.currentTimeMillis()}")
        
        enableEdgeToEdge()
        setContent {
            TokenTestTheme {
                // Log when theme is applied
                Log.d("AppStartup", "🎨 TokenTestTheme applied")
                
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DesignSystemShowcase(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        
        Log.d("AppStartup", "✅ MainActivity onCreate completed")
    }
}

@Composable
fun DesignSystemShowcase(modifier: Modifier = Modifier) {
    // Log all current token values for comparison
    Log.d("DesignTokens", "=== CURRENT DESIGN TOKENS ===")
    
    // Log Colors
    Log.d("DesignTokens", "🎨 COLORS:")
    Log.d("DesignTokens", "  Primary: $Primary")
    Log.d("DesignTokens", "  Secondary: $Secondary")
    Log.d("DesignTokens", "  ErrorColor: $ErrorColor")
    Log.d("DesignTokens", "  Surface: $Surface")
    Log.d("DesignTokens", "  Background: $Background")
    
    // Log Spacing
    Log.d("DesignTokens", "📏 SPACING:")
    Log.d("DesignTokens", "  PaddingSmall: $PaddingSmall")
    Log.d("DesignTokens", "  PaddingMedium: $PaddingMedium")
    Log.d("DesignTokens", "  PaddingLarge: $PaddingLarge")
    
    // Log Border Radius (with try-catch in case they don't exist yet)
    try {
        Log.d("DesignTokens", "📐 BORDER RADIUS:")
        Log.d("DesignTokens", "  BorderRadiusSmall: $BorderRadiusSmall")
        Log.d("DesignTokens", "  BorderRadiusMedium: $BorderRadiusMedium")
        Log.d("DesignTokens", "  BorderRadiusLarge: $BorderRadiusLarge")
    } catch (e: Exception) {
        Log.d("DesignTokens", "📐 BORDER RADIUS: Not yet generated")
    }
    
    // Log Typography (with try-catch in case they don't exist yet)
    try {
        Log.d("DesignTokens", "🔤 TYPOGRAPHY:")
        Log.d("DesignTokens", "  HeadingLarge: $HeadingLarge")
        Log.d("DesignTokens", "  HeadingMedium: $HeadingMedium")
        Log.d("DesignTokens", "  BodyLarge: $BodyLarge")
    } catch (e: Exception) {
        Log.d("DesignTokens", "🔤 TYPOGRAPHY: Not yet generated")
    }
    
    // Log Color Variations (with try-catch in case they don't exist yet)
    try {
        Log.d("DesignTokens", "🌈 COLOR VARIATIONS:")
        Log.d("DesignTokens", "  Purple50: $Purple50")
        Log.d("DesignTokens", "  Purple500: $Purple500")
        Log.d("DesignTokens", "  Green200: $Green200")
        Log.d("DesignTokens", "  Green600: $Green600")
        Log.d("DesignTokens", "  Red200: $Red200")
        Log.d("DesignTokens", "  Red500: $Red500")
    } catch (e: Exception) {
        Log.d("DesignTokens", "🌈 COLOR VARIATIONS: Not yet generated")
    }
    
    Log.d("DesignTokens", "=== END DESIGN TOKENS ===")

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(Background)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(
                text = "🎨 Design System Showcase",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Primary
            )
            Text(
                text = "Colors from tokens.json",
                fontSize = 14.sp,
                color = Secondary,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }

        item {
            ColorPaletteSection()
        }

        item {
            SpacingShowcaseSection()
        }

        item {
            BorderRadiusShowcaseSection()
        }

        item {
            TypographyShowcaseSection()
        }

        item {
            ColorVariationsSection()
        }

        item {
            ButtonShowcaseSection()
        }

        item {
            CardShowcaseSection()
        }

        item {
            TextStylesSection()
        }

        item {
            StateShowcaseSection()
        }
    }
}

@Composable
fun ColorPaletteSection() {
    // Log color palette details
    Log.d("ColorPalette", "🎨 Color Palette Section Loading:")
    Log.d("ColorPalette", "  Primary RGB: ${Primary.red}, ${Primary.green}, ${Primary.blue}, ${Primary.alpha}")
    Log.d("ColorPalette", "  Secondary RGB: ${Secondary.red}, ${Secondary.green}, ${Secondary.blue}, ${Secondary.alpha}")
    Log.d("ColorPalette", "  Error RGB: ${ErrorColor.red}, ${ErrorColor.green}, ${ErrorColor.blue}, ${ErrorColor.alpha}")
    
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Color Palette",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ColorSwatch("Primary", Primary)
                ColorSwatch("Secondary", Secondary)
                ColorSwatch("Error", ErrorColor)
            }
            
            Spacer(modifier = Modifier.height(12.dp))
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ColorSwatch("Surface", Surface)
                ColorSwatch("Background", Background)
                ColorSwatch("Material", MaterialTheme.colorScheme.primary)
            }
        }
    }
}

@Composable
fun ColorSwatch(name: String, color: Color) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(60.dp)
                .background(color, RoundedCornerShape(8.dp))
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = name,
            fontSize = 12.sp,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}

@Composable
fun SpacingShowcaseSection() {
    // Log spacing details
    Log.d("Spacing", "📏 Spacing Section Loading:")
    Log.d("Spacing", "  PaddingSmall value: ${PaddingSmall.value}dp")
    Log.d("Spacing", "  PaddingMedium value: ${PaddingMedium.value}dp")
    Log.d("Spacing", "  PaddingLarge value: ${PaddingLarge.value}dp")
    
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Spacing Showcase",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            
            Text(
                text = "Padding values from tokens.json:",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            
            // Small padding example
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                colors = CardDefaults.cardColors(containerColor = Primary.copy(alpha = 0.1f))
            ) {
                Text(
                    text = "Small Padding (${PaddingSmall})",
                    modifier = Modifier.padding(PaddingSmall),
                    color = Primary,
                    fontWeight = FontWeight.Medium
                )
            }
            
            // Medium padding example
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                colors = CardDefaults.cardColors(containerColor = Secondary.copy(alpha = 0.1f))
            ) {
                Text(
                    text = "Medium Padding (${PaddingMedium})",
                    modifier = Modifier.padding(PaddingMedium),
                    color = Secondary,
                    fontWeight = FontWeight.Medium
                )
            }
            
            // Large padding example
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = ErrorColor.copy(alpha = 0.1f))
            ) {
                Text(
                    text = "Large Padding (${PaddingLarge})",
                    modifier = Modifier.padding(PaddingLarge),
                    color = ErrorColor,
                    fontWeight = FontWeight.Medium
                )
            }
            
            Spacer(modifier = Modifier.height(12.dp))
            
            // Visual spacing comparison
            Text(
                text = "Visual Spacing Comparison:",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                SpacingDemo("Small", PaddingSmall, Primary)
                SpacingDemo("Medium", PaddingMedium, Secondary)
                SpacingDemo("Large", PaddingLarge, ErrorColor)
            }
        }
    }
}

@Composable
fun SpacingDemo(label: String, padding: androidx.compose.ui.unit.Dp, color: Color) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .background(color.copy(alpha = 0.2f), RoundedCornerShape(4.dp))
        ) {
            Box(
                modifier = Modifier
                    .padding(padding)
                    .size(24.dp)
                    .background(color, RoundedCornerShape(4.dp))
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = label,
            fontSize = 10.sp,
            color = MaterialTheme.colorScheme.onSurface
        )
        Text(
            text = "${padding}",
            fontSize = 8.sp,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
        )
    }
}

@Composable
fun BorderRadiusShowcaseSection() {
    // Log border radius details
    try {
        Log.d("BorderRadius", "📐 Border Radius Section Loading:")
        Log.d("BorderRadius", "  BorderRadiusSmall value: ${BorderRadiusSmall.value}dp")
        Log.d("BorderRadius", "  BorderRadiusMedium value: ${BorderRadiusMedium.value}dp")
        Log.d("BorderRadius", "  BorderRadiusLarge value: ${BorderRadiusLarge.value}dp")
    } catch (e: Exception) {
        Log.d("BorderRadius", "📐 Border Radius values not yet available: ${e.message}")
    }
    
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Border Radius Showcase",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            
            Text(
                text = "Border radius values from tokens.json:",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            
            // Small border radius example
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                colors = CardDefaults.cardColors(containerColor = Primary.copy(alpha = 0.1f))
            ) {
                Text(
                    text = "Small Border Radius (${BorderRadiusSmall})",
                    modifier = Modifier.padding(PaddingSmall),
                    color = Primary,
                    fontWeight = FontWeight.Medium
                )
            }
            
            // Medium border radius example
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                colors = CardDefaults.cardColors(containerColor = Secondary.copy(alpha = 0.1f))
            ) {
                Text(
                    text = "Medium Border Radius (${BorderRadiusMedium})",
                    modifier = Modifier.padding(PaddingMedium),
                    color = Secondary,
                    fontWeight = FontWeight.Medium
                )
            }
            
            // Large border radius example
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = ErrorColor.copy(alpha = 0.1f))
            ) {
                Text(
                    text = "Large Border Radius (${BorderRadiusLarge})",
                    modifier = Modifier.padding(PaddingLarge),
                    color = ErrorColor,
                    fontWeight = FontWeight.Medium
                )
            }
            
            Spacer(modifier = Modifier.height(12.dp))
            
            // Visual border radius comparison
            Text(
                text = "Visual Border Radius Comparison:",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                BorderRadiusDemo("Small", BorderRadiusSmall, Primary)
                BorderRadiusDemo("Medium", BorderRadiusMedium, Secondary)
                BorderRadiusDemo("Large", BorderRadiusLarge, ErrorColor)
            }
        }
    }
}

@Composable
fun BorderRadiusDemo(label: String, borderRadius: androidx.compose.ui.unit.Dp, color: Color) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .background(color.copy(alpha = 0.2f), RoundedCornerShape(4.dp))
        ) {
            Box(
                modifier = Modifier
                    .padding(borderRadius)
                    .size(24.dp)
                    .background(color, RoundedCornerShape(4.dp))
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = label,
            fontSize = 10.sp,
            color = MaterialTheme.colorScheme.onSurface
        )
        Text(
            text = "${borderRadius}",
            fontSize = 8.sp,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
        )
    }
}

@Composable
fun TypographyShowcaseSection() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Typography",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            
            Text(
                text = "Primary Text",
                color = Primary,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
            
            Text(
                text = "Secondary Text",
                color = Secondary,
                fontSize = 14.sp
            )
            
            Text(
                text = "Error Text",
                color = ErrorColor,
                fontSize = 14.sp
            )
            
            Text(
                text = "Surface Text on Background",
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 14.sp
            )
        }
    }
}

@Composable
fun ColorVariationsSection() {
    // Log color variations details
    try {
        Log.d("ColorVariations", "🌈 Color Variations Section Loading:")
        Log.d("ColorVariations", "  Purple50: $Purple50")
        Log.d("ColorVariations", "  Purple500: $Purple500")
        Log.d("ColorVariations", "  Green200: $Green200")
        Log.d("ColorVariations", "  Green600: $Green600")
        Log.d("ColorVariations", "  Red200: $Red200")
        Log.d("ColorVariations", "  Red500: $Red500")
    } catch (e: Exception) {
        Log.d("ColorVariations", "🌈 Color variations not yet available: ${e.message}")
    }
    
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Color Variations",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            
            Text(
                text = "Purple Variations",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ColorVariation("Purple 50", Purple50)
                ColorVariation("Purple 500", Purple500)
            }
            
            Spacer(modifier = Modifier.height(12.dp))
            
            Text(
                text = "Green Variations",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ColorVariation("Green 200", Green200)
                ColorVariation("Green 600", Green600)
            }
            
            Spacer(modifier = Modifier.height(12.dp))
            
            Text(
                text = "Red Variations",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ColorVariation("Red 200", Red200)
                ColorVariation("Red 500", Red500)
            }
        }
    }
}

@Composable
fun ColorVariation(name: String, color: Color) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(60.dp)
                .background(color, RoundedCornerShape(8.dp))
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = name,
            fontSize = 12.sp,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}

@Composable
fun ButtonShowcaseSection() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Button Styles",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Primary),
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Primary")
                }
                
                OutlinedButton(
                    onClick = { },
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Primary),
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Outlined")
                }
            }
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Secondary),
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Secondary")
                }
                
                TextButton(
                    onClick = { },
                    colors = ButtonDefaults.textButtonColors(contentColor = Primary),
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Text Button")
                }
            }
        }
    }
}

@Composable
fun CardShowcaseSection() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Card Components",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Primary.copy(alpha = 0.1f))
            ) {
                Text(
                    text = "Primary Card",
                    modifier = Modifier.padding(16.dp),
                    color = Primary,
                    fontWeight = FontWeight.Medium
                )
            }
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Background)
            ) {
                Text(
                    text = "Background Card",
                    modifier = Modifier.padding(16.dp),
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        }
    }
}

@Composable
fun TextStylesSection() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Typography",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            
            Text(
                text = "Primary Text",
                color = Primary,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
            
            Text(
                text = "Secondary Text",
                color = Secondary,
                fontSize = 14.sp
            )
            
            Text(
                text = "Error Text",
                color = ErrorColor,
                fontSize = 14.sp
            )
            
            Text(
                text = "Surface Text on Background",
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 14.sp
            )
        }
    }
}

@Composable
fun StateShowcaseSection() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Component States",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            
            // Enabled state
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Primary),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Enabled Button")
            }
            
            Spacer(modifier = Modifier.height(8.dp))
            
            // Disabled state
            Button(
                onClick = { },
                enabled = false,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Disabled Button")
            }
            
            Spacer(modifier = Modifier.height(8.dp))
            
            // Error state
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = ErrorColor.copy(alpha = 0.1f),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "⚠️ Error State Example",
                    modifier = Modifier.padding(12.dp),
                    color = ErrorColor,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DesignSystemPreview() {
    TokenTestTheme {
        DesignSystemShowcase()
    }
}