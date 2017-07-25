package com.example.demo;
/**
 * Created by rickiecashwell on 7/1/17.
 */
public class Word {
    int wordCount;
    String word;
    Integer id;
    String theme;

    public Word(Integer id,String word,String theme){
        this.id = id;
        this.word = word;
        this.theme = theme;
    }
    public Word(){

    }
    public String getTheme() {
        return theme;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getWord() {
        return word;
    }
    public int getwordCount(){
     return this.wordCount = this.word.length();

    }
}
