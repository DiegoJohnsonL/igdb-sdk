package api.igdb.util;

public enum ImageSize {
    MICRO("t_micro"),
    THUMB("t_thumb"),
    COVER_SMALL("t_cover_small"),
    COVER_BIG("t_cover_big"),
    LOGO_MEDIUM("t_logo_med"),
    SCREENSHOT_MEDIUM("t_screenshot_med"),
    SCREENSHOT_BIG("t_screenshot_big"),
    SCREENSHOT_HUGE("t_screenshot_huge"),
    HD("t_720p"),
    FHD("t_1080p");

    private final String size;
    private ImageSize(String size){
        this.size = size;
    }
    public String toSize(){
        return this.size;
    }
}
