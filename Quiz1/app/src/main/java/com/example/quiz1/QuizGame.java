package com.example.quiz1;
import android.content.Intent;

import java.util.Random;

public class QuizGame {
    public static Quiz[] quiz = {
            new Quiz("¿De qué compañía es el Macbook?",
                    new String[]{"Apple", "Nokia", "Google", "Samsung"},
                    "Apple"),
            new Quiz( "¿De que compañia es la swtich?",
                    new String[]{"Xbox","Sony","Nintendo","Sega"},
                    "Nintendo"),
            new Quiz("¿Que videojuego provoco la crisis del 83?",
                    new String[]{"Donkey Kong","Pac-man","E.T.","Jetpac"},
                    "E.T."),
            new Quiz("¿Cual fue la primera videoconsola?",
                    new String[]{"Atari 2600","NES","Magnavox Odyssey","Mastersystem"},
                    "Magnavox Odyssey"),
            new Quiz("¿Cuales de estos juegos salio para el 'Cerebro de la bestia'?",
                    new String[]{"Super mario World","Sonic 1","Resident evil","Halo"},
                    "Super mario World"),
            new Quiz("¿Cual es el primer juego de pokemon?",
                    new String[]{"Pokemon Rojo", "Pokemon ruby", "Pokemon escarlata", "Pokemon Diamante"},
                    "Pokemon Rojo"),
            new Quiz( "¿Cuales de estas consolas es portatil?",
                    new String[]{"Ps2","Nintendo 64","Ps vita","Nintendo Wii U"},
                    "Ps vita"),
            new Quiz("¿Cuales de estas empresas tuvo que dejar de hacer consolas?",
                    new String[]{"Sony","Microsoft","Nintendo","Sega"},
                    "Sega"),
            new Quiz("¿Cuales de estos videojuegos se situa en España?",
                    new String[]{"Resident Evil 4","Super mario sunshine","Devil may cry 3","DOOM"},
                    "Resident Evil 4"),
            new Quiz("¿Cuales de estas consolas es hibrida?",
                    new String[]{"Sega Dreamcast","Nintendo Switch","Atari Jaguar","Xbox series x"},
                    "Nintendo Switch"),
    };

    static public int score;
    static public int total;
    static public int current;

    //static public int score, total, current;// funciona igual que lo de arriba//

    static public String answer;

    static public int[] shuffles;

    static public void InitGame()
    {
        score = 0;
        current = 0;
        answer = "";
        total = quiz.length;
        shuffles = new int[total];
        for(int i = 0; i<total; i++)
        {
            shuffles[i] = i;
        }

        for (int i = 0; i<total; i++)
        {
            int temp = shuffles[i];
            Random random = new Random();
            int randomNum = random.nextInt(total);
            shuffles[i] = shuffles[randomNum];
            shuffles[randomNum] = temp;
        }

    }

    static public Quiz GetCurrentQuiz()
    {
        return quiz[shuffles[current]];
    }

    static public boolean CheckAnswer()
    {
        if (answer == quiz[shuffles[current]].correct) score++;
        current++;
        answer="";

        if(current >= total)
        {
            return true;
        }
        else return false;
    }
}
