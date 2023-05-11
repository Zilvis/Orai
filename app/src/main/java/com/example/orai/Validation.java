package com.example.orai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    // Regex pattern ( Apriboja vartotoja vesti duomenis pagal nurodyta sablona )
    private static final String USERNAME_PATTERN = "^[A-Za-z]{3,20}$";
    private static final String PASSWORD_PATTERN = "^[A-Za-z]{3,20}$";

    /**
     * Validuoja vartotojo ivestus duomenis
     * Jeigu vartotojo ivesti duomenys atitinka auksciau aprasyta sablona
     * @param username perduodami vartotojo ivesti duomeys
     * @return true jeigu pereina false jeigu nepraeina
     */
    public static boolean isUsernameValid ( String username){
        // Sukuriamas sablonas pagal eiluteje aprasytas taisykles
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);

        // Patikrina ar vartotojo ivesti duomenys atitinka auskciau aprasyta sablona
        Matcher matcher = pattern.matcher(username);

        // True grazins kai atitinka | False kaip neatitinka.
        return matcher.find();
    }

    public static boolean isPasswordValid ( String password){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}

// 1. LoginActivity paspaudus mygtuką login - pereiti į SearchActivity (reikės sukurti naują Activity).
// Pereiti tik, jeigu praeina validaciją.
// 2. Prisijungimo lange atlikti šių laukelių validaciją:
// Prisijungimo vardo:
// - nuo 3 iki 20 symbolių;
// - mažosios ir didžiosios raidės;
// - jokių specialių symbolių;

// Slaptažodžio:
// - nuo 5 iki 20 symbolių;
// - mažosios ir didžiosios raidės;
// - skaičiai;
// - specialūs symboliai- .!@_
// 3. Jeigu validacija sėkminga, išvesti pranešimą