package com.hakankaralar.artfragment.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.hakankaralar.artfragment.model.Art;

@Database(entities = {Art.class} ,version = 1)
public abstract class ArtDatabase extends RoomDatabase {
    public abstract ArtDao artDao();

}
