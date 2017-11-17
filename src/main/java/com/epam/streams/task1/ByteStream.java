package com.epam.streams.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ByteStream {
    public static void main(String[] args) {
        ByteStream byteStream = new ByteStream();
        Set<String> keyWords = byteStream.setKeyWords();
        Set<String> foundKeyWords = byteStream.findKeyWords(keyWords, args[0]);
        byteStream.printToFile(foundKeyWords);
    }

    private void printToFile(Set<String> foundKeyWords) {
        try (FileOutputStream fout = new FileOutputStream("ByteOutput.txt")) {
            for (String keyword : foundKeyWords) {
                byte[] toWrite = (keyword + "\r\n").getBytes();
                fout.write(toWrite);
            }
            byte[] toWrite = ("The number of keywords: " + foundKeyWords.size()).getBytes();
            fout.write(toWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Set findKeyWords(Set<String> keywords, String fileName) {
        Set<String> foundKeyWords = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fin =
                     new FileInputStream(fileName)) {
            int input;
            String wordToCheck;
            while ((input = fin.read()) != -1) {
                if (input > 96 && input < 123) {
                    sb.append((char) input);
                } else if (Character.isJavaIdentifierPart(input)) {
                    sb.setLength(0);
                } else {
                    wordToCheck = sb.toString();
                    if (keywords.contains(wordToCheck)) {
                        foundKeyWords.add(wordToCheck);
                    }
                    sb.setLength(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return foundKeyWords;
    }

    private Set setKeyWords() {
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
