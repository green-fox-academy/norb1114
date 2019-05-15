package controllers;

public class Greeting {

    public void setId(long id) {
        this.id = id;
    }

    private long id;
    private String content;

    public Greeting (long id, String content){
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }
}
