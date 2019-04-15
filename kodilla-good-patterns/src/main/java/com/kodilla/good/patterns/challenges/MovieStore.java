package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MovieStore {
    final List<String> ironManTranslations = new ArrayList();
    final List<String> avengersTranslations = new ArrayList();
    final List<String> flashTranslations = new ArrayList();
    final Map<String, List<String>> booksTitlesWithTranslations = new HashMap();

    public MovieStore() {
        this.ironManTranslations.add("Żelazny Człowiek");
        this.ironManTranslations.add("Iron Man");
        this.avengersTranslations.add("Mściciele");
        this.avengersTranslations.add("Avengers");
        this.flashTranslations.add("Błyskawica");
        this.flashTranslations.add("Flash");
        this.booksTitlesWithTranslations.put("IM", this.ironManTranslations);
        this.booksTitlesWithTranslations.put("AV", this.avengersTranslations);
        this.booksTitlesWithTranslations.put("FL", this.flashTranslations);
    }
    public final Map<String, List<String>> getMovies() {
        return this.booksTitlesWithTranslations;
    }
}

