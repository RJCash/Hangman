package com.example.demo;
/**
 * Created by rickiecashwell on 7/1/17.
 */
public class Word {
    int wordCount;
    String word;
    Integer id;
    String theme;

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

    public Word(Integer id,String word){
        this.id = id;
        this.word = word;
    }
    public Word(){

    }
    public int getwordCount(){
     return this.wordCount = this.word.length();

    }
}
