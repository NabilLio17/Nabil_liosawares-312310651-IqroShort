package com.example.IqroShort;

public class ActivityItem {

    private String title;
    private int imageResId;
    private Class<?> targetActivity;

    public ActivityItem(String title, int imageResId, Class<?> targetActivity) {
        this.title = title;
        this.imageResId = imageResId;
        this.targetActivity = targetActivity;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public Class<?> getTargetActivity() {
        return targetActivity;
    }
}
