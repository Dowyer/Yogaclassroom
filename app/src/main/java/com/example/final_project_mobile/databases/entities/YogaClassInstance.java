package com.example.final_project_mobile.databases.entities;

public class YogaClassInstance {
    //Table name
    public static final String TABLE_NAME = "YogaClassInstance";
    //Columns
    public static final String COLUMN_YOGA_CLASS_INSTANCE_ID = "yoga_class_instance_id";
    public static final String COLUMN_YOGA_CLASS_ID = "yoga_class_id";
    public static final String COLUMN_DATE = "date";
    public static final String COLUMN_DESCRIPTION = "description";
    //variables
    private int yoga_class_instance_id;
    private int yoga_class_id;
    private String date;
    private String description;

    public YogaClassInstance(int yoga_class_instance_id, int yoga_class_id, String date, String description) {
        this.yoga_class_instance_id = yoga_class_instance_id;
        this.yoga_class_id = yoga_class_id;
        this.date = date;
        this.description = description;
    }

    public int getYoga_class_instance_id() {
        return yoga_class_instance_id;
    }

    public void setYoga_class_instance_id(int yoga_class_instance_id) {
        this.yoga_class_instance_id = yoga_class_instance_id;
    }

    public int getYoga_class_id() {
        return yoga_class_id;
    }

    public void setYoga_class_id(int yoga_class_id) {
        this.yoga_class_id = yoga_class_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public static final String CREATE_TABLE_YOGA_CLASS_INSTANCE =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_YOGA_CLASS_INSTANCE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_YOGA_CLASS_ID + " INTEGER NOT NULL, " +
                    COLUMN_DATE + " TEXT NOT NULL, " +
                    COLUMN_DESCRIPTION + " TEXT, " +
                    "FOREIGN KEY(" + COLUMN_YOGA_CLASS_ID + ") REFERENCES " + YogaClass.TABLE_NAME + "(" + YogaClass.COLUMN_YOGA_CLASS_ID + ")" +
                    ");";

}
