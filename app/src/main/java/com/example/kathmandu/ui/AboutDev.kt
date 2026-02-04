package com.example.kathmandu.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.kathmandu.R
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kathmandu.ui.theme.KathmanduTheme

private val PrimaryColor = Color(0xFF1E293B)
private val AccentColor = Color(0xFF3B82F6)
private val BackgroundGradientStart = Color(0xFFF8FAFC)
private val BackgroundGradientEnd = Color(0xFFE2E8F0)
private val CardBackground = Color(0xFFFFFFFF)
private val TextPrimary = Color(0xFF0F172A)
private val TextSecondary = Color(0xFF64748B)

@Composable
fun AboutDev() {
    val scrollState = rememberScrollState()
    val uriHandler = LocalUriHandler.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        BackgroundGradientStart,
                        BackgroundGradientEnd
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(32.dp))

            // Profile Image Section
            Card(
                modifier = Modifier.size(180.dp),
                shape = CircleShape,
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.developer_photo),
                    contentDescription = "Profile Photo",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Name and Title
            Text(
                text = "Samrat Parajuli",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = TextPrimary,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Android App Developer",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = AccentColor,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(48.dp))

            // About Me Section
            AboutMeSection()

            Spacer(modifier = Modifier.height(48.dp))

            // Skills Section
            SkillsSection()

            Spacer(modifier = Modifier.height(48.dp))

            // Social Links Section
            SocialLinksSection(uriHandler)

            Spacer(modifier = Modifier.height(48.dp))

            // Contact Section
            ContactSection(uriHandler)

            Spacer(modifier = Modifier.height(48.dp))

            // Reviews & Feedback Section
            ReviewsSection()

            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}

@Composable
private fun AboutMeSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CardBackground),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            Text(
                text = "About Me",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryColor
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "I'm a passionate Android developer with expertise in building modern, " +
                        "user-friendly mobile applications. I specialize in Jetpack Compose, " +
                        "Kotlin, and creating seamless user experiences.",
                fontSize = 16.sp,
                color = TextSecondary,
                lineHeight = 24.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Based in the beautiful land of Nepal, I combine technical excellence " +
                        "with creative problem-solving to deliver high-quality Android applications " +
                        "that users love.",
                fontSize = 16.sp,
                color = TextSecondary,
                lineHeight = 24.sp
            )
        }
    }
}

@Composable
private fun SkillsSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CardBackground),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            Text(
                text = "Skills & Expertise",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryColor
            )

            Spacer(modifier = Modifier.height(16.dp))

            val skills = listOf(
                "Jetpack Compose",
                "Kotlin",
                "Android SDK",
                "Material Design 3",
                "MVVM Architecture",
                "Coroutines & Flow",
                "Room Database",
                "Retrofit & Networking",
                "Git & Version Control"
            )

            skills.chunked(3).forEach { rowSkills ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    rowSkills.forEach { skill ->
                        SkillChip(
                            text = skill,
                            modifier = Modifier.weight(1f)
                        )
                    }
                    // Fill remaining slots if row is incomplete
                    repeat(3 - rowSkills.size) {
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Composable
private fun SkillChip(text: String, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        color = AccentColor.copy(alpha = 0.1f),
        border = androidx.compose.foundation.BorderStroke(1.dp, AccentColor.copy(alpha = 0.3f))
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
            fontSize = 13.sp,
            fontWeight = FontWeight.Medium,
            color = AccentColor,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
private fun SocialLinksSection(uriHandler: androidx.compose.ui.platform.UriHandler) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CardBackground),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            Text(
                text = "Connect With Me",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryColor
            )

            Spacer(modifier = Modifier.height(16.dp))

            SocialLink(
                platform = "LinkedIn",
                handle = "SamratVsn",
                url = "https://www.linkedin.com/in/samratvsn/",
                icon = "🔗",
                onClick = { uriHandler.openUri(it) }
            )

            SocialLink(
                platform = "GitHub",
                handle = "@SamratVsn",
                url = "https://github.com/SamratVsn",
                icon = "💻",
                onClick = { uriHandler.openUri(it) }
            )

            SocialLink(
                platform = "X (Twitter)",
                handle = "@SamratVsn",
                url = "https://x.com/SamratVsn",
                icon = "𝕏",
                onClick = { uriHandler.openUri(it) }
            )

            SocialLink(
                platform = "Instagram",
                handle = "@samratvsn",
                url = "https://www.instagram.com/samratvsn/",
                icon = "📷",
                onClick = { uriHandler.openUri(it) }
            )

            SocialLink(
                platform = "Portfolio",
                handle = "samratparajuli0.com.np",
                url = "https://www.samratparajuli0.com.np/",
                icon = "🌐",
                onClick = { uriHandler.openUri(it) }
            )
        }
    }
}

@Composable
private fun SocialLink(
    platform: String,
    handle: String,
    url: String,
    icon: String,
    onClick: (String) -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
            .clickable { onClick(url) },
        shape = RoundedCornerShape(12.dp),
        color = Color(0xFFF8FAFC),
        tonalElevation = 2.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = icon,
                fontSize = 24.sp,
                modifier = Modifier.padding(end = 16.dp)
            )

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = platform,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = TextPrimary
                )
                Text(
                    text = handle,
                    fontSize = 14.sp,
                    color = TextSecondary
                )
            }

            Icon(
                painter = painterResource(android.R.drawable.ic_menu_share),
                contentDescription = "Open link",
                tint = AccentColor,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}

@Composable
private fun ContactSection(uriHandler: androidx.compose.ui.platform.UriHandler) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = AccentColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { uriHandler.openUri("mailto:samratvsn@gmail.com") }
                .padding(24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(
                    text = "Get In Touch",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.White.copy(alpha = 0.9f)
                )
                Text(
                    text = "samratvsn@gmail.com",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}

@Composable
private fun ReviewsSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CardBackground),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Reviews & Feedback",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryColor
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "I'd love to hear from you! Whether you have feedback on my work, " +
                        "want to collaborate, or just want to connect, feel free to reach out " +
                        "through any of the channels above.",
                fontSize = 16.sp,
                color = TextSecondary,
                textAlign = TextAlign.Center,
                lineHeight = 24.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Star rating display (placeholder)
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(5) {
                    Text(
                        text = "⭐",
                        fontSize = 28.sp,
                        modifier = Modifier.padding(horizontal = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Your feedback matters!",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = AccentColor
            )
        }
    }
}

@Preview
@Composable
fun DevPreview(){
    KathmanduTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            AboutDev()
        }
    }
}