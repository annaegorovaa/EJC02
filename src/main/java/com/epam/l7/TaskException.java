package com.epam.l7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskException {
    public static void main(String[] args) {
        TaskException taskException = new TaskException();
        taskException.readInput();
    }

    public void readInput() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(checkInput(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BarsikException b) {
            System.err.println(b.getMessage());
        }
    }

    public String checkInput(String s) {
        if (s.equals("Barsik")) {
            System.out.println("Input OK");
            return s;
        }
        throw new BarsikException("Your input should be \"Barsik\", but you typed: " + s);
    }
}
