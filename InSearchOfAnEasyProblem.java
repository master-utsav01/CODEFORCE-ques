// A. In Search of an Easy Problem
// time limit per test1 second
// memory limit per test256 megabytes
// When preparing a tournament, Codeforces coordinators try treir best to make the first problem as easy as possible. This time the coordinator had chosen some problem and asked 𝑛
//  people about their opinions. Each person answered whether this problem is easy or hard.

// If at least one of these 𝑛
//  people has answered that the problem is hard, the coordinator decides to change the problem. For the given responses, check if the problem is easy enough.

// Input
// The first line contains a single integer 𝑛
//  (1≤𝑛≤100
// ) — the number of people who were asked to give their opinions.

// The second line contains 𝑛
//  integers, each integer is either 0
//  or 1
// . If 𝑖
// -th integer is 0
// , then 𝑖
// -th person thinks that the problem is easy; if it is 1
// , then 𝑖
// -th person thinks that the problem is hard.

// Output
// Print one word: "EASY" if the problem is easy according to all responses, or "HARD" if there is at least one person who thinks the problem is hard.

// You may print every letter in any register: "EASY", "easy", "EaSY" and "eAsY" all will be processed correctly.

// Examples
// InputCopy
// 3
// 0 0 1
// OutputCopy
// HARD
// InputCopy
// 1
// 0
// OutputCopy
// EASY
// Note
// In the first example the third person says it's a hard problem, so it should be replaced.

// In the second example the problem easy for the only person, so it doesn't have to be replaced.



import java.util.*;
public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0) {
            int a=sc.nextInt();
            
            if (a==1) {
                System.out.println("Hard");
                return;
            }

        }System.out.println("Easy");
        
    }
}
