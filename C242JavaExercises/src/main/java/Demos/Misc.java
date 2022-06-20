package Demos;

import java.util.ArrayList;
import java.util.List;

public class Misc {

    public void ternaryOpDemo(int x, int y) {
        int z;
        if (x == y) {
            z = 5;
        } else {
            z = 9;
        }
        int z1 = x == y ? 5 : 9;
    }

    public boolean compWinner(int userMove, int compMove) {
        if (userMove == 1) {
            return (compMove == 2); //if user picks 1 and comp picks 2 then comp wins so this will return a true, else comp chose 3 and lost so false
        } else if (userMove == 2) {
            return (compMove == 3);
        } else {
            return (compMove == 1);
        }
    }

    public boolean compWinner1(int userMove, int compMove) {
        return userMove == 1 ? compMove == 2 : userMove == 2 ? compMove == 3 : compMove == 1;
    }

    public boolean compWinner2(int userMove, int compMove) {
        if (userMove == 3) {
            return compMove == 1;
        } else {
            return compMove == userMove + 1;
        }
    }

    public boolean compWinner3(int userMove, int compMove) {
        return compMove == (userMove + 1) % 3;
    }


    public static List<Integer> generatePercentageList(List<String> dogBreeds) {
        List<Integer> percentages = new ArrayList<>();
        return percentages;
    }
}
