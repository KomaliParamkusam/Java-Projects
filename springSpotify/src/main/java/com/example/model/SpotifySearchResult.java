package com.example.model;


public class SpotifySearchResult {
    private String id;
    private String name;
    private String type;
    private String imageUrl;
    private String externalUrl;

    public SpotifySearchResult() {}

    public SpotifySearchResult(String id, String name, String type, String imageUrl, String externalUrl) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.imageUrl = imageUrl;
        this.externalUrl = externalUrl;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public String getImageUrl() { return imageUrl; }
    public String getExternalUrl() { return externalUrl; }
}

