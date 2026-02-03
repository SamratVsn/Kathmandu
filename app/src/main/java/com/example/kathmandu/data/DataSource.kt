package com.example.kathmandu.data

import com.example.kathmandu.R
import com.example.kathmandu.model.CategoryOptions
import com.example.kathmandu.model.Recommendation

object DataSource {
    val defaultPlace: Recommendation = Recommendation(
        name = "Singha Durbar",
        description = "The historic seat of the Nepali government, originally built by Chandra Shumsher JBR as a private residence and once the largest palace in Asia.",
        categoryOptions = CategoryOptions.SPECIALS,
        imageResourceId = R.drawable.singha_durbar
    )

    val allRecommendation = listOf(
        // --- CATEGORY: SPECIALS ---
        Recommendation(
            name = "Singha Durbar",
            description = "The historic seat of the Nepali government, originally built by Chandra Shumsher JBR as a private residence and once the largest palace in Asia.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.singha_durbar
        ),
        Recommendation(
            name = "Birendra International Convention Center",
            description = "A major landmark in New Baneshwor that served as the meeting place for the Federal Parliament of Nepal.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.birendra_ic_center
        ),
        Recommendation(
            name = "Civil Service Hospital",
            description = "A modern federal hospital in New Baneshwor dedicated to providing quality healthcare services to civil servants and the general public.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.civil_service_hospital
        ),
        Recommendation(
            name = "Tribhuvan International Airport",
            description = "The primary international gateway to Nepal, located in Kathmandu, connecting the Himalayan nation to the rest of the world.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.tribhuwan_airport
        ),
        Recommendation(
            name = "Dharahara Tower",
            description = "A 22-story landmark in Sundhara offering a panoramic view of the Kathmandu Valley; it is a symbol of resilience and history.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.dharahara_tower
        ),
        Recommendation(
            name = "Ratna Park",
            description = "A central green park in Kathmandu named after Queen Ratna, serving as a peaceful getaway in the middle of the city's hustle.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.ratna_park
        ),
        Recommendation(
            name = "Narayanhiti Palace Museum",
            description = "The former royal palace that now serves as a museum, showcasing the lifestyle and history of Nepal’s Shah monarchs.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.narayanhiti_museum
        ),
        Recommendation(
            name = "National Museum",
            description = "Located in Chhauni, it houses a vast collection of historical artifacts, weapons, and art reflecting Nepal’s rich cultural heritage.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.national_museum
        ),
        Recommendation(
            name = "Kathmandu Durbar Square",
            description = "A UNESCO World Heritage Site featuring ancient palaces, courtyards, and temples, including the home of the Living Goddess, Kumari.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.kathmandu_durbar_square
        ),

        // --- CATEGORY: TEMPLES ---
        Recommendation(
            name = "Pashupatinath",
            description = "One of the most sacred Hindu temples of Lord Shiva in the world, situated on the banks of the holy Bagmati River.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.pashupatinath
        ),
        Recommendation(
            name = "Guhyeshwari Temple",
            description = "An important Shakti Peeth located near Pashupatinath, dedicated to Adi Shakti and revered by both Hindus and Tantric practitioners.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.guhyeshwari_temple
        ),
        Recommendation(
            name = "Budhanilkantha Temple",
            description = "Famous for its massive 5th-century stone carving of Lord Vishnu reclining on a bed of serpents in a cosmic pond.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.budhanilkantha_bishnu_temple
        ),
        Recommendation(
            name = "Chandra Binayak Temple",
            description = "Located in Chabahil, this is one of the four main Binayak (Ganesh) temples in the valley, believed to cure various illnesses.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.chandra_binayak_temple
        ),
        Recommendation(
            name = "Surya Binayak Temple",
            description = "The 'Temple of the Rising Sun' in Bhaktapur, dedicated to Lord Ganesh and set in a beautiful forest environment.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.surya_binayak_temple
        ),
        Recommendation(
            name = "Karya Binayak Temple",
            description = "Located between Bungamati and Khokana, this temple is visited to pray for the successful completion of any new project or work.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.karya_binayak_temple
        ),

        // --- CATEGORY: SHOPS ---
        Recommendation(
            name = "Thamel",
            description = "The ultimate tourist hub known for its narrow alleys, trekking gear shops, bookstores, and vibrant nightlife.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.thamel
        ),
        Recommendation(
            name = "Asan Bazaar",
            description = "One of the oldest and busiest market squares in Kathmandu, famous for spices, textiles, and traditional goods.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.asan_bazaar
        ),
        Recommendation(
            name = "Labim Mall",
            description = "A modern, upscale shopping destination in Pulchowk featuring international brands, a cinema, and various dining options.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.labim_mall
        ),
        Recommendation(
            name = "Durbar Marg",
            description = "The 'King's Way' of Kathmandu, known for luxury brands, high-end boutiques, and some of the city's finest restaurants.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.durbar_marga
        ),
        Recommendation(
            name = "Civil Mall",
            description = "A popular multi-story shopping mall in Sundhara featuring a wide variety of clothing stores and a dedicated food court.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.civil_mall
        ),

        // --- CATEGORY: DESTINATIONS ---
        Recommendation(
            name = "Nagarkot",
            description = "A hilltop village famous for its breathtaking sunrise views of the Himalayas, including Mt. Everest on clear days.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.nagarkot
        ),
        Recommendation(
            name = "Chandragiri Hills",
            description = "Accessible by cable car, it offers a stunning panorama of the valley and is home to the Bhaleshwor Mahadev Temple.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.chandragiri_hills
        ),
        Recommendation(
            name = "Boudhanath Stupa",
            description = "One of the largest stupas in the world and a center for Tibetan Buddhism, surrounded by peaceful monasteries and cafes.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.boudhanath_stupa
        ),
        Recommendation(
            name = "Swayambhunath (Monkey Temple)",
            description = "An ancient religious complex atop a hill that provides a 360-degree view of the entire Kathmandu Valley.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.swayambhu_temple
        ),
        Recommendation(
            name = "Bhaktapur Durbar Square",
            description = "An 'Open Museum' known for its well-preserved medieval architecture, 55-window palace, and traditional pottery square.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.bhaktapur_durbar_square
        )
    )
}