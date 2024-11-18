package com.example.final_project_mobile.databases.entities;

public class YogaCourseYogaClass {
    //Table name
    public static final String TABLE_NAME = "YogaCourseYogaClass";
    //Columns
    public static final String COLUMN_YOGA_CLASS_ID = "yoga_class_id";
    public static final String COLUMN_YOGA_COURSE_ID = "yoga_course_id";
    //variables
    private int yoga_class_id;
    private int yoga_course_id;

    public YogaCourseYogaClass(int yoga_class_id, int yoga_course_id) {
        this.yoga_class_id = yoga_class_id;
        this.yoga_course_id = yoga_course_id;
    }

    public int getYoga_class_id() {
        return yoga_class_id;
    }

    public void setYoga_class_id(int yoga_class_id) {
        this.yoga_class_id = yoga_class_id;
    }

    public int getYoga_course_id() {
        return yoga_course_id;
    }

    public void setYoga_course_id(int yoga_course_id) {
        this.yoga_course_id = yoga_course_id;
    }
    public static final String CREATE_TABLE_YOGA_COURSE_YOGA_CLASS =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    YogaClass.COLUMN_YOGA_CLASS_ID + " INTEGER NOT NULL, " +
                    YogaCourse.COLUMN_YOGA_COURSE_ID + " INTEGER NOT NULL, " +
                    "PRIMARY KEY (" + YogaClass.COLUMN_YOGA_CLASS_ID + ", " + YogaCourse.COLUMN_YOGA_COURSE_ID + "), " +
                    "FOREIGN KEY (" + YogaClass.COLUMN_YOGA_CLASS_ID + ") REFERENCES " +
                    YogaClass.TABLE_NAME + "(" + YogaClass.COLUMN_YOGA_CLASS_ID + "), " +
                    "FOREIGN KEY (" + YogaCourse.COLUMN_YOGA_COURSE_ID + ") REFERENCES " +
                    YogaCourse.TABLE_NAME + "(" + YogaCourse.COLUMN_YOGA_COURSE_ID + ")" +
                    ");";




}
