package vn.edu.iuh.www_lab_week5_20009931_nguyenhoangthai.backend.enums;

public enum SkillLevel {
    MASTER(5),
    PROFESSIONAL(4),
    ADVANCED(3),
    INTERMEDIATE(2),
    BEGINER(1);
    private int value;
    SkillLevel(int value){
        this.value = value;
    }
}
