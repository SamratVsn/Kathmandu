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
        // SPECIALS CATEGORY (History & Landmark)
        // ==========================================
        Recommendation(
            name = "Singha Durbar",
            description = "The historic seat of the Nepali government and one of the most iconic buildings in Kathmandu. Originally built in 1908 by the Rana Prime Minister Chandra Shumsher JBR as a private residence, it was once considered the largest and most luxurious palace in Asia, boasting over 1,700 rooms and 17 courtyards. Today, it houses key government ministries, the Prime Minister's Office, and the National Planning Commission, serving as the administrative heart of the nation.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.singha_durbar,
            locationName = "Singha Durbar, Kathmandu",
            entryFee = "Restricted (Exterior viewing free)",
            tags = listOf("History", "Architecture", "Government")
        ),
        Recommendation(
            name = "Dharahara Tower",
            description = "Also known as the Bhimsen Tower, this white minaret-style landmark in Sundhara is a symbol of Nepal's resilience. Originally built in 1832 by Prime Minister Bhimsen Thapa, the nine-story tower offered panoramic views of the Kathmandu Valley. After collapsing in the devastating 2015 earthquake, it was reconstructed to its original architectural style but with modern safety features, standing tall once again as a national icon.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.dharahara_tower,
            locationName = "Sundhara, Kathmandu",
            entryFee = "NPR 1,000 (Foreigners) / NPR 100 (Locals)",
            tags = listOf("Landmark", "Viewpoint", "History")
        ),
        Recommendation(
            name = "Narayanhiti Palace Museum",
            description = "The former royal palace of the Shah monarchs of Nepal, located at the northern end of Durbar Marg. Following the abolition of the monarchy in 2008, this sprawling complex was converted into a public museum. Visitors can explore the grand halls named after Nepali districts, the throne room, and the site of the tragic 2001 royal massacre, gaining a rare glimpse into the lifestyle of Nepal's royalty.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.narayanhiti_museum,
            locationName = "Durbar Marg, Kathmandu",
            entryFee = "NPR 500 (Foreigners) / NPR 100 (Locals)",
            tags = listOf("Museum", "Royalty", "Massacre Site")
        ),
        Recommendation(
            name = "National Museum",
            description = "Located in Chhauni, this is the oldest and largest museum in Nepal, originally established as an arsenal house in the early 19th century. It houses an extensive collection of archaeological treasures, ancient statues, traditional weapons, and historical artifacts that chronicle Nepal's rich military history, art, and cultural evolution spanning nearly two millennia.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.national_museum,
            locationName = "Chhauni, Kathmandu",
            entryFee = "NPR 200 (Foreigners) / NPR 25 (Locals)",
            tags = listOf("Museum", "History", "Military")
        ),
        Recommendation(
            name = "Kathmandu Durbar Square",
            description = "A UNESCO World Heritage Site known locally as Basantapur, this historic square was the royal seat of the Malla and Shah kings. It features a spectacular cluster of ancient temples, palaces, and courtyards, including the Hanuman Dhoka Palace and the Kumari Ghar, home of the Living Goddess. The site showcases the pinnacle of traditional Newari architecture and woodcarving.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.kathmandu_durbar_square,
            locationName = "Basantapur, Kathmandu",
            entryFee = "NPR 1,000 (Foreigners) / Free (Locals)",
            tags = listOf("UNESCO", "Newari Culture", "Royal Palace")
        ),
        Recommendation(
            name = "Birendra International Convention Center",
            description = "A distinct architectural landmark in New Baneshwor, characterized by its unique blue roof and modern design. Originally constructed with Chinese assistance to host international summits, it served as the interim meeting place for the Federal Parliament of Nepal for over a decade. It remains a premier venue for major national and international conferences.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.birendra_ic_center,
            locationName = "New Baneshwor, Kathmandu",
            entryFee = "Restricted (Event-based)",
            tags = listOf("Modern Architecture", "Political History")
        ),
        Recommendation(
            name = "Civil Service Hospital",
            description = "A state-of-the-art federal government hospital located in Minbhawan, New Baneshwor, established with assistance from China. While its primary mandate is to provide specialized treatment to civil servants, it serves the general public with advanced facilities, standing as a landmark of modern healthcare infrastructure in the capital.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.civil_service_hospital,
            locationName = "Minbhawan, Kathmandu",
            entryFee = "Public Access (Medical)",
            tags = listOf("Healthcare", "Infrastructure")
        ),
        Recommendation(
            name = "Tribhuvan International Airport",
            description = "The primary international aerial gateway to Nepal, named after King Tribhuvan. Originally known as Gaucharan Airport, it has evolved from a grass airstrip to a vital hub connecting the Himalayan nation to the globe. It is the starting point for most Himalayan expeditions and international tourists entering Nepal.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.tribhuwan_airport,
            locationName = "Pashupatinath Area, Kathmandu",
            entryFee = "Free (Public areas)",
            tags = listOf("Transport", "Aviation", "Gateway")
        ),
        Recommendation(
            name = "Ratna Park",
            description = "A historic public park in central Kathmandu named after Queen Ratna Rajya Lakshmi Devi Shah. Recently renovated with modern water fountains and seating areas, it serves as a vital green lung for the city and a meeting point for locals seeking a peaceful escape from the urban hustle of the nearby Ratnapark bus hub.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.ratna_park,
            locationName = "Central Kathmandu",
            entryFee = "NPR 50 (General Public)",
            tags = listOf("Park", "Recreation", "Green Space")
        ),
        Recommendation(
            name = "Tundikhel",
            description = "One of the largest open parade grounds in Asia, Tundikhel is a historic multipurpose field used for military parades, horse racing (Ghode Jatra), and public celebrations. It is located between Ratnapark and Sahid Gate and serves as an important site for cultural events that define the Kathmandu urban landscape.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.tundikhel,
            locationName = "New Road, Kathmandu",
            entryFee = "Free (Open area)",
            tags = listOf("Military", "Festivals", "Open Space")
        ),

        // ==========================================
        // TEMPLES CATEGORY (Spiritual & Ancient)
        // ==========================================
        Recommendation(
            name = "Pashupatinath",
            description = "One of the holiest Hindu temples in the world, dedicated to Lord Shiva as the 'Lord of Animals'. Located on the Bagmati River, it is famous for its silver-plated doors and gold roof. The evening 'Aarti' ceremony, featuring synchronized light rituals with oil lamps and music, is a profound spiritual experience attracting thousands daily.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.pashupatinath,
            locationName = "Gaushala, Kathmandu",
            entryFee = "NPR 1,000 (Foreigners) / Free (Indians)",
            tags = listOf("UNESCO", "Shiva", "Ritual", "Aarti")
        ),
        Recommendation(
            name = "Guhyeshwari Temple",
            description = "A highly revered Shakti Peeth near Pashupatinath. Mythology states this is where the hips of Goddess Sati fell. It is an important pilgrimage site for Tantric practitioners, symbolizing potent divine feminine energy. The temple's interior features a unique metal plate covering a hole that represents the goddess's body part.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.guhyeshwari_temple,
            locationName = "Pashupatinath Complex",
            entryFee = "Free (Donations Welcome)",
            tags = listOf("Shakti", "Tantra", "Mythology")
        ),
        Recommendation(
            name = "Budhanilkantha Temple",
            description = "Renowned for its colossal 5th-century stone statue of Lord Vishnu reclining on a bed of serpents in a cosmic pond. Carved from a single block of black basalt, it is a masterpiece of Licchavi era art. Legend traditionally barred the monarchs of Nepal from visiting this temple due to a prophetic curse.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.budhanilkantha_bishnu_temple,
            locationName = "Budhanilkantha, Kathmandu",
            entryFee = "Free",
            tags = listOf("Vishnu", "Ancient Art", "Floating Statue")
        ),
        Recommendation(
            name = "Dakshinkali Temple",
            description = "Situated in a dark, forest-covered ravine, this temple is dedicated to the goddess Kali. It is famous for animal sacrifices performed on Tuesdays and Saturdays. The scenic drive through traditional villages makes it a popular weekend pilgrimage for locals seeking blessings and picnicking in the nearby pine forests.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.dakshinkali_temple,
            locationName = "Pharping, Kathmandu",
            entryFee = "Free",
            tags = listOf("Kali", "Pilgrimage", "Sacrifice")
        ),
        Recommendation(
            name = "Swayambhunath",
            description = "Perched on a hill, the 'Monkey Temple' is one of the oldest religious sites in Nepal. It features a grand stupa with the painted eyes of Buddha symbolizing wisdom. Home to hundreds of monkeys, the site offers a 360-degree view of the city and represents perfect harmony between Hindu and Buddhist devotees.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.swayambhu_temple,
            locationName = "Swayambhu, Kathmandu",
            entryFee = "NPR 200 (Foreigners)",
            tags = listOf("UNESCO", "Buddhism", "Viewpoint")
        ),
        Recommendation(
            name = "Kopan Monastery",
            description = "A center for Tibetan Buddhist study and meditation on a hill north of Boudhanath. Famous for its 'Discover Buddhism' courses, the monastery features magnificent temples, gold statues, and peaceful gardens. It is a tranquil escape for those seeking spiritual reflection and views of the Kathmandu valley floor.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.kopan_monastery,
            locationName = "Kopan, Kathmandu",
            entryFee = "Free",
            tags = listOf("Meditation", "Buddhism", "Quiet")
        ),
        Recommendation(
            name = "Changu Narayan Temple",
            description = "The oldest Hindu temple in Nepal, dating to the 4th-century. This UNESCO site is a museum of stone, wood, and metal craftsmanship. It houses the oldest stone inscription in Nepal. Its ridge location offers a quiet atmosphere surrounded by a traditional Newari settlement and a small local museum.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.changu_narayan,
            locationName = "Changu, Bhaktapur",
            entryFee = "NPR 300 (Foreigners)",
            tags = listOf("Ancient", "Vishnu", "UNESCO")
        ),
        Recommendation(
            name = "Krishna Mandir",
            description = "The centerpiece of Patan Durbar Square, this 17th-century temple is the only one in Nepal built entirely of stone. It features 21 golden pinnacles and friezes depicting scenes from the Mahabharata and Ramayana. It is the spiritual heart of Lalitpur and a masterpiece of Shikara-style architecture.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.krishna_mandir,
            locationName = "Patan, Lalitpur",
            entryFee = "Included in Square Fee",
            tags = listOf("Stone Art", "Krishna", "Epic")
        ),
        Recommendation(
            name = "Bangalamukhi Temple",
            description = "Dedicated to one of the ten Mahavidyas (wisdom goddesses), this temple is widely visited by people seeking victory over enemies or success in legal matters. Located within the Kumbheshwar temple complex in Patan, it is especially crowded on Thursdays when devotees offer yellow flowers and oil lamps.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.bangalamukhi_temple,
            locationName = "Patan, Lalitpur",
            entryFee = "Free",
            tags = listOf("Success", "Goddess", "Patan")
        ),
        Recommendation(
            name = "Bajrayogini Temple",
            description = "An ancient Tantric temple located in the historic town of Sankhu. Dedicated to the Buddhist/Hindu goddess Bajrayogini, the three-storied pagoda temple is surrounded by many small shrines and caves used by yogis for centuries. The site is a key cultural landmark of the northeastern valley.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.bajrayogini_temple,
            locationName = "Sankhu, Kathmandu",
            entryFee = "Free",
            tags = listOf("Tantra", "Hiking", "Ancient")
        ),

        // ==========================================
        // DESTINATIONS CATEGORY (Travel & Leisure)
        // ==========================================
        Recommendation(
            name = "Nagarkot",
            description = "A world-renowned hill station 32 km east of Kathmandu, celebrated for offering one of the broadest views of the Himalayas. On clear days, visitors can see eight Himalayan ranges, including Everest. Famous for its stunning sunrise views, it was historically a summer retreat for Nepali royalty.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.nagarkot,
            locationName = "Nagarkot, Kavre",
            entryFee = "Free (Town) / NPR 350 (Tower Area)",
            tags = listOf("Himalayas", "Sunrise", "Honeymoon")
        ),
        Recommendation(
            name = "Chandragiri Hills",
            description = "A historic hill station accessible by a scenic 2.5 km cable car ride. It features the Bhaleshwor Mahadev Temple and offers a 180-degree view of the Himalayas. This is where King Prithvi Narayan Shah first gazed upon the valley and conceived the idea of a unified Nepal.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.chandragiri_hills,
            locationName = "Thankot, Kathmandu",
            entryFee = "USD 22 (Foreigners) / NPR 800 (Locals)",
            tags = listOf("Cable Car", "History", "Adventure")
        ),
        Recommendation(
            name = "Boudhanath Stupa",
            description = "One of the largest spherical stupas in the world and the center of Tibetan Buddhism in Nepal. The massive white dome and golden spire with all-seeing eyes create a peaceful atmosphere. Surrounded by monasteries and shops, it is a haven for meditation and ritual circumambulation (Kora).",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.boudhanath_stupa,
            locationName = "Boudha, Kathmandu",
            entryFee = "NPR 400 (Foreigners)",
            tags = listOf("UNESCO", "Buddhism", "Peace")
        ),
        Recommendation(
            name = "Bhaktapur Durbar Square",
            description = "An 'Open Museum' of medieval art and architecture. Famous for the 55-Window Palace, the Nyatapola Temple (tallest in Nepal), and the Golden Gate. The square preserves the charm of the Malla dynasty and is world-famous for its traditional pottery and 'Juju Dhau' (King Curd).",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.bhaktapur_durbar_square,
            locationName = "Bhaktapur City",
            entryFee = "NPR 1,800 (Foreigners) / NPR 500 (SAARC)",
            tags = listOf("Medieval", "Pottery", "Heritage")
        ),
        Recommendation(
            name = "Garden of Dreams",
            description = "A neoclassical garden in the heart of Kathmandu. Built in 1920, it was restored with Austrian aid and serves as a serene oasis with pavilions, fountains, and sunken gardens. It offers a sophisticated European vibe, perfect for escaping the traffic and dust of the city.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.garden_of_dreams,
            locationName = "Kaiser Mahal, Thamel",
            entryFee = "NPR 400 (Foreigners) / NPR 150 (Locals)",
            tags = listOf("Relaxation", "Garden", "Architecture")
        ),
        Recommendation(
            name = "Godawari Botanical Garden",
            description = "Located at the foot of Phulchowki, the highest hill in the valley. Spanning 82 hectares, it houses thousands of plant species, a lily pond, and a cactus house. It is a favorite family picnic spot and a premier site for birdwatching and botany education in Nepal.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.godawari_garden,
            locationName = "Godawari, Lalitpur",
            entryFee = "NPR 200 (Foreigners) / NPR 50 (Locals)",
            tags = listOf("Nature", "Botany", "Family")
        ),
        Recommendation(
            name = "Patan Durbar Square",
            description = "Known as the 'City of Fine Arts', this square is a marvel of Newari metalwork and architecture. Highlights include the Patan Museum (one of the best in Asia) and the Golden Temple. It is the best place to watch traditional craftsmen practicing ancient arts in hidden courtyards.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.patan_durbar_square,
            locationName = "Mangal Bazaar, Lalitpur",
            entryFee = "NPR 1,000 (Foreigners)",
            tags = listOf("UNESCO", "Art", "Newari")
        ),
        Recommendation(
            name = "Dhulikhel",
            description = "An ancient Newari town famous for panoramic Himalayan views and well-preserved brick-paved streets. It is less touristy than Nagarkot and offers authentic culture. It is the starting point for popular hikes to Namo Buddha and provides a peaceful Himalayan retreat atmosphere.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.dhulikhel_view,
            locationName = "Dhulikhel, Kavre",
            entryFee = "Free",
            tags = listOf("Hiking", "Himalayas", "Newari")
        ),
        Recommendation(
            name = "Kirtipur",
            description = "Perched on a ridge, Kirtipur is one of the oldest settlements in the valley. It is a city of history and resistance with ancient temples like Bagh Bhairab. It is also the best place to experience authentic Newari cuisine like 'Samay Baji' in traditional local eateries.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.kirtipur_town,
            locationName = "Kirtipur, Kathmandu",
            entryFee = "Free",
            tags = listOf("Food", "History", "Local")
        ),
        Recommendation(
            name = "Shivapuri National Park",
            description = "The northern rim of the valley, famous for trekking, birdwatching, and waterfalls. It is the source of the Bagmati and Bishnumati rivers. Popular for hikes to Nagi Gompa and Shivapuri Peak, it offers lush forests and a chance to see wildlife like the Himalayan Black Bear.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.shivapuri_park,
            locationName = "Budhanilkantha, Kathmandu",
            entryFee = "NPR 1,000 (Foreigners) / NPR 100 (Locals)",
            tags = listOf("Trekking", "Nature", "Wildlife")
        )
    )
}