package techkids.vn.tkprogress.networks.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by huynq on 7/22/17.
 */

public class Score {

    @SerializedName("_id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("className")
    private String className;

    @SerializedName("score")
    private int score;

    public Score() {
    }

    public Score(String id, String name, String avatar, String className, int score) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.className = className;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", className='" + className + '\'' +
                ", score=" + score +
                '}';
    }
}
