# HackDalton: Decompile (Writeup)

> Warning! There are spoilers ahead

When we pass the `Program.class` file through a decompiler, we are able to see a potential java source that could be the source code for the problem. This source code has the flag in it.

```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Random;

class Program {
    Program() {
    }

    public static void main(String[] var0) {
        int[] var1 = new int[]{164, 157, 159, 167, 128, 157, 168, 176, 171, 170, 183, 166, 177, 175, 176, 155, 112, 155, 168, 109, 176, 176, 168, 111, 155, 166, 112, 178, 112, 155, 170, 162, 137, 105, 173, 149, 111, 138, 174, 113, 185};
        Random var2 = new Random();
        if (var2.nextInt(256) == 257) {
            for(int var3 = 0; var3 < var1.length; ++var3) {
                int var4 = var1[var3] - 60;
                System.out.print((char)var4);
            }
        } else {
            System.out.println("Sorry, you got unlucky, no flag for you.");
        }

    }
}

```