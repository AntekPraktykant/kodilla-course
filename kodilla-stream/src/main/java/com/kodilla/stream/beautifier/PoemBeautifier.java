package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify (String s, PoemDecorator decorator){
        return decorator.decorate(s);
    }
}
