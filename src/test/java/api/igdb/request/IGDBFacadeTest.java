package api.igdb.request;

import api.igdb.apicalypse.APICalypse;
import api.igdb.util.ImageBuilder;
import api.igdb.util.ImageSize;
import api.igdb.util.ImageType;
import org.junit.jupiter.api.Test;

class IGDBFacadeTest {
    private final IGDBFacade facade = new IGDBFacade();

    public IGDBFacadeTest() {
        facade.setCredentials("ov3od6hqyjyb0iurx0hbbvp6ijde7v", "24jlaiw72qgv0z64gi7h1tbz11x3dz");
    }
    @Test
    void testGetCovers() throws Exception {
        APICalypse api = new APICalypse();
        var response = facade.getCovers(api.setFields("*").setWhere("id = 89412"));
        var cover = response.get(0).getUrl();
    }

    @Test
    void testGetGames() throws Exception {
        APICalypse api = new APICalypse();
        var response = facade.getGames(api.setLimit(1).setWhere("id = 114795").setFields("storyline, name, id, age_ratings, cover.*, screenshots.*"));
        var cover = response.get(0).getCover();
        var s = response.get(0).getScreenshots();
    }
    @Test
    void testGetScreenshots() throws Exception {
        APICalypse api = new APICalypse();
        var response = facade.getScreenshots(api.setLimit(1).setWhere("game = 114795").setFields("*"));
        System.out.println(response.get(0).getUrl());
    }

    @Test
    void testImageSize(){
        var imageUrl = ImageBuilder.build("co1wzo",ImageSize.HD, ImageType.PNG);
        System.out.println(imageUrl);
    }
}