package com.teamtreehouse.funfactsproject.dhope;

import java.util.Random;

/**
 * Created by David on 8/30/2014.
 */
public class FactBook {

    // Member variable (properties about the object)
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Kangaroos can't hop backwards.",
            "The state of Georgia was named after the British King George II.",
            "Snow owls hunt and are active both day and night.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."};

    // Methods (abilities: things the object can do)
    public String getFact() {




        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
