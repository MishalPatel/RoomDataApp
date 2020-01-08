package com.alchemy.admin.roomdataapp.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.alchemy.admin.roomdataapp.TaskDao;
import com.alchemy.admin.roomdataapp.model.Task;

@Database(entities = {Task.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}