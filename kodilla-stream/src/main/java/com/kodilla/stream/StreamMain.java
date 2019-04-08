package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main( String[] args ) {

        System.out.println();
        String rawPoem = new String("Jedzą, piją, lulki palą,\nTańce, hulanka, swawola;\nLedwie karczmy nie rozwalą,\nCha cha, chi chi, hejza, hola!\n\nTwardowski siadł w końcu stoła.\nPodparł się w boki jak basza;\n\"Hulaj dusza! hulaj!\" - woła,\nŚmieszy, tumani, przestrasza.\n\nŻołnierzowi, co grał zucha,\nWszystkich łaje i potrąca,\nŚwisnął szablą koło ucha,\nJuż z żołnierza masz zająca.");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(rawPoem, ( Str ) -> {
            System.out.println("-------------------\nLambda expression #1\n");
            return Str.toUpperCase();
        });
        poemBeautifier.beautify(rawPoem, ( Str ) -> {
            System.out.println("-------------------\nLambda expression #2\n");
            return Str.substring(110, 200);
        });
        poemBeautifier.beautify(rawPoem, ( Str ) -> {
            System.out.println("-------------------\nLambda expression #3\n");
            return "ABC   ->>>> " + Str + " <<<<- CBA";
        });
        poemBeautifier.beautify(rawPoem, ( Str ) -> {
            System.out.println("-------------------\nLambda expression #4\n");
            return Str.replace("Twardowski", "POLITYCZNIE POPRAWNY CZLOWIEK");
        });
    }
}





