package com.example.isms.model;
import java.util.List;

public class MatchRequest {
    public Matches matches;
    public List<Mat> matList;

    public Matches getMatches() {
        return matches;
    }

    public void setMatches(Matches matches) {
        this.matches = matches;
    }

    public List<Mat> getMatList() {
        return matList;
    }

    public void setMatList(List<Mat> matList) {
        this.matList = matList;
    }
}
