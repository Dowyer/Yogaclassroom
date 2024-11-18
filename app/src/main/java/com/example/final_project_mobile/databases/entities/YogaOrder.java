package com.example.final_project_mobile.databases.entities;

public class YogaOrder {
    //Table name
    public static final String TABLE_NAME = "YogaOrder";
    //Columns
    public static final String COLUMN_YOGA_ORDER_ID = "yoga_order_id";
    public static final String COLUMN_YOGA_USER_ID = "yoga_user_id";
    public static final String COLUMN_YOGA_CLASS_INSTANCE_ID = "YogaClassInstance_id";
    public static final String COLUMN_INFORMATION = "information";
    //variables

    private int yoga_order_id;
    private int yoga_user_id;
    private int yoga_class_instance_id;
    private String information;

    public YogaOrder(int yoga_order_id, int yoga_user_id, int yoga_class_instance_id, String information) {
        this.yoga_order_id = yoga_order_id;
        this.yoga_user_id = yoga_user_id;
        this.yoga_class_instance_id = yoga_class_instance_id;
        this.information = information;
    }

    public int getYoga_order_id() {
        return yoga_order_id;
    }

    public void setYoga_order_id(int yoga_order_id) {
        this.yoga_order_id = yoga_order_id;
    }

    public int getYoga_user_id() {
        return yoga_user_id;
    }

    public void setYoga_user_id(int yoga_user_id) {
        this.yoga_user_id = yoga_user_id;
    }

    public int getYoga_class_instance_id() {
        return yoga_class_instance_id;
    }

    public void setYoga_class_instance_id(int yoga_class_instance_id) {
        this.yoga_class_instance_id = yoga_class_instance_id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
    public static final String CREATE_TABLE_YOGA_ORDER =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_YOGA_ORDER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_YOGA_USER_ID + " INTEGER NOT NULL, " +
                    COLUMN_YOGA_CLASS_INSTANCE_ID + " INTEGER NOT NULL, " +
                    COLUMN_INFORMATION + " TEXT, " +
                    "FOREIGN KEY(" + COLUMN_YOGA_USER_ID + ") REFERENCES YogaUser(" + YogaUser.COLUMN_YOGA_USER_ID + "), " +
                    "FOREIGN KEY(" + COLUMN_YOGA_CLASS_INSTANCE_ID + ") REFERENCES YogaClassInstance(" + YogaClassInstance.COLUMN_YOGA_CLASS_INSTANCE_ID + ")" +
                    ");";

}
