package com.shuffle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShuffleSampleTest {
    Shuffle shuffle;

    Artist artist1;
    Artist artist2;

    Music music1;
    Music music2;
    Music music3;
    Music music4;
    Music music5;

    List<Music> expected;

    @BeforeEach
    public void init() {
        shuffle = new Shuffle();

        artist1 = new Artist("Marnie Real Love");
        artist2 = new Artist("Jose Marsry Tian");

        music1 = new Music("Back", 210);
        music2 = new Music("The Love", 211);
        music3 = new Music("Talk Real", 185);
        music4 = new Music("Fly", 221);
        music5 = new Music("Down the Road", 208);

        expected = new ArrayList<>();

        artist1.addMusic(music1);
        artist1.addMusic(music4);
        artist1.addMusic(music3);

        artist2.addMusic(music2);
        artist2.addMusic(music5);

        shuffle.addArtist(artist1);
        shuffle.addArtist(artist2);
    }

    @Test
    public void ___00P___get_musics() {
        expected.add(music1);
        expected.add(music5);
        expected.add(music4);
        expected.add(music3);
        expected.add(music2);

        assertEquals(expected, shuffle.getMusics());
    }

    @Test
    public void ___00P___search_music_1() {
        expected.add(music5);
        expected.add(music2);

        assertEquals(expected, shuffle.searchMusic("tHe"));
    }

    @Test
    public void ___00P___search_key_matches_artist_and_music() {
        expected.add(music1);
        expected.add(music4);
        expected.add(music3);

        assertEquals(expected, shuffle.searchMusic("Real"));
    }
}
