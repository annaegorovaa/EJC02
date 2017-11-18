package com.epam.streams.task2;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class TextStream {
    public static void main(String[] args) {
        TextStream textStream = new TextStream();
        Set<String> keyWords = textStream.setKeyWords();
        Set<String> foundKeyWords = textStream.findKeyWords(keyWords, args[0]);
        textStream.printToFile(foundKeyWords);
    }

    private void printToFile(Set<String> foundKeyWords) {
        try (FileWriter writer = new FileWriter("TextOutput.txt")) {
            for (String keyword : foundKeyWords) {
                writer.write(keyword + "\r\n");
            }
            writer.write("The number of keywords: " + foundKeyWords.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Set<String> findKeyWords(Set<String> keyWords, String fileName) {
        Set<String> foundKeyWords = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                char[] toCheck = line.toCharArray();
                for (char ch : toCheck) {
                    Character letter = new Character(ch);
                    String wordToCheck;
                    if (letter.isLowerCase(ch)) {
                        sb.append(ch);
                    } else if (Character.isJavaIdentifierPart(ch)) {
                        sb.setLength(0);
                    } else {
                        wordToCheck = sb.toString();
                        if (keyWords.contains(wordToCheck)) {
                            foundKeyWords.add(wordToCheck);
                        }
                        sb.setLength(0);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return foundKeyWords;
    }

    private Set<String> setKeyWords() {
        Set<String> keyWords = new HashSet();
        keyWords.add("abstract");
        keyWords.add("continue");
        keyWords.add("for");
        keyWords.add("new");
        keyWords.add("switch");
        keyWords.add("assert");
        keyWords.add("default");
        keyWords.add("goto");
        keyWords.add("package");
        keyWords.add("synchronized");
        keyWords.add("boolean");
        keyWords.add("do");
        keyWords.add("if");
        keyWords.add("private");
        keyWords.add("this");
        keyWords.add("break");
        keyWords.add("double");
        keyWords.add("implements");
        keyWords.add("protected");
        keyWords.add("throw");
        keyWords.add("byte");
        keyWords.add("else");
        keyWords.add("import");
        keyWords.add("public");
        keyWords.add("throws");
        keyWords.add("case");
        keyWords.add("enum");
        keyWords.add("instanceof");
        keyWords.add("return");
        keyWords.add("transient");
        keyWords.add("catch");
        keyWords.add("extends");
        keyWords.add("int");
        keyWords.add("short");
        keyWords.add("short");
        keyWords.add("try");
        keyWords.add("char");
        keyWords.add("final");
        keyWords.add("interface");
        keyWords.add("static");
        keyWords.add("void");
        keyWords.add("class");
        keyWords.add("finally");
        keyWords.add("long");
        keyWords.add("strictfp");
        keyWords.add("volatile");
        keyWords.add("const");
        keyWords.add("float");
        keyWords.add("native");
        keyWords.add("super");
        keyWords.add("while");

        return keyWords;
    }
}
