package com.example.listcontactos.database;

import androidx.room.RoomDatabase;

public abstract class ContactDataBase extends RoomDatabase {

    public abstract ContactDAO getContactDAO();

}
