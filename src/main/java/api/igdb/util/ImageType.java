package api.igdb.util;

public enum ImageType {
    PNG("png"),
    JPEG("jpg"),
    GIF("gif"),
    WEBP("webp");
    private final String type;
    private ImageType(String type){
        this.type = type;
    }
    public String type(){
        return this.type;
    }
}
