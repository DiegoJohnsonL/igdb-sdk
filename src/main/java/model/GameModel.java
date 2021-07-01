package model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GameModel {
    private int id;
    private String name;
    private String summary;
    private String storyline;
    private CoverModel cover;
    private List<String> ageRatings;

    public List<ScreenshotModel> getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(List<ScreenshotModel> screenshots) {
        this.screenshots = screenshots;
    }

    private List<ScreenshotModel> screenshots;

    public CoverModel getCover() {
        return cover;
    }
    public void setCover(CoverModel cover) {
        this.cover = cover;
    }
    public List<String> getAgeRatings() {
        return ageRatings;
    }

    public void setAgeRatings(List<String> ageRatings) {
        this.ageRatings = ageRatings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getStoryline() {
        return storyline;
    }

    public void setStoryline(String storyline) {
        this.storyline = storyline;
    }
}
