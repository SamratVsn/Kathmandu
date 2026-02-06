package com.example.kathmandu.data

import com.example.kathmandu.R
import com.example.kathmandu.model.CategoryOptions
import com.example.kathmandu.model.Recommendation

object DataSource {
    val defaultPlace: Recommendation = Recommendation(
        name = "Dharahara Tower",
        description = "Also known as the Bhimsen Tower, this white minaret-style landmark in Sundhara is a symbol of Nepal's resilience. Originally built in 1832 by Prime Minister Bhimsen Thapa, the nine-story tower offered panoramic views of the Kathmandu Valley. After collapsing in the devastating 2015 earthquake, it was reconstructed to its original architectural style but with modern safety features, standing tall once again as a national icon.",
        categoryOptions = CategoryOptions.SPECIALS,
        imageResourceId = R.drawable.dharahara_tower,
        locationName = "Sundhara, Kathmandu",
        entryFee = "NPR 1,000 (Foreigners) / NPR 100 (Locals)",
        tags = listOf("Landmark", "Viewpoint", "History")
    )

    val allRecommendation = listOf(
        // ==========================================
        // SPECIALS CATEGORY (History & Landmarks)
        // ==========================================
        Recommendation(
            name = "Singha Durbar",
            description = "The historic seat of the Nepali government. Originally built in 1908 by Rana Prime Minister Chandra Shumsher, it was once the largest palace in Asia with over 1,700 rooms. Today it houses the Prime Minister's Office and key ministries.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.singha_durbar,
            locationName = "Singha Durbar, Kathmandu",
            entryFee = "Restricted (Exterior only)",
            tags = listOf("Government", "Architecture", "History")
        ),
        Recommendation(
            name = "Dharahara Tower",
            description = "A 22-story white minaret tower that serves as a symbol of Nepal's resilience. Reconstructed after the 2015 earthquake, it offers panoramic views of the entire Kathmandu Valley from its observation deck.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.dharahara_tower,
            locationName = "Sundhara, Kathmandu",
            entryFee = "NPR 1,000 (Foreigners) / NPR 100 (Locals)",
            tags = listOf("Viewpoint", "Landmark", "Iconic")
        ),
        Recommendation(
            name = "Narayanhiti Palace Museum",
            description = "The former royal palace of the Shah dynasty, converted into a public museum after the monarchy was abolished in 2008. Visitors can see the throne room, royal banqueting halls, and the site of the tragic 2001 royal massacre.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.narayanhiti_museum,
            locationName = "Durbar Marg, Kathmandu",
            entryFee = "NPR 1,000 (Foreigners) / NPR 250 (SAARC)",
            tags = listOf("Royalty", "Museum", "History")
        ),
        Recommendation(
            name = "National Museum of Nepal",
            description = "The oldest museum in the country, housing an extensive collection of ancient statues, paintings, weapons, and costumes. It provides a deep dive into Nepal's military history and artistic evolution over two millennia.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.national_museum,
            locationName = "Chhauni, Kathmandu",
            entryFee = "NPR 150 (Foreigners)",
            tags = listOf("Archaeology", "Art", "Education")
        ),
        Recommendation(
            name = "Kathmandu Durbar Square",
            description = "The spiritual heart of the old city, this UNESCO World Heritage site is a complex of palaces, courtyards, and temples. It is home to the 'Kumari' (Living Goddess) and remains a vibrant hub of festivals and daily worship.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.kathmandu_durbar_square,
            locationName = "Basantapur, Kathmandu",
            entryFee = "NPR 1,000 (Foreigners)",
            tags = listOf("UNESCO", "Living Goddess", "Culture")
        ),
        Recommendation(
            name = "Birendra Int'l Convention Center",
            description = "A distinct architectural landmark with a blue roof, originally built to host international summits. It served as the interim Parliament of Nepal for many years and is now a premier venue for global conferences.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.birendra_ic_center,
            locationName = "New Baneshwor, Kathmandu",
            entryFee = "Event based",
            tags = listOf("Modern", "Politics", "Convention")
        ),
        Recommendation(
            name = "Tribhuvan International Airport",
            description = "Nepal's primary aerial gateway. Named after King Tribhuvan, it is the starting point for almost all international visitors and mountaineers heading to the Himalayas.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.tribhuwan_airport,
            locationName = "Ring Road, Kathmandu",
            entryFee = "Free (Public areas)",
            tags = listOf("Transport", "Hub", "Aviation")
        ),
        Recommendation(
            name = "Ratna Park",
            description = "A historic central park named after Queen Ratna. Recently renovated, it features manicured gardens and fountains, serving as a green lung in the chaotic city center and a popular meeting spot for locals.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.ratna_park,
            locationName = "City Center, Kathmandu",
            entryFee = "NPR 75 (Foreigners) / NPR 25 (Locals)",
            tags = listOf("Park", "Relaxation", "Local Life")
        ),
        Recommendation(
            name = "Sahid Gate",
            description = "A historical monument dedicated to the four martyrs who rebelled against the Rana regime. It stands as a symbol of democracy and freedom in Nepal, located near the army pavilion.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.sahid_gate,
            locationName = "Sundhara, Kathmandu",
            entryFee = "Free",
            tags = listOf("Monument", "Democracy", "History")
        ),

        // ==========================================
        // TEMPLES CATEGORY (Spiritual Sites)
        // ==========================================
        Recommendation(
            name = "Pashupatinath Temple",
            description = "A massive Hindu temple complex dedicated to Lord Shiva. Famous for its cremation ghats along the Bagmati River and the evening 'Aarti' ceremony that captivates visitors with fire, music, and chanting.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.pashupatinath,
            locationName = "Gaushala, Kathmandu",
            entryFee = "NPR 1,000 (Foreigners)",
            tags = listOf("Hinduism", "Shiva", "UNESCO", "Aarti")
        ),
        Recommendation(
            name = "Swayambhunath Stupa",
            description = "Ideally known as the 'Monkey Temple', this hilltop stupa offers 360-degree views of Kathmandu. It is a symbol of religious harmony where Hindu shrines and Buddhist stupas coexist side by side.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.swayambhu_temple,
            locationName = "Swayambhu, Kathmandu",
            entryFee = "NPR 200 (Foreigners)",
            tags = listOf("Buddhism", "Viewpoint", "Monkeys")
        ),
        Recommendation(
            name = "Budhanilkantha",
            description = "Features a mysterious 5th-century stone statue of Lord Vishnu floating on a bed of serpents in a pond. It is carved from a single block of black stone and is considered one of Nepal's artistic masterpieces.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.budhanilkantha_bishnu_temple,
            locationName = "Budhanilkantha, Kathmandu",
            entryFee = "Free",
            tags = listOf("Vishnu", "Ancient Art", "Floating Statue")
        ),
        Recommendation(
            name = "Dakshinkali Temple",
            description = "A powerful temple dedicated to the ferocious goddess Kali. Located in a forest ravine south of the city, it is famous for animal sacrifices performed on Tuesdays and Saturdays to appease the deity.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.dakshinkali_temple,
            locationName = "Pharping, Kathmandu",
            entryFee = "Free",
            tags = listOf("Tantra", "Sacrifice", "Forest")
        ),
        Recommendation(
            name = "Changu Narayan",
            description = "The oldest Hindu temple in Nepal, dating back to the 4th century. Perched on a ridge, it is a UNESCO site known for its intricate wood carvings and ancient stone inscriptions.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.changu_narayan,
            locationName = "Changu, Bhaktapur",
            entryFee = "NPR 300 (Foreigners)",
            tags = listOf("Oldest", "UNESCO", "Woodcarving")
        ),
        Recommendation(
            name = "Kopan Monastery",
            description = "A peaceful Tibetan Buddhist monastery on a hilltop, famous for its meditation courses and beautiful gardens. It offers a stunning view of the valley and a chance to interact with monks.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.kopan_monastery,
            locationName = "Kopan, Kathmandu",
            entryFee = "Free",
            tags = listOf("Meditation", "Buddhism", "Peace")
        ),
        Recommendation(
            name = "Krishna Mandir",
            description = "A masterpiece of stone architecture in Patan Durbar Square. Built in the 17th century, this Shikhara-style temple has 21 golden pinnacles and friezes depicting the Mahabharata epic.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.krishna_mandir,
            locationName = "Patan, Lalitpur",
            entryFee = "Included in Square Fee",
            tags = listOf("Stone Art", "Krishna", "Architecture")
        ),
        Recommendation(
            name = "Guhyeshwari Temple",
            description = "A sacred Shakti Peeth located near Pashupatinath. It represents the female divine energy and is a significant pilgrimage site for Tantric practitioners.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.guhyeshwari_temple,
            locationName = "Pashupatinath Complex",
            entryFee = "Free (Hindus Only inside)",
            tags = listOf("Shakti", "Tantra", "Holy")
        ),
        Recommendation(
            name = "Bajrayogini Temple",
            description = "An ancient tantric temple located in Sankhu. It is dedicated to the Buddhist-Hindu goddess Bajrayogini and is situated in a forest that is considered a holy power spot.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.bajrayogini_temple,
            locationName = "Sankhu, Kathmandu",
            entryFee = "Free",
            tags = listOf("Tantra", "Hiking", "Ancient")
        ),
        Recommendation(
            name = "Bangalamukhi Temple",
            description = "Located in Patan, this temple is dedicated to the goddess who grants victory over enemies and legal disputes. Thursday is the main day of worship here.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.bangalamukhi_temple,
            locationName = "Patan, Lalitpur",
            entryFee = "Free",
            tags = listOf("Wishes", "Local Culture", "Patan")
        ),

        // ==========================================
        // SHOPS CATEGORY (Malls & Markets)
        // ==========================================
        Recommendation(
            name = "Thamel Market",
            description = "The tourist hub of Nepal. A maze of narrow streets filled with shops selling trekking gear, pashmina shawls, thangka paintings, and handicrafts. It is the best place for souvenirs.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.thamel,
            locationName = "Thamel, Kathmandu",
            entryFee = "Free",
            tags = listOf("Tourist Hub", "Souvenirs", "Trekking Gear")
        ),
        Recommendation(
            name = "Asan Bazaar",
            description = "The oldest traditional market in Kathmandu. Famous for spices, textiles, brassware, and dried fruits. It is a sensory overload of colors and smells, offering a truly local shopping experience.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.asan_bazaar,
            locationName = "Asan Tole, Kathmandu",
            entryFee = "Free",
            tags = listOf("Traditional", "Spices", "Local Life")
        ),
        Recommendation(
            name = "Labim Mall",
            description = "A high-end lifestyle mall in Patan that blends modern architecture with traditional touches. It features premium international brands, a cinema, and a beautiful open-air courtyard.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.labim_mall,
            locationName = "Pulchowk, Lalitpur",
            entryFee = "Free",
            tags = listOf("Luxury", "Brands", "Cinema")
        ),
        Recommendation(
            name = "Civil Mall",
            description = "One of the largest malls in the city, offering a wide range of electronics, clothing, and a large food court. It also houses a bowling alley and a multiplex cinema.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.civil_mall,
            locationName = "Sundhara, Kathmandu",
            entryFee = "Free",
            tags = listOf("Electronics", "Cinema", "Shopping")
        ),
        Recommendation(
            name = "Durbar Marg",
            description = "The 'Fifth Avenue' of Kathmandu. This upscale street is lined with branded showrooms (Nike, Adidas, etc.), luxury watches, and high-end restaurants.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.durbar_marga,
            locationName = "Durbar Marg, Kathmandu",
            entryFee = "Free",
            tags = listOf("High-end", "Brands", "Fashion")
        ),
        Recommendation(
            name = "Bhatbhateni Supermarket",
            description = "Nepal's largest retail chain. A one-stop shop for groceries, clothes, electronics, and household items. Great for travelers needing to restock supplies.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.bhatbhateni,
            locationName = "Naxal/Multiple Locations",
            entryFee = "Free",
            tags = listOf("Department Store", "Grocery", "Supplies")
        ),
        Recommendation(
            name = "Indra Chowk",
            description = "Located near Asan, this market is famous for beads (pote), bangles, and fabrics. It is the go-to place for traditional Nepali wedding shopping.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.indra_chowk,
            locationName = "Indra Chowk, Kathmandu",
            entryFee = "Free",
            tags = listOf("Beads", "Fabrics", "Weddings")
        ),

        // ==========================================
        // DESTINATIONS CATEGORY (Travel & Day Trips)
        // ==========================================
        Recommendation(
            name = "Nagarkot",
            description = "A premier hill station famous for its sunrise views over the Himalayas. On a clear day, you can see Mt. Everest. It offers fresh air and pine forests just 32km from the city.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.nagarkot,
            locationName = "Nagarkot, Kavre",
            entryFee = "NPR 350 (Tower entry)",
            tags = listOf("Sunrise", "Himalayas", "Nature")
        ),
        Recommendation(
            name = "Chandragiri Hills",
            description = "Accessible via a scenic cable car ride, this hill station offers a panoramic view of the Kathmandu Valley and the Himalayan range. It also features the Bhaleshwor Mahadev temple.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.chandragiri_hills,
            locationName = "Thankot, Kathmandu",
            entryFee = "USD 22 (Cable Car Roundtrip)",
            tags = listOf("Cable Car", "Viewpoint", "Adventure")
        ),
        Recommendation(
            name = "Bhaktapur Durbar Square",
            description = "An open-air museum of medieval art. Known for its 55-window palace, pottery square, and 'Juju Dhau' (King Curd). It preserves the ancient way of life better than any other city.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.bhaktapur_durbar_square,
            locationName = "Bhaktapur",
            entryFee = "NPR 1,800 (Foreigners)",
            tags = listOf("Medieval", "Pottery", "Culture")
        ),
        Recommendation(
            name = "Boudhanath Stupa",
            description = "The center of Tibetan culture in Kathmandu. This massive white stupa is surrounded by monasteries and shops. It is a haven of peace where pilgrims circumambulate the dome daily.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.boudhanath_stupa,
            locationName = "Boudha, Kathmandu",
            entryFee = "NPR 400 (Foreigners)",
            tags = listOf("Tibetan", "Peace", "UNESCO")
        ),
        Recommendation(
            name = "Garden of Dreams",
            description = "A neo-classical garden built in the 1920s. It features pavilions, fountains, and sunken gardens, offering a European-style oasis in the middle of chaotic Thamel.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.garden_of_dreams,
            locationName = "Thamel, Kathmandu",
            entryFee = "NPR 400 (Foreigners)",
            tags = listOf("Relaxation", "Romantic", "Garden")
        ),
        Recommendation(
            name = "Dhulikhel",
            description = "An ancient Newari town famous for its drinking water and mountain views. It offers a more authentic, less commercialized alternative to Nagarkot for seeing the Himalayas.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.dhulikhel_view,
            locationName = "Dhulikhel, Kavre",
            entryFee = "Free",
            tags = listOf("Culture", "Himalayas", "Hiking")
        ),
        Recommendation(
            name = "Chobhar Gorge & Manjushree Park",
            description = "The legendary spot where Manjushree cut the hill to drain the lake that was once Kathmandu. It features caves, a suspension bridge, and a beautiful park.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.chobhar_gorge,
            locationName = "Kirtipur, Kathmandu",
            entryFee = "NPR 100",
            tags = listOf("Legend", "Nature", "Caves")
        ),
        Recommendation(
            name = "Shivapuri National Park",
            description = "A paradise for hikers and birdwatchers. Located on the northern rim of the valley, it offers trails to Nagi Gompa and Baghdwar (source of Bagmati river).",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.shivapuri_park,
            locationName = "Budhanilkantha, Kathmandu",
            entryFee = "NPR 1,000 (Foreigners)",
            tags = listOf("Hiking", "Nature", "Wildlife")
        ),
        Recommendation(
            name = "Godawari Botanical Garden",
            description = "Located at the foot of Phulchowki hill, this garden is a lush retreat with orchids, ferns, and a Japanese garden. It is a popular picnic spot for families.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.godawari_garden,
            locationName = "Godawari, Lalitpur",
            entryFee = "NPR 200 (Foreigners)",
            tags = listOf("Botany", "Picnic", "Flowers")
        ),
        Recommendation(
            name = "Kakani",
            description = "A quiet hill station famous for strawberry farming and trout fish. It offers a majestic view of the Ganesh Himal range and is perfect for a peaceful day trip.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.kakani_view,
            locationName = "Kakani, Nuwakot",
            entryFee = "Free",
            tags = listOf("Strawberries", "Trout", "Views")
        ),
        Recommendation(
            name = "Namo Buddha",
            description = "One of the most sacred Buddhist pilgrimage sites. Legend says Lord Buddha (in a previous life) fed his body to a starving tigress here. It features the grand Thrangu Tashi Yangtse Monastery.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.namo_buddha,
            locationName = "Kavre District",
            entryFee = "Free",
            tags = listOf("Pilgrimage", "Monastery", "Legend")
        )
    )
}