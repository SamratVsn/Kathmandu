package com.example.kathmandu.data

import com.example.kathmandu.R
import com.example.kathmandu.model.CategoryOptions
import com.example.kathmandu.model.Recommendation

object DataSource {
    val defaultPlace: Recommendation = Recommendation(
        name = "Dharahara Tower",
        description = "Also known as the Bhimsen Tower, this white minaret-style landmark in Sundhara is a symbol of Nepal's resilience. Originally built in 1832 by Prime Minister Bhimsen Thapa, the nine-story tower offered panoramic views of the Kathmandu Valley. After collapsing in the devastating 2015 earthquake, it was reconstructed to its original architectural style but with modern safety features, standing tall once again as a national icon.",
        categoryOptions = CategoryOptions.SPECIALS,
        imageResourceId = R.drawable.dharahara_tower
    )

    val allRecommendation = listOf(
        Recommendation(
            name = "Singha Durbar",
            description = "The historic seat of the Nepali government and one of the most iconic buildings in Kathmandu. Originally built in 1908 by the Rana Prime Minister Chandra Shumsher JBR as a private residence, it was once considered the largest and most luxurious palace in Asia, boasting over 1,700 rooms and 17 courtyards. Today, it houses key government ministries, the Prime Minister's Office, and the National Planning Commission, serving as the administrative heart of the nation.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.singha_durbar
        ),
        Recommendation(
            name = "Birendra International Convention Center",
            description = "A distinct architectural landmark in New Baneshwor, characterized by its unique blue roof and modern design. Originally constructed with Chinese assistance to host international summits, it served as the interim meeting place for the Federal Parliament of Nepal (Constituent Assembly) for over a decade after the historic political changes. It remains a premier venue for major national and international conferences.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.birendra_ic_center
        ),
        Recommendation(
            name = "Civil Service Hospital",
            description = "A state-of-the-art federal government hospital located in Minbhawan, New Baneshwor, established with assistance from the People's Republic of China. While its primary mandate is to provide subsidized, high-quality specialized medical treatment to current and retired civil servants and their families, it also serves the general public with a wide range of medical services and advanced facilities.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.civil_service_hospital
        ),
        Recommendation(
            name = "Tribhuvan International Airport",
            description = "The primary international aerial gateway to Nepal, situated in the capital city of Kathmandu. Named after King Tribhuvan, it was originally known as Gaucharan Airport and has served as the hub for connecting the Himalayan nation to the globe since the mid-20th century. It acts as the main hub for Nepal Airlines and serves numerous international carriers connecting tourists to the mountains.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.tribhuwan_airport
        ),
        Recommendation(
            name = "Dharahara Tower",
            description = "Also known as the Bhimsen Tower, this white minaret-style landmark in Sundhara is a symbol of Nepal's resilience. Originally built in 1832 by Prime Minister Bhimsen Thapa, the nine-story tower offered panoramic views of the Kathmandu Valley. After collapsing in the devastating 2015 earthquake, it was reconstructed to its original architectural style but with modern safety features, standing tall once again as a national icon.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.dharahara_tower
        ),
        Recommendation(
            name = "Ratna Park",
            description = "A historic public park located in central Kathmandu, adjacent to the open parade ground of Tundikhel. Named after Queen Ratna Rajya Lakshmi Devi Shah, the park features lush gardens, paved pathways, and monuments, serving as a vital green lung and a popular recreational spot for city dwellers seeking a peaceful escape from the surrounding urban hustle.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.ratna_park
        ),
        Recommendation(
            name = "Narayanhiti Palace Museum",
            description = "The former royal palace of the Shah monarchs of Nepal, located at the northern end of Durbar Marg. Following the abolition of the monarchy in 2008, this sprawling complex was converted into a public museum. Visitors can explore the grand halls named after Nepali districts, the throne room, and the site of the tragic 2001 royal massacre, gaining a rare glimpse into the lifestyle of Nepal's royalty.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.narayanhiti_museum
        ),
        Recommendation(
            name = "National Museum",
            description = "Located in Chhauni, this is the oldest and largest museum in Nepal, originally established as an arsenal house in the early 19th century. It houses an extensive collection of archaeological treasures, ancient statues, traditional weapons, and historical artifacts that chronicle Nepal's rich military history, art, and cultural evolution spanning nearly two millennia.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.national_museum
        ),
        Recommendation(
            name = "Kathmandu Durbar Square",
            description = "A UNESCO World Heritage Site known locally as Basantapur, this historic square was the royal seat of the Malla and Shah kings. It features a spectacular cluster of ancient temples, palaces, and courtyards, including the Hanuman Dhoka Palace and the Kumari Ghar, home of the Living Goddess. The site showcases the pinnacle of traditional Newari architecture and woodcarving.",
            categoryOptions = CategoryOptions.SPECIALS,
            imageResourceId = R.drawable.kathmandu_durbar_square
        ),

        //TEMPLES Category
        Recommendation(
            name = "Pashupatinath",
            description = "One of the holiest Hindu temples in the world, dedicated to Lord Shiva in his incarnation as the 'Lord of Animals'. Located on the banks of the sacred Bagmati River, this UNESCO World Heritage Site is a sprawling complex of temples, ashrams, and open-air cremation ghats. It attracts millions of pilgrims annually, especially during the Maha Shivaratri festival.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.pashupatinath
        ),
        Recommendation(
            name = "Guhyeshwari Temple",
            description = "A highly revered Shakti Peeth located near the Pashupatinath temple complex. According to mythology, this is the spot where the secret part (hips) of Goddess Sati fell after her death. It is an important pilgrimage site for both Hindus and Tantric practitioners, symbolizing the potent female divine energy (Shakti).",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.guhyeshwari_temple
        ),
        Recommendation(
            name = "Budhanilkantha Temple",
            description = "Renowned for its enigmatic, colossal stone statue of Lord Vishnu reclining on a bed of coiled serpents (Ananta Shesha) in the middle of a cosmic pond. Carved from a single block of black basalt in the 5th century, the statue is a masterpiece of Licchavi era art. Legend traditionally barred the monarchs of Nepal from visiting this temple.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.budhanilkantha_bishnu_temple
        ),
        Recommendation(
            name = "Chandra Binayak Temple",
            description = "Located in Chabahil, this ancient double-storied temple is one of the four principal Vinayak (Ganesh) shrines in the Kathmandu Valley. Devotees flock here particularly on Tuesdays, believing that worshipping this deity can cure bodily lumps, bruises, and other external ailments, as well as grant overall good health.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.chandra_binayak_temple
        ),
        Recommendation(
            name = "Surya Binayak Temple",
            description = "Situated in a dense forest to the south of Bhaktapur, this temple is dedicated to Lord Ganesh as the 'Sun Ganesh'. It is believed to be the first place in the valley to receive the morning sun rays. Devotees, especially parents, visit this temple to pray for the well-being of their children and the curing of speech or hearing impairments.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.surya_binayak_temple
        ),
        Recommendation(
            name = "Karya Binayak Temple",
            description = "Located in a serene spot between the ancient villages of Bungamati and Khokana, this temple is dedicated to the 'Lord of Action' (Karya Ganesh). It is widely believed that paying homage here ensures the successful completion of new ventures, businesses, or difficult tasks. The deity is worshipped in the form of a naturally emerging stone.",
            categoryOptions = CategoryOptions.TEMPLES,
            imageResourceId = R.drawable.karya_binayak_temple
        ),

        // SHOPS Category
        Recommendation(
            name = "Thamel",
            description = "The vibrant nerve center of tourism in Kathmandu, famous since the 'hippie trail' days of the 1960s. Today, it is a bustling maze of narrow streets filled with trekking gear shops, pashmina stalls, handicraft boutiques, restaurants, and lively bars. It serves as the primary base camp for mountaineers and travelers preparing for their Himalayan adventures.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.thamel
        ),
        Recommendation(
            name = "Asan Bazaar",
            description = "A historic ceremonial square and marketplace in central Kathmandu that has served as a trade hub on the India-Tibet route for centuries. Famous for its six converging streets, it is the city's busiest traditional market where one can find everything from ritual spices, dried fruits, and textiles to brassware, all surrounding the Annapurna Temple.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.asan_bazaar
        ),
        Recommendation(
            name = "Labim Mall",
            description = "A premier lifestyle destination in Pulchowk, Lalitpur, that blends modern architecture with traditional Nepali aesthetics. It features an open-air courtyard, high-end international fashion brands, diverse dining options, and a multiplex cinema. It is a popular gathering spot for the city's youth and expatriate community.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.labim_mall
        ),
        Recommendation(
            name = "Durbar Marg",
            description = "Known as 'King's Way', this wide avenue leading to the Narayanhiti Palace Museum is the upscale face of Kathmandu. It is lined with luxury hotels, premium boutiques, branded showrooms, and fine dining restaurants. The area represents the modern, affluent side of the city and is a hub for high-end shopping and nightlife.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.durbar_marga
        ),
        Recommendation(
            name = "Civil Mall",
            description = "One of the largest shopping complexes in the city, located in the heart of Sundhara. This multi-story mall offers a comprehensive shopping experience with a wide variety of clothing stores, electronics shops, a large food court, a bowling arena, and a high-quality cinema multiplex, making it a favorite family destination.",
            categoryOptions = CategoryOptions.SHOPS,
            imageResourceId = R.drawable.civil_mall
        ),

        //  DESTINATIONS Category
        Recommendation(
            name = "Nagarkot",
            description = "A world-renowned hill station located 32 km east of Kathmandu, celebrated for offering one of the broadest views of the Himalayas. On clear days, visitors can see eight out of thirteen Himalayan ranges, including Mount Everest. It was historically a summer retreat for the royals and is now famous for its stunning sunrise and sunset views over the snow-capped peaks.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.nagarkot
        ),
        Recommendation(
            name = "Chandragiri Hills",
            description = "A historic hill station on the southwestern rim of the valley, accessible by a scenic cable car ride. It features the Bhaleshwor Mahadev Temple and offers a majestic 180-degree view of the Himalayas. Historically, this is the vantage point from where King Prithvi Narayan Shah first gazed upon the Kathmandu Valley and conceived the idea of unifying Nepal.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.chandragiri_hills
        ),
        Recommendation(
            name = "Boudhanath Stupa",
            description = "One of the largest spherical stupas in the world and a UNESCO World Heritage Site, serving as the center of Tibetan Buddhism in Nepal. The massive white dome is topped by a golden spire with the all-seeing eyes of Buddha. The surrounding area is a haven of peace, filled with monasteries, maroon-robed monks, and shops selling Tibetan artifacts.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.boudhanath_stupa
        ),
        Recommendation(
            name = "Swayambhunath (Monkey Temple)",
            description = "An ancient religious complex perched atop a hill, revered by both Hindus and Buddhists. Known as the 'Monkey Temple' due to the holy monkeys living in the area, it is believed to have self-emerged from a primordial lotus. The site offers breathtaking 360-degree views of the Kathmandu Valley and features a stupa with the painted eyes of Buddha symbolizing wisdom and compassion.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.swayambhu_temple
        ),
        Recommendation(
            name = "Bhaktapur Durbar Square",
            description = "A magnificent open-air museum of medieval art and architecture, preserving the charm of the Malla dynasty. Key attractions include the 55-Window Palace, the towering Nyatapola Temple (the tallest pagoda in Nepal), and the Golden Gate. The square is also famous for its traditional pottery, curd (Juju Dhau), and vibrant festivals.",
            categoryOptions = CategoryOptions.DESTINATIONS,
            imageResourceId = R.drawable.bhaktapur_durbar_square
        )
    )
}