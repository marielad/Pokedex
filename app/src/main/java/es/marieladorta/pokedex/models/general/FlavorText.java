package es.marieladorta.pokedex.models.general;

import com.google.gson.annotations.SerializedName;

import es.marieladorta.pokedex.models.general.NameUrl;

public class FlavorText {

    @SerializedName("flavor_text")
    private String flavor_text;

    @SerializedName("language")
    private NameUrl Language;

    public String getFlavor_text() {
        return flavor_text;
    }

    public NameUrl getLanguage() {
        return Language;
    }
}
