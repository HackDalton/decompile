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
        String var1 = "hackDalton{just_4_l1ttl3_j4v4_nfM-qY3Nr5}";
        StringBuilder var2 = new StringBuilder();
        Random var3 = new Random();

        for(int var4 = 0; var4 < var1.length(); ++var4) {
            var2.appendCodePoint(var1.charAt(var4) + (char)var3.nextInt(255));
        }

        System.out.println(var2);
    }
}

```