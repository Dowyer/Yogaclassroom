package com.example.final_project_mobile.databases.entities;

public class YogaClass {
    //Table name
    public static final String TABLE_NAME = "YogaClass";
    //Columns
    public static final String COLUMN_YOGA_CLASS_ID = "yoga_class_id";
    public static final String COLUMN_ROOM_NUMBER = "room_number";
    public static final String COLUMN_DESCRIPTION = "description";
    //variables
    private int yoga_class_id;
    private String room_number;
    private String description;

    public YogaClass(int yoga_class_id, String room_number, String description) {
        this.yoga_class_id = yoga_class_id;
        this.room_number = room_number;
        this.description = description;
    }

    public int getYoga_class_id() {
        return yoga_class_id;
    }

    public void setYoga_class_id(int yoga_class_id) {
        this.yoga_class_id = yoga_class_id;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public static final String CREATE_TABLE_YOGA_CLASS =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_YOGA_CLASS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_ROOM_NUMBER + " TEXT NOT NULL, " +
                    COLUMN_DESCRIPTION + " TEXT" +
                    ");";

}
