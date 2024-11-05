// SPDX-FileCopyrightText: 2024 Soenke Weber
//
// SPDX-License-Identifier: MIT

import static java.lang.Math.*;
import static java.lang.Math.random;

public class Shuffle {
private int number;


    public Shuffle(){
        number = (int) ceil(100*random());

    }

    public int getNumber() {
        return number;
    }
}
