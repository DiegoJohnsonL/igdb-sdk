package api.igdb.util;

public class ImageBuilder {
    private static final String IGDB_IMAGE_URL = "https://images.igdb.com/igdb/image/upload/";
    public static String build(String imageId, ImageSize imageSize, ImageType imageType){
       return IGDB_IMAGE_URL + imageSize.toSize() + "/" + imageId + "." + imageType.type();
    }
}
