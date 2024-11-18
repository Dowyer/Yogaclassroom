package com.example.final_project_mobile.databases.entities;

public class YogaUser {
    //Table name
    public static final String TABLE_NAME = "YogaUser";
    //Columns
    public static final String COLUMN_YOGA_USER_ID = "yoga_user_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_ROLE = "role";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PHONE_NUMBER = "phone_number";
    public static final String COLUMN_DESCRIPTION = "description";
    //variables
    private int yoga_user_id;
    private String name;
    private String role;
    private String email;
    private String phone_number;
    private String description;

    public YogaUser(int yoga_user_id, String name, String role, String email, String phone_number, String description) {
        this.yoga_user_id = yoga_user_id;
        this.name = name;
        this.role = role;
        this.email = email;
        this.phone_number = phone_number;
        this.description = description;
    }

    public int getYoga_user_id() {
        return yoga_user_id;
    }

    public void setYoga_user_id(int yoga_user_id) {
        this.yoga_user_id = yoga_user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public static final String CREATE_TABLE_YOGA_USER =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_YOGA_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_NAME + " TEXT NOT NULL, " +
                    COLUMN_ROLE + " TEXT NOT NULL, " +
                    COLUMN_EMAIL + " TEXT NOT NULL, " +
                    COLUMN_PHONE_NUMBER + " TEXT, " +
                    COLUMN_DESCRIPTION + " TEXT" +
                    ");";

}
