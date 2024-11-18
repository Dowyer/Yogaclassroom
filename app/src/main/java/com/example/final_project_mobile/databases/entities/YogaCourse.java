package com.example.final_project_mobile.databases.entities;

public class YogaCourse {
    //Table name
    public static final String TABLE_NAME = "YogaCourse";
    //Columns
    public static final String COLUMN_YOGA_COURSE_ID = "yoga_course_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_DAY_OF_WEAK = "day_of_weak";
    public static final String COLUMN_TIME = "time";
    public static final String COLUMN_PRICE = "price";
    public static final String COLUMN_CAPACITY = "capacity";
    public static final String COLUMN_TYPE = "type";
    public static final String COLUMN_DURATION = "duration";
    public static final String COLUMN_DESCRIPTION = "description";
    //variables
    private int yoga_course_id;
    private String name;
    private String day_of_weak;
    private String time;
    private double price;
    private int capacity;
    private String type;
    private int duration;
    private String description;

    public YogaCourse(int yoga_course_id, String name, String day_of_weak, String time, double price, int capacity, String type, int duration, String description) {
        this.yoga_course_id = yoga_course_id;
        this.name = name;
        this.day_of_weak = day_of_weak;
        this.time = time;
        this.price = price;
        this.capacity = capacity;
        this.type = type;
        this.duration = duration;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYoga_course_id() {
        return yoga_course_id;
    }

    public void setYoga_course_id(int yoga_course_id) {
        this.yoga_course_id = yoga_course_id;
    }

    public String getDay_of_weak() {
        return day_of_weak;
    }

    public void setDay_of_weak(String day_of_weak) {
        this.day_of_weak = day_of_weak;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //database
    public static final String CREATE_TABLE_YOGA_COURSE =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_YOGA_COURSE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_NAME + " TEXT NOT NULL, " +
                    COLUMN_DAY_OF_WEAK + " TEXT NOT NULL, " +
                    COLUMN_TIME + " TEXT NOT NULL, " +
                    COLUMN_PRICE + " REAL, " +
                    COLUMN_CAPACITY + " INTEGER, " +
                    COLUMN_TYPE + " TEXT, " +
                    COLUMN_DURATION + " INTEGER, " +
                    COLUMN_DESCRIPTION + " TEXT" +
                    ");";

}
