package com.azamovhudstc.quizapp.model;

import com.azamovhudstc.quizapp.R;

public enum QuestionCategory {
    BIOLOGY("Sinh học", R.drawable.img_biology),
    PHYSICS("Vật lý", R.drawable.img_physics),
    GEOLOGY("Địa lý", R.drawable.img_geology),
    CHEMISTRY("Hóa học", R.drawable.img_chemistry),
    SCIENCE("Khoa học", R.drawable.img_science);

    private String subjectName;
    private int imageRes;

    QuestionCategory(String subjectName, int imageRes) {
        this.subjectName = subjectName;
        this.imageRes = imageRes;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public static QuestionCategory toQuestionCategory(String subjectName) {
        for (QuestionCategory category : QuestionCategory.values()) {
            if (category.getSubjectName().equals(subjectName)) {
                return category;
            }
        }
        return null;
    }
}
