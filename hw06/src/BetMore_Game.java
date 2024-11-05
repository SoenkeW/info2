// SPDX-FileCopyrightText: 2024 Soenke Weber
//
// SPDX-License-Identifier: MIT

public class BetMore_Game {
    
    public int pickCard(){
        Shuffle s = new Shuffle();
        return s.getNumber();
    }
}
